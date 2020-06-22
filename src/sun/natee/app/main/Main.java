package sun.natee.app.main;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import sun.natee.app.AppConstants;
import sun.natee.app.main.panel.ShopPanel;
import sun.natee.app.main.dialog.ShopDialog;
import sun.natee.app.main.dialog.AboutDialog;
import sun.natee.app.main.dialog.ChooseTemplateDialog;
import sun.natee.app.main.dialog.ShopPlaceDialog;
import sun.natee.app.main.dialog.ProcessDialog;
import sun.natee.app.main.dialog.TargetDialog;
import sun.natee.app.bean.Shop;
import sun.natee.app.dao.impl.ShopDaoImpl;
import sun.natee.app.main.dialog.OtherDeptDialog;
import sun.natee.app.main.dialog.TaskDialyDialog;
import sun.natee.app.main.dialog.TodayDialyDialog;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class Main extends javax.swing.JDialog {

    public Main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        loadData();
        lbSystem.setText(StringUtil.showSystem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pbProgress = new javax.swing.JProgressBar();
        tabPaneMain = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        btnRecord = new javax.swing.JButton();
        btnAddShop = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("โปรแกรมวางแผนจัดการร้าน ก่อนดำเนินการขายจริง");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 102, 102)));

        lbSystem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSystem.setText("26/10/2561 21:51:01");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("โปรแกรมวางแผนจัดการร้าน ก่อนดำเนินการขายจริง");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pbProgress.setValue(15);
        pbProgress.setStringPainted(true);

        tabPaneMain.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 1, 3, new java.awt.Color(0, 102, 51)));
        tabPaneMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("เพิ่มร้านที่คุณต้องการบริหาร");

        btnRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/record2.png"))); // NOI18N
        btnRecord.setText("ผลการวิเคราะห์");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        btnAddShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        btnAddShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddShopActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        btnReset.setText("เริ่มต้นใหม่");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jMenu1.setText("แฟ้มข้อมูลหลัก");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem12.setText("เริ่มกิจการใหม่");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem4.setText("วางแผนกิจการ / เริ่มต้นกิจการ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator4);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 0, 153));
        jMenuItem5.setText("เลือก Template ต้นแบบ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setText("จบการทำงาน");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("แฟ้มข้อมูลกิจการ");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem10.setText("ทำเลสำหรับขายสินค้า");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);
        jMenu4.add(jSeparator5);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem7.setText("กำหนดกิจกรรมพื้นฐาน");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem9.setText("ก่อนเปิดร้าน/หลังปิดร้าน");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);
        jMenu4.add(jSeparator6);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("หนี้สินนอกระบบ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("เกี่ยวกับโปรแกม");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem3.setText("ทีมพัฒนา");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator2);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem8.setText("อัพเดตโปรแกรม");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator3);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem6.setText("คู่มือใช้งาน");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pbProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabPaneMain, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddShop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAddShop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddShopActionPerformed
        addShop();
    }//GEN-LAST:event_btnAddShopActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TargetDialog targetDialog = new TargetDialog(null, true);
        targetDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AboutDialog abtDialog = new AboutDialog(null, true);
        abtDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ChooseTemplateDialog templateDialog = new ChooseTemplateDialog(null, true);
        templateDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        userManual();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        updateProgram();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        if (tabPaneMain.getTabCount() <= 0) {
            MsgUtil.showMsg("ท่านยังไม่ได้กำหนดร้าน", null);
        } else {
            loadData();

            String shopId = tabPaneMain.getTitleAt(tabPaneMain.getSelectedIndex());
            shopId = shopId.split("-")[0].trim();
            ShopDaoImpl shop = new ShopDaoImpl();
            try {
                Shop shopBean = shop.findById(Integer.parseInt(shopId));
                if (shopBean != null) {
                    ProcessDialog processDialog = new ProcessDialog(null, true, shopBean.getCode());
                    processDialog.setVisible(true);
                } else {
                    MsgUtil.showMsg("กรุณาเลือกร้าน", null);
                }
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }

        }
    }//GEN-LAST:event_btnRecordActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ShopPlaceDialog init = new ShopPlaceDialog(null, true);
        init.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ต้องการเริ่มต้นข้อมูลใหม่ใช่หรือไม่ ?");
        if (confirm == JOptionPane.YES_OPTION) {
            int size = tabPaneMain.getTabCount();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    tabPaneMain.remove(0);
                }
            }
            //remove all table
            try {
                new ShopDaoImpl().delete(null);
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        TodayDialyDialog today = new TodayDialyDialog(null, true);
        today.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        TaskDialyDialog task = new TaskDialyDialog(null, true);
        task.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ยืนยันการเริ่มกิจการใหม่ ?");
        if (confirm == JOptionPane.YES_OPTION) {
            dropAllTable();
            MsgUtil.showMsg("เริ่มต้นกิจการใหม่ พร้อมแล้ว", null);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        OtherDeptDialog other = new OtherDeptDialog(null, true);
        other.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddShop;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JProgressBar pbProgress;
    private javax.swing.JTabbedPane tabPaneMain;
    // End of variables declaration//GEN-END:variables

    private void addShop() {
        if (tabPaneMain.getTabCount() > 0) {
            MsgUtil.showMsg("ข้อมูลร้านเพิ่มแล้ว ไม่สามารถเพิ่มร้านได้", null);
            return;
        }

        ShopDialog shopDialog = new ShopDialog(null, true, null);
        shopDialog.setVisible(true);

        if (shopDialog.getData() != null) {
            ShopDaoImpl shopDao = new ShopDaoImpl();
            Shop item;
            try {
                item = shopDao.findById(shopDialog.getData().getId());
                if (item != null) {
                    tabPaneMain.add(new ShopPanel(item.getCode()));
                    tabPaneMain.setTitleAt(tabPaneMain.getTabCount() - 1, item.getId() + " - " + item.getShopName());
                }
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }

    private void loadData() {
        tabPaneMain.removeAll();

        ShopDaoImpl shopDao = new ShopDaoImpl();
        try {
            List<Shop> listShop = shopDao.findAll();
            for (Shop shop : listShop) {
                AppConstants.SHOP_CODE_CURRENT = shop.getCode();
                tabPaneMain.add(new ShopPanel(shop.getCode()));
                tabPaneMain.setTitleAt(tabPaneMain.getTabCount() - 1, shop.getId() + " - " + shop.getShopName());
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void dropAllTable() {
        AppUI.dropAllTable();
    }

    private void userManual() {
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("files/UserManual.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void updateProgram() {

    }
}
