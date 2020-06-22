package sun.natee.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.main.AppUI;
import sun.natee.app.main.util.MsgUtil;

public class Database {

    private static Connection conn = null;
    private static final Logger logger = Logger.getLogger(Database.class);

    public static Connection getConnect() {
        if (conn == null) {
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
                conn = DriverManager.getConnection("jdbc:derby:" + AppUI.DATA_DB + ";create=true;user=app;password=app");
//                conn = DriverManager.getConnection("jdbc:derby:" + AppUI.DATA_DB + ";upgrade=true;user=app;password=app");
                return conn;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
                System.err.println(e);
            }
        }

        return conn;
    }

    public static boolean isTableExists(String tableName) throws SQLException {
        return Database.getConnect().getMetaData().getTables(null, null, tableName.toUpperCase(), null).next();
    }

    public static boolean dropTable(String tableName) throws SQLException {
        return Database.getConnect().createStatement().execute("drop table " + tableName);
    }

    public static void initTable(String tableName) {
        Statement stmt;

        try {
            stmt = Database.getConnect().createStatement();
            String sql;
            if (tableName.equalsIgnoreCase(AppConstants.TABLE_TARGET_PLAN)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "START_BUDGET_AMT decimal(10,2), "
                        + "START_LOAN_AMT decimal(10,2), "
                        + "TARGET_NAME varchar(150), "
                        + "LOAN_INT_PERCENT decimal(10,2), "
                        + "LOAN_TYPE varchar(10), "
                        + "BUSINESS_TARGET_AMT decimal(10,2), "
                        + "BUSINESS_PLAN_COUNT int, "
                        + "TARGET_TYPE varchar(10), "
                        + "INCOME_BUSINESS_AMT decimal(10,2), "
                        + "INCOME_PER varchar(10), "
                        + "OUTCOME_BUSINESS_AMT decimal(10,2), "
                        + "OUTCOME_PER varchar(10), "
                        + "START_DATE date, "
                        + "TARGET_DATE date "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_SHOP)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(5),"
                        + "time_Open varchar(8),"
                        + "time_Close varchar(8),"
                        + "shop_Name varchar(150),"
                        + "shop_Owner varchar(150),"
                        + "chkMon varchar(1),"
                        + "tOMon varchar(8),"
                        + "tCMon varchar(8),"
                        + "chkTue varchar(1),"
                        + "tOTue varchar(8),"
                        + "tCTue varchar(8),"
                        + "chkWed varchar(1),"
                        + "tOWed varchar(8),"
                        + "tCWed varchar(8),"
                        + "chkThu varchar(1),"
                        + "tOThu varchar(8),"
                        + "tCThu varchar(8),"
                        + "chkFri varchar(1),"
                        + "tOFri varchar(8),"
                        + "tCFri varchar(8),"
                        + "chkSat varchar(1),"
                        + "tOSat varchar(8),"
                        + "tCSat varchar(8),"
                        + "chkSun varchar(1),"
                        + "tOSun varchar(8),"
                        + "tCSun varchar(8),"
                        + "chkUptoShop varchar(1)"
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_DEVICE)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(5),"
                        + "name varchar(150),"
                        + "price_amt decimal(10,2),"
                        + "qty int,"
                        + "total_amt decimal(10,2),"
                        + "net_total_amt decimal(10,2),"
                        + "has_expired varchar(1),"
                        + "date_expired date,"
                        + "count_day_expired int,"
                        + "chk_up_to_sale varchar(1),"
                        + "count_per_used int,"
                        + "shop_code varchar(5),"
                        + "menu_code varchar(5),"
                        + "cbDevExpiredDay varchar(30)"
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_MENU)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(5),"
                        + "name varchar(150),"
                        + "base_price decimal(10,2),"
                        + "menu_price decimal(10,2),"
                        + "menu_disc_price decimal(10,2),"
                        + "menu_special_price decimal(10,2),"
                        + "make_order_time int,"
                        + "shop_code varchar(5),"
                        + "unit_sale varchar(30) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_EXPENSE)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(5),"
                        + "name varchar(150),"
                        + "dialy_pay_amt decimal(10,2),"
                        + "weekly_pay_amt decimal(10,2),"
                        + "monthly_pay_amt decimal(10,2),"
                        + "price_amt decimal(10,2),"
                        + "price_type int,"
                        + "shop_code varchar(5), "
                        + "cbPayType varchar(30) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_EMPLOYEE)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(5),"
                        + "name varchar(150),"
                        + "age int,"
                        + "nation varchar(150),"
                        + "emp_type varchar(150),"
                        + "chk_day varchar(1),"
                        + "day_salary_amt decimal(10,2),"
                        + "chk_week varchar(1),"
                        + "week_salary_amt decimal(10,2),"
                        + "chk_month varchar(1),"
                        + "month_salary_amt decimal(10,2),"
                        + "chk_year varchar(1),"
                        + "year_salary_amt decimal(10,2),"
                        + "hire_start_date date,"
                        + "hire_end_date date,"
                        + "chk_is_active varchar(1),"
                        + "shop_code varchar(5) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_INGREDIENT)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "menu_code varchar(5),"
                        + "code varchar(5),"
                        + "name varchar(150),"
                        + "ing_type_normal varchar(1),"
                        + "ing_type_special varchar(1),"
                        + "ing_type_discount varchar(1),"
                        + "buyUnitPerSale decimal(10,2),"
                        + "cbBuyUnit varchar(30),"
                        + "buyUnitPrice decimal(10,2),"
                        + "qtyUnit decimal(10,2),"
                        + "cbUnitSale varchar(30),"
                        + "chkHasExpire varchar(1),"
                        + "rdExpireDate varchar(1),"
                        + "dateExpire date,"
                        + "dayCountExpire int,"
                        + "rdExpireBetween varchar(1),"
                        + "dateExpireStart date,"
                        + "dateExpireFinish date"
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_SHOP_PLACE)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "chkPark varchar(1),"
                        + "chkManyPeople varchar(1),"
                        + "chkSchool varchar(1),"
                        + "chkCommunity varchar(1),"
                        + "cbHomeType varchar(30),"
                        + "rentPerMonthAmt decimal(10,2),"
                        + "advanceBefore int,"
                        + "rentTotalAmt decimal(10,2),"
                        + "farFromShop decimal(10,2),"
                        + "chkPayMonthly varchar(1),"
                        + "chkPayAtDate varchar(1),"
                        + "datePay date,"
                        + "rentForSaleAmt decimal(10, 2),"
                        + "predictPeopleWalk int,"
                        + "predictPeopleWantPercent int, "
                        + "cbShopRentType varchar(30) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_PO_ORDER)) {
                //header
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "date_order date,"
                        + "order_no varchar(20),"
                        + "order_by varchar(50), "
                        + "chk_notice_order varchar(1) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }

                //detail
                sql = "CREATE TABLE " + AppConstants.TABLE_PO_ORDER_ITEMS + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "product_code varchar(5),"
                        + "product_name varchar(5),"
                        + "product_type varchar(5),"
                        + "chk_auto_date_order varchar(5),"
                        + "auto_date1 varchar(5),"
                        + "auto_date2 varchar(5),"
                        + "qty varchar(5),"
                        + "price_per_product_amt varchar(5),"
                        + "product_pack varchar(5),"
                        + "total_amt varchar(150), "
                        + "net_total_amt varchar(150) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + AppConstants.TABLE_PO_ORDER_ITEMS + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_HOLIDY_SETTING)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(5),"
                        + "name varchar(150),"
                        + "chk_active varchar(1),"
                        + "year_start varchar(4),"
                        + "year_end varchar(4),"
                        + "rd_lock_day varchar(1),"
                        + "date_holiday date,"
                        + "rd_every_day varchar(1),"
                        + "cb_day_week varchar(20),"
                        + "cb_day_dialy varchar(20),"
                        + "rd_specific_day varchar(1),"
                        + "date_start date,"
                        + "date_end date"
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_MENU_TOP)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "code varchar(10),"
                        + "name varchar(150),"
                        + "chk_active varchar(1),"
                        + "chk_top_week varchar(1),"
                        + "chk_top_month varchar(1),"
                        + "cb_top_day_start varchar(20),"
                        + "cb_top_day_end varchar(20),"
                        + "cb_top_month_start varchar(20),"
                        + "cb_top_month_end varchar(20) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            } else if (tableName.equalsIgnoreCase(AppConstants.TABLE_BASE_DIALY)) {
                sql = "CREATE TABLE " + tableName + " ("
                        + "ID INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "index int,"
                        + "type varchar(150),"
                        + "name varchar(100),"
                        + "desc2 varchar(250),"
                        + "rang1 varchar(30),"
                        + "rang2 varchar(30),"
                        + "status varchar(1) "
                        + ")";
                if (!isTableExists(tableName)) {
                    logger.debug(sql);
                    stmt.execute(sql);
                    MsgUtil.printLog("create table " + tableName + " already.");
                }
            }

            stmt.close();
        } catch (SQLException ex) {
        }
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException ex) {
            }
        }
    }
}
