package sun.natee.app.main.dialog;

import java.sql.SQLException;
import org.apache.log4j.Logger;
import sun.natee.app.bean.ShopPlace;
import sun.natee.app.dao.impl.ShopPlaceDaoImpl;
import sun.natee.app.main.util.CalendarDialog;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class ShopPlaceDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ShopPlaceDialog.class);

    public ShopPlaceDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadData();
        lbSystem.setText(StringUtil.showSystem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkManyPeople = new javax.swing.JCheckBox();
        chkPark = new javax.swing.JCheckBox();
        chkSchool = new javax.swing.JCheckBox();
        chkCommunity = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAdvanceBefore = new javax.swing.JTextField();
        txtRentPerMonthAmt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbHomeType = new javax.swing.JComboBox<>();
        txtRentTotalAmt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFarFromShop = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        chkPayMonthly = new javax.swing.JRadioButton();
        chkPayAtDate = new javax.swing.JRadioButton();
        txtDatePay = new javax.swing.JTextField();
        btnCalendar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPredictPeopleWalk = new javax.swing.JTextField();
        txtRentForSaleAmt = new javax.swing.JTextField();
        cbShopRentType = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPredictPeopleWantPercent = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnSaveData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("วิเคราะห์ทำเลสำหรับขายสินค้า");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ทำเลที่ตั้งใกล้เคียง");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkManyPeople.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkManyPeople.setText("ผู้คนพลุกผล่าน");
        chkManyPeople.setOpaque(false);

        chkPark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPark.setText("มีสถานที่จอดรถ");
        chkPark.setOpaque(false);

        chkSchool.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSchool.setText("ย่านโรงเรียน");
        chkSchool.setOpaque(false);

        chkCommunity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkCommunity.setText("ย่านชุมชน");
        chkCommunity.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPark)
                    .addComponent(chkManyPeople)
                    .addComponent(chkSchool)
                    .addComponent(chkCommunity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkPark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkManyPeople)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSchool)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCommunity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("วิเคราะห์ทำเลสำหรับขายสินค้า");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 102, 102)));

        lbSystem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSystem.setText("26/10/2561 21:51:01");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ที่พักคนขาย", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("เลือกที่พัก");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("จ่ายล่วงหน้า");

        txtAdvanceBefore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAdvanceBefore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdvanceBefore.setText("1");

        txtRentPerMonthAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRentPerMonthAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRentPerMonthAmt.setText("3,000.00");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("รวม");

        cbHomeType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbHomeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ตลาด", "ชุมชน", "โรงเรียน" }));
        cbHomeType.setSelectedIndex(1);

        txtRentTotalAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRentTotalAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRentTotalAmt.setText("3,000.00");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("ก่อนเข้าพัก");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("ราคาต่อเดือน");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("ระยะห่างจากที่ขาย");

        txtFarFromShop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFarFromShop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFarFromShop.setText("1");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("กิโลเมตร");

        buttonGroup1.add(chkPayMonthly);
        chkPayMonthly.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPayMonthly.setSelected(true);
        chkPayMonthly.setText("จ่ายค่าเช่าทุกสิ้นเดือน");
        chkPayMonthly.setOpaque(false);

        buttonGroup1.add(chkPayAtDate);
        chkPayAtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPayAtDate.setText("จ่ายประจำเดือน ทุกวันที่ ");
        chkPayAtDate.setOpaque(false);

        txtDatePay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCalendar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalendar.setText("...");
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("เดือน");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPayMonthly)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(chkPayAtDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatePay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbHomeType, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAdvanceBefore, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFarFromShop))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRentTotalAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(txtRentPerMonthAmt))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbHomeType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtRentPerMonthAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAdvanceBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtRentTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtFarFromShop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPayMonthly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPayAtDate)
                    .addComponent(txtDatePay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ค่าเช่าขายของ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ชำระค่าเช่าขาย");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("ปริมาณคนสัญจร");

        txtPredictPeopleWalk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPredictPeopleWalk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPredictPeopleWalk.setText("2,000");

        txtRentForSaleAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRentForSaleAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRentForSaleAmt.setText("100.00");

        cbShopRentType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbShopRentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "รายวัน", "รายสัปดาห์", "รายเดือน", "รายปี" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("คนต่อวัน");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("ตั้งเป้าคนซื้อ");

        txtPredictPeopleWantPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPredictPeopleWantPercent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPredictPeopleWantPercent.setText("10");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("%");

        btnSaveData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSaveData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSaveData.setText("บันทึกข้อมูล");
        btnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRentForSaleAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(txtPredictPeopleWalk)
                    .addComponent(txtPredictPeopleWantPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(cbShopRentType, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(273, 273, 273))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveData)
                        .addGap(120, 120, 120))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtRentForSaleAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbShopRentType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPredictPeopleWalk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtPredictPeopleWantPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(btnSaveData))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDataActionPerformed
        savePlace();
    }//GEN-LAST:event_btnSaveDataActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        CalendarDialog calendar = new CalendarDialog(null, true);
        calendar.setVisible(true);

        txtDatePay.setText(calendar.getDateString());
    }//GEN-LAST:event_btnCalendarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnSaveData;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbHomeType;
    private javax.swing.JComboBox<String> cbShopRentType;
    private javax.swing.JCheckBox chkCommunity;
    private javax.swing.JCheckBox chkManyPeople;
    private javax.swing.JCheckBox chkPark;
    private javax.swing.JRadioButton chkPayAtDate;
    private javax.swing.JRadioButton chkPayMonthly;
    private javax.swing.JCheckBox chkSchool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JTextField txtAdvanceBefore;
    private javax.swing.JTextField txtDatePay;
    private javax.swing.JTextField txtFarFromShop;
    private javax.swing.JTextField txtPredictPeopleWalk;
    private javax.swing.JTextField txtPredictPeopleWantPercent;
    private javax.swing.JTextField txtRentForSaleAmt;
    private javax.swing.JTextField txtRentPerMonthAmt;
    private javax.swing.JTextField txtRentTotalAmt;
    // End of variables declaration//GEN-END:variables

    private void savePlace() {
        ShopPlace bean = new ShopPlace();
        bean.setId(1);
        bean.setChkPark(chkPark.isSelected() ? "Y" : "N");
        bean.setChkManyPeople(chkManyPeople.isSelected() ? "Y" : "N");
        bean.setChkSchool(chkSchool.isSelected() ? "Y" : "N");
        bean.setChkCommunity(chkCommunity.isSelected() ? "Y" : "N");
        bean.setChkPayMonthly(chkPayMonthly.isSelected() ? "Y" : "N");
        bean.setChkPayAtDate(chkPayAtDate.isSelected() ? "Y" : "N");
        bean.setCbHomeType(cbHomeType.getSelectedItem().toString());
        bean.setRentPerMonthAmt(StringUtil.strToBig(txtRentPerMonthAmt.getText()));
        bean.setAdvanceBefore(StringUtil.strToInt(txtAdvanceBefore.getText()));
        bean.setRentTotalAmt(StringUtil.strToBig(txtRentTotalAmt.getText()));
        bean.setFarFromShop(StringUtil.strToInt(txtFarFromShop.getText()));
        bean.setDatePay(StringUtil.strToDate(txtDatePay.getText()));
        bean.setRentForSaleAmt(StringUtil.strToBig(txtRentForSaleAmt.getText()));
        bean.setPredictPeopleWalk(StringUtil.strToInt(txtPredictPeopleWalk.getText()));
        bean.setPredictPeopleWantPercent(StringUtil.strToInt(txtPredictPeopleWantPercent.getText()));
        bean.setCbShopRentType(cbShopRentType.getSelectedItem().toString());

        ShopPlaceDaoImpl spDao = new ShopPlaceDaoImpl();
        try {
            spDao.save(bean);
            dispose();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void loadData() {
        try {
            ShopPlaceDaoImpl spDao = new ShopPlaceDaoImpl();
            ShopPlace bean = spDao.findById(null);
            if (bean != null) {
                chkPark.setSelected(bean.getChkPark().equals("Y"));
                chkManyPeople.setSelected(bean.getChkManyPeople().equals("Y"));
                chkSchool.setSelected(bean.getChkSchool().equals("Y"));
                chkCommunity.setSelected(bean.getChkCommunity().equals("Y"));
                cbHomeType.setSelectedItem(bean.getCbHomeType());
                txtRentPerMonthAmt.setText(bean.getRentPerMonthAmt().toString());
                txtAdvanceBefore.setText("" + bean.getAdvanceBefore());
                txtRentTotalAmt.setText(bean.getRentTotalAmt().toString());
                txtFarFromShop.setText("" + bean.getFarFromShop());
                chkPayMonthly.setSelected(bean.getChkPayMonthly().equals("Y"));
                chkPayAtDate.setSelected(bean.getChkPayAtDate().equals("Y"));
                txtDatePay.setText(StringUtil.dateStr(bean.getDatePay()));
                txtRentForSaleAmt.setText(bean.getRentForSaleAmt().toString());
                txtPredictPeopleWalk.setText("" + bean.getPredictPeopleWalk());
                txtPredictPeopleWantPercent.setText("" + bean.getPredictPeopleWantPercent());
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }
}
