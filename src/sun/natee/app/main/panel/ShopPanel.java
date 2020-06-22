package sun.natee.app.main.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import sun.natee.app.AppConstants;
import sun.natee.app.main.dialog.ShopDialog;
import sun.natee.app.main.dialog.ShopPlaceDialog;

public class ShopPanel extends javax.swing.JPanel {

    private final String shopCode;
    private final JButton[] button = new JButton[6];

    public ShopPanel(String shopCode) {
        initComponents();

        this.shopCode = shopCode;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 2));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pan_1.png"))); // NOI18N
        btn3.setText("อุปกรณ์");
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btn3);

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btn1.setText("เมนูอาหาร");
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btn1);

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingredient.png"))); // NOI18N
        btn2.setText("วัตถุดิบ");
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btn2);

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/expense.png"))); // NOI18N
        btn6.setText("สาธารณูปโภค");
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btn6);

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employee.png"))); // NOI18N
        btn4.setText("พนักงาน");
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btn4);

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shop.png"))); // NOI18N
        btn5.setText("ค่าเช่าร้าน");
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btn5);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    // End of variables declaration//GEN-END:variables

    private void init() {
        button[0] = btn1;
        button[1] = btn2;
        button[2] = btn3;
        button[3] = btn4;
        button[4] = btn5;
        button[5] = btn6;

        for (final JButton btn : button) {
            btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    ShopDialog shopDialog = new ShopDialog(null, true, AppConstants.SHOP_CODE_CURRENT);
                    switch (btn.getText()) {
                        case "อุปกรณ์":
                            shopDialog.changeTab(0);
                            shopDialog.setVisible(true);
                            break;
                        case "เมนูอาหาร":
                        case "วัตถุดิบ":
                            shopDialog.changeTab(1);
                            shopDialog.setVisible(true);
                            break;
                        case "พนักงาน":
                            shopDialog.changeTab(3);
                            shopDialog.setVisible(true);
                            break;
                        case "สาธารณูปโภค":
                            shopDialog.changeTab(2);
                            shopDialog.setVisible(true);
                            break;
                        case "ค่าเช่าร้าน":
                            ShopPlaceDialog init = new ShopPlaceDialog(null, true);
                            init.setVisible(true);
                            break;
                    }
                }
            });
        }
    }
}
