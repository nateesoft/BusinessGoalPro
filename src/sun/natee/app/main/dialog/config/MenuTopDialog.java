package sun.natee.app.main.dialog.config;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sun.natee.app.bean.Menu;
import sun.natee.app.bean.MenuTop;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.dao.impl.MenuTopDaoImpl;
import sun.natee.app.main.util.MsgUtil;

public class MenuTopDialog extends javax.swing.JDialog {

    private final DefaultTableModel model;
    private final String shopCode;

    public MenuTopDialog(java.awt.Frame parent, boolean modal, String shopCode) {
        super(parent, modal);
        initComponents();

        this.shopCode = shopCode;
        model = (DefaultTableModel) tb.getModel();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        chkTopWeek = new javax.swing.JRadioButton();
        cbTopDayStart = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbTopDayEnd = new javax.swing.JComboBox();
        chkTopMonth = new javax.swing.JRadioButton();
        cbTopMonthStart = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbTopMonthEnd = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        chkActive = new javax.swing.JCheckBox();
        cbCode = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("กำหนดเมนูเมนูขายดี");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัสเมนู");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ชือเมนูอาหาร");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(chkTopWeek);
        chkTopWeek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkTopWeek.setSelected(true);
        chkTopWeek.setText("เลือกวันที่ขายดีของสัปดาห์");

        cbTopDayStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTopDayStart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "จันทร์", "อังคาร", "พุธ", "พฤหัสบดี", "ศุกร์", "เสาร์", "อาทิตย์" }));
        cbTopDayStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopDayStartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ถึง");

        cbTopDayEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTopDayEnd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "จันทร์", "อังคาร", "พุธ", "พฤหัสบดี", "ศุกร์", "เสาร์", "อาทิตย์" }));
        cbTopDayEnd.setSelectedIndex(4);
        cbTopDayEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopDayEndActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkTopMonth);
        chkTopMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkTopMonth.setText("เลือกเดือนที่ขายดีของปี");

        cbTopMonthStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTopMonthStart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "มกราคม", "กุมพาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฏาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        cbTopMonthStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopMonthStartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ถึง");

        cbTopMonthEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTopMonthEnd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "มกราคม", "กุมพาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฏาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        cbTopMonthEnd.setSelectedIndex(11);
        cbTopMonthEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopMonthEndActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        btnAdd.setText("เพิ่มข้อมูล");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTopWeek)
                    .addComponent(chkTopMonth))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTopMonthStart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTopDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTopDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTopMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTopWeek)
                    .addComponent(cbTopDayStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbTopDayEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTopMonth)
                    .addComponent(cbTopMonthStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbTopMonthEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Active", "TopWeek", "TopMonth", "TopDayStart", "TopDayEnd", "TopMonthStart", "TopMonthEnd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tb);
        if (tb.getColumnModel().getColumnCount() > 0) {
            tb.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb.getColumnModel().getColumn(1).setPreferredWidth(200);
            tb.getColumnModel().getColumn(2).setPreferredWidth(150);
            tb.getColumnModel().getColumn(3).setPreferredWidth(120);
            tb.getColumnModel().getColumn(4).setPreferredWidth(120);
            tb.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        chkActive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkActive.setSelected(true);
        chkActive.setText("ใช้งานอยู่");

        cbCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCodeItemStateChanged(evt);
            }
        });

        jMenu1.setText("แฟ้มข้อมูล");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("Clear Data");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkActive)
                                .addGap(0, 176, Short.MAX_VALUE))
                            .addComponent(txtName))
                        .addGap(0, 180, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chkActive)
                    .addComponent(cbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbTopDayStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopDayStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTopDayStartActionPerformed

    private void cbTopDayEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopDayEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTopDayEndActionPerformed

    private void cbTopMonthStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopMonthStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTopMonthStartActionPerformed

    private void cbTopMonthEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopMonthEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTopMonthEndActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addRow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        clearData();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cbCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCodeItemStateChanged
        changeCombo();
    }//GEN-LAST:event_cbCodeItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCode;
    private javax.swing.JComboBox cbTopDayEnd;
    private javax.swing.JComboBox cbTopDayStart;
    private javax.swing.JComboBox cbTopMonthEnd;
    private javax.swing.JComboBox cbTopMonthStart;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JRadioButton chkTopMonth;
    private javax.swing.JRadioButton chkTopWeek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void addRow() {
        MenuTop bean = new MenuTop();
        bean.setCode(pullCode(cbCode.getSelectedItem().toString()));
        bean.setName(txtName.getText());
        bean.setChkActive(chkActive.isSelected() ? "Y" : "N");
        bean.setChkTopWeek(chkTopWeek.isSelected() ? "Y" : "N");
        bean.setChkTopMonth(chkTopMonth.isSelected() ? "Y" : "N");
        bean.setCbTopDayStart(cbTopDayStart.getSelectedItem().toString());
        bean.setCbTopDayEnd(cbTopDayEnd.getSelectedItem().toString());
        bean.setCbTopMonthStart(cbTopMonthStart.getSelectedItem().toString());
        bean.setCbTopMonthEnd(cbTopMonthStart.getSelectedItem().toString());
        MenuTopDaoImpl menuTop = new MenuTopDaoImpl();
        try {
            menuTop.save(bean);
            addRowToModel(model, bean);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void loadData() {
        MenuTopDaoImpl menuTop = new MenuTopDaoImpl();
        try {
            // load all menu
            MenuDaoImpl menuDao = new MenuDaoImpl();
            List<Menu> listMenu = menuDao.findAll();
            cbCode.addItem("เลือกรายการ");
            for (Menu menu : listMenu) {
                cbCode.addItem(menu.getName() + " (" + menu.getCode() + ")");
            }

            List<MenuTop> listBean = menuTop.findAll();
            int size = model.getRowCount();
            for (int i = 0; i < size; i++) {
                model.removeRow(0);
            }
            for (MenuTop bean : listBean) {
                addRowToModel(model, bean);
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void addRowToModel(DefaultTableModel model, MenuTop bean) {
        model.addRow(new Object[]{
            bean.getCode(),
            bean.getName(),
            bean.getChkActive(),
            bean.getChkTopWeek(),
            bean.getChkTopMonth(),
            bean.getCbTopDayStart(),
            bean.getCbTopDayEnd(),
            bean.getCbTopMonthStart(),
            bean.getCbTopMonthEnd()
        });
    }

    private void clearData() {
        MenuTopDaoImpl dao = new MenuTopDaoImpl();
        try {
            dao.delete(null);
            loadData();
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }
    }

    private String pullCode(String codeStr) {
        codeStr = codeStr.substring(codeStr.indexOf("(") + 1, codeStr.lastIndexOf(")"));
        return codeStr;
    }

    private void changeCombo() {
        if (cbCode.getSelectedIndex() > 0) {
            String menuCode = pullCode(cbCode.getSelectedItem().toString());
            try {
                MenuDaoImpl menuDao = new MenuDaoImpl();
                Menu menu = menuDao.findByCode(menuCode, shopCode);
                if (menu != null) {
                    txtName.setText(menu.getName());
                }
            } catch (SQLException e) {
                MsgUtil.showMsg(e.getMessage(), null);
            }
        } else {
            txtName.setText("");
        }
    }
}
