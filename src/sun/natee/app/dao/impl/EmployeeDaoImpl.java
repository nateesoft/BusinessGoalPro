package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Employee;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class EmployeeDaoImpl implements BaseDao<Employee, Integer> {
    private final Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
    private final String table = AppConstants.TABLE_EMPLOYEE;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public int save(Employee bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }
        String sql = "insert into " + table + ""
                + "(code,name,age,nation,emp_type,"
                + "chk_day,day_salary_amt,chk_week,week_salary_amt,chk_month,"
                + "month_salary_amt,chk_year,year_salary_amt,hire_start_date,hire_end_date,"
                + "chk_is_active,shop_code) "
                + "values ("
                + "'" + bean.getCode() + "', '" + bean.getName() + "'," + bean.getAge() + ",'" + bean.getNation() + "','" + bean.getEmpType() + "',"
                + "'" + bean.getChkDay() + "'," + bean.getDaySalary() + ",'" + bean.getChkWeek() + "'," + bean.getWeekSalary() + ",'" + bean.getChkMonth() + "',"
                + "" + bean.getMonthSalary() + ",'" + bean.getChkYear() + "'," + bean.getYearSalary() + ",'" + StringUtil.dateToDb(bean.getHireStartDate()) + "','" + StringUtil.dateToDb(bean.getHireEndDate()) + "',"
                + "'" + bean.getChkIsActive() + "','" + bean.getShopCode() + "')";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Employee bean) throws SQLException {
        String sql = "update " + table + " set "
                + " name='" + bean.getName() + "', "
                + " age=" + bean.getAge() + ","
                + " nation='" + bean.getNation() + "',"
                + " emp_type='" + bean.getEmpType() + "',"
                + " chk_day='" + bean.getChkDay() + "',"
                + " day_salary_amt=" + bean.getDaySalary() + ","
                + " chk_week='" + bean.getChkWeek() + "',"
                + " week_salary_amt=" + bean.getWeekSalary() + ","
                + " chk_month='" + bean.getChkMonth() + "',"
                + " month_salary_amt=" + bean.getMonthSalary() + ","
                + " chk_year='" + bean.getChkYear() + "',"
                + " year_salary_amt=" + bean.getYearSalary() + ","
                + " hire_start_date='" + StringUtil.dateToDb(bean.getHireStartDate()) + "',"
                + " hire_end_date='" + StringUtil.dateToDb(bean.getHireEndDate()) + "',"
                + " chk_is_active='" + bean.getChkIsActive() + "' "
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
    public Employee findById(Integer id) throws SQLException {
        String sql = "select * from " + table + " where id=" + id;
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Employee());
            }
        }
        return null;
    }

    public Employee findByCode(String code, String shopCode) throws SQLException {
        String sql = "select * from " + table + " where code='" + code + "' and shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Employee());
            }
        }
        return null;
    }

    @Override
    public List<Employee> findAll() throws SQLException {
        List<Employee> listMenu = new ArrayList<>();
        String sql = "select * from " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new Employee()));
            }
        }

        return listMenu;
    }

    public List<Employee> findAll(String shopCode) throws SQLException {
        List<Employee> listMenu = new ArrayList<>();
        String sql = "select * from " + table + " where shop_code='" + shopCode + "'";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            while (rs.next()) {
                listMenu.add(mapping(rs, new Employee()));
            }
        }

        return listMenu;
    }

    @Override
    public Employee mapping(ResultSet rs, Employee bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setCode(rs.getString("code"));
        bean.setName(rs.getString("name"));
        bean.setDaySalary(rs.getBigDecimal("day_salary_amt"));
        bean.setWeekSalary(rs.getBigDecimal("week_salary_amt"));
        bean.setMonthSalary(rs.getBigDecimal("month_salary_amt"));
        bean.setYearSalary(rs.getBigDecimal("year_salary_amt"));
        bean.setAge(rs.getInt("age"));
        bean.setNation(rs.getString("nation"));
        bean.setEmpType(rs.getString("emp_type"));
        bean.setChkDay(rs.getString("chk_day"));
        bean.setChkWeek(rs.getString("chk_week"));
        bean.setChkMonth(rs.getString("chk_month"));
        bean.setChkYear(rs.getString("chk_year"));
        bean.setChkIsActive(rs.getString("chk_is_active"));
        bean.setHireStartDate(rs.getDate("hire_start_date"));
        bean.setHireEndDate(rs.getDate("hire_end_date"));
        bean.setShopCode(rs.getString("shop_code"));

        return bean;
    }

    @Override
    public boolean isUpdate(Employee bean) throws SQLException {
        boolean isExist = false;
        String sql = "SELECT * FROM " + table + " where shop_code='" + bean.getShopCode() + "' and code='" + bean.getCode() + "'";
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
