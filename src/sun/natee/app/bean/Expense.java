package sun.natee.app.bean;

import sun.natee.app.AppConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Expense {

    private int id;
    private String code;
    private String name;
    private BigDecimal dialyPayAmt;
    private BigDecimal weeklyPayAmt;
    private BigDecimal monthlyPayAmt;
    private BigDecimal price;
    private String shopCode;
    private int priceType;
    private String cbPayType;

    public Expense(int id, String name, BigDecimal price, int priceType) {
        this.id = id;
        this.name = name;
        this.dialyPayAmt = price;
        this.priceType = priceType;
    }

    public Expense() {
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

    public BigDecimal convertToDay() {
        if (priceType == AppConstants.PRICE_PER_MONTH) {
            return price.divide(new BigDecimal("30"), 2, RoundingMode.HALF_DOWN);
        }
        if (priceType == AppConstants.PRICE_HALF_YEAR) {
            return price.divide(new BigDecimal("180"), 2, RoundingMode.HALF_DOWN);
        }
        if (priceType == AppConstants.PRICE_PER_YEAR) {
            return price.divide(new BigDecimal("365"), 2, RoundingMode.HALF_DOWN);
        }

        return this.price;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getDialyPayAmt() {
        return dialyPayAmt;
    }

    public void setDialyPayAmt(BigDecimal dialyPayAmt) {
        this.dialyPayAmt = dialyPayAmt;
    }

    public BigDecimal getWeeklyPayAmt() {
        return weeklyPayAmt;
    }

    public void setWeeklyPayAmt(BigDecimal weeklyPayAmt) {
        this.weeklyPayAmt = weeklyPayAmt;
    }

    public BigDecimal getMonthlyPayAmt() {
        return monthlyPayAmt;
    }

    public void setMonthlyPayAmt(BigDecimal monthlyPayAmt) {
        this.monthlyPayAmt = monthlyPayAmt;
    }

    public String getCbPayType() {
        return cbPayType;
    }

    public void setCbPayType(String cbPayType) {
        this.cbPayType = cbPayType;
    }

}
