package com.app.test;

import java.sql.SQLException;
import sun.natee.app.bean.Shop;
import sun.natee.app.dao.impl.ShopDaoImpl;

public class TestDb {

    public static void main(String[] args) throws SQLException {
        ShopDaoImpl s = new ShopDaoImpl();
        Shop ss = s.findById(null);
        System.out.println(ss.getTimeOpen());
        System.out.println(ss.getTimeClose());
    }
}
