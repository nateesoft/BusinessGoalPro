package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.HolidaySetting;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class HolidaySettingDaoImpl implements BaseDao<HolidaySetting, Integer> {
    private final Logger logger = Logger.getLogger(HolidaySettingDaoImpl.class);
    private final String table = AppConstants.TABLE_HOLIDY_SETTING;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(HolidaySetting bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }
        String sql = "insert into " + table + ""
                + "(code,name,chk_active,"
                + "year_start,year_end,rd_lock_day,"
                + "date_holiday,rd_every_day,cb_day_week,"
                + "cb_day_dialy,rd_specific_day,date_start,"
                + "date_end) values ("
                + "'" + bean.getCode() + "','" + bean.getName() + "','" + bean.getChkActive() + "',"
                + "'" + bean.getYearStart() + "','" + bean.getYearEnd() + "','" + bean.getRdLockDay() + "',"
                + "'" + StringUtil.dateToDb(bean.getDateHoliday()) + "','" + bean.getRdEveryDay() + "','" + bean.getCbDayWeek() + "',"
                + "'" + bean.getCbDayDialy() + "','" + bean.getRdSpecificDay() + "','" + StringUtil.dateToDb(bean.getDateStart()) + "',"
                + "'" + StringUtil.dateToDb(bean.getDateEnd()) + "'"
                + ")";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);

    }

    @Override
    public int update(HolidaySetting bean) throws SQLException {
        String sql = "update " + table + " set "
                + "name='" + bean.getName() + "',"
                + "chk_active='" + bean.getChkActive() + "',"
                + "year_start='" + bean.getYearStart() + "',"
                + "year_end='" + bean.getYearEnd() + "',"
                + "rd_lock_day='" + bean.getRdLockDay() + "',"
                + "date_holiday='" + StringUtil.dateToDb(bean.getDateHoliday()) + "',"
                + "rd_every_day='" + bean.getRdEveryDay() + "',"
                + "cb_day_week='" + bean.getCbDayWeek() + "',"
                + "cb_day_dialy='" + bean.getCbDayDialy() + "',"
                + "rd_specific_day='" + bean.getRdSpecificDay() + "',"
                + "date_start='" + StringUtil.dateToDb(bean.getDateStart()) + "',"
                + "date_end='" + StringUtil.dateToDb(bean.getDateEnd()) + "' "
                + "where code='" + bean.getCode() + "' ";
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
    public HolidaySetting findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where 1=1 ";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new HolidaySetting());
            }
        }
        return null;
    }

    @Override
    public List<HolidaySetting> findAll() throws SQLException {
        List<HolidaySetting> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new HolidaySetting()));
            }
        }

        return listMenu;
    }

    @Override
    public HolidaySetting mapping(ResultSet rs, HolidaySetting bean) throws SQLException {
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setChkActive(rs.getString("chk_active"));
        bean.setYearStart(rs.getString("year_start"));
        bean.setYearEnd(rs.getString("year_end"));
        bean.setRdLockDay(rs.getString("rd_lock_day"));
        bean.setDateHoliday(rs.getDate("date_holiday"));
        bean.setRdEveryDay(rs.getString("rd_every_day"));
        bean.setCbDayWeek(rs.getString("cb_day_week"));
        bean.setCbDayDialy(rs.getString("cb_day_dialy"));
        bean.setRdSpecificDay(rs.getString("rd_specific_day"));
        bean.setDateStart(rs.getDate("date_start"));
        bean.setDateEnd(rs.getDate("date_end"));

        return bean;
    }

    @Override
    public boolean isUpdate(HolidaySetting bean) throws SQLException {
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
