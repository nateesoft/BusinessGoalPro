package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Device {

    private int id;
    private String shopCode;
    private String menuCode;
    private String code;
    private String name;
    private BigDecimal priceAmt;
    private int qty;
    private BigDecimal totalAmt;
    private BigDecimal netTotalAmt;
    private int countDayExpired;
    private int expiredDay;
    private Date dateExpired;
    private String chkUpToSale;
    private String hasExpired;
    private int countPerUsed;
    private String cbDevExpiredDay;

    public Device() {

    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public Device(int id, String name) {
        this.id = id;
        this.name = name;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getNetTotalAmt() {
        return netTotalAmt;
    }

    public void setNetTotalAmt(BigDecimal netTotalAmt) {
        this.netTotalAmt = netTotalAmt;
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

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public int getCountDayExpired() {
        return countDayExpired;
    }

    public void setCountDayExpired(int countDayExpired) {
        this.countDayExpired = countDayExpired;
    }

    public int getCountPerUsed() {
        return countPerUsed;
    }

    public void setCountPerUsed(int countPerUsed) {
        this.countPerUsed = countPerUsed;
    }

    public BigDecimal getPriceAmt() {
        return priceAmt;
    }

    public void setPriceAmt(BigDecimal priceAmt) {
        this.priceAmt = priceAmt;
    }

    public int getExpiredDay() {
        return expiredDay;
    }

    public void setExpiredDay(int expiredDay) {
        this.expiredDay = expiredDay;
    }

    public String getChkUpToSale() {
        return chkUpToSale;
    }

    public void setChkUpToSale(String chkUpToSale) {
        this.chkUpToSale = chkUpToSale;
    }

    public String getHasExpired() {
        return hasExpired;
    }

    public void setHasExpired(String hasExpired) {
        this.hasExpired = hasExpired;
    }

    public String getCbDevExpiredDay() {
        return cbDevExpiredDay;
    }

    public void setCbDevExpiredDay(String cbDevExpiredDay) {
        this.cbDevExpiredDay = cbDevExpiredDay;
    }

}
