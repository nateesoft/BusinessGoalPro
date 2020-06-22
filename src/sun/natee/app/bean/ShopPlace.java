package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ShopPlace {
    
    private int id;
    private String chkPark;
    private String chkManyPeople;
    private String chkSchool;
    private String chkCommunity;
    private String cbHomeType;
    private BigDecimal rentPerMonthAmt;
    private int advanceBefore;
    private BigDecimal rentTotalAmt;
    private int farFromShop;
    private String chkPayMonthly;
    private String chkPayAtDate;
    private Date datePay;
    private BigDecimal rentForSaleAmt;
    private int predictPeopleWalk;
    private int predictPeopleWantPercent;
    private String cbShopRentType;

    public ShopPlace(int id, String code, String name) {
        this.id = id;
        this.chkPark = code;
        this.chkManyPeople = name;
    }

    public ShopPlace() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChkPark() {
        return chkPark;
    }

    public void setChkPark(String chkPark) {
        this.chkPark = chkPark;
    }

    public String getChkManyPeople() {
        return chkManyPeople;
    }

    public void setChkManyPeople(String chkManyPeople) {
        this.chkManyPeople = chkManyPeople;
    }

    public String getChkSchool() {
        return chkSchool;
    }

    public void setChkSchool(String chkSchool) {
        this.chkSchool = chkSchool;
    }

    public String getChkCommunity() {
        return chkCommunity;
    }

    public void setChkCommunity(String chkCommunity) {
        this.chkCommunity = chkCommunity;
    }

    public String getCbHomeType() {
        return cbHomeType;
    }

    public void setCbHomeType(String cbHomeType) {
        this.cbHomeType = cbHomeType;
    }

    public BigDecimal getRentPerMonthAmt() {
        return rentPerMonthAmt;
    }

    public void setRentPerMonthAmt(BigDecimal rentPerMonthAmt) {
        this.rentPerMonthAmt = rentPerMonthAmt;
    }

    public int getAdvanceBefore() {
        return advanceBefore;
    }

    public void setAdvanceBefore(int advanceBefore) {
        this.advanceBefore = advanceBefore;
    }

    public BigDecimal getRentTotalAmt() {
        return rentTotalAmt;
    }

    public void setRentTotalAmt(BigDecimal rentTotalAmt) {
        this.rentTotalAmt = rentTotalAmt;
    }

    public int getFarFromShop() {
        return farFromShop;
    }

    public void setFarFromShop(int farFromShop) {
        this.farFromShop = farFromShop;
    }

    public String getChkPayMonthly() {
        return chkPayMonthly;
    }

    public void setChkPayMonthly(String chkPayMonthly) {
        this.chkPayMonthly = chkPayMonthly;
    }

    public String getChkPayAtDate() {
        return chkPayAtDate;
    }

    public void setChkPayAtDate(String chkPayAtDate) {
        this.chkPayAtDate = chkPayAtDate;
    }

    public Date getDatePay() {
        return datePay;
    }

    public void setDatePay(Date datePay) {
        this.datePay = datePay;
    }

    public BigDecimal getRentForSaleAmt() {
        return rentForSaleAmt;
    }

    public void setRentForSaleAmt(BigDecimal rentForSaleAmt) {
        this.rentForSaleAmt = rentForSaleAmt;
    }

    public int getPredictPeopleWalk() {
        return predictPeopleWalk;
    }

    public void setPredictPeopleWalk(int predictPeopleWalk) {
        this.predictPeopleWalk = predictPeopleWalk;
    }

    public int getPredictPeopleWantPercent() {
        return predictPeopleWantPercent;
    }

    public void setPredictPeopleWantPercent(int predictPeopleWantPercent) {
        this.predictPeopleWantPercent = predictPeopleWantPercent;
    }

    public String getCbShopRentType() {
        return cbShopRentType;
    }

    public void setCbShopRentType(String cbShopRentType) {
        this.cbShopRentType = cbShopRentType;
    }

}
