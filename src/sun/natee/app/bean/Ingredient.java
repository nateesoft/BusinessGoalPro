package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Ingredient {

    private int id;
    private String menuCode;
    private String code;
    private String name;
    private String ingTypeNormal;
    private String ingTypeSpecial;
    private String ingTypeDiscount;
    private BigDecimal buyUnitPerSale;
    private Unit unit;
    private String cbBuyUnit;
    private BigDecimal buyUnitPrice;
    private BigDecimal qtyUnit;
    private String cbUnitSale;
    private String chkHasExpire;
    private String rdExpireDate;
    private Date dateExpire;
    private int dayCountExpire;
    private String rdExpireBetween;
    private Date dateExpireStart;
    private Date dateExpireFinish;

    public Ingredient(int id, String name, BigDecimal buyUnitPerSale, Unit unit) {
        this.id = id;
        this.name = name;
        this.buyUnitPerSale = buyUnitPerSale;
        this.unit = unit;
    }

    public Ingredient() {
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getIngTypeNormal() {
        return ingTypeNormal;
    }

    public void setIngTypeNormal(String ingTypeNormal) {
        this.ingTypeNormal = ingTypeNormal;
    }

    public String getIngTypeSpecial() {
        return ingTypeSpecial;
    }

    public void setIngTypeSpecial(String ingTypeSpecial) {
        this.ingTypeSpecial = ingTypeSpecial;
    }

    public String getIngTypeDiscount() {
        return ingTypeDiscount;
    }

    public void setIngTypeDiscount(String ingTypeDiscount) {
        this.ingTypeDiscount = ingTypeDiscount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
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

    public BigDecimal getBuyUnitPerSale() {
        return buyUnitPerSale;
    }

    public void setBuyUnitPerSale(BigDecimal buyUnitPerSale) {
        this.buyUnitPerSale = buyUnitPerSale;
    }

    public String getCbBuyUnit() {
        return cbBuyUnit;
    }

    public void setCbBuyUnit(String cbBuyUnit) {
        this.cbBuyUnit = cbBuyUnit;
    }

    public BigDecimal getBuyUnitPrice() {
        return buyUnitPrice;
    }

    public void setBuyUnitPrice(BigDecimal buyUnitPrice) {
        this.buyUnitPrice = buyUnitPrice;
    }

    public BigDecimal getQtyUnit() {
        return qtyUnit;
    }

    public void setQtyUnit(BigDecimal qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    public String getCbUnitSale() {
        return cbUnitSale;
    }

    public void setCbUnitSale(String cbUnitSale) {
        this.cbUnitSale = cbUnitSale;
    }

    public String getChkHasExpire() {
        return chkHasExpire;
    }

    public void setChkHasExpire(String chkHasExpire) {
        this.chkHasExpire = chkHasExpire;
    }

    public String getRdExpireDate() {
        return rdExpireDate;
    }

    public void setRdExpireDate(String rdExpireDate) {
        this.rdExpireDate = rdExpireDate;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }

    public int getDayCountExpire() {
        return dayCountExpire;
    }

    public void setDayCountExpire(int dayCountExpire) {
        this.dayCountExpire = dayCountExpire;
    }

    public String getRdExpireBetween() {
        return rdExpireBetween;
    }

    public void setRdExpireBetween(String rdExpireBetween) {
        this.rdExpireBetween = rdExpireBetween;
    }

    public Date getDateExpireStart() {
        return dateExpireStart;
    }

    public void setDateExpireStart(Date dateExpireStart) {
        this.dateExpireStart = dateExpireStart;
    }

    public Date getDateExpireFinish() {
        return dateExpireFinish;
    }

    public void setDateExpireFinish(Date dateExpireFinish) {
        this.dateExpireFinish = dateExpireFinish;
    }

}
