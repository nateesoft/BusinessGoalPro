package sun.natee.app.main.dialog;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Locale;
import org.apache.log4j.Logger;
import sun.natee.app.bean.Target;
import sun.natee.app.dao.impl.TargetDaoImpl;
import sun.natee.app.main.util.CalendarDialog;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;
import sun.natee.app.main.util.ThaiBaht;

public class TargetDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(TargetDialog.class);

    private final TargetDaoImpl targetDao;

    public TargetDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        targetDao = new TargetDaoImpl();
        loadData();
        lbSystem.setText(StringUtil.showSystem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSaveTarget = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtBusinessPlanCount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOutcomeBusinessAmt = new javax.swing.JTextField();
        txtIncomeBusinessAmt = new javax.swing.JTextField();
        cbIncomePer = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBusinessTargetAmt = new javax.swing.JTextField();
        txtStartLoanAmt = new javax.swing.JTextField();
        cbLoanType = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtLoanIntPercent = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbTargetType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtStartBudgetAmt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbOutcomePer = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtTargetName = new javax.swing.JTextField();
        btnResetData = new javax.swing.JButton();
        lbTargetMoneyMsg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTargetDate = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        btnDate1 = new javax.swing.JButton();
        btnDate2 = new javax.swing.JButton();
        btnCal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("วางแผนกิจการ / เริ่มต้นกิจการ");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSaveTarget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSaveTarget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSaveTarget.setText("บันทึกข้อมูล");
        btnSaveTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTargetActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBusinessPlanCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBusinessPlanCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusinessPlanCount.setText("0");
        txtBusinessPlanCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBusinessPlanCountFocusGained(evt);
            }
        });
        txtBusinessPlanCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusinessPlanCountKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ตั้งเป้าหมาย กำไร");

        txtOutcomeBusinessAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOutcomeBusinessAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOutcomeBusinessAmt.setText("0.00");
        txtOutcomeBusinessAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOutcomeBusinessAmtFocusGained(evt);
            }
        });

        txtIncomeBusinessAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIncomeBusinessAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIncomeBusinessAmt.setText("0.00");
        txtIncomeBusinessAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIncomeBusinessAmtFocusGained(evt);
            }
        });
        txtIncomeBusinessAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIncomeBusinessAmtKeyPressed(evt);
            }
        });

        cbIncomePer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbIncomePer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วัน", "เดือน", "ปี" }));
        cbIncomePer.setSelectedIndex(1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("เงินกู้ยืม");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("เงินทุนเริ่มต้นกิจการ");

        txtBusinessTargetAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBusinessTargetAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBusinessTargetAmt.setText("0.00");
        txtBusinessTargetAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBusinessTargetAmtFocusGained(evt);
            }
        });
        txtBusinessTargetAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusinessTargetAmtKeyPressed(evt);
            }
        });

        txtStartLoanAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStartLoanAmt.setText("0.00");
        txtStartLoanAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStartLoanAmtFocusGained(evt);
            }
        });
        txtStartLoanAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStartLoanAmtKeyPressed(evt);
            }
        });

        cbLoanType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbLoanType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ต่อปี", "ต่อเดือน", "ต่อวัน" }));
        cbLoanType.setSelectedIndex(1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ต่อ");

        txtLoanIntPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanIntPercent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanIntPercent.setText("0");
        txtLoanIntPercent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanIntPercentFocusGained(evt);
            }
        });
        txtLoanIntPercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanIntPercentKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("รายจ่ายนอกกิจการ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ต่อ");

        cbTargetType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTargetType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ปี", "เดือน", "วัน" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ภายในระยะเวลา");

        txtStartBudgetAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartBudgetAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStartBudgetAmt.setText("0.00");
        txtStartBudgetAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStartBudgetAmtFocusGained(evt);
            }
        });
        txtStartBudgetAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStartBudgetAmtKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("รายได้นอกกิจการ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("อัตราดอกเบี้ย");

        cbOutcomePer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOutcomePer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วัน", "เดือน", "ปี" }));
        cbOutcomePer.setSelectedIndex(1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("ชื่อเป้าหมาย");

        txtTargetName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTargetName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTargetNameFocusGained(evt);
            }
        });
        txtTargetName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTargetNameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBusinessTargetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartBudgetAmt)
                            .addComponent(txtStartLoanAmt)
                            .addComponent(txtIncomeBusinessAmt)
                            .addComponent(txtOutcomeBusinessAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusinessPlanCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTargetType, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLoanIntPercent)
                                    .addComponent(cbIncomePer, 0, 95, Short.MAX_VALUE)
                                    .addComponent(cbOutcomePer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtTargetName, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBusinessTargetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusinessPlanCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTargetType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTargetName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStartBudgetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStartLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIncomeBusinessAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbIncomePer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtOutcomeBusinessAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbOutcomePer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnResetData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnResetData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        btnResetData.setText("Reset");
        btnResetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDataActionPerformed(evt);
            }
        });

        lbTargetMoneyMsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTargetMoneyMsg.setForeground(new java.awt.Color(51, 102, 0));
        lbTargetMoneyMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTargetMoneyMsg.setText("...");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("วันที่เริ่ม");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("ถึงเป้าหมาย");

        txtTargetDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTargetDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTargetDate.setText("31/12/2018");
        txtTargetDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTargetDateFocusGained(evt);
            }
        });

        txtStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartDate.setText("01/01/2018");
        txtStartDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStartDateFocusGained(evt);
            }
        });

        btnDate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDate1.setText("jButton1");
        btnDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDate1ActionPerformed(evt);
            }
        });

        btnDate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDate2.setText("jButton1");
        btnDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDate2ActionPerformed(evt);
            }
        });

        btnCal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCal.setText("ดึงจากระยะเวลา");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTargetMoneyMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnResetData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSaveTarget))
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTargetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTargetMoneyMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTargetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("วางแผนกิจการ / เริ่มต้นกิจการ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 102, 102)));

        lbSystem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSystem.setText("26/10/2561 21:51:01");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTargetActionPerformed
        save();
    }//GEN-LAST:event_btnSaveTargetActionPerformed

    private void txtStartBudgetAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartBudgetAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtStartLoanAmt.requestFocus();
        }
    }//GEN-LAST:event_txtStartBudgetAmtKeyPressed

    private void txtStartLoanAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartLoanAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanIntPercent.requestFocus();
        }
    }//GEN-LAST:event_txtStartLoanAmtKeyPressed

    private void txtLoanIntPercentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanIntPercentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIncomeBusinessAmt.requestFocus();
        }
    }//GEN-LAST:event_txtLoanIntPercentKeyPressed

    private void txtBusinessTargetAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusinessTargetAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBusinessPlanCount.requestFocus();
        }
    }//GEN-LAST:event_txtBusinessTargetAmtKeyPressed

    private void txtBusinessPlanCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusinessPlanCountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTargetName.requestFocus();
        }
    }//GEN-LAST:event_txtBusinessPlanCountKeyPressed

    private void txtIncomeBusinessAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIncomeBusinessAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtOutcomeBusinessAmt.requestFocus();
        }
    }//GEN-LAST:event_txtIncomeBusinessAmtKeyPressed

    private void txtStartBudgetAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartBudgetAmtFocusGained
        txtStartBudgetAmt.selectAll();
    }//GEN-LAST:event_txtStartBudgetAmtFocusGained

    private void txtStartLoanAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartLoanAmtFocusGained
        txtStartLoanAmt.selectAll();
    }//GEN-LAST:event_txtStartLoanAmtFocusGained

    private void txtLoanIntPercentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanIntPercentFocusGained
        txtLoanIntPercent.selectAll();
    }//GEN-LAST:event_txtLoanIntPercentFocusGained

    private void txtBusinessTargetAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusinessTargetAmtFocusGained
        txtBusinessTargetAmt.selectAll();
    }//GEN-LAST:event_txtBusinessTargetAmtFocusGained

    private void txtBusinessPlanCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusinessPlanCountFocusGained
        txtBusinessPlanCount.selectAll();
    }//GEN-LAST:event_txtBusinessPlanCountFocusGained

    private void txtIncomeBusinessAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIncomeBusinessAmtFocusGained
        txtIncomeBusinessAmt.selectAll();
    }//GEN-LAST:event_txtIncomeBusinessAmtFocusGained

    private void txtOutcomeBusinessAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOutcomeBusinessAmtFocusGained
        txtOutcomeBusinessAmt.selectAll();
    }//GEN-LAST:event_txtOutcomeBusinessAmtFocusGained

    private void txtTargetNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTargetNameFocusGained
        txtTargetName.selectAll();
    }//GEN-LAST:event_txtTargetNameFocusGained

    private void txtTargetNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTargetNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtStartBudgetAmt.requestFocus();
        }
    }//GEN-LAST:event_txtTargetNameKeyPressed

    private void btnResetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDataActionPerformed
        loadData();
    }//GEN-LAST:event_btnResetDataActionPerformed

    private void txtStartDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartDateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateFocusGained

    private void txtTargetDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTargetDateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTargetDateFocusGained

    private void btnDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDate1ActionPerformed
        CalendarDialog cal = new CalendarDialog(null, true);
        cal.setVisible(true);

        txtStartDate.setText(cal.getDateString());
    }//GEN-LAST:event_btnDate1ActionPerformed

    private void btnDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDate2ActionPerformed
        CalendarDialog cal = new CalendarDialog(null, true);
        cal.setVisible(true);

        txtTargetDate.setText(cal.getDateString());
    }//GEN-LAST:event_btnDate2ActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        calcDate();
    }//GEN-LAST:event_btnCalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnDate1;
    private javax.swing.JButton btnDate2;
    private javax.swing.JButton btnResetData;
    private javax.swing.JButton btnSaveTarget;
    private javax.swing.JComboBox<String> cbIncomePer;
    private javax.swing.JComboBox<String> cbLoanType;
    private javax.swing.JComboBox<String> cbOutcomePer;
    private javax.swing.JComboBox<String> cbTargetType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lbTargetMoneyMsg;
    private javax.swing.JTextField txtBusinessPlanCount;
    private javax.swing.JTextField txtBusinessTargetAmt;
    private javax.swing.JTextField txtIncomeBusinessAmt;
    private javax.swing.JTextField txtLoanIntPercent;
    private javax.swing.JTextField txtOutcomeBusinessAmt;
    private javax.swing.JTextField txtStartBudgetAmt;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtStartLoanAmt;
    private javax.swing.JTextField txtTargetDate;
    private javax.swing.JTextField txtTargetName;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        try {
            Target target = targetDao.findById(null);
            if (target != null) {
                txtTargetName.setText(target.getTargetName());
                txtStartBudgetAmt.setText(target.getStartBudgetAmt().toString());
                txtStartLoanAmt.setText(target.getStartLoanAmt().toString());
                txtLoanIntPercent.setText(target.getLoanIntPercent().toString());
                cbLoanType.setSelectedItem(target.getLoanType());
                txtBusinessTargetAmt.setText(target.getBusinessTargetAmt().toString());
                txtBusinessPlanCount.setText("" + target.getBusinessPlanCount());
                cbTargetType.setSelectedItem(target.getTargetType());
                txtIncomeBusinessAmt.setText(target.getIncomeBusinessAmt().toString());
                cbIncomePer.setSelectedItem(target.getIncomePer());
                txtOutcomeBusinessAmt.setText(target.getOutcomeBusinessAmt().toString());
                cbOutcomePer.setSelectedItem(target.getOutcomePer());
                txtStartDate.setText(StringUtil.dateStr(target.getStartDate()));
                txtTargetDate.setText(StringUtil.dateStr(target.getTargetDate()));

                lbTargetMoneyMsg.setText("เป้าหมายกำไรที่คุณตั้งไว้คือ : " + new ThaiBaht().getText(target.getBusinessTargetAmt()) + " ภายใน " + target.getBusinessPlanCount() + " " + cbTargetType.getSelectedItem());
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void save() {
        Target target = new Target();
        target.setTargetName(txtTargetName.getText());
        target.setStartBudgetAmt(StringUtil.strToBig(txtStartBudgetAmt.getText()));
        target.setStartLoanAmt(StringUtil.strToBig(txtStartLoanAmt.getText()));
        target.setLoanIntPercent(StringUtil.strToBig(txtLoanIntPercent.getText()));
        target.setLoanType(cbLoanType.getSelectedItem().toString());
        target.setBusinessTargetAmt(StringUtil.strToBig(txtBusinessTargetAmt.getText()));
        target.setBusinessPlanCount(StringUtil.strToInt(txtBusinessPlanCount.getText()));
        target.setTargetType(cbTargetType.getSelectedItem().toString());
        target.setIncomeBusinessAmt(StringUtil.strToBig(txtIncomeBusinessAmt.getText()));
        target.setIncomePer(cbIncomePer.getSelectedItem().toString());
        target.setOutcomeBusinessAmt(StringUtil.strToBig(txtOutcomeBusinessAmt.getText()));
        target.setOutcomePer(cbOutcomePer.getSelectedItem().toString());
        target.setStartDate(StringUtil.strToDate(txtStartDate.getText()));
        target.setTargetDate(StringUtil.strToDate(txtTargetDate.getText()));

        try {
            targetDao.save(target);
            dispose();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void calcDate() {
        try {
            Calendar ca = Calendar.getInstance(Locale.ENGLISH);
            ca.setTime(StringUtil.strToDate(txtStartDate.getText()));
            int businessPlanCount = StringUtil.strToInt(txtBusinessPlanCount.getText());
            switch (cbTargetType.getSelectedItem().toString()) {
                case "ปี":
                    ca.add(Calendar.YEAR, businessPlanCount);
                    break;
                case "เดือน":
                    ca.add(Calendar.MONTH, businessPlanCount);
                    break;
                case "วัน":
                    ca.add(Calendar.DATE, businessPlanCount);
                    break;
            }
            txtTargetDate.setText(StringUtil.dateStr(ca.getTime()));
        } catch (Exception e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }
    }
}
