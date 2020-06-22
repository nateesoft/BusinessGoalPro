package sun.natee.app.main.dialog;

import java.awt.Font;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import sun.natee.app.bean.Menu;
import sun.natee.app.bean.Shop;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.dao.impl.ShopDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;
import sun.natee.app.main.util.UXUtil;

public class RuntimeDetailDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(RuntimeDetailDialog.class);

    private DefaultTableModel model = null;
    private final MenuDaoImpl menuImpl = new MenuDaoImpl();
    private final String shopCode;
    private final Date date;

    public RuntimeDetailDialog(java.awt.Frame parent, boolean modal, String shopCode, String menu, Date date) {
        super(parent, modal);
        initComponents();

        setTitle(getTitle() + " " + StringUtil.dateStr(date));
        this.date = date;
        this.shopCode = shopCode;
        initTable();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbRun = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Running to Target by dialy");
        setResizable(false);

        tbRun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "เวลา", "จำนวนที่ขาย", "รายการ", "สรุป", "กิจกรรมพื้นฐาน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tbRun.getColumnModel().getColumn(0).setPreferredWidth(55);
            tbRun.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbRun.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbRun.getColumnModel().getColumn(3).setPreferredWidth(200);
            tbRun.getColumnModel().getColumn(4).setPreferredWidth(150);
            tbRun.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("Exit Program");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setText("Export Excel File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRunMouseClicked

    }//GEN-LAST:event_tbRunMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRun;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        int lengthMinute = 15;
        List<Menu> listMenu;
        try {
            listMenu = menuImpl.findAll(shopCode);
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
            return;
        }

        BigDecimal baseUnitPrice = BigDecimal.ZERO;
        if (!listMenu.isEmpty()) {
            baseUnitPrice = listMenu.get(0).getMenuPrice();
        }

        BigDecimal baseQty = new BigDecimal("1");
        BigDecimal baseBalanceAmt = BigDecimal.ZERO;
        BigDecimal balaceQty = BigDecimal.ZERO;

        BigDecimal totalAmt, qty;

        ShopDaoImpl shop = new ShopDaoImpl();
        Shop shopBean;
        try {
            shopBean = shop.findById(null);
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
            return;
        }

        Calendar ca = Calendar.getInstance(Locale.ENGLISH);
        ca.setTime(StringUtil.strToDateTime("01/01/2018 " + shopBean.getTimeOpen()));

        boolean isRunning = true;
        int count = 1;
        model.addRow(new Object[]{"", "", "", "สั่งของก่อนขาย"});
        model.addRow(new Object[]{"", "", "", "เตรียมขายของ/เงินทอน/จัดโต๊ะ"});
        model.addRow(new Object[]{"", "", "", "เปิดร้าน	"});
        while (isRunning) {
            String desc = "";
            String timeStr = StringUtil.timeStr(ca.getTime());
            if (timeStr.contains("12:") || timeStr.contains(":00")) {
                if (timeStr.contains("12:")) {
                    desc = "พักเที่ยง";
                } else if (timeStr.contains(":00")) {
                    desc = "พัก/เข้าห้องน้ำ";
                }
                model.addRow(new Object[]{count++, timeStr, "", desc});
            } else {
                qty = baseQty;
                balaceQty = balaceQty.add(qty);
                desc = "";
                totalAmt = baseUnitPrice.multiply(baseQty);
                baseBalanceAmt = baseBalanceAmt.add(totalAmt);
                model.addRow(new Object[]{count++, timeStr, qty, desc});
            }

            if (shopBean.getTimeClose().equals(StringUtil.timeStr(ca.getTime()))) {
                isRunning = false;
            }
            ca.add(Calendar.MINUTE, lengthMinute);
        }

        // Summary
        model.addRow(new Object[]{"", "", "", "ปิดร้าน"});
        model.addRow(new Object[]{"", "", "", "สรุปการขายต่อวัน"});
        BigDecimal sumTotalAmt = balaceQty.multiply(baseUnitPrice);
        model.addRow(new Object[]{"", "", "", "   รายรับ", sumTotalAmt + " บาท"});
        model.addRow(new Object[]{"", "", "", "   รายจ่าย", "0.00 บาท"});
        model.addRow(new Object[]{"", "", "", "   กำไร/-(ขาดทุน)", sumTotalAmt + " บาท"});
        model.addRow(new Object[]{"", "", "", "   วัตถุดิบเหลือ", "2 รายการ"});
        model.addRow(new Object[]{"", "", "", "   ของที่หมดอายุวันนี้", "5 รายการ"});
        model.addRow(new Object[]{"", "", "", "   เมนูที่ขายดีที่สุด", "ข้าวไข่เจียว"});
        model.addRow(new Object[]{"", "", "", "   รวมขายได้ทั้งหมด (MAX)", balaceQty + " กล่อง"});
        model.addRow(new Object[]{"", "", "", "   รวมจำนวนเงินทั้งหมด (MAX)", sumTotalAmt + " บาท"});
    }

    private void initTable() {
        model = (DefaultTableModel) tbRun.getModel();
        JTableHeader tHead = tbRun.getTableHeader();
        tHead.setFont(new Font("Tahoma", Font.PLAIN, 14));

        tbRun.setRowHeight(30);
        tbRun.setFont(new Font("Tahoma", Font.PLAIN, 14));

        UXUtil.alignTable(tbRun, 0, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 1, SwingConstants.CENTER);
        UXUtil.alignTable(tbRun, 2, SwingConstants.CENTER);
    }

}
