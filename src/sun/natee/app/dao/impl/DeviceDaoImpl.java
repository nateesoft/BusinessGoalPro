package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Device;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class DeviceDaoImpl implements BaseDao<Device, Integer> {
    private final Logger logger = Logger.getLogger(DeviceDaoImpl.class);
    private final String table = AppConstants.TABLE_DEVICE;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(Device bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }
        String sql = "insert into " + table + " "
                + "(code,name,price_amt,qty,total_amt,"
                + "net_total_amt,has_expired,date_expired,"
                + "count_day_expired,chk_up_to_sale,count_per_used,shop_code,menu_code,cbDevExpiredDay) "
                + "values("
                + "'" + bean.getCode() + "','" + bean.getName() + "'," + bean.getPriceAmt() + "," + bean.getQty() + "," + bean.getTotalAmt() + ","
                + "" + bean.getNetTotalAmt() + ",'" + bean.getHasExpired() + "','" + StringUtil.dateToDb(bean.getDateExpired()) + "',"
                + bean.getCountDayExpired() + ", '" + bean.getChkUpToSale() + "'," + bean.getCountPerUsed()
                + ",'" + bean.getShopCode() + "', '" + bean.getMenuCode() + "', '" + bean.getCbDevExpiredDay() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Device bean) throws SQLException {
        String sql = "update " + table + " set "
                + " code='" + bean.getCode() + "',"
                + " name='" + bean.getName() + "',"
                + " price_amt=" + bean.getPriceAmt() + ","
                + " qty=" + bean.getQty() + ","
                + " total_amt=" + bean.getTotalAmt() + ","
                + " net_total_amt=" + bean.getNetTotalAmt() + ","
                + " has_expired='" + bean.getHasExpired() + "',"
                + " date_expired='" + StringUtil.dateToDb(bean.getDateExpired()) + "',"
                + " count_day_expired=" + bean.getCountDayExpired() + ","
                + " chk_up_to_sale='" + bean.getChkUpToSale() + "',"
                + " shop_code='" + bean.getShopCode() + "',"
                + " menu_code='" + bean.getMenuCode() + "',"
                + " count_per_used=" + bean.getCountPerUsed() + ","
                + " cbDevExpiredDay='" + bean.getCbDevExpiredDay() + "' "
                + " where code='" + bean.getCode() + "' and shop_code='" + bean.getShopCode() + "'";
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
    public Device findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where id=" + id;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Device());
            }
        }

        return null;
    }

    public Device findByCode(String code, String shopCode) throws SQLException {
        String sql = "select * from " + table + " where code='" + code + "' and shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Device());
            }
        }

        return null;
    }

    @Override
    public List<Device> findAll() throws SQLException {
        List<Device> listBean = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listBean.add(mapping(rs, new Device()));
            }
        }

        return listBean;
    }

    public List<Device> findAll(String shopCode) throws SQLException {
        List<Device> listBean = new ArrayList<>();
        String sql = "select * from " + table + " where shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listBean.add(mapping(rs, new Device()));
            }
        }

        return listBean;
    }

    @Override
    public Device mapping(ResultSet rs, Device bean) throws SQLException {
        bean.setId(rs.getInt("id"));
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setPriceAmt(rs.getBigDecimal("price_amt"));
        bean.setQty(rs.getInt("qty"));
        bean.setTotalAmt(rs.getBigDecimal("total_amt"));
        bean.setNetTotalAmt(rs.getBigDecimal("net_total_amt"));
        bean.setHasExpired(rs.getString("has_expired"));
        bean.setDateExpired(rs.getDate("date_expired"));
        bean.setCountDayExpired(rs.getInt("count_day_expired"));
        bean.setCountPerUsed(rs.getInt("count_per_used"));
        bean.setShopCode(rs.getString("shop_code"));
        bean.setMenuCode(rs.getString("menu_code"));
        bean.setCbDevExpiredDay(rs.getString("cbDevExpiredDay"));
        bean.setChkUpToSale(rs.getString("chk_up_to_sale"));

        return bean;
    }

    @Override
    public void dropTable() {
        try {
            Database.dropTable(table);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    @Override
    public boolean isUpdate(Device bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + " WHERE code='" + bean.getCode() + "' and shop_code='" + bean.getShopCode() + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                isExist = true;
            }
        }

        return isExist;
    }

}
