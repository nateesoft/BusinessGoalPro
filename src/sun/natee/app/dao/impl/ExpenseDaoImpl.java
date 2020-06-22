package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Expense;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;

public class ExpenseDaoImpl implements BaseDao<Expense, Integer> {
    private final Logger logger = Logger.getLogger(ExpenseDaoImpl.class);
    private final String table = AppConstants.TABLE_EXPENSE;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(Expense bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }
        String sql = "insert into " + table + ""
                + "(code, name, dialy_pay_amt, weekly_pay_amt, monthly_pay_amt, "
                + "price_amt, price_type, shop_code, cbPayType) "
                + "values ("
                + "'" + bean.getCode() + "', '" + bean.getName() + "', " + bean.getDialyPayAmt() + "," + bean.getWeeklyPayAmt() + "," + bean.getMonthlyPayAmt() + ","
                + "" + bean.getPrice() + "," + bean.getPriceType() + ", '" + bean.getShopCode() + "', '" + bean.getCbPayType() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Expense bean) throws SQLException {
        String sql = "update " + table + " set "
                + "code='" + bean.getCode() + "', "
                + "name='" + bean.getName() + "', "
                + "dialy_pay_amt=" + bean.getDialyPayAmt() + ", "
                + "weekly_pay_amt=" + bean.getWeeklyPayAmt() + ", "
                + "monthly_pay_amt=" + bean.getMonthlyPayAmt() + ", "
                + "price_amt=" + bean.getPrice() + ", "
                + "price_type=" + bean.getPriceType() + ", "
                + "shop_code='" + bean.getShopCode() + "', "
                + "cbPayType='" + bean.getCbPayType() + "' "
                + "where code='" + bean.getCode() + "' and shop_code='" + bean.getShopCode() + "'";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int delete(Integer id) throws SQLException {
        String sql;
        if (id == null) {
            sql = "delete from " + table;
            logger.debug(sql);
            return Database.getConnect().createStatement().executeUpdate(sql);
        }
        sql = "delete from " + table + " where id=" + id;
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public Expense findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where id=" + id;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Expense());
            }
        }

        return null;
    }

    public Expense findByCode(String code, String shopCode) throws SQLException {
        String sql = "select * from " + table + " where code='" + code + "' and shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Expense());
            }
        }

        return null;
    }

    @Override
    public List<Expense> findAll() throws SQLException {
        List<Expense> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        ResultSet rs = Database.getConnect().createStatement().executeQuery(sql);
        while (rs.next()) {
            listMenu.add(mapping(rs, new Expense()));
        }

        return listMenu;
    }

    public List<Expense> findAll(String shopCode) throws SQLException {
        List<Expense> listMenu = new ArrayList<>();
        String sql = "select * from " + table + " where shop_code='" + shopCode + "'";
        logger.debug(sql);
        ResultSet rs = Database.getConnect().createStatement().executeQuery(sql);
        while (rs.next()) {
            listMenu.add(mapping(rs, new Expense()));
        }

        return listMenu;
    }

    @Override
    public Expense mapping(ResultSet rs, Expense bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setDialyPayAmt(rs.getBigDecimal("dialy_pay_amt"));
        bean.setWeeklyPayAmt(rs.getBigDecimal("weekly_pay_amt"));
        bean.setMonthlyPayAmt(rs.getBigDecimal("monthly_pay_amt"));
        bean.setPrice(rs.getBigDecimal("price_amt"));
        bean.setPriceType(rs.getInt("price_type"));
        bean.setShopCode(rs.getString("shop_code"));
        bean.setCbPayType(rs.getString("cbPayType"));

        return bean;
    }

    @Override
    public boolean isUpdate(Expense bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + " where code='" + bean.getCode() + "' and shop_code='" + bean.getShopCode() + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                isExist = true;
            }
        }

        return isExist;
    }

    @Override
    public void dropTable() {
        try {
            Database.dropTable(table);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

}
