package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.MenuTop;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;

public class MenuTopDaoImpl implements BaseDao<MenuTop, Integer> {
    private final Logger logger = Logger.getLogger(MenuTopDaoImpl.class);
    private final String table = AppConstants.TABLE_MENU_TOP;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(MenuTop bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }

        String sql = "insert into " + table + ""
                + "(code,name,chk_active,"
                + "chk_top_week,cb_top_day_start,cb_top_day_end,"
                + "chk_top_month,cb_top_month_start,cb_top_month_end) "
                + "values ("
                + "'" + bean.getCode() + "','" + bean.getName() + "','" + bean.getChkActive() + "',"
                + "'" + bean.getChkTopWeek() + "','" + bean.getCbTopDayStart() + "','" + bean.getCbTopDayEnd() + "',"
                + "'" + bean.getChkTopMonth() + "','" + bean.getCbTopMonthStart() + "','" + bean.getCbTopMonthEnd() + "'"
                + ")";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);

    }

    @Override
    public int update(MenuTop bean) throws SQLException {
        String sql = "update " + table + " set "
                + "code='" + bean.getCode() + "',"
                + "name='" + bean.getName() + "',"
                + "chk_active='" + bean.getChkActive() + "',"
                + "chk_top_week='" + bean.getChkTopWeek() + "',"
                + "cb_top_day_start='" + bean.getCbTopDayStart() + "',"
                + "cb_top_day_end='" + bean.getCbTopDayEnd() + "',"
                + "chk_top_month='" + bean.getChkTopMonth() + "',"
                + "cb_top_month_start='" + bean.getCbTopMonthStart() + "',"
                + "cb_top_month_end='" + bean.getCbTopMonthEnd() + "' "
                + "where 1=1";
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
    public MenuTop findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where 1=1 ";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new MenuTop());
            }
        }
        return null;
    }

    @Override
    public List<MenuTop> findAll() throws SQLException {
        List<MenuTop> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new MenuTop()));
            }
        }

        return listMenu;
    }

    public List<MenuTop> findAll(String shopCode) throws SQLException {
        List<MenuTop> listMenu = new ArrayList<>();
        String sql = "select * from " + table + " where shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new MenuTop()));
            }
        }

        return listMenu;
    }

    @Override
    public MenuTop mapping(ResultSet rs, MenuTop bean) throws SQLException {
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setChkActive(rs.getString("chk_active"));
        bean.setChkTopWeek(rs.getString("chk_top_week"));
        bean.setChkTopMonth(rs.getString("chk_top_month"));
        bean.setCbTopDayStart(rs.getString("cb_top_day_start"));
        bean.setCbTopDayEnd(rs.getString("cb_top_day_end"));
        bean.setCbTopMonthStart(rs.getString("cb_top_month_start"));
        bean.setCbTopMonthEnd(rs.getString("cb_top_month_end"));

        return bean;
    }

    @Override
    public boolean isUpdate(MenuTop bean) throws SQLException {
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
