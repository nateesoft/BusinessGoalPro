package sun.natee.app.main.dialog;

import java.awt.Font;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Device;
import sun.natee.app.bean.Employee;
import sun.natee.app.bean.Expense;
import sun.natee.app.bean.HolidaySetting;
import sun.natee.app.bean.Ingredient;
import sun.natee.app.bean.Menu;
import sun.natee.app.bean.Shop;
import sun.natee.app.bean.ShopPlace;
import sun.natee.app.bean.Target;
import sun.natee.app.dao.impl.DeviceDaoImpl;
import sun.natee.app.dao.impl.EmployeeDaoImpl;
import sun.natee.app.dao.impl.ExpenseDaoImpl;
import sun.natee.app.dao.impl.HolidaySettingDaoImpl;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.dao.impl.ShopDaoImpl;
import sun.natee.app.dao.impl.ShopPlaceDaoImpl;
import sun.natee.app.dao.impl.TargetDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;
import sun.natee.app.main.util.UXUtil;

public class RuntimeDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(RuntimeDialog.class);

    private DefaultTableModel model = null;
    private final ShopDaoImpl shopImpl = new ShopDaoImpl();
    private final HolidaySettingDaoImpl holidayImpl = new HolidaySettingDaoImpl();
    private Shop shop = null;
    private List<HolidaySetting> listHoliday = new ArrayList<>();
    private final ShopPlaceDaoImpl shopPlaceImpl = new ShopPlaceDaoImpl();
    private final EmployeeDaoImpl employeeImpl = new EmployeeDaoImpl();
    private final TargetDaoImpl targetImpl = new TargetDaoImpl();
    private final MenuDaoImpl menuImpl = new MenuDaoImpl();
    private final DeviceDaoImpl devImpl = new DeviceDaoImpl();
    private final ExpenseDaoImpl expImpl = new ExpenseDaoImpl();

    public RuntimeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initTable();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNetTotalAmt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRun = new javax.swing.JTable();
        txtPercent = new javax.swing.JLabel();
        pbSuccess = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Running to Target");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 4, 2, 4, new java.awt.Color(0, 153, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("กำไรรวมทั้งหมด");

        txtNetTotalAmt.setEditable(false);
        txtNetTotalAmt.setBackground(new java.awt.Color(204, 255, 204));
        txtNetTotalAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNetTotalAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNetTotalAmt.setText("0.00");

        tbRun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "วัน", "วันที่", "รายการ", "กำไร/-ขาดทุน", "คงเหลือสะสม", "ขายได้", "ราคาขาย", "รวม", "รายได้สะสม", "หมายเหตุ", "จ่ายหนี้เงินกู้/หนี้นอกระบบ", "ซื้อวัตถุดิบ", "ซื้ออุปกรณ์", "เงินเดือนพนักงาน", "ค่าเช่าร้าน", "ที่พักอาศัย"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRun.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRun);
        if (tbRun.getColumnModel().getColumnCount() > 0) {
            tbRun.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbRun.getColumnModel().getColumn(1).setPreferredWidth(90);
            tbRun.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbRun.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(4).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(5).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(6).setPreferredWidth(80);
            tbRun.getColumnModel().getColumn(7).setPreferredWidth(80);
            tbRun.getColumnModel().getColumn(8).setPreferredWidth(80);
            tbRun.getColumnModel().getColumn(9).setPreferredWidth(100);
            tbRun.getColumnModel().getColumn(10).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(11).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(12).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(13).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(14).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(15).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(16).setPreferredWidth(150);
        }

        txtPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPercent.setText("เป้าหมายความสำเร็จ (100%)");

        pbSuccess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("บาท");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNetTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pbSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNetTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPercent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Goal Running");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setText("Exit Program");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRunMouseClicked
        if (evt.getClickCount() == 2) {
            showDetail();
        }
    }//GEN-LAST:event_tbRunMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pbSuccess;
    private javax.swing.JTable tbRun;
    private javax.swing.JTextField txtNetTotalAmt;
    private javax.swing.JLabel txtPercent;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        BigDecimal resultTargetAmt;
        BigDecimal saveIntBalanceAmt = BigDecimal.ZERO;
        BigDecimal saveLoanBalanceAmt = BigDecimal.ZERO;
        String showResultTargetAmtStr;
        String showResultSaveIntAmtStr;
        String showIntLoanAmtStr;

        List<Menu> listMenu;
        try {
            shop = shopImpl.findById(null);
            listHoliday = holidayImpl.findAll();
            listMenu = menuImpl.findAll(shop.getCode());
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
            return;
        }

        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        BigDecimal baseUnitPrice = BigDecimal.ZERO;
        if (!listMenu.isEmpty()) {
            baseUnitPrice = listMenu.get(0).getMenuPrice();
        }
        BigDecimal baseQty = new BigDecimal("33");
        BigDecimal sumQtyPerMonth = BigDecimal.ZERO;
        BigDecimal baseBalanceAmt = BigDecimal.ZERO;
        BigDecimal dayBalanceAmt = BigDecimal.ZERO;
        BigDecimal totalAmt, unitPrice, qty;

        Target target = new Target();
        BigDecimal startLoanAmt;
        BigDecimal intLoanAmt = BigDecimal.ZERO;
        try {
            target = targetImpl.findById(null);
            startLoanAmt = target.getStartLoanAmt();
            intLoanAmt = target.getLoanIntPercent().multiply(startLoanAmt);
            intLoanAmt = intLoanAmt.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);

            pbSuccess.setMinimum(0);
            pbSuccess.setMaximum(target.getBusinessTargetAmt().intValue());
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }

        Calendar ca = Calendar.getInstance(Locale.ENGLISH);
        ca.setTime(StringUtil.strToDateTime(StringUtil.dateStr(target.getStartDate()) + " 06:00"));
        Calendar caTarget = Calendar.getInstance(Locale.ENGLISH);
        caTarget.setTime(StringUtil.strToDateTime(StringUtil.dateStr(target.getStartDate()) + " 06:00"));
        caTarget.add(Calendar.YEAR, 5);
        boolean isRunning = true;
        int count = 1;

        BigDecimal homePerMonthTmp = getHomePerMonth();
        String homePerMonth;
        BigDecimal shopPerMonthTmp = getShopPerMonth();
        String shopPerMonth;
        BigDecimal empPerMonthTmp = getEmpPerMonth();
        String empPerMonth;
        BigDecimal ingredientOrderTmp;
        String ingredientOrder;
        BigDecimal devicesOrderTmp;
        String devicesOrder;

        while (isRunning) {
            String desc = "";
            String remark;
            String dayStr = StringUtil.dayStr(ca.getTime());

            if (StringUtil.isMaxMonth(ca.getTime())) {
                desc = "วันสิ้นเดือน";

                ingredientOrderTmp = getIngredientOrder(sumQtyPerMonth);

                homePerMonth = StringUtil.bahtFormat(homePerMonthTmp);
                empPerMonth = StringUtil.bahtFormat(empPerMonthTmp);
                shopPerMonth = StringUtil.bahtFormat(shopPerMonthTmp);
                ingredientOrder = StringUtil.bahtFormat(ingredientOrderTmp);

                devicesOrderTmp = getDevicesOrder(sumQtyPerMonth);
                devicesOrder = StringUtil.bahtFormat(devicesOrderTmp);

                BigDecimal sum1 = dayBalanceAmt;
                BigDecimal sum2 = empPerMonthTmp.add(shopPerMonthTmp).add(homePerMonthTmp).add(ingredientOrderTmp).add(devicesOrderTmp);

                resultTargetAmt = sum1.subtract(sum2);
                showResultTargetAmtStr = StringUtil.bahtFormat(resultTargetAmt);// interest per month

                saveIntBalanceAmt = saveIntBalanceAmt.add(resultTargetAmt);
                saveLoanBalanceAmt = saveLoanBalanceAmt.add(intLoanAmt);
                showResultSaveIntAmtStr = StringUtil.bahtFormat(saveIntBalanceAmt);// summary interest
                showIntLoanAmtStr = StringUtil.bahtFormat(saveLoanBalanceAmt);

                dayBalanceAmt = BigDecimal.ZERO;
                sumQtyPerMonth = BigDecimal.ZERO;
            } else {
                homePerMonth = "";
                empPerMonth = "";
                shopPerMonth = "";
                showResultTargetAmtStr = "";
                ingredientOrder = "";
                devicesOrder = "";
                showResultSaveIntAmtStr = "";
                showIntLoanAmtStr = "";
            }

            if (StringUtil.isStartMonth(ca.getTime())) {
                desc = "เริ่มต้นเดือน";
            }

            if (isHoliday(ca.getTime())) {
                dayStr = "" + dayStr + "";
                remark = "วันหยุด";
                model.addRow(new Object[]{
                    count++,//0
                    dayStr,//1
                    StringUtil.dateStr(ca.getTime()),//2
                    desc,//3
                    showResultTargetAmtStr,//4
                    showResultSaveIntAmtStr,//5
                    "",//6
                    "",//7
                    "",//8
                    "",//9
                    remark,//10
                    "",//11
                    ingredientOrder,//12
                    devicesOrder,//13
                    empPerMonth,//14
                    shopPerMonth,//15
                    homePerMonth//16
                });
            } else {
                remark = "";
                unitPrice = baseUnitPrice;
                qty = baseQty;
                sumQtyPerMonth = sumQtyPerMonth.add(qty);

                totalAmt = baseUnitPrice.multiply(baseQty);
                baseBalanceAmt = baseBalanceAmt.add(totalAmt);
                dayBalanceAmt = dayBalanceAmt.add(totalAmt);

                model.addRow(new Object[]{
                    count++,//0
                    dayStr,//1
                    StringUtil.dateStr(ca.getTime()),//2
                    desc,//3
                    showResultTargetAmtStr,//4
                    showResultSaveIntAmtStr,//5
                    StringUtil.intFormat(qty),//6
                    StringUtil.bahtFormat(unitPrice),//7
                    StringUtil.bahtFormat(totalAmt),//8
                    StringUtil.bahtFormat(baseBalanceAmt),//9
                    remark,//10
                    showIntLoanAmtStr,//11
                    ingredientOrder,//12
                    devicesOrder,//13
                    empPerMonth,//14
                    shopPerMonth,//15
                    homePerMonth//16
                });
            }

            if (StringUtil.dateStr(caTarget.getTime()).equals(StringUtil.dateStr(ca.getTime()))) {
                isRunning = false;
            }

            ca.add(Calendar.DATE, 1);
        }

        // show summary
        pbSuccess.setValue(saveIntBalanceAmt.intValue());
        BigDecimal percent = saveIntBalanceAmt.divide(target.getBusinessTargetAmt(), 2, RoundingMode.HALF_UP).multiply(new BigDecimal("100"));
        txtPercent.setText("เป้าหมายความสำเร็จ (" + percent.toString() + "%)");
        txtNetTotalAmt.setText(StringUtil.bahtFormat(saveIntBalanceAmt));
    }

    private void initTable() {
        model = (DefaultTableModel) tbRun.getModel();
        JTableHeader tHead = tbRun.getTableHeader();
        tHead.setFont(new Font("Tahoma", Font.PLAIN, 14));

        tbRun.setRowHeight(30);
        tbRun.setFont(new Font("Tahoma", Font.PLAIN, 14));

        UXUtil.alignTable(tbRun, 0, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 2, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 3, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 4, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 5, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 6, SwingConstants.RIGHT);
        UXUtil.alignTable(tbRun, 7, SwingConstants.RIGHT);
        UXUtil.alignTable(tbRun, 8, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 9, SwingConstants.RIGHT);
        for (int i = 10; i < tbRun.getColumnCount(); i++) {
            UXUtil.alignTable(tbRun, i, SwingConstants.RIGHT);
        }

//        tbRun.setDefaultRenderer(Object.class, new TableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//                JLabel label = new JLabel();
//                label.setFont(new Font("Tahoma", Font.PLAIN, 14));
//                if (isHoliday(table, row, 1)) {
//                    label.setForeground(Color.RED);
//                } else {
//                    label.setForeground(Color.BLACK);
//                }
//                label.setText("" + value);
//
//                return label;
//            }
//
//            private boolean isHoliday(JTable table, int row, int column) {
//                return table.getValueAt(row, column).toString().contains("Sunday") || table.getValueAt(row, column).toString().contains("Saturday");
//            }
//
//        });
    }

    private void showDetail() {
        int sel = tbRun.getSelectedRow();
        Date date = new Date();
        String menuCode = "";
        if (sel != -1) {
            date = StringUtil.strToDate(tbRun.getValueAt(sel, 2).toString());
            menuCode = "";
        }
        RuntimeDetailDialog detail = new RuntimeDetailDialog(null, true, shop.getCode(), menuCode, date);
        detail.setVisible(true);
    }

    private boolean isHoliday(Date time) {
        boolean isHolidyChk = true;
        if (shop != null) {
            String dayStr = StringUtil.dayStr(time);

            if (shop.getChkUptoShop().equals("N")) {
                if (shop.getChkMon().equals("Y") && dayStr.contains("Mon")) {
                    isHolidyChk = false;
                } else if (shop.getChkTue().equals("Y") && dayStr.contains("Tue")) {
                    isHolidyChk = false;
                } else if (shop.getChkWed().equals("Y") && dayStr.contains("Wed")) {
                    isHolidyChk = false;
                } else if (shop.getChkThu().equals("Y") && dayStr.contains("Thu")) {
                    isHolidyChk = false;
                } else if (shop.getChkFri().equals("Y") && dayStr.contains("Fri")) {
                    isHolidyChk = false;
                } else if (shop.getChkSat().equals("Y") && dayStr.contains("Sat")) {
                    isHolidyChk = false;
                } else if (shop.getChkSun().equals("Y") && dayStr.contains("Sun")) {
                    isHolidyChk = false;
                }
            } else {
                isHolidyChk = false;
                for (HolidaySetting bean : listHoliday) {
                    if (bean.getChkActive().equals("Y")) {
                        //check year between year
                        Integer year = StringUtil.strToInt(StringUtil.yearStr(time));
                        Integer yearStart = StringUtil.strToInt(bean.getYearStart());
                        Integer yearEnd = StringUtil.strToInt(bean.getYearEnd());
                        if (year >= yearStart && year <= yearEnd) {
                            // 1. lock date
                            if (bean.getRdLockDay().equals("Y")) {
                                Calendar cal = Calendar.getInstance(Locale.ENGLISH);
                                cal.setTime(time);
                                cal.set(Calendar.HOUR, 0);
                                cal.set(Calendar.MINUTE, 0);
                                cal.set(Calendar.SECOND, 0);

                                Date dateChk = bean.getDateHoliday();
                                Date dateTime = cal.getTime();
                                if (dateChk.compareTo(dateTime) == 0) {
                                    isHolidyChk = true;
                                    break;
                                }
                            } // 2. every day in
                            else if (bean.getRdEveryDay().equals("Y")) {
                                String dayWeek = bean.getCbDayWeek();
                                String dayDialy = bean.getCbDayDialy();
                                if (dayDialy.equals("All Month")) {
                                    switch (dayWeek) {
                                        case "Holiday":
                                            if (dayStr.contains("Sat") || dayStr.contains("Sun")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Mon":
                                            if (dayStr.contains("Mon")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Tue":
                                            if (dayStr.contains("Tue")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Wed":
                                            if (dayStr.contains("Wed")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Thu":
                                            if (dayStr.contains("Thu")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Fri":
                                            if (dayStr.contains("Fri")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Sat":
                                            if (dayStr.contains("Sat")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Sun":
                                            if (dayStr.contains("Sat")) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                    }
                                } else {
                                    Integer monthStr = Integer.parseInt(StringUtil.monthStr(time)) + 1;
                                    switch (dayDialy) {
                                        case "Jan":
                                            if (monthStr == 1) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Feb":
                                            if (monthStr == 2) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Mar":
                                            if (monthStr == 3) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Apr":
                                            if (monthStr == 4) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "May":
                                            if (monthStr == 5) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Jun":
                                            if (monthStr == 6) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Jul":
                                            if (monthStr == 7) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Aug":
                                            if (monthStr == 8) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Sep":
                                            if (monthStr == 9) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Oct":
                                            if (monthStr == 10) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Nov":
                                            if (monthStr == 11) {
                                                isHolidyChk = true;
                                            }
                                            break;
                                        case "Dec":
                                            if (monthStr == 12) {
                                                isHolidyChk = true;
                                            }
                                            break;

                                    }
                                }
                            } // 3. check length date
                            else if (bean.getRdSpecificDay().equals("Y")) {
                                Date dateStart = bean.getDateStart();
                                Date dateEnd = bean.getDateEnd();
                                if (time.after(dateStart) && time.before(dateEnd)) {
                                    isHolidyChk = true;
                                }
                            }
                        }
                    } else {
                        isHolidyChk = false;
                    }
                }
            }
        }

        return isHolidyChk;
    }

    private BigDecimal getHomePerMonth() {
        try {
            ShopPlace spBean = shopPlaceImpl.findById(null);
            return spBean.getRentPerMonthAmt();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
            return BigDecimal.ZERO;
        }
    }

    private BigDecimal getShopPerMonth() {
        BigDecimal total = BigDecimal.ZERO;
        try {
            ShopPlace spBean = shopPlaceImpl.findById(null);
            if (spBean != null) {
                switch (spBean.getCbShopRentType()) {
                    case "รายวัน":
                        total = total.add(spBean.getRentForSaleAmt().multiply(new BigDecimal("30")));
                        break;
                    case "รายสัปดาห์":
                        total = total.add(spBean.getRentForSaleAmt().multiply(new BigDecimal("4")));
                        break;
                    case "รายเดือน":
                        total = total.add(spBean.getRentForSaleAmt());
                        break;
                    case "รายปี":
                        total = total.add(spBean.getRentForSaleAmt().divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP));
                        break;

                }
            }
            List<Expense> listExpense = expImpl.findAll(shop.getCode());
            for (Expense bean : listExpense) {
                switch (bean.getCbPayType()) {
                    case "รายวัน":
                        total = total.add(bean.getDialyPayAmt().multiply(new BigDecimal("30")));
                        break;
                    case "รายสัปดาห์":
                        total = total.add(bean.getWeeklyPayAmt().multiply(new BigDecimal("4")));
                        break;
                    case "รายเดือน":
                        total = total.add(bean.getMonthlyPayAmt());
                        break;
                }
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
            return BigDecimal.ZERO;
        }

        return total;
    }

    private BigDecimal getEmpPerMonth() {
        try {
            List<Employee> listEmp = employeeImpl.findAll(shop.getCode());
            BigDecimal empAmt = BigDecimal.ZERO;
            for (Employee emp : listEmp) {
                if (emp.getChkIsActive().equals("Y")) {
                    empAmt = empAmt.add(emp.getMonthSalary());
                }
            }
            return empAmt;
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
            return BigDecimal.ZERO;
        }
    }

    private BigDecimal getIngredientOrder(BigDecimal qtySalePerMonth) {
        BigDecimal netTotalAmt = BigDecimal.ZERO;
        try {
            List<Menu> listMenu = menuImpl.findAll();
            for (Menu menu : listMenu) {
                List<Ingredient> listIng = menuImpl.ingAll(menu.getCode(), AppConstants.MENU_NORMAL);
                for (Ingredient ing : listIng) {
                    BigDecimal totalQty = menuImpl.convertToPack(ing, qtySalePerMonth);
                    BigDecimal netAmt = totalQty.multiply(ing.getBuyUnitPrice());
                    netTotalAmt = netTotalAmt.add(netAmt);
                }
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }

        return netTotalAmt;
    }

    private BigDecimal getDevicesOrder(BigDecimal dayCount) {
        BigDecimal netTotalAmt = BigDecimal.ZERO;
        try {
            List<Device> listDev = devImpl.findAll(shop.getCode());
            for (Device dev : listDev) {
                if (dev.getHasExpired().equals("Y")) {
                    if (dev.getChkUpToSale().equals("Y")) {
                        int countPerUsed = dev.getCountPerUsed();
                        BigDecimal total1 = dayCount.divide(new BigDecimal("" + countPerUsed), 2, RoundingMode.HALF_UP);
                        BigDecimal total2 = total1.multiply(dev.getPriceAmt());

                        netTotalAmt = netTotalAmt.add(total2);
                    }
                }
            }
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }

        return netTotalAmt;
    }
}
