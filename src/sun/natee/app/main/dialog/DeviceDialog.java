package sun.natee.app.main.dialog;

import java.io.File;
import java.math.BigDecimal;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import org.apache.log4j.Logger;
import sun.natee.app.bean.Device;
import sun.natee.app.dao.impl.DeviceDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class DeviceDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(DeviceDialog.class);

    private final String shopCode;
    private Device data = null;

    public DeviceDialog(java.awt.Frame parent, boolean modal, String shopCode, String devCode) {
        super(parent, modal);
        initComponents();
        this.shopCode = shopCode;
        if (!devCode.equals("")) {
            txtDevCode.setText(devCode);
            loadData();
        }
        lbSystem.setText(StringUtil.showSystem());
    }

    public Device getData() {
        return data;
    }

    public void setData(Device data) {
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPriceAmt = new javax.swing.JTextField();
        txtDevCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDevQty = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDevName = new javax.swing.JTextField();
        btnAddDevice = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbDevExpiredDay = new javax.swing.JComboBox<>();
        txtCountDayExpired = new javax.swing.JTextField();
        txtDateExpired = new javax.swing.JTextField();
        chkUpToSale = new javax.swing.JCheckBox();
        btnCalendar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCountPerUsed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalAmt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        chkHasExpired = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มอุปกรณ์สำหรับร้าน");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPriceAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPriceAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPriceAmt.setText("0.00");

        txtDevCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDevCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ราคาซื้อมา");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัสอุปกรณ์");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("จำนวน");

        txtDevQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDevQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDevQty.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ชื่ออุปกรณ์");

        txtDevName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAddDevice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnAddDevice.setText("บันทึกข้อมูล");
        btnAddDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeviceActionPerformed(evt);
            }
        });

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pan.png"))); // NOI18N
        lblImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N
        btnImg.setText("เปลี่ยน...");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("รายการ");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)), "อายุการใช้งาน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cbDevExpiredDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDevExpiredDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วัน", "เดือน", "ปี" }));

        txtCountDayExpired.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCountDayExpired.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCountDayExpired.setText("0");

        txtDateExpired.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDateExpired.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateExpired.setText("01/01/2018");

        chkUpToSale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkUpToSale.setText("ขึ้นอยู่กับรายการที่ขาย");

        btnCalendar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalendar.setText("...");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("อายุการใช้งาน");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ถึงวันที่");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("ใช้ได้จำนวน");

        txtCountPerUsed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCountPerUsed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCountPerUsed.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ครั้ง");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCountPerUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(chkUpToSale))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(4, 4, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountDayExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDevExpiredDay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalendar))
                        .addGap(34, 34, 34))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCountDayExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbDevExpiredDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDateExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(chkUpToSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCountPerUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("รวมราคา");

        txtTotalAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalAmt.setText("0.00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("บาท");

        chkHasExpired.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkHasExpired.setText("มีวันหมดอายุ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddDevice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDevCode)
                            .addComponent(txtPriceAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtTotalAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHasExpired)
                            .addComponent(txtDevQty, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDevName, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDevCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDevName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPriceAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(txtDevQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(chkHasExpired))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

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
                .addComponent(lbSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("เพิ่มอุปกรณ์สำหรับร้าน");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeviceActionPerformed
        saveDevice();
    }//GEN-LAST:event_btnAddDeviceActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser jfc = new JFileChooser();
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            MsgUtil.printLog(selectedFile.getAbsolutePath());
            lblImg.setIcon(new javax.swing.ImageIcon(selectedFile.getAbsolutePath()));
        }
    }//GEN-LAST:event_btnImgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDevice;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnImg;
    private javax.swing.JComboBox<String> cbDevExpiredDay;
    private javax.swing.JCheckBox chkHasExpired;
    private javax.swing.JCheckBox chkUpToSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField txtCountDayExpired;
    private javax.swing.JTextField txtCountPerUsed;
    private javax.swing.JTextField txtDateExpired;
    private javax.swing.JTextField txtDevCode;
    private javax.swing.JTextField txtDevName;
    private javax.swing.JTextField txtDevQty;
    private javax.swing.JTextField txtPriceAmt;
    private javax.swing.JTextField txtTotalAmt;
    // End of variables declaration//GEN-END:variables

    private void saveDevice() {
        //validate
        if (StringUtil.isEmpty(txtDevCode.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtDevCode.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtDevName.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtDevName.requestFocus();
            return;
        }
        
        data = new Device();
        data.setCode(txtDevCode.getText());
        data.setName(txtDevName.getText());
        data.setPriceAmt(new BigDecimal(txtPriceAmt.getText()));
        data.setQty(Integer.parseInt(txtDevQty.getText()));
        data.setTotalAmt(new BigDecimal(txtTotalAmt.getText()));
        data.setNetTotalAmt(data.getTotalAmt());
        data.setHasExpired(chkHasExpired.isSelected() ? "Y" : "N");
        data.setDateExpired(StringUtil.strToDate(txtDateExpired.getText()));
        data.setCountDayExpired(Integer.parseInt(txtCountDayExpired.getText()));
        data.setChkUpToSale(chkUpToSale.isSelected() ? "Y" : "N");
        data.setCountPerUsed(Integer.parseInt(txtCountPerUsed.getText()));
        data.setShopCode(shopCode);
        data.setMenuCode("");
        data.setCbDevExpiredDay(cbDevExpiredDay.getSelectedItem().toString());

        DeviceDaoImpl deviceDao = new DeviceDaoImpl();
        try {
            deviceDao.save(data);
            dispose();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }

    }

    private void clearForm() {
        txtDevCode.setText("");
        txtDevName.setText("");
        txtPriceAmt.setText("0.00");
        txtDevQty.setText("0");
        txtTotalAmt.setText("0.00");
        chkHasExpired.setSelected(false);
        txtCountDayExpired.setText("0");
        cbDevExpiredDay.setSelectedIndex(0);
        txtDateExpired.setText("");
        chkUpToSale.setSelected(false);
        txtCountPerUsed.setText("0");
    }

    private void loadData() {
        DeviceDaoImpl devImpl = new DeviceDaoImpl();
        try {
            Device dev = devImpl.findByCode(txtDevCode.getText(), shopCode);
            if (dev != null) {
                txtDevName.setText(dev.getName());
                txtPriceAmt.setText(dev.getPriceAmt().toString());
                txtDevQty.setText("" + dev.getQty());
                txtTotalAmt.setText(dev.getTotalAmt().toString());
                chkHasExpired.setSelected(dev.getHasExpired().equals("Y"));
                txtCountDayExpired.setText("" + dev.getCountDayExpired());
                cbDevExpiredDay.setSelectedIndex(dev.getExpiredDay());
                txtDateExpired.setText(StringUtil.dateStr(dev.getDateExpired()));
                chkUpToSale.setSelected(dev.getChkUpToSale().equals("Y"));
                txtCountPerUsed.setText("" + dev.getCountPerUsed());
            }
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }
    }

}
