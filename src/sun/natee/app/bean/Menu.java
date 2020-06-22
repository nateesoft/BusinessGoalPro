package sun.natee.app.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int id;
    private String code;
    private String name;
    private BigDecimal basePrice;
    private BigDecimal menuPrice;
    private BigDecimal menuSpecialPrice;
    private BigDecimal menuDiscPrice;
    private int makeOrderTime;
    private Unit unit;
    private List<Ingredient> listIng;
    private List<Device> listDev;
    private String shopCode;
    private String unit_sale;

    public Menu(int id, String name, BigDecimal menuPrice, Unit unit) {
        this.id = id;
        this.name = name;
        this.menuPrice = menuPrice;
        this.unit = unit;

        listIng = new ArrayList<>();
        listDev = new ArrayList<>();
    }

    public Menu() {
    }

    public String getUnit_sale() {
        return unit_sale;
    }

    public void setUnit_sale(String unit_sale) {
        this.unit_sale = unit_sale;
    }

    public BigDecimal getMenuSpecialPrice() {
        return menuSpecialPrice;
    }

    public void setMenuSpecialPrice(BigDecimal menuSpecialPrice) {
        this.menuSpecialPrice = menuSpecialPrice;
    }

    public int getMakeOrderTime() {
        return makeOrderTime;
    }

    public void setMakeOrderTime(int makeOrderTime) {
        this.makeOrderTime = makeOrderTime;
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

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(BigDecimal menuPrice) {
        this.menuPrice = menuPrice;
    }

    public BigDecimal getMenuDiscPrice() {
        return menuDiscPrice;
    }

    public void setMenuDiscPrice(BigDecimal menuDiscPrice) {
        this.menuDiscPrice = menuDiscPrice;
    }

    public List<Ingredient> getListIng() {
        return listIng;
    }

    public List<Device> getListDev() {
        return listDev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("        Ingredient [Per Menu]\n");
        for (Ingredient ing : getListIng()) {
            sb.append("        - ").append(ing.getName()).append("  ").append(ing.getBuyUnitPerSale()).append("  ").append(ing.getUnit().getName()).append("\n");
        }
        
        sb.append("        Device\n");
        for (Device dev : getListDev()) {
            sb.append("        - ").append(dev.getName()).append("  ").append("  ").append("\n");
        }

        return sb.toString();
    }

}
