package sun.natee.app.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private int id;
    private String code;
    private String timeOpen;
    private String timeClose;
    private String shopName;
    private String shopOwner;
    private String chkMon;
    private String tOMon;
    private String tCMon;
    private String chkTue;
    private String tOTue;
    private String tCTue;
    private String chkWed;
    private String tOWed;
    private String tCWed;
    private String chkThu;
    private String tOThu;
    private String tCThu;
    private String chkFri;
    private String tOFri;
    private String tCFri;
    private String chkSat;
    private String tOSat;
    private String tCSat;
    private String chkSun;
    private String tOSun;
    private String tCSun;
    private String chkUptoShop;

    private List<Menu> listProduct = null;
    private List<Employee> listEmp = null;
    private List<Expense> listExp = null;
    private List<Device> listDev = null;
    private Target target;

    public Shop() {
    }

    public Shop(int id, String shopName, Target target) {
        this.id = id;
        this.shopName = shopName;
        this.target = target;
        listProduct = new ArrayList<>();
        listEmp = new ArrayList<>();
        listExp = new ArrayList<>();
        listDev = new ArrayList<>();
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Menu> getListProduct() {
        return listProduct;
    }

    public List<Employee> getListEmp() {
        return listEmp;
    }

    public List<Expense> getListExp() {
        return listExp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------- BRANCH DETAIL ---------------\n");
        sb.append("branch name: ").append(getShopName()).append("\n");
        sb.append("target: ").append(getTarget().getBusinessTargetAmt()).append(" บาท\n");

        sb.append("list product: ").append("\n");
        BigDecimal totalProduct = BigDecimal.ZERO;
        for (Menu product : getListProduct()) {
            sb.append("    - ").append(product.getName()).append("  ").append(product.getMenuPrice()).append("\n");
            sb.append(product.toString());
            totalProduct = totalProduct.add(product.getMenuPrice());
        }

        sb.append("list employee: ").append("\n");
        for (Employee emp : getListEmp()) {
            sb.append("    - ").append(emp.getName()).append(" ").append("\n");
        }

        BigDecimal totalExpense = BigDecimal.ZERO;
        sb.append("list expense [Per Day]: ").append("\n");
        for (Expense expense : getListExp()) {
            sb.append("    - ").append(expense.getName()).append("  ").append(expense.convertToDay()).append("\n");
            totalExpense = totalExpense.add(expense.convertToDay());
        }

        sb.append("---------- TOTAL EXPENSE ----------\n");
        sb.append("summary expense: ").append(totalExpense.doubleValue()).append("\n");

        BigDecimal totalTargetAdd = totalExpense.add(getTarget().getBusinessTargetAmt());

        BigDecimal totalPcs = totalTargetAdd.divide(totalProduct, 0, RoundingMode.UP);
        BigDecimal totalProfit = totalPcs.multiply(totalProduct);
        sb.append("--------------- PROFIT ---------------\n");
        sb.append("profit when: ").append(totalPcs.intValue()).append(" Pcs. = ").append(totalProfit).append("\n\n");
        sb.append("profit per day: ").append(totalProfit.subtract(totalExpense)).append("\n");
        sb.append("profit per month: ").append((totalProfit.subtract(totalExpense)).multiply(new BigDecimal("30"))).append("\n");
        sb.append("profit per year: ").append((totalProfit.subtract(totalExpense)).multiply(new BigDecimal("365"))).append("\n");

        return sb.toString();
    }

    public BigDecimal computeEmpSalary() {
        BigDecimal salary = BigDecimal.ZERO;
        for (Employee emp : getListEmp()) {
            salary = salary.add(emp.getDaySalary());
        }

        return salary;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    public String getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(String timeClose) {
        this.timeClose = timeClose;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(String shopOwner) {
        this.shopOwner = shopOwner;
    }

    public String getChkMon() {
        return chkMon;
    }

    public void setChkMon(String chkMon) {
        this.chkMon = chkMon;
    }

    public String gettOMon() {
        return tOMon;
    }

    public void settOMon(String tOMon) {
        this.tOMon = tOMon;
    }

    public String gettCMon() {
        return tCMon;
    }

    public void settCMon(String tCMon) {
        this.tCMon = tCMon;
    }

    public String getChkTue() {
        return chkTue;
    }

    public void setChkTue(String chkTue) {
        this.chkTue = chkTue;
    }

    public String gettOTue() {
        return tOTue;
    }

    public void settOTue(String tOTue) {
        this.tOTue = tOTue;
    }

    public String gettCTue() {
        return tCTue;
    }

    public void settCTue(String tCTue) {
        this.tCTue = tCTue;
    }

    public String getChkWed() {
        return chkWed;
    }

    public void setChkWed(String chkWed) {
        this.chkWed = chkWed;
    }

    public String gettOWed() {
        return tOWed;
    }

    public void settOWed(String tOWed) {
        this.tOWed = tOWed;
    }

    public String gettCWed() {
        return tCWed;
    }

    public void settCWed(String tCWed) {
        this.tCWed = tCWed;
    }

    public String getChkThu() {
        return chkThu;
    }

    public void setChkThu(String chkThu) {
        this.chkThu = chkThu;
    }

    public String gettOThu() {
        return tOThu;
    }

    public void settOThu(String tOThu) {
        this.tOThu = tOThu;
    }

    public String gettCThu() {
        return tCThu;
    }

    public void settCThu(String tCThu) {
        this.tCThu = tCThu;
    }

    public String getChkFri() {
        return chkFri;
    }

    public void setChkFri(String chkFri) {
        this.chkFri = chkFri;
    }

    public String gettOFri() {
        return tOFri;
    }

    public void settOFri(String tOFri) {
        this.tOFri = tOFri;
    }

    public String gettCFri() {
        return tCFri;
    }

    public void settCFri(String tCFri) {
        this.tCFri = tCFri;
    }

    public String getChkSat() {
        return chkSat;
    }

    public void setChkSat(String chkSat) {
        this.chkSat = chkSat;
    }

    public String gettOSat() {
        return tOSat;
    }

    public void settOSat(String tOSat) {
        this.tOSat = tOSat;
    }

    public String gettCSat() {
        return tCSat;
    }

    public void settCSat(String tCSat) {
        this.tCSat = tCSat;
    }

    public String getChkSun() {
        return chkSun;
    }

    public void setChkSun(String chkSun) {
        this.chkSun = chkSun;
    }

    public String gettOSun() {
        return tOSun;
    }

    public void settOSun(String tOSun) {
        this.tOSun = tOSun;
    }

    public String gettCSun() {
        return tCSun;
    }

    public void settCSun(String tCSun) {
        this.tCSun = tCSun;
    }

    public String getChkUptoShop() {
        return chkUptoShop;
    }

    public void setChkUptoShop(String chkUptoShop) {
        this.chkUptoShop = chkUptoShop;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Device> getListDev() {
        return listDev;
    }

    public void setListDev(List<Device> listDev) {
        this.listDev = listDev;
    }

}
