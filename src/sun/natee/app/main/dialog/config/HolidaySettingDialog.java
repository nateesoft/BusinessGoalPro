package sun.natee.app.main.dialog.config;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sun.natee.app.bean.HolidaySetting;
import sun.natee.app.dao.impl.HolidaySettingDaoImpl;
import sun.natee.app.main.util.CalendarDialog;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class HolidaySettingDialog extends javax.swing.JDialog {

    private final DefaultTableModel model;

    public HolidaySettingDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        model = (DefaultTableModel) tb.getModel();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtDateStart = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        rdEveryDay = new javax.swing.JRadioButton();
        cbDayWeek = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        txtDateEnd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtDateHoliday = new javax.swing.JTextField();
        rdLockDay = new javax.swing.JRadioButton();
        rdSpecificDay = new javax.swing.JRadioButton();
        cbDayDialy = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        chkActive = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtYearStart = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtYearEnd = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("กำหนดวันหยุดร้าน");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัส");

        txtCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("รายละเอียด");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDateStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdEveryDay);
        rdEveryDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdEveryDay.setText("หยุดทุกวัน");

        cbDayWeek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDayWeek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Holiday", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" }));
        cbDayWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDayWeekActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtDateEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDateHoliday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(rdLockDay);
        rdLockDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdLockDay.setSelected(true);
        rdLockDay.setText("หยุดเฉพาะวัน");

        buttonGroup1.add(rdSpecificDay);
        rdSpecificDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdSpecificDay.setText("หยุดเป็นช่วงวัน");

        cbDayDialy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDayDialy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        cbDayDialy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDayDialyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ถึง");

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
                    .addComponent(rdLockDay)
                    .addComponent(rdEveryDay)
                    .addComponent(rdSpecificDay))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDateHoliday, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbDayWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDayDialy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdLockDay)
                    .addComponent(txtDateHoliday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdEveryDay)
                    .addComponent(cbDayWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDayDialy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSpecificDay)
                    .addComponent(txtDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Active", "Year Start", "Year End", "LockDay", "Date Holiday", "Every Day", "Day Week", "Day Dialy", "Specific Day", "Date Start", "Date End"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("กำหนดช่วงปี");

        txtYearStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtYearStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ถึง");

        txtYearEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtYearEnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkActive))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkActive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYearStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbDayWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDayWeekActionPerformed

    }//GEN-LAST:event_cbDayWeekActionPerformed

    private void cbDayDialyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDayDialyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDayDialyActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addRow();
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CalendarDialog c = new CalendarDialog(null, true);
        c.setVisible(true);
        txtDateHoliday.setText(c.getDateString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CalendarDialog c = new CalendarDialog(null, true);
        c.setVisible(true);
        txtDateStart.setText(c.getDateString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CalendarDialog c = new CalendarDialog(null, true);
        c.setVisible(true);
        txtDateEnd.setText(c.getDateString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        clearData();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbDayDialy;
    private javax.swing.JComboBox cbDayWeek;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdEveryDay;
    private javax.swing.JRadioButton rdLockDay;
    private javax.swing.JRadioButton rdSpecificDay;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDateEnd;
    private javax.swing.JTextField txtDateHoliday;
    private javax.swing.JTextField txtDateStart;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtYearEnd;
    private javax.swing.JTextField txtYearStart;
    // End of variables declaration//GEN-END:variables

    private void addRow() {
        HolidaySetting bean = new HolidaySetting();
        bean.setCode(txtCode.getText());
        bean.setName(txtName.getText());
        bean.setChkActive(chkActive.isSelected() ? "Y" : "N");
        bean.setYearStart(txtYearStart.getText());
        bean.setYearEnd(txtYearEnd.getText());
        bean.setRdLockDay(rdLockDay.isSelected() ? "Y" : "N");
        bean.setDateHoliday(StringUtil.strToDate(txtDateHoliday.getText()));
        bean.setRdEveryDay(rdEveryDay.isSelected() ? "Y" : "N");
        bean.setCbDayWeek(cbDayWeek.getSelectedItem().toString());
        bean.setCbDayDialy(cbDayDialy.getSelectedItem().toString());
        bean.setRdSpecificDay(rdSpecificDay.isSelected() ? "Y" : "N");
        bean.setDateStart(StringUtil.strToDate(txtDateStart.getText()));
        bean.setDateEnd(StringUtil.strToDate(txtDateEnd.getText()));

        HolidaySettingDaoImpl holiday = new HolidaySettingDaoImpl();
        try {
            holiday.save(bean);
            addRowToModel(model, bean);

            //clear
            clearForm();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void loadData() {
        HolidaySettingDaoImpl holiday = new HolidaySettingDaoImpl();
        try {
            List<HolidaySetting> listBean = holiday.findAll();
            int size = model.getRowCount();
            for (int i = 0; i < size; i++) {
                model.removeRow(0);
            }
            for (HolidaySetting bean : listBean) {
                addRowToModel(model, bean);
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void addRowToModel(DefaultTableModel model, HolidaySetting bean) {
        model.addRow(new Object[]{
            bean.getCode(),
            bean.getName(),
            bean.getChkActive(),
            bean.getYearStart(),
            bean.getYearEnd(),
            bean.getRdLockDay(),
            bean.getDateHoliday(),
            bean.getRdEveryDay(),
            bean.getCbDayWeek(),
            bean.getCbDayDialy(),
            bean.getRdSpecificDay(),
            bean.getDateStart(),
            bean.getDateEnd()
        });
    }

    private void clearData() {
        HolidaySettingDaoImpl dao = new HolidaySettingDaoImpl();
        try {
            dao.delete(null);
            loadData();
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }
    }

    private void clearForm() {
        txtCode.setText("");
        chkActive.setSelected(true);
        txtName.setText("");
        txtYearStart.setText("");
        txtYearEnd.setText("");
        txtDateHoliday.setText("");
        cbDayWeek.setSelectedIndex(0);
        cbDayDialy.setSelectedIndex(0);
        txtDateStart.setText("");
        txtDateEnd.setText("");
        rdLockDay.setSelected(true);

        txtCode.requestFocus();
    }
}
