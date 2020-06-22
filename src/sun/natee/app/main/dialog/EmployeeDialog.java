package sun.natee.app.main.dialog;

import java.io.File;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import org.apache.log4j.Logger;
import sun.natee.app.bean.Employee;
import sun.natee.app.dao.impl.EmployeeDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class EmployeeDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(EmployeeDialog.class);

    private Employee data = null;
    private final String shopCode;

    public EmployeeDialog(java.awt.Frame parent, boolean modal, String shopCode, String empCode) {
        super(parent, modal);
        initComponents();
        this.shopCode = shopCode;
        if (!empCode.equals("")) {
            txtEmpCode.setText(empCode);
            loadData();
        }
        lbSystem.setText(StringUtil.showSystem());
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtDaySalary = new javax.swing.JTextField();
        txtWeekSalary = new javax.swing.JTextField();
        txtYearSalary = new javax.swing.JTextField();
        btnAddEmp = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();
        chkDay = new javax.swing.JRadioButton();
        chkWeek = new javax.swing.JRadioButton();
        chkYear = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        txtEmpCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmpAge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbNation = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbEmpType = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnCal2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtHireEndDate = new javax.swing.JTextField();
        btnCal1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHireStartDate = new javax.swing.JTextField();
        txtMonthSalary = new javax.swing.JTextField();
        chkMonth = new javax.swing.JRadioButton();
        chkIsActive = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มพนักงานสำหรับร้าน");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDaySalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDaySalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDaySalary.setText("0");

        txtWeekSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeekSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWeekSalary.setText("0");

        txtYearSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtYearSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYearSalary.setText("0");

        btnAddEmp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnAddEmp.setText("บันทึกข้อมูล");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employ.jpg"))); // NOI18N
        lblImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N
        btnImg.setText("เปลี่ยน...");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkDay);
        chkDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkDay.setText("จ้างรายวัน");

        buttonGroup1.add(chkWeek);
        chkWeek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkWeek.setText("จ้างรายสัปดาห์");

        buttonGroup1.add(chkYear);
        chkYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkYear.setText("จ้างรายปี");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัสพนักงาน");

        txtEmpName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmpCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ชื่อ-สกุล");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("อายุ");

        txtEmpAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpAge.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("สัญชาติ");

        cbNation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbNation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ไทย" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ประเภทพนักงาน");

        cbEmpType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbEmpType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Part Time", "ประจำ", "เจ้าของ" }));
        cbEmpType.setSelectedIndex(2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbNation, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEmpType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cbNation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(cbEmpType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCal2.setText("...");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("สัญญาจ้างเริ่ม");

        txtHireEndDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHireEndDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHireEndDate.setText("31/12/2018");

        btnCal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCal1.setText("...");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ถึงวันที่");

        txtHireStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHireStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHireStartDate.setText("01/01/2018");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHireEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHireStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCal1)
                    .addComponent(btnCal2))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHireStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHireEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtMonthSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMonthSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonthSalary.setText("0");

        buttonGroup1.add(chkMonth);
        chkMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMonth.setSelected(true);
        chkMonth.setText("จ้างรายเดือน");

        chkIsActive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkIsActive.setSelected(true);
        chkIsActive.setText("ยังเป็นพนักงานอยู่");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDay)
                                    .addComponent(chkWeek)
                                    .addComponent(chkYear)
                                    .addComponent(chkMonth))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtYearSalary)
                                    .addComponent(txtWeekSalary)
                                    .addComponent(txtDaySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonthSalary)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIsActive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDaySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkDay))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeekSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkWeek))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonthSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkMonth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYearSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkIsActive))))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("เพิ่มพนักงานสำหรับร้าน");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        saveEmployee();
    }//GEN-LAST:event_btnAddEmpActionPerformed

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
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnCal1;
    private javax.swing.JButton btnCal2;
    private javax.swing.JButton btnImg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbEmpType;
    private javax.swing.JComboBox<String> cbNation;
    private javax.swing.JRadioButton chkDay;
    private javax.swing.JCheckBox chkIsActive;
    private javax.swing.JRadioButton chkMonth;
    private javax.swing.JRadioButton chkWeek;
    private javax.swing.JRadioButton chkYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField txtDaySalary;
    private javax.swing.JTextField txtEmpAge;
    private javax.swing.JTextField txtEmpCode;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtHireEndDate;
    private javax.swing.JTextField txtHireStartDate;
    private javax.swing.JTextField txtMonthSalary;
    private javax.swing.JTextField txtWeekSalary;
    private javax.swing.JTextField txtYearSalary;
    // End of variables declaration//GEN-END:variables

    private void saveEmployee() {
        //validate
        if (StringUtil.isEmpty(txtEmpCode.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtEmpCode.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtEmpName.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtEmpName.requestFocus();
            return;
        }
        
        data = new Employee();
        data.setCode(txtEmpCode.getText());
        data.setName(txtEmpName.getText());
        data.setAge(Integer.parseInt(txtEmpAge.getText()));
        data.setNation(cbNation.getSelectedItem().toString());
        data.setEmpType(cbEmpType.getSelectedItem().toString());
        data.setChkDay(chkDay.isSelected() ? "Y" : "N");
        data.setDaySalary(StringUtil.strToBig(txtDaySalary.getText()));
        data.setChkWeek(chkWeek.isSelected() ? "Y" : "N");
        data.setWeekSalary(StringUtil.strToBig(txtWeekSalary.getText()));
        data.setChkMonth(chkMonth.isSelected() ? "Y" : "N");
        data.setMonthSalary(StringUtil.strToBig(txtMonthSalary.getText()));
        data.setChkYear(chkYear.isSelected() ? "Y" : "N");
        data.setYearSalary(StringUtil.strToBig(txtYearSalary.getText()));
        data.setHireStartDate(StringUtil.strToDate(txtHireStartDate.getText()));
        data.setHireEndDate(StringUtil.strToDate(txtHireEndDate.getText()));
        data.setChkIsActive(chkIsActive.isSelected() ? "Y" : "N");
        data.setShopCode(shopCode);

        EmployeeDaoImpl empDao = new EmployeeDaoImpl();
        try {
            empDao.save(data);
            dispose();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void loadData() {
        EmployeeDaoImpl empImpl = new EmployeeDaoImpl();
        try {
            Employee emp = empImpl.findByCode(txtEmpCode.getText(), shopCode);
            if (emp != null) {
                txtEmpCode.setText(emp.getCode());
                txtEmpName.setText(emp.getName());
                txtEmpAge.setText("" + emp.getAge());
                cbNation.setSelectedItem(emp.getNation());
                cbEmpType.setSelectedItem(emp.getEmpType());
                chkDay.setSelected(emp.getChkDay().equals("Y"));
                txtDaySalary.setText(emp.getDaySalary().toString());
                chkWeek.setSelected(emp.getChkWeek().equals("Y"));
                txtWeekSalary.setText(emp.getWeekSalary().toString());
                chkMonth.setSelected(emp.getChkMonth().equals("Y"));
                txtMonthSalary.setText(emp.getMonthSalary().toString());
                chkYear.setSelected(emp.getChkYear().equals("Y"));
                txtYearSalary.setText(emp.getYearSalary().toString());
                txtHireStartDate.setText(StringUtil.dateStr(emp.getHireStartDate()));
                txtHireEndDate.setText(StringUtil.dateStr(emp.getHireEndDate()));
                chkIsActive.setSelected(emp.getChkIsActive().equals("Y"));
            }
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }

    }
}
