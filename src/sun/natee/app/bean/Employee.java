package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {

    private int id;
    private String code;
    private String name;
    private BigDecimal daySalary;
    private BigDecimal weekSalary;
    private BigDecimal monthSalary;
    private BigDecimal yearSalary;
    private int age;
    private String nation;
    private String empType;
    private String chkDay;
    private String chkWeek;
    private String chkMonth;
    private String chkYear;
    private String chkIsActive;
    private Date hireStartDate;
    private Date hireEndDate;
    private String shopCode;

    public Employee(int id, String name, String lastName, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.monthSalary = salary;
    }

    public Employee() {
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(BigDecimal daySalary) {
        this.daySalary = daySalary;
    }

    public BigDecimal getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(BigDecimal weekSalary) {
        this.weekSalary = weekSalary;
    }

    public BigDecimal getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(BigDecimal monthSalary) {
        this.monthSalary = monthSalary;
    }

    public BigDecimal getYearSalary() {
        return yearSalary;
    }

    public void setYearSalary(BigDecimal yearSalary) {
        this.yearSalary = yearSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getChkDay() {
        return chkDay;
    }

    public void setChkDay(String chkDay) {
        this.chkDay = chkDay;
    }

    public String getChkWeek() {
        return chkWeek;
    }

    public void setChkWeek(String chkWeek) {
        this.chkWeek = chkWeek;
    }

    public String getChkMonth() {
        return chkMonth;
    }

    public void setChkMonth(String chkMonth) {
        this.chkMonth = chkMonth;
    }

    public String getChkYear() {
        return chkYear;
    }

    public void setChkYear(String chkYear) {
        this.chkYear = chkYear;
    }

    public String getChkIsActive() {
        return chkIsActive;
    }

    public void setChkIsActive(String chkIsActive) {
        this.chkIsActive = chkIsActive;
    }

    public Date getHireStartDate() {
        return hireStartDate;
    }

    public void setHireStartDate(Date hireStartDate) {
        this.hireStartDate = hireStartDate;
    }

    public Date getHireEndDate() {
        return hireEndDate;
    }

    public void setHireEndDate(Date hireEndDate) {
        this.hireEndDate = hireEndDate;
    }

}
