package sun.natee.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Target;
import sun.natee.app.dao.BaseDao;
import sun.natee.app.db.Database;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class TargetDaoImpl implements BaseDao<Target, Integer> {
    private final Logger logger = Logger.getLogger(TargetDaoImpl.class);
    private final String table = AppConstants.TABLE_TARGET_PLAN;

    @Override
    public void init() {
        Database.initTable(table);
    }

    @Override
    public Target findById(Integer id) throws SQLException {
        String sql = "SELECT * FROM " + table + "";
        logger.debug(sql);
        try (ResultSet rs = Database.getConnect().createStatement().executeQuery(sql)) {
            if (rs.next()) {
                return mapping(rs, new Target());
            }
        }

        return null;
    }

    @Override
    public int save(Target bean) throws SQLException {
        if (isUpdate(bean)) {
            return update(bean);
        }

        String sql = "INSERT INTO " + table + ""
                + "(START_BUDGET_AMT, START_LOAN_AMT, TARGET_NAME, LOAN_INT_PERCENT, "
                + "LOAN_TYPE, BUSINESS_TARGET_AMT, BUSINESS_PLAN_COUNT, TARGET_TYPE, "
                + "INCOME_BUSINESS_AMT, INCOME_PER, OUTCOME_BUSINESS_AMT, OUTCOME_PER,"
                + "START_DATE, TARGET_DATE) "
                + "VALUES("
                + "" + bean.getStartBudgetAmt() + ","
                + "" + bean.getStartLoanAmt() + ","
                + "'" + bean.getTargetName() + "',"
                + "" + bean.getLoanIntPercent() + ","
                + "'" + bean.getLoanType() + "',"
                + "" + bean.getBusinessTargetAmt() + ","
                + "" + bean.getBusinessPlanCount() + ","
                + "'" + bean.getTargetType() + "',"
                + "" + bean.getIncomeBusinessAmt() + ","
                + "'" + bean.getIncomePer() + "',"
                + "" + bean.getOutcomeBusinessAmt() + ","
                + "'" + bean.getOutcomePer() + "',"
                + "'" + StringUtil.dateToDb(bean.getStartDate()) + "',"
                + "'" + StringUtil.dateToDb(bean.getTargetDate()) + "'"
                + ")";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public int update(Target bean) throws SQLException {
        String sql = "UPDATE " + table + " SET "
                + "START_BUDGET_AMT=" + bean.getStartBudgetAmt() + ", "
                + "START_LOAN_AMT=" + bean.getStartLoanAmt() + ", "
                + "TARGET_NAME='" + bean.getTargetName() + "', "
                + "LOAN_INT_PERCENT=" + bean.getLoanIntPercent() + ", "
                + "LOAN_TYPE='" + bean.getLoanType() + "', "
                + "BUSINESS_TARGET_AMT=" + bean.getBusinessTargetAmt() + ", "
                + "BUSINESS_PLAN_COUNT=" + bean.getBusinessPlanCount() + ", "
                + "TARGET_TYPE='" + bean.getTargetType() + "', "
                + "INCOME_BUSINESS_AMT=" + bean.getIncomeBusinessAmt() + ", "
                + "INCOME_PER='" + bean.getIncomePer() + "', "
                + "OUTCOME_BUSINESS_AMT=" + bean.getOutcomeBusinessAmt() + ", "
                + "OUTCOME_PER='" + bean.getOutcomePer() + "', "
                + "START_DATE='" + StringUtil.dateToDb(bean.getStartDate()) + "', "
                + "TARGET_DATE='" + StringUtil.dateToDb(bean.getTargetDate()) + "' ";
        MsgUtil.printLog(sql);
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public List<Target> findAll() throws SQLException {
        List<Target> listTarget = new ArrayList<>();
        Target target = findById(null);
        listTarget.add(target);

        return listTarget;
    }

    @Override
    public int delete(Integer id) throws SQLException {
        String sql = "DELETE FROM " + table + "";
        logger.debug(sql);
        return Database.getConnect().createStatement().executeUpdate(sql);
    }

    @Override
    public Target mapping(ResultSet rs, Target bean) throws SQLException {
        bean.setId(rs.getInt("ID"));
        bean.setStartBudgetAmt(rs.getBigDecimal("START_BUDGET_AMT"));
        bean.setStartLoanAmt(rs.getBigDecimal("START_LOAN_AMT"));
        bean.setTargetName(rs.getString("TARGET_NAME"));
        bean.setLoanIntPercent(rs.getBigDecimal("LOAN_INT_PERCENT"));
        bean.setLoanType(rs.getString("LOAN_TYPE"));
        bean.setBusinessTargetAmt(rs.getBigDecimal("BUSINESS_TARGET_AMT"));
        bean.setBusinessPlanCount(rs.getInt("BUSINESS_PLAN_COUNT"));
        bean.setTargetType(rs.getString("TARGET_TYPE"));
        bean.setIncomeBusinessAmt(rs.getBigDecimal("INCOME_BUSINESS_AMT"));
        bean.setIncomePer(rs.getString("INCOME_PER"));
        bean.setOutcomeBusinessAmt(rs.getBigDecimal("OUTCOME_BUSINESS_AMT"));
        bean.setOutcomePer(rs.getString("OUTCOME_PER"));
        bean.setStartDate(rs.getDate("START_DATE"));
        bean.setTargetDate(rs.getDate("TARGET_DATE"));

        return bean;
    }

    @Override
    public boolean isUpdate(Target bean) throws SQLException {
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
