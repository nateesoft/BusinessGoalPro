package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class POItems {

    private int id;
    private Date dateOrder;
    private String orderNo;
    private String orderBy;
    private String chkNoticeOrder;
    private String productCode;
    private String productName;
    private String productType;
    private String chkAutoDateOrder;
    private Date autoDate1;
    private Date autoDate2;
    private int qty;
    private BigDecimal pricePerProduct;
    private String productPack;
    private BigDecimal totalAmt;
    private BigDecimal netTotalAmt;
    private List<POItems> listItems;

    public POItems(int id, String code, String name) {
        this.id = id;
        this.productCode = code;
        this.productName = name;
    }

    public POItems() {
        listItems = new ArrayList<>();
    }

    public List<POItems> getListItems() {
        return listItems;
    }

    public void setListItems(List<POItems> listItems) {
        this.listItems = listItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getChkNoticeOrder() {
        return chkNoticeOrder;
    }

    public void setChkNoticeOrder(String chkNoticeOrder) {
        this.chkNoticeOrder = chkNoticeOrder;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getChkAutoDateOrder() {
        return chkAutoDateOrder;
    }

    public void setChkAutoDateOrder(String chkAutoDateOrder) {
        this.chkAutoDateOrder = chkAutoDateOrder;
    }

    public Date getAutoDate1() {
        return autoDate1;
    }

    public void setAutoDate1(Date autoDate1) {
        this.autoDate1 = autoDate1;
    }

    public Date getAutoDate2() {
        return autoDate2;
    }

    public void setAutoDate2(Date autoDate2) {
        this.autoDate2 = autoDate2;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPricePerProduct() {
        return pricePerProduct;
    }

    public void setPricePerProduct(BigDecimal pricePerProduct) {
        this.pricePerProduct = pricePerProduct;
    }

    public String getProductPack() {
        return productPack;
    }

    public void setProductPack(String productPack) {
        this.productPack = productPack;
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

}
