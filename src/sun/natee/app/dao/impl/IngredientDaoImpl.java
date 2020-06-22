package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Ingredient;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class IngredientDaoImpl implements BaseDao<Ingredient, Integer> {

    private final Logger logger = Logger.getLogger(IngredientDaoImpl.class);
    private final String table = AppConstants.TABLE_INGREDIENT;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(Ingredient bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }

        String sql = "insert into " + table + ""
                + "(menu_code, code, name,"
                + "ing_type_normal, ing_type_special, ing_type_discount,"
                + "buyUnitPerSale, cbBuyUnit, buyUnitPrice,"
                + "qtyUnit, cbUnitSale, chkHasExpire,"
                + "rdExpireDate, dateExpire, dayCountExpire,"
                + "rdExpireBetween, dateExpireStart, dateExpireFinish) "
                + "values ("
                + "'" + bean.getMenuCode() + "', '" + bean.getCode() + "', '" + bean.getName() + "',"
                + "'" + bean.getIngTypeNormal() + "', '" + bean.getIngTypeSpecial() + "', '" + bean.getIngTypeDiscount() + "',"
                + "" + bean.getBuyUnitPerSale() + ", '" + bean.getCbBuyUnit() + "', " + bean.getBuyUnitPrice() + ","
                + "" + bean.getQtyUnit() + ", '" + bean.getCbUnitSale() + "', '" + bean.getChkHasExpire() + "',"
                + "'" + bean.getRdExpireDate() + "', '" + StringUtil.dateToDb(bean.getDateExpire()) + "', " + bean.getDayCountExpire() + ","
                + "'" + bean.getRdExpireBetween() + "', '" + StringUtil.dateToDb(bean.getDateExpireStart()) + "', '" + StringUtil.dateToDb(bean.getDateExpireFinish()) + "'"
                + ")";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Ingredient bean) throws SQLException {
        String sql = "update " + table + " set "
                + "menu_code='" + bean.getMenuCode() + "',"
                + "code='" + bean.getCode() + "',"
                + "name='" + bean.getName() + "',"
                + "ing_type_normal='" + bean.getIngTypeNormal() + "',"
                + "ing_type_special='" + bean.getIngTypeSpecial() + "',"
                + "ing_type_discount='" + bean.getIngTypeDiscount() + "',"
                + "buyUnitPerSale=" + bean.getBuyUnitPerSale() + ","
                + "cbBuyUnit='" + bean.getCbBuyUnit() + "',"
                + "buyUnitPrice=" + bean.getBuyUnitPrice() + ","
                + "qtyUnit=" + bean.getQtyUnit() + ","
                + "cbUnitSale='" + bean.getCbUnitSale() + "',"
                + "chkHasExpire='" + bean.getChkHasExpire() + "',"
                + "rdExpireDate='" + bean.getRdExpireDate() + "',"
                + "dateExpire='" + StringUtil.dateToDb(bean.getDateExpire()) + "',"
                + "dayCountExpire=" + bean.getDayCountExpire() + ","
                + "rdExpireBetween='" + bean.getRdExpireBetween() + "',"
                + "dateExpireStart='" + StringUtil.dateToDb(bean.getDateExpireStart()) + "',"
                + "dateExpireFinish='" + StringUtil.dateToDb(bean.getDateExpireFinish()) + "' "
                + "where code='" + bean.getCode() + "' and menu_code='" + bean.getMenuCode() + "'";
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
    public Ingredient findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where id=" + id;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Ingredient());
            }
        }
        return null;
    }

    public Ingredient findByCode(String code, String menuCode) throws SQLException {
        String sql = "select * from " + table + " where code='" + code + "' and menu_code='" + menuCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Ingredient());
            }
        }
        return null;
    }

    public List<Ingredient> findGroup(String menuCode, String ingType) throws SQLException {
        List<Ingredient> listIng = new ArrayList<>();
        String sql = "select * from " + table + " where 1=1 ";
        switch (ingType) {
            case "normal":
                sql += " and ing_type_normal='Y' ";
                break;
            case "special":
                sql += " and ing_type_special='Y' ";
                break;
            case "discount":
                sql += " and ing_type_discount='Y' ";
                break;
        }
        sql += " and menu_code='" + menuCode + "' ";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listIng.add(mapping(rs, new Ingredient()));
            }
        }

        return listIng;
    }

    @Override
    public List<Ingredient> findAll() throws SQLException {
        List<Ingredient> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new Ingredient()));
            }
        }

        return listMenu;
    }

    public List<Ingredient> findAll(String menuCode) throws SQLException {
        List<Ingredient> listMenu = new ArrayList<>();
        String sql = "select * from " + table + " where menu_code='" + menuCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new Ingredient()));
            }
        }

        return listMenu;
    }

    @Override
    public Ingredient mapping(ResultSet rs, Ingredient bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setIngTypeNormal(rs.getString("ing_type_normal"));
        bean.setIngTypeSpecial(rs.getString("ing_type_special"));
        bean.setIngTypeDiscount(rs.getString("ing_type_discount"));
        bean.setCbBuyUnit(rs.getString("CbBuyUnit"));
        bean.setBuyUnitPrice(rs.getBigDecimal("BuyUnitPrice"));
        bean.setQtyUnit(rs.getBigDecimal("QtyUnit"));
        bean.setCbUnitSale(rs.getString("CbUnitSale"));
        bean.setChkHasExpire(rs.getString("ChkHasExpire"));
        bean.setRdExpireDate(rs.getString("RdExpireDate"));
        bean.setDateExpire(rs.getDate("DateExpire"));
        bean.setDayCountExpire(rs.getInt("DayCountExpire"));
        bean.setRdExpireBetween(rs.getString("RdExpireBetween"));
        bean.setDateExpireStart(rs.getDate("DateExpireStart"));
        bean.setDateExpireFinish(rs.getDate("DateExpireFinish"));
        bean.setBuyUnitPerSale(rs.getBigDecimal("buyUnitPerSale"));
        bean.setMenuCode(rs.getString("menu_code"));

        return bean;
    }

    @Override
    public boolean isUpdate(Ingredient bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + " "
                + "where code='" + bean.getCode() + "' "
                + "and menu_code='" + bean.getMenuCode() + "' "
                + "and ing_type_normal='" + bean.getIngTypeNormal() + "' "
                + "and ing_type_special='" + bean.getIngTypeSpecial() + "' "
                + "and ing_type_discount='" + bean.getIngTypeDiscount() + "' ";
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
