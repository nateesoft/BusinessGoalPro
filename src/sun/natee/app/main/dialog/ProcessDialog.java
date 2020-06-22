package sun.natee.app.main.dialog;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JLabel;
import org.apache.log4j.Logger;
import sun.natee.app.bean.Menu;
import sun.natee.app.bean.ShopPlace;
import sun.natee.app.bean.Target;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.dao.impl.ShopPlaceDaoImpl;
import sun.natee.app.dao.impl.TargetDaoImpl;
import sun.natee.app.main.dialog.calendar.CalendarDialog;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class ProcessDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ProcessDialog.class);

    private final JLabel[] labelGroup1 = new JLabel[8];
    private final JLabel[] labelGroup2 = new JLabel[8];
    private final JLabel[] labelGroup3 = new JLabel[8];
    private final JLabel[] labelGroup4 = new JLabel[8];
    private final String shopCode;

    public ProcessDialog(java.awt.Frame parent, boolean modal, String shopCode) {
        super(parent, modal);
        initComponents();
        this.shopCode = shopCode;
        try {
            init();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
        lbSystem.setText(StringUtil.showSystem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcessCalendar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        pn3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        pn4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("สรุปข้อมูลกิจการ เริ่มต้นทั้งหมด พร้อมเป้าหมาย");
        setResizable(false);

        btnProcessCalendar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProcessCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        btnProcessCalendar.setText("แสดงผลสรุป (ปฏิทิน)");
        btnProcessCalendar.setEnabled(false);
        btnProcessCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessCalendarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        pn1.setBackground(new java.awt.Color(255, 255, 255));
        pn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pn1.setLayout(new java.awt.GridLayout(9, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("สรุปเป้าหมาย");
        pn1.add(jLabel1);

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl1.setText("...");
        pn1.add(lbl1);

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl2.setText("...");
        pn1.add(lbl2);

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl3.setText("...");
        pn1.add(lbl3);

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl4.setText("...");
        pn1.add(lbl4);

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl5.setText("...");
        pn1.add(lbl5);

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl6.setText("...");
        pn1.add(lbl6);

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl7.setText("...");
        pn1.add(lbl7);

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl8.setText("...");
        pn1.add(lbl8);

        jPanel1.add(pn1);

        pn2.setBackground(new java.awt.Color(255, 255, 255));
        pn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pn2.setLayout(new java.awt.GridLayout(9, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("สรุปทำเลที่ตั้ง");
        pn2.add(jLabel2);

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl9.setText("...");
        pn2.add(lbl9);

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl10.setText("...");
        pn2.add(lbl10);

        lbl11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl11.setText("...");
        pn2.add(lbl11);

        lbl12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl12.setText("...");
        pn2.add(lbl12);

        lbl13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl13.setText("...");
        pn2.add(lbl13);

        lbl14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl14.setText("...");
        pn2.add(lbl14);

        lbl15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl15.setText("...");
        pn2.add(lbl15);

        lbl16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl16.setText("...");
        pn2.add(lbl16);

        jPanel1.add(pn2);

        pn3.setBackground(new java.awt.Color(255, 255, 255));
        pn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pn3.setLayout(new java.awt.GridLayout(9, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("สรุปรายละเอียดร้าน");
        pn3.add(jLabel3);

        lbl17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl17.setText("...");
        pn3.add(lbl17);

        lbl18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl18.setText("...");
        pn3.add(lbl18);

        lbl19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl19.setText("...");
        pn3.add(lbl19);

        lbl20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl20.setText("...");
        pn3.add(lbl20);

        lbl21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl21.setText("...");
        pn3.add(lbl21);

        lbl22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl22.setText("...");
        pn3.add(lbl22);

        lbl23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl23.setText("...");
        pn3.add(lbl23);

        lbl24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl24.setText("...");
        pn3.add(lbl24);

        jPanel1.add(pn3);

        pn4.setBackground(new java.awt.Color(255, 255, 255));
        pn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pn4.setLayout(new java.awt.GridLayout(9, 1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("สรุปการขายทั้งหมด จนบรรลุตามเป้าหมาย");
        pn4.add(jLabel4);

        lbl25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl25.setText("...");
        pn4.add(lbl25);

        lbl26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl26.setText("...");
        pn4.add(lbl26);

        lbl27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl27.setText("...");
        pn4.add(lbl27);

        lbl28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl28.setText("...");
        pn4.add(lbl28);

        lbl29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl29.setText("...");
        pn4.add(lbl29);

        lbl30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl30.setText("...");
        pn4.add(lbl30);

        lbl31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl31.setText("...");
        pn4.add(lbl31);

        lbl32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl32.setText("...");
        pn4.add(lbl32);

        jPanel1.add(pn4);

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
        jLabel7.setText("สรุปข้อมูลกิจการ เริ่มต้นทั้งหมด พร้อมเป้าหมาย");

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

        btnProcess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        btnProcess.setText("แสดงผลดำเนินการ (รายวัน)");
        btnProcess.setEnabled(false);
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnGo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        btnGo.setText("Preview");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcessCalendar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcess)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessCalendarActionPerformed
        CalendarDialog calendarDialog = new CalendarDialog(null, true);
        calendarDialog.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnProcessCalendarActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        ImaginationPlan mp = new ImaginationPlan(null, true);
        mp.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        RuntimeDialog run = new RuntimeDialog(null, true);
        run.setVisible(true);
    }//GEN-LAST:event_btnGoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnProcessCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    // End of variables declaration//GEN-END:variables

    private void init() throws SQLException {
        labelGroup1[0] = lbl1;
        labelGroup1[1] = lbl2;
        labelGroup1[2] = lbl3;
        labelGroup1[3] = lbl4;
        labelGroup1[4] = lbl5;
        labelGroup1[5] = lbl6;
        labelGroup1[6] = lbl7;
        labelGroup1[7] = lbl8;

        labelGroup2[0] = lbl9;
        labelGroup2[1] = lbl10;
        labelGroup2[2] = lbl11;
        labelGroup2[3] = lbl12;
        labelGroup2[4] = lbl13;
        labelGroup2[5] = lbl14;
        labelGroup2[6] = lbl15;
        labelGroup2[7] = lbl16;

        labelGroup3[0] = lbl17;
        labelGroup3[1] = lbl18;
        labelGroup3[2] = lbl19;
        labelGroup3[3] = lbl20;
        labelGroup3[4] = lbl21;
        labelGroup3[5] = lbl22;
        labelGroup3[6] = lbl23;
        labelGroup3[7] = lbl24;

        labelGroup4[0] = lbl25;
        labelGroup4[1] = lbl26;
        labelGroup4[2] = lbl27;
        labelGroup4[3] = lbl28;
        labelGroup4[4] = lbl29;
        labelGroup4[5] = lbl30;
        labelGroup4[6] = lbl31;
        labelGroup4[7] = lbl32;

        // clear text
        for (int i = 0; i < 8; i++) {
            labelGroup1[i].setText("");
            labelGroup2[i].setText("");
            labelGroup3[i].setText("");
            labelGroup4[i].setText("");
        }

        // process        
        BigDecimal totalYearAmt = BigDecimal.ZERO;
        BigDecimal totalMonthAmt = BigDecimal.ZERO;
        BigDecimal totalDayAmt = BigDecimal.ZERO;
        BigDecimal planTargetCount, planTargetCountMonth, planTargetCountDay;

        BigDecimal menuPrice = new BigDecimal("25");
        BigDecimal totalQtySell = BigDecimal.ZERO;
        BigDecimal totalQtyPerYear = BigDecimal.ZERO;
        BigDecimal totalQtyPerMonth = BigDecimal.ZERO;
        BigDecimal totalQtyPerDay = BigDecimal.ZERO;

        TargetDaoImpl target = new TargetDaoImpl();
        Target targetBean = target.findById(null);
        if (targetBean != null) {
            planTargetCount = new BigDecimal("" + targetBean.getBusinessPlanCount());
            planTargetCountMonth = planTargetCount.multiply(new BigDecimal("12"));
            planTargetCountDay = planTargetCount.multiply(new BigDecimal("365"));

            totalYearAmt = targetBean.getBusinessTargetAmt().divide(planTargetCount, 2, RoundingMode.HALF_UP);
            totalMonthAmt = targetBean.getBusinessTargetAmt().divide(planTargetCountMonth, 2, RoundingMode.HALF_UP);
            totalDayAmt = targetBean.getBusinessTargetAmt().divide(planTargetCountDay, 2, RoundingMode.HALF_UP);

            totalQtySell = targetBean.getBusinessTargetAmt().divide(menuPrice, 2, RoundingMode.HALF_UP);
            totalQtyPerYear = totalQtySell.divide(planTargetCount, 2, RoundingMode.HALF_UP);
            totalQtyPerMonth = totalQtySell.divide(planTargetCountMonth, 2, RoundingMode.HALF_UP);
            totalQtyPerDay = totalQtySell.divide(planTargetCountDay, 2, RoundingMode.HALF_UP);

            labelGroup1[0].setText("  เป้าหมาย: " + StringUtil.bahtFormat(targetBean.getBusinessTargetAmt()) + " ภายใน " + planTargetCount + " " + targetBean.getTargetType());
        } else {
            labelGroup1[0].setText("<< ยังไม่ได้กำหนดข้อมูล >>");
        }

        ShopPlaceDaoImpl place = new ShopPlaceDaoImpl();
        ShopPlace placeBean = place.findById(null);
        if (placeBean != null) {
            labelGroup2[0].setText("  ค่าเช่าพัก (ต่อเดือน): " + StringUtil.bahtFormat(placeBean.getRentPerMonthAmt()) + " บาท");
            labelGroup2[1].setText("  ค่าเช่าร้าน (ต่อวัน): " + StringUtil.bahtFormat(placeBean.getRentForSaleAmt()) + " บาท");
        } else {
            labelGroup2[0].setText("<< ยังไม่ได้กำหนดข้อมูล >>");
        }

        MenuDaoImpl menu = new MenuDaoImpl();
        List<Menu> listMenu = menu.findAll();
        labelGroup3[0].setText("  เมนูที่ขายทั้งหมด: " + listMenu.size() + " เมนู");
        int countMenu = 1;
        for (Menu m : listMenu) {
            labelGroup3[countMenu].setText("  " + m.getName() + " ราคา: " + StringUtil.bahtFormat(m.getMenuPrice()) + " บาท");
            countMenu++;
        }

        labelGroup4[0].setText("  สรุปรายได้ต่อปี: " + StringUtil.bahtFormat(totalYearAmt) + " บาท");
        labelGroup4[1].setText("  สรุปรายได้ต่อเดือน: " + StringUtil.bahtFormat(totalMonthAmt) + " บาท");
        labelGroup4[2].setText("  สรุปรายได้ต่อวัน: " + StringUtil.bahtFormat(totalDayAmt) + " บาท");
        labelGroup4[3].setText("  ราคาข้าวกล่อง กล่องล่ะ: " + StringUtil.bahtFormat(menuPrice) + " บาท");
        labelGroup4[4].setText("  ต้องขายข้าวกล่องทั้งหมด " + StringUtil.intFormat(totalQtySell) + " กล่อง");
        labelGroup4[5].setText("  ต้องขายข้าวกล่อง " + StringUtil.intFormat(totalQtyPerYear) + " กล่องต่อปี");
        labelGroup4[6].setText("  ต้องขายข้าวกล่อง " + StringUtil.intFormat(totalQtyPerMonth) + " กล่องต่อเดือน");
        labelGroup4[7].setText("  ต้องขายข้าวกล่อง " + StringUtil.intFormat(totalQtyPerDay) + " กล่องต่อวัน");
    }
}
