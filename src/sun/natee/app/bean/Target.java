package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Target {

    private int id;
    private String targetName;    
    private BigDecimal startBudgetAmt;
    private BigDecimal startLoanAmt;
    private BigDecimal loanIntPercent;
    private String loanType;
    private BigDecimal businessTargetAmt;
    private int businessPlanCount;
    private String targetType;
    private BigDecimal incomeBusinessAmt;
    private String incomePer;
    private BigDecimal outcomeBusinessAmt;
    private String outcomePer;
    private Date startDate;
    private Date targetDate;
    
    public Target(){
        
    }

    public Target(int id, String targetName, BigDecimal businessTargetAmt, int businessPlanCount) {
        this.id = id;
        this.targetName = targetName;
        this.businessTargetAmt = businessTargetAmt;
        this.businessPlanCount = businessPlanCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public BigDecimal getStartBudgetAmt() {
        return startBudgetAmt;
    }

    public void setStartBudgetAmt(BigDecimal startBudgetAmt) {
        this.startBudgetAmt = startBudgetAmt;
    }

    public BigDecimal getStartLoanAmt() {
        return startLoanAmt;
    }

    public void setStartLoanAmt(BigDecimal startLoanAmt) {
        this.startLoanAmt = startLoanAmt;
    }

    public BigDecimal getLoanIntPercent() {
        return loanIntPercent;
    }

    public void setLoanIntPercent(BigDecimal loanIntPercent) {
        this.loanIntPercent = loanIntPercent;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public BigDecimal getBusinessTargetAmt() {
        return businessTargetAmt;
    }

    public void setBusinessTargetAmt(BigDecimal businessTargetAmt) {
        this.businessTargetAmt = businessTargetAmt;
    }

    public int getBusinessPlanCount() {
        return businessPlanCount;
    }

    public void setBusinessPlanCount(int businessPlanCount) {
        this.businessPlanCount = businessPlanCount;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public BigDecimal getIncomeBusinessAmt() {
        return incomeBusinessAmt;
    }

    public void setIncomeBusinessAmt(BigDecimal incomeBusinessAmt) {
        this.incomeBusinessAmt = incomeBusinessAmt;
    }

    public String getIncomePer() {
        return incomePer;
    }

    public void setIncomePer(String incomePer) {
        this.incomePer = incomePer;
    }

    public BigDecimal getOutcomeBusinessAmt() {
        return outcomeBusinessAmt;
    }

    public void setOutcomeBusinessAmt(BigDecimal outcomeBusinessAmt) {
        this.outcomeBusinessAmt = outcomeBusinessAmt;
    }

    public String getOutcomePer() {
        return outcomePer;
    }

    public void setOutcomePer(String outcomePer) {
        this.outcomePer = outcomePer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

}
