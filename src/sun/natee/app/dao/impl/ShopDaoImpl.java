package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Shop;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;

public class ShopDaoImpl implements BaseDao<Shop, Integer> {
    private final Logger logger = Logger.getLogger(ShopDaoImpl.class);
    private final String table = AppConstants.TABLE_SHOP;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(Shop bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }

        String sql = "insert into " + table + ""
                + "(time_open,time_close,shop_name,shop_owner,chkMon,"
                + "tOMon,tCMon,chkTue,tOTue,tCTue,"
                + "chkWed,tOWed,tCWed,chkThu,tOThu,"
                + "tCThu,chkFri,tOFri,tCFri,chkSat,"
                + "tOSat,tCSat,chkSun,tOSun,tCSun,"
                + "chkUptoShop, code) values("
                + "'" + bean.getTimeOpen() + "','" + bean.getTimeClose() + "','" + bean.getShopName() + "','" + bean.getShopOwner() + "','" + bean.getChkMon() + "',"
                + "'" + bean.gettOMon() + "','" + bean.gettCMon() + "','" + bean.getChkTue() + "','" + bean.gettOTue() + "','" + bean.gettCTue() + "',"
                + "'" + bean.getChkWed() + "','" + bean.gettOWed() + "','" + bean.gettCWed() + "','" + bean.getChkThu() + "','" + bean.gettOThu() + "',"
                + "'" + bean.gettCThu() + "','" + bean.getChkFri() + "','" + bean.gettOFri() + "','" + bean.gettCFri() + "','" + bean.getChkSat() + "',"
                + "'" + bean.gettOSat() + "','" + bean.gettCSat() + "','" + bean.getChkSun() + "','" + bean.gettOSun() + "','" + bean.gettCSun() + "',"
                + "'" + bean.getChkUptoShop() + "', '" + bean.getCode() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Shop bean) throws SQLException {
        String sql = "update " + table + " set "
                + " time_Open='" + bean.getTimeOpen() + "',"
                + " time_Close='" + bean.getTimeClose() + "',"
                + " shop_Name='" + bean.getShopName() + "',"
                + " shop_Owner='" + bean.getShopOwner() + "',"
                + " chkMon='" + bean.getChkMon() + "',"
                + " tOMon='" + bean.gettOMon() + "',"
                + " tCMon='" + bean.gettCMon() + "',"
                + " chkTue='" + bean.getChkTue() + "',"
                + " tOTue='" + bean.gettOTue() + "',"
                + " tCTue='" + bean.gettCTue() + "',"
                + " chkWed='" + bean.getChkWed() + "',"
                + " tOWed='" + bean.gettOWed() + "',"
                + " tCWed='" + bean.gettCWed() + "',"
                + " chkThu='" + bean.getChkThu() + "',"
                + " tOThu='" + bean.gettOThu() + "',"
                + " tCThu='" + bean.gettCThu() + "',"
                + " chkFri='" + bean.getChkFri() + "',"
                + " tOFri='" + bean.gettOFri() + "',"
                + " tCFri='" + bean.gettCFri() + "',"
                + " chkSat='" + bean.getChkSat() + "',"
                + " tOSat='" + bean.gettOSat() + "',"
                + " tCSat='" + bean.gettCSat() + "',"
                + " chkSun='" + bean.getChkSun() + "',"
                + " tOSun='" + bean.gettOSun() + "',"
                + " tCSun='" + bean.gettCSun() + "',"
                + " chkUptoShop='" + bean.getChkUptoShop() + "'"
                + " where code='" + bean.getCode() + "'";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public Shop findById(Integer id) throws SQLException {
        String sql = "SELECT * FROM " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Shop());
            }
        }

        return null;
    }

    @Override
    public List<Shop> findAll() throws SQLException {
        List<Shop> listShop = new ArrayList<>();
        String sql = "SELECT * FROM " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listShop.add(mapping(rs, new Shop()));
            }
        }

        return listShop;
    }

    @Override
    public Shop mapping(ResultSet rs, Shop bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setCode(rs.getString("code"));
        bean.setTimeOpen(rs.getString("Time_Open"));
        bean.setTimeClose(rs.getString("Time_Close"));
        bean.setShopName(rs.getString("Shop_Name"));
        bean.setShopOwner(rs.getString("Shop_Owner"));
        bean.setChkMon(rs.getString("ChkMon"));
        bean.settOMon(rs.getString("tOMon"));
        bean.settCMon(rs.getString("tCMon"));
        bean.setChkTue(rs.getString("ChkTue"));
        bean.settOTue(rs.getString("tOTue"));
        bean.settCTue(rs.getString("tCTue"));
        bean.setChkWed(rs.getString("ChkWed"));
        bean.settOWed(rs.getString("tOWed"));
        bean.settCWed(rs.getString("tCWed"));
        bean.setChkThu(rs.getString("ChkThu"));
        bean.settOThu(rs.getString("tOThu"));
        bean.settCThu(rs.getString("tCThu"));
        bean.setChkFri(rs.getString("ChkFri"));
        bean.settOFri(rs.getString("tOFri"));
        bean.settCFri(rs.getString("tCFri"));
        bean.setChkSat(rs.getString("ChkSat"));
        bean.settOSat(rs.getString("tOSat"));
        bean.settCSat(rs.getString("tCSat"));
        bean.setChkSun(rs.getString("ChkSun"));
        bean.settOSun(rs.getString("tOSun"));
        bean.settCSun(rs.getString("tCSun"));
        bean.setChkUptoShop(rs.getString("ChkUptoShop"));

        return bean;
    }

    @Override
    public int delete(Integer id) throws SQLException {
        String sql;
        if (id == null) {
            sql = "delete from " + table + "";
            logger.debug(sql);
            return Database.getConnect().createStatement().executeUpdate(sql);
        }
        sql = "delete from " + table + " where id=" + id;
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public boolean isUpdate(Shop bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + " where code='" + bean.getCode() + "'";
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
