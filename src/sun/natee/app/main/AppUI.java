package sun.natee.app.main;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.natee.app.dao.impl.BaseDialyDaoImpl;
import sun.natee.app.dao.impl.DeviceDaoImpl;
import sun.natee.app.dao.impl.EmployeeDaoImpl;
import sun.natee.app.dao.impl.ExpenseDaoImpl;
import sun.natee.app.dao.impl.HolidaySettingDaoImpl;
import sun.natee.app.dao.impl.IngredientDaoImpl;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.dao.impl.MenuTopDaoImpl;
import sun.natee.app.dao.impl.POItemsDaoImpl;
import sun.natee.app.dao.impl.ShopDaoImpl;
import sun.natee.app.dao.impl.ShopPlaceDaoImpl;
import sun.natee.app.dao.impl.TargetDaoImpl;

public class AppUI {

    public static String DATA_DB = "data";

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }

        Properties prop = new Properties();
        try {
            if (new File("config.txt").exists()) {
                prop.load(new FileInputStream(new File("config.txt")));
                DATA_DB = prop.getProperty("db");
                if (DATA_DB == null && DATA_DB.equals("")) {
                    DATA_DB = "data";
                }
            }
        } catch (IOException e) {
            DATA_DB = "data";
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // create table to derby database
                new ShopDaoImpl().init();
                new DeviceDaoImpl().init();
                new MenuDaoImpl().init();
                new ExpenseDaoImpl().init();
                new EmployeeDaoImpl().init();
                new IngredientDaoImpl().init();
                new TargetDaoImpl().init();
                new ShopPlaceDaoImpl().init();
                new POItemsDaoImpl().init();
                new MenuTopDaoImpl().init();
                new HolidaySettingDaoImpl().init();
                new BaseDialyDaoImpl().init();

                Main dialog = new Main(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }

        });
    }

    public static void dropAllTable() {
        new ShopDaoImpl().dropTable();
        new DeviceDaoImpl().dropTable();
        new MenuDaoImpl().dropTable();
        new ExpenseDaoImpl().dropTable();
        new EmployeeDaoImpl().dropTable();
        new IngredientDaoImpl().dropTable();
        new TargetDaoImpl().dropTable();
        new ShopPlaceDaoImpl().dropTable();
        new POItemsDaoImpl().dropTable();
        new HolidaySettingDaoImpl().dropTable();
        new MenuTopDaoImpl().dropTable();
        new BaseDialyDaoImpl().dropTable();
    }
}
