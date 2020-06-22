package sun.natee.app.dao.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Ingredient;
import sun.natee.app.bean.Menu;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;

public class MenuDaoImpl implements BaseDao<Menu, Integer> {
    private final Logger logger = Logger.getLogger(MenuDaoImpl.class);
    private final String table = AppConstants.TABLE_MENU;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(Menu bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }
        String sql = "insert into " + table + ""
                + "(code,name,base_price,menu_price,menu_disc_price,"
                + "menu_special_price,make_order_time,unit_sale,shop_code) "
                + "values ("
                + "'" + bean.getCode() + "','" + bean.getName() + "', " + bean.getBasePrice() + "," + bean.getMenuPrice() + "," + bean.getMenuDiscPrice() + " "
                + "," + bean.getMenuSpecialPrice() + "," + bean.getMakeOrderTime() + ",'" + bean.getUnit_sale() + "','" + bean.getShopCode() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Menu bean) throws SQLException {
        String sql = "update " + table + " set "
                + "name='" + bean.getName() + "',"
                + "base_price=" + bean.getBasePrice() + ","
                + "menu_price=" + bean.getMenuPrice() + ","
                + "menu_disc_price=" + bean.getMenuDiscPrice() + ","
                + "menu_special_price=" + bean.getMenuSpecialPrice() + ","
                + "make_order_time=" + bean.getMakeOrderTime() + ","
                + "unit_sale='" + bean.getUnit_sale() + "' "
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
    public Menu findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where id=" + id;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Menu());
            }
        }

        return null;
    }

    @Override
    public List<Menu> findAll() throws SQLException {
        List<Menu> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        ResultSet rs = Database.getConnect().createStatement().executeQuery(sql);
        while (rs.next()) {
            listMenu.add(mapping(rs, new Menu()));
        }

        return listMenu;
    }

    public List<Menu> findAll(String shopCode) throws SQLException {
        List<Menu> listMenu = new ArrayList<>();
        String sql = "select * from " + table + " where shop_code='" + shopCode + "'";
        logger.debug(sql);
        ResultSet rs = Database.getConnect().createStatement().executeQuery(sql);
        while (rs.next()) {
            listMenu.add(mapping(rs, new Menu()));
        }

        return listMenu;
    }

    public List<Ingredient> ingAll(String menuCode, String ingType) throws SQLException {
        IngredientDaoImpl ingImpl = new IngredientDaoImpl();
        List<Ingredient> listIng = ingImpl.findGroup(menuCode, ingType);

        return listIng;
    }

    @Override
    public Menu mapping(ResultSet rs, Menu bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setBasePrice(rs.getBigDecimal("base_price"));
        bean.setMenuPrice(rs.getBigDecimal("menu_price"));
        bean.setMenuDiscPrice(rs.getBigDecimal("menu_disc_price"));
        bean.setMenuSpecialPrice(rs.getBigDecimal("menu_special_price"));
        bean.setMakeOrderTime(rs.getInt("make_order_time"));
        bean.setUnit_sale(rs.getString("unit_sale"));
        bean.setShopCode(rs.getString("shop_code"));

        return bean;
    }

    @Override
    public boolean isUpdate(Menu bean) throws SQLException {
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

    public Menu findByCode(String code, String shopCode) throws SQLException {
        String sql = "select * from " + table + " where code='" + code + "' and shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Menu());
            }
        }

        return null;
    }

    public BigDecimal convertToPack(Ingredient ing, BigDecimal qtySalePerMonth) {
        BigDecimal totalIngAmt = ing.getQtyUnit().multiply(qtySalePerMonth);
        BigDecimal pack = totalIngAmt.divide(ing.getBuyUnitPerSale(), 0, RoundingMode.HALF_UP);
        return pack;
    }

}
