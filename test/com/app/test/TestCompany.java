package com.app.test;

import sun.natee.app.AppConstants;
import java.math.BigDecimal;
import sun.natee.app.bean.Shop;
import sun.natee.app.bean.Device;
import sun.natee.app.bean.Employee;
import sun.natee.app.bean.Menu;
import sun.natee.app.bean.Target;
import sun.natee.app.bean.Unit;
import sun.natee.app.bean.Expense;
import sun.natee.app.bean.Ingredient;

public class TestCompany {
    
    public static void main(String[] args) {
        Target target = new Target(1, "1,000,000 ภายใน 5 ปี", new BigDecimal("1000000"), (365*5));
        
        Shop shop = new Shop(1, "ข้าวไข่เจียวอร่อย", target);
        
        Employee emp1 = new Employee(1, "นที", "สังข์ทองงาม", new BigDecimal("6000"));
        shop.getListEmp().add(emp1);
        
        Expense exp1 = new Expense(1, "เงินจ่ายพนักงาน", shop.computeEmpSalary(), AppConstants.PRICE_PER_MONTH);
        Expense exp2 = new Expense(2, "ค่าเช่าแผง", new BigDecimal("100"), AppConstants.PRICE_PER_DAY);
        Expense exp3 = new Expense(2, "ค่าเช่าห้อง/บ้าน", new BigDecimal("3000"), AppConstants.PRICE_PER_MONTH);
        Expense exp4 = new Expense(2, "ค่าเดินทาง", new BigDecimal("100"), AppConstants.PRICE_PER_DAY);
        
        shop.getListExp().add(exp1);
        shop.getListExp().add(exp2);
        shop.getListExp().add(exp3);
        shop.getListExp().add(exp4);
        
        Unit unit1 = new Unit(1, "กรัม", "");
        Unit unit2 = new Unit(2, "กล่อง", "");
        Unit unit3 = new Unit(3, "ขีด", "");
        Unit unit4 = new Unit(4, "ฝา", "");
        Unit unit5 = new Unit(5, "ฟอง", "");
        Unit unit6 = new Unit(6, "ถ้วย", "");
        
        Menu product = new Menu(1, "ข้าวไข่เจียว", new BigDecimal("30"), unit2);
        
        product.getListDev().add(new Device(1, "กะทะ"));
        product.getListDev().add(new Device(1, "เตาแก๊ส"));
        product.getListDev().add(new Device(1, "ครก"));
        product.getListDev().add(new Device(1, "สาก"));
        
        product.getListIng().add(new Ingredient(1, "กระเทียม", new BigDecimal("5"), unit1));
        product.getListIng().add(new Ingredient(2, "พริก", new BigDecimal("5"), unit1));
        product.getListIng().add(new Ingredient(3, "หมูสับ", new BigDecimal("1"), unit3));
        product.getListIng().add(new Ingredient(4, "น้ำตาล", new BigDecimal("1"), unit1));
        product.getListIng().add(new Ingredient(5, "ผงชูรส", new BigDecimal("1"), unit1));
        product.getListIng().add(new Ingredient(6, "น้ำมัน", new BigDecimal("1"), unit4));
        product.getListIng().add(new Ingredient(7, "ไข่ไก่", new BigDecimal("1"), unit5));
        product.getListIng().add(new Ingredient(8, "ข้าวสวย", new BigDecimal("1"), unit6));
        product.getListIng().add(new Ingredient(9, "ซอส", new BigDecimal("1"), unit4));
        
        shop.getListProduct().add(product);
        
        System.out.println(shop.toString());
    }
}
