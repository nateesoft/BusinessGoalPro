package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.POItems;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;

public class POItemsDaoImpl implements BaseDao<POItems, Integer> {
    private final Logger logger = Logger.getLogger(POItemsDaoImpl.class);
    private final String table = AppConstants.TABLE_PO_ORDER;

    @Override
    public void init() {
        Database.initTable(table);
    }

    public int saveDetail(POItems bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }

        String sql = "insert into " + AppConstants.TABLE_PO_ORDER_ITEMS + ""
                + "(order_no,product_code,product_name,product_type,chk_auto_date_order,"
                + "auto_date1,auto_date2,qty,price_per_product,product_pack,"
                + "total_amt,net_total_amt) "
                + "values ("
                + "'" + bean.getOrderNo() + "', '" + bean.getProductCode() + "','" + bean.getProductName() + "', '" + bean.getProductType() + "', '" + bean.getChkAutoDateOrder() + "', "
                + "'" + bean.getAutoDate1() + "', '" + bean.getAutoDate2() + "'," + bean.getQty() + ", " + bean.getPricePerProduct() + ", '" + bean.getProductPack() + "', "
                + "" + bean.getTotalAmt() + ", " + bean.getNetTotalAmt() + ""
                + ")";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int save(POItems bean) throws SQLException {
        String sql = "insert into " + table + " "
                + "(date_order,order_no,order_by,chk_notice_order) "
                + "values ("
                + "'" + bean.getDateOrder() + "', '" + bean.getOrderNo() + "', '" + bean.getOrderBy() + "', '" + bean.getChkNoticeOrder() + "'"
                + ")";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(POItems bean) throws SQLException {
        String sql = "update " + table + " set "
                + "date_order='" + bean.getDateOrder() + "',"
                + "order_no='" + bean.getOrderNo() + "',"
                + "order_by='" + bean.getOrderBy() + "',"
                + "chk_notice_order='" + bean.getChkNoticeOrder() + "' "
                + "where order_no=" + bean.getId();
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    public int updateDetail(POItems bean) throws SQLException {
        String sql = "update " + table + " set "
                + "product_code='" + bean.getProductCode() + "',"
                + "product_name='" + bean.getProductName() + "',"
                + "product_type='" + bean.getProductType() + "',"
                + "chk_auto_date_order='" + bean.getChkAutoDateOrder() + "',"
                + "auto_date1='" + bean.getAutoDate1() + "',"
                + "auto_date2='" + bean.getAutoDate2() + "',"
                + "qty=" + bean.getQty() + ","
                + "price_per_product=" + bean.getPricePerProduct() + ","
                + "product_pack='" + bean.getProductPack() + "',"
                + "total_amt=" + bean.getTotalAmt() + ","
                + "net_total_amt=" + bean.getNetTotalAmt() + " "
                + "where order_no=" + bean.getOrderNo() + " and product_code='" + bean.getProductCode() + "'";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int delete(Integer id) throws SQLException {
        String sql;
        if (id == null) {
            sql = "delete from " + table;
            return Database.getConnect().createStatement().executeUpdate(sql);
        }
        sql = "delete from " + table + " where id=" + id;
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public POItems findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where id=" + id;
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new POItems());
            }
        }
        return null;
    }

    public POItems findById(String order_no) throws SQLException {
        POItems header = new POItems();
        String sql = "select * from " + table + " where order_no=" + order_no;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                header = mapping(rs, new POItems());
            }
        }

        header.setListItems(new ArrayList<POItems>());
        sql = "select * from " + AppConstants.TABLE_PO_ORDER_ITEMS + " where order_no=" + order_no;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                header.getListItems().add(mapping(rs, new POItems()));
            }
        }

        return header;
    }

    @Override
    public List<POItems> findAll() throws SQLException {
        List<POItems> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new POItems()));
            }
        }

        return listMenu;
    }

    @Override
    public POItems mapping(ResultSet rs, POItems bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setDateOrder(rs.getDate("date_order"));
        bean.setOrderNo(rs.getString("order_no"));
        bean.setOrderBy(rs.getString("order_by"));
        bean.setChkNoticeOrder(rs.getString("chk_notice_order"));
        bean.setProductCode(rs.getString("product_code"));
        bean.setProductName(rs.getString("product_name"));
        bean.setProductType(rs.getString("product_type"));
        bean.setChkAutoDateOrder(rs.getString("chk_auto_date_order"));
        bean.setAutoDate1(rs.getDate("auto_date1"));
        bean.setAutoDate2(rs.getDate("auto_date2"));
        bean.setQty(rs.getInt("qty"));
        bean.setPricePerProduct(rs.getBigDecimal("price_per_product"));
        bean.setProductPack(rs.getString("product_pack"));
        bean.setTotalAmt(rs.getBigDecimal("total_amt"));
        bean.setNetTotalAmt(rs.getBigDecimal("net_total_amt"));

        return bean;
    }

    @Override
    public boolean isUpdate(POItems bean) throws SQLException {
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
