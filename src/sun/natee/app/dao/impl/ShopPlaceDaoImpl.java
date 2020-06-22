package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.ShopPlace;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class ShopPlaceDaoImpl implements BaseDao<ShopPlace, Integer> {
    private final Logger logger = Logger.getLogger(ShopPlaceDaoImpl.class);
    private final String table = AppConstants.TABLE_SHOP_PLACE;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(ShopPlace bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }

        String sql = "insert into " + table + ""
                + "(chkPark,chkManyPeople,chkSchool,chkCommunity,cbHomeType,"
                + "rentPerMonthAmt,advanceBefore,rentTotalAmt,farFromShop,chkPayMonthly,"
                + "chkPayAtDate,datePay,rentForSaleAmt,predictPeopleWalk,predictPeopleWantPercent,cbShopRentType) "
                + "values ("
                + "'" + bean.getChkPark() + "', '" + bean.getChkManyPeople() + "', '" + bean.getChkSchool() + "', '" + bean.getChkCommunity() + "', '" + bean.getCbHomeType() + "',"
                + "" + bean.getRentPerMonthAmt() + "," + bean.getAdvanceBefore() + "," + bean.getRentTotalAmt() + "," + bean.getFarFromShop() + ",'" + bean.getChkPayMonthly() + "',"
                + "'" + bean.getChkPayAtDate() + "','" + StringUtil.dateToDb(bean.getDatePay()) + "'," + bean.getRentForSaleAmt() + "," + bean.getPredictPeopleWalk() + "," + bean.getPredictPeopleWantPercent() + ","
                + "'" + bean.getCbShopRentType() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);

    }

    @Override
    public int update(ShopPlace bean) throws SQLException {
        String sql = "update " + table + " set "
                + "chkPark='" + bean.getChkPark() + "' ,"
                + "chkManyPeople='" + bean.getChkManyPeople() + "' ,"
                + "chkSchool='" + bean.getChkSchool() + "' ,"
                + "chkCommunity='" + bean.getChkCommunity() + "' ,"
                + "cbHomeType='" + bean.getCbHomeType() + "' ,"
                + "rentPerMonthAmt= " + bean.getRentPerMonthAmt() + ","
                + "advanceBefore= " + bean.getAdvanceBefore() + ","
                + "rentTotalAmt= " + bean.getRentTotalAmt() + ","
                + "farFromShop= " + bean.getFarFromShop() + ","
                + "chkPayMonthly='" + bean.getChkPayMonthly() + "' ,"
                + "chkPayAtDate='" + bean.getChkPayAtDate() + "' ,"
                + "datePay='" + StringUtil.dateToDb(bean.getDatePay()) + "' ,"
                + "rentForSaleAmt= " + bean.getRentForSaleAmt() + ","
                + "predictPeopleWalk= " + bean.getPredictPeopleWalk() + ","
                + "predictPeopleWantPercent=" + bean.getPredictPeopleWantPercent() + ", "
                + "cbShopRentType='" + bean.getCbShopRentType() + "' ";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
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
    public ShopPlace findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where 1=1 ";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new ShopPlace());
            }
        }
        return null;
    }

    @Override
    public List<ShopPlace> findAll() throws SQLException {
        List<ShopPlace> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new ShopPlace()));
            }
        }

        return listMenu;
    }

    @Override
    public ShopPlace mapping(ResultSet rs, ShopPlace bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setChkPark(rs.getString("ChkPark"));
        bean.setChkManyPeople(rs.getString("ChkManyPeople"));
        bean.setChkSchool(rs.getString("ChkSchool"));
        bean.setChkCommunity(rs.getString("ChkCommunity"));
        bean.setChkPayMonthly(rs.getString("ChkPayMonthly"));
        bean.setChkPayAtDate(rs.getString("ChkPayAtDate"));
        bean.setCbHomeType(rs.getString("CbHomeType"));
        bean.setRentPerMonthAmt(rs.getBigDecimal("RentPerMonthAmt"));
        bean.setAdvanceBefore(rs.getInt("AdvanceBefore"));
        bean.setRentTotalAmt(rs.getBigDecimal("RentTotalAmt"));
        bean.setFarFromShop(rs.getInt("FarFromShop"));
        bean.setDatePay(rs.getDate("DatePay"));
        bean.setRentForSaleAmt(rs.getBigDecimal("RentForSaleAmt"));
        bean.setPredictPeopleWalk(rs.getInt("PredictPeopleWalk"));
        bean.setPredictPeopleWantPercent(rs.getInt("PredictPeopleWantPercent"));
        bean.setCbShopRentType(rs.getString("cbShopRentType"));

        return bean;
    }

    @Override
    public boolean isUpdate(ShopPlace bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + "";
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
