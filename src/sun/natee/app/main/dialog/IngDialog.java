package sun.natee.app.main.dialog;

import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import org.apache.log4j.Logger;
import sun.natee.app.bean.Ingredient;
import sun.natee.app.dao.impl.IngredientDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class IngDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(IngDialog.class);

    private Ingredient data = null;
    private final String menuCode;

    public IngDialog(java.awt.Frame parent, boolean modal, String menuCode, String ingCode) {
        super(parent, modal);
        initComponents();

        this.menuCode = menuCode;
        if (!ingCode.equals("")) {
            txtCode.setText(ingCode);
            loadIngredient();
        }
        lbSystem.setText(StringUtil.showSystem());
    }

    public Ingredient getData() {
        return data;
    }

    public void setData(Ingredient data) {
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAddIng = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtQtyUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbUnitSale = new javax.swing.JComboBox();
        txtCode = new javax.swing.JTextField();
        cbBuyUnit = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuyUnitPerSale = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chkHasExpire = new javax.swing.JCheckBox();
        txtDateExpire = new javax.swing.JTextField();
        txtDateExpireStart = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateExpireFinish = new javax.swing.JTextField();
        rdExpireDate = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        rdExpireBetween = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtBuyUnitPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDayCountExpire = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkNormal = new javax.swing.JCheckBox();
        chkSpecial = new javax.swing.JCheckBox();
        chkDiscount = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มข้อมูลวัตถุดิบ");
        setResizable(false);

        btnAddIng.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddIng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnAddIng.setText("บันทึกข้อมูล");
        btnAddIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtQtyUnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQtyUnit.setText("1");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ชื่อ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("=");

        cbUnitSale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbUnitSale.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ฟอง", "ขีด", "กำ", "กรัม", "เม็ด", "ชิ้น", "อัน", "ถึง", "ช้อนชา", "ช้อนโต๊ะ", "กรีบ", "ฝา" }));

        txtCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });

        cbBuyUnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBuyUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "แพ็ค", "กิโลกรัม", "กำ", "มัด", "ชิ้น", "อัน", "ขีด", "กรัม", "ถุง", "ห่อ", "ขวด", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("หน่วยซื้อ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ต่อ 1 เมนู");

        txtBuyUnitPerSale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuyUnitPerSale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuyUnitPerSale.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("รหัสวัตถุดิบ");

        chkHasExpire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkHasExpire.setText("มีวันหมดอายุ");

        txtDateExpire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDateExpire.setText("01/01/2018");

        txtDateExpireStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDateExpireStart.setText("01/01/2018");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ถึง");

        txtDateExpireFinish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDateExpireFinish.setText("01/12/2018");

        buttonGroup1.add(rdExpireDate);
        rdExpireDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdExpireDate.setText("หมดวันที่");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("..");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdExpireBetween);
        rdExpireBetween.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdExpireBetween.setText("ช่วงวันที่");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("..");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("..");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ing.jpg"))); // NOI18N
        lblImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N
        btnImg.setText("เปลี่ยน...");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ราคาต่อหน่วย");

        txtBuyUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuyUnitPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuyUnitPrice.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("หรือ");

        txtDayCountExpire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDayCountExpire.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDayCountExpire.setText("7");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("วัน");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdExpireBetween)
                                    .addComponent(rdExpireDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDateExpire)
                                    .addComponent(txtDateExpireStart, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))))
                            .addComponent(chkHasExpire)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtQtyUnit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBuyUnit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBuyUnitPerSale)
                                    .addComponent(cbUnitSale, 0, 107, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDayCountExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDateExpireFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuyUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImg)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuyUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(cbBuyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(txtBuyUnitPerSale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtQtyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbUnitSale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkHasExpire)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDateExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdExpireDate)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDateExpireStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(rdExpireBetween)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDayCountExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDateExpireFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("เพิ่มข้อมูลวัตถุดิบ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("เป็นวัตถุดิบที่ใช้ในรายการ");

        chkNormal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkNormal.setSelected(true);
        chkNormal.setText("ปกติ");

        chkSpecial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSpecial.setText("พิเศษ");

        chkDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkDiscount.setText("ส่วนลด");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSpecial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddIng))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddIng, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(chkNormal)
                    .addComponent(chkSpecial)
                    .addComponent(chkDiscount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIngActionPerformed
        saveIngredient();
    }//GEN-LAST:event_btnAddIngActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser jfc = new JFileChooser();
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            MsgUtil.printLog(selectedFile.getAbsolutePath());
            lblImg.setIcon(new javax.swing.ImageIcon(selectedFile.getAbsolutePath()));
        }
    }//GEN-LAST:event_btnImgActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loadIngredient();
        }
    }//GEN-LAST:event_txtCodeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddIng;
    private javax.swing.JButton btnImg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbBuyUnit;
    private javax.swing.JComboBox cbUnitSale;
    private javax.swing.JCheckBox chkDiscount;
    private javax.swing.JCheckBox chkHasExpire;
    private javax.swing.JCheckBox chkNormal;
    private javax.swing.JCheckBox chkSpecial;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lblImg;
    private javax.swing.JRadioButton rdExpireBetween;
    private javax.swing.JRadioButton rdExpireDate;
    private javax.swing.JTextField txtBuyUnitPerSale;
    private javax.swing.JTextField txtBuyUnitPrice;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDateExpire;
    private javax.swing.JTextField txtDateExpireFinish;
    private javax.swing.JTextField txtDateExpireStart;
    private javax.swing.JTextField txtDayCountExpire;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQtyUnit;
    // End of variables declaration//GEN-END:variables

    private void saveIngredient() {
        //validate
        if (StringUtil.isEmpty(txtCode.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtCode.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtName.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtName.requestFocus();
            return;
        }
        
        data = new Ingredient();
        data.setCode(txtCode.getText());
        data.setName(txtName.getText());
        data.setBuyUnitPerSale(StringUtil.strToBig(txtBuyUnitPerSale.getText()));
        data.setIngTypeNormal(chkNormal.isSelected() ? "Y" : "N");
        data.setIngTypeSpecial(chkSpecial.isSelected() ? "Y" : "N");
        data.setIngTypeDiscount(chkDiscount.isSelected() ? "Y" : "N");
        data.setMenuCode(menuCode);
        data.setCbBuyUnit(cbBuyUnit.getSelectedItem().toString());
        data.setBuyUnitPrice(StringUtil.strToBig(txtBuyUnitPrice.getText()));
        data.setQtyUnit(StringUtil.strToBig(txtQtyUnit.getText()));
        data.setCbUnitSale(cbUnitSale.getSelectedItem().toString());
        data.setChkHasExpire(chkHasExpire.isSelected() ? "Y" : "N");
        data.setRdExpireDate(rdExpireDate.isSelected() ? "Y" : "N");
        data.setDateExpire(StringUtil.strToDate(txtDateExpire.getText()));
        data.setDayCountExpire(StringUtil.strToInt(txtDayCountExpire.getText()));
        data.setRdExpireBetween(rdExpireBetween.isSelected() ? "Y" : "N");
        data.setDateExpireStart(StringUtil.strToDate(txtDateExpireStart.getText()));
        data.setDateExpireFinish(StringUtil.strToDate(txtDateExpireFinish.getText()));

        if (chkNormal.isSelected() == false
                && chkSpecial.isSelected() == false
                && chkDiscount.isSelected() == false) {
            MsgUtil.showMsg("กรุณาเลือกประเภทวัตถุดิบ", null);
            return;
        }

        IngredientDaoImpl ingDao = new IngredientDaoImpl();
        try {
            ingDao.save(data);
            dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void clearForm() {
        txtCode.setText("");
        txtName.setText("");
        cbBuyUnit.setSelectedIndex(0);
        txtBuyUnitPerSale.setText("0");
        txtBuyUnitPrice.setText("0");
        txtQtyUnit.setText("1");
        cbUnitSale.setSelectedIndex(0);
        chkHasExpire.setSelected(false);
        rdExpireDate.setSelected(false);
        txtDateExpire.setText("01/01/2018");
        txtDayCountExpire.setText("7");
        rdExpireBetween.setSelected(false);
        txtDateExpireStart.setText("01/01/2018");
        txtDateExpireFinish.setText("01/01/2018");
    }

    private void loadIngredient() {
        IngredientDaoImpl ingImpl = new IngredientDaoImpl();
        try {
            Ingredient ing = ingImpl.findByCode(txtCode.getText(), menuCode);
            if (ing != null) {
                txtCode.setText(ing.getCode());
                txtCode.setEditable(false);
                txtName.setText(ing.getName());
                cbBuyUnit.setSelectedItem(ing.getCbBuyUnit());
                txtBuyUnitPerSale.setText(ing.getBuyUnitPerSale().toString());
                txtBuyUnitPrice.setText(ing.getBuyUnitPrice().toString());
                txtQtyUnit.setText(ing.getQtyUnit().toString());
                cbUnitSale.setSelectedItem(ing.getCbUnitSale());
                chkHasExpire.setSelected(ing.getChkHasExpire().equals("Y"));
                rdExpireDate.setSelected(ing.getRdExpireDate().equals("Y"));
                txtDateExpire.setText(StringUtil.dateStr(ing.getDateExpire()));
                txtDayCountExpire.setText(StringUtil.intFormat(ing.getDayCountExpire()));
                rdExpireBetween.setSelected(ing.getRdExpireBetween().equals("Y"));
                txtDateExpireStart.setText(StringUtil.dateStr(ing.getDateExpireStart()));
                txtDateExpireFinish.setText(StringUtil.dateStr(ing.getDateExpireFinish()));
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }
}
