package com.app.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.List;
import sun.natee.app.bean.Device;
import sun.natee.app.dao.impl.DeviceDaoImpl;
import sun.natee.app.main.util.MsgUtil;

public class TestDevice {

    public static void main(String[] args) {
        int dayCount = 300;
        DeviceDaoImpl devImpl = new DeviceDaoImpl();
        BigDecimal netTotalAmt = BigDecimal.ZERO;
        try {
            List<Device> listDev = devImpl.findAll("01");
            for (Device dev : listDev) {
                System.out.println(dev.getName());
                if (dev.getHasExpired().equals("Y")) {
                    if (dev.getChkUpToSale().equals("Y")) {
                        int countPerUsed = dev.getCountPerUsed();
                        BigDecimal a = new BigDecimal("" + dayCount);
                        BigDecimal b = new BigDecimal("" + countPerUsed);
                        BigDecimal c = a.divide(b, 2, RoundingMode.HALF_UP);
                        BigDecimal d = c.multiply(dev.getPriceAmt());
                        
                        netTotalAmt = netTotalAmt.add(d);
                        System.out.println(netTotalAmt);
                    }
                }
            }
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }
    }
}
