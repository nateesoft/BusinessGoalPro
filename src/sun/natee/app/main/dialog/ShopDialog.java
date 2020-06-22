package sun.natee.app.main.dialog;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sun.natee.app.main.dialog.config.HolidaySettingDialog;
import sun.natee.app.main.dialog.config.MenuTopDialog;
import sun.natee.app.bean.Device;
import sun.natee.app.bean.Employee;
import sun.natee.app.bean.Expense;
import sun.natee.app.bean.Menu;
import sun.natee.app.bean.Shop;
import sun.natee.app.dao.impl.DeviceDaoImpl;
import sun.natee.app.dao.impl.EmployeeDaoImpl;
import sun.natee.app.dao.impl.ExpenseDaoImpl;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.dao.impl.ShopDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class ShopDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ShopDialog.class);

    private Shop data;
    private final String shopCode;
    private final DefaultTableModel modelMenu;
    private final DefaultTableModel modelDevice;
    private final DefaultTableModel modelExpense;
    private final DefaultTableModel modelEmp;

    public ShopDialog(java.awt.Frame parent, boolean modal, String shopCode) {
        super(parent, modal);
        initComponents();

        this.shopCode = shopCode;
        txtShopCode.setText(shopCode);

        modelMenu = (DefaultTableModel) tableMenu.getModel();
        modelDevice = (DefaultTableModel) tableDevice.getModel();
        modelExpense = (DefaultTableModel) tableExpense.getModel();
        modelEmp = (DefaultTableModel) tableEmp.getModel();

        if (shopCode != null) {
            loadData();
        }
        lbSystem.setText(StringUtil.showSystem());
    }

    public Shop getData() {
        return data;
    }

    public void setData(Shop data) {
        this.data = data;
    }

    public void changeTab(int index) {
        tabbMain.setSelectedIndex(index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtShopCode = new javax.swing.JTextField();
        tabbMain = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnAddDevice = new javax.swing.JButton();
        tbMenu1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDevice = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAddMenu = new javax.swing.JButton();
        tbMenu = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAddExpense = new javax.swing.JButton();
        tbMenu2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableExpense = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnAddEmp = new javax.swing.JButton();
        tbMenu3 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEmp = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnSaveShop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtShopName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        chkMon = new javax.swing.JCheckBox();
        chkTue = new javax.swing.JCheckBox();
        chkWed = new javax.swing.JCheckBox();
        chkThu = new javax.swing.JCheckBox();
        chkFri = new javax.swing.JCheckBox();
        chkSat = new javax.swing.JCheckBox();
        chkSun = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtTOMon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTCMon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTCTue = new javax.swing.JTextField();
        txtTOTue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTCWed = new javax.swing.JTextField();
        txtTOWed = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTCThu = new javax.swing.JTextField();
        txtTOThu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTCFri = new javax.swing.JTextField();
        txtTOFri = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTCSat = new javax.swing.JTextField();
        txtTOSat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTCSun = new javax.swing.JTextField();
        txtTOSun = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        chkUptoShop = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        txtTimeOpen = new javax.swing.JTextField();
        txtTimeClose = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtShopOwner = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มข้อมูล และรายละเอียดร้าน");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัสร้าน");

        txtShopCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShopCode.setText("01");

        tabbMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAddDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        btnAddDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeviceActionPerformed(evt);
            }
        });

        tbMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tableDevice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDevice.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableDevice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDeviceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDevice);
        if (tableDevice.getColumnModel().getColumnCount() > 0) {
            tableDevice.getColumnModel().getColumn(0).setPreferredWidth(75);
            tableDevice.getColumnModel().getColumn(2).setPreferredWidth(400);
        }

        tbMenu1.addTab("รายการ", jScrollPane2);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("เพิ่มอุปกรณ์");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("delete all");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel27)
                    .addComponent(btnAddDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbMain.addTab("อุปกรณ์", jPanel2);

        btnAddMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        btnAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuActionPerformed(evt);
            }
        });

        tbMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ", "ราคาขาย", "ราคาพิเศษ", "ราคาลด"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMenu.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMenu);
        if (tableMenu.getColumnModel().getColumnCount() > 0) {
            tableMenu.getColumnModel().getColumn(0).setPreferredWidth(75);
            tableMenu.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableMenu.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        tbMenu.addTab("รายการ", jScrollPane1);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("เพิ่มเมนูอาหาร");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("delete all");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel26)
                    .addComponent(btnAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbMain.addTab("เมนูขาย", jPanel1);

        btnAddExpense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        btnAddExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExpenseActionPerformed(evt);
            }
        });

        tbMenu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tableExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableExpense.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableExpenseMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableExpense);
        if (tableExpense.getColumnModel().getColumnCount() > 0) {
            tableExpense.getColumnModel().getColumn(0).setPreferredWidth(75);
            tableExpense.getColumnModel().getColumn(2).setPreferredWidth(400);
        }

        tbMenu2.addTab("รายการ", jScrollPane3);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("เพิ่มค่าใช้จ่ายอื่นๆ");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("delete all");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("remove");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(btnAddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbMain.addTab("สาธารณูปโภค", jPanel3);

        btnAddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        tbMenu3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmp.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableEmp);
        if (tableEmp.getColumnModel().getColumnCount() > 0) {
            tableEmp.getColumnModel().getColumn(0).setPreferredWidth(75);
            tableEmp.getColumnModel().getColumn(2).setPreferredWidth(400);
        }

        tbMenu3.addTab("รายการ", jScrollPane4);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("เพิ่มพนักงาน");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("delete all");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setText("remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel29)
                    .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbMain.addTab("พนักงาน", jPanel4);

        btnSaveShop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSaveShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSaveShop.setText("บันทึกข้อมูล");
        btnSaveShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveShopActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ชื่อร้าน");

        txtShopName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShopName.setText("ร้านข้าวไข่เจียว พรีเมียม");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ช่วงเวลาดำเนินการ (ประจำ)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        chkMon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMon.setSelected(true);
        chkMon.setText("จันทร์");
        chkMon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkMonItemStateChanged(evt);
            }
        });

        chkTue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkTue.setSelected(true);
        chkTue.setText("อังคาร");
        chkTue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkTueItemStateChanged(evt);
            }
        });

        chkWed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkWed.setSelected(true);
        chkWed.setText("พุธ");
        chkWed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkWedItemStateChanged(evt);
            }
        });

        chkThu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkThu.setSelected(true);
        chkThu.setText("พฤหัสบดี");
        chkThu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkThuItemStateChanged(evt);
            }
        });

        chkFri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkFri.setSelected(true);
        chkFri.setText("ศุกร์");
        chkFri.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkFriItemStateChanged(evt);
            }
        });

        chkSat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSat.setSelected(true);
        chkSat.setText("เสาร์");
        chkSat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkSatItemStateChanged(evt);
            }
        });

        chkSun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSun.setSelected(true);
        chkSun.setText("อาทิตย์");
        chkSun.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkSunItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("เปิด");

        txtTOMon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOMon.setText("06:00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ปิด");

        txtTCMon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCMon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCMon.setText("18:00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("เปิด");

        txtTCTue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCTue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCTue.setText("18:00");

        txtTOTue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOTue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOTue.setText("06:00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ปิด");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("เปิด");

        txtTCWed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCWed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCWed.setText("18:00");

        txtTOWed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOWed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOWed.setText("06:00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ปิด");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("เปิด");

        txtTCThu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCThu.setText("18:00");

        txtTOThu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOThu.setText("06:00");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ปิด");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("เปิด");

        txtTCFri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCFri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCFri.setText("18:00");

        txtTOFri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOFri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOFri.setText("06:00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ปิด");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("เปิด");

        txtTCSat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCSat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCSat.setText("18:00");

        txtTOSat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOSat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOSat.setText("06:00");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("ปิด");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("เปิด");

        txtTCSun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTCSun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTCSun.setText("18:00");

        txtTOSun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTOSun.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTOSun.setText("06:00");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ปิด");

        chkUptoShop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkUptoShop.setText("ตามข้อกำหนดวันหยุดร้าน");
        chkUptoShop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkUptoShopItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkWed, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkTue, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOWed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCWed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOTue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCTue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOMon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCMon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkThu)
                            .addComponent(chkFri)
                            .addComponent(chkSat)
                            .addComponent(chkSun))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOSun, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCSun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOSat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCSat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOFri, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCFri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTOThu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTCThu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(chkUptoShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMon)
                    .addComponent(jLabel4)
                    .addComponent(txtTOMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTCMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkTue)
                    .addComponent(jLabel6)
                    .addComponent(txtTOTue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTCTue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkWed)
                    .addComponent(jLabel8)
                    .addComponent(txtTOWed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTCWed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkThu)
                    .addComponent(jLabel10)
                    .addComponent(txtTOThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTCThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFri)
                    .addComponent(jLabel12)
                    .addComponent(txtTOFri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtTCFri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSat)
                    .addComponent(jLabel14)
                    .addComponent(txtTOSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTCSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSun)
                    .addComponent(jLabel16)
                    .addComponent(txtTOSun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtTCSun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkUptoShop))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("ปิด");

        txtTimeOpen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimeOpen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimeOpen.setText("06:00");

        txtTimeClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimeClose.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTimeClose.setText("18:00");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("เปิด");

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restaurant.jpg"))); // NOI18N
        lblImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N
        btnImg.setText("เปลี่ยน...");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("เจ้าของ");

        txtShopOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShopOwner.setText("ชาย ปริญญา");

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("เพิ่มข้อมูล และรายละเอียดร้าน");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 8, 1, new java.awt.Color(0, 102, 102)));

        lbSystem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSystem.setText("26/10/2561 21:51:01");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSystem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("รายละเอียดเพิ่มเติม");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("กำหนดวันหยุดร้าน");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setText("กำหนดเมนูขายดี");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnImg)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSaveShop)))
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel31)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtShopCode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimeOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimeClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShopOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbMain, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tabbMain, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtShopCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtTimeOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtTimeClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtShopOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveShop)
                            .addComponent(btnImg))
                        .addGap(13, 13, 13)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveShopActionPerformed
        saveShop();
    }//GEN-LAST:event_btnSaveShopActionPerformed

    private void btnAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMenuActionPerformed
        addMenu("");
    }//GEN-LAST:event_btnAddMenuActionPerformed

    private void btnAddDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeviceActionPerformed
        addDevice("");
    }//GEN-LAST:event_btnAddDeviceActionPerformed

    private void btnAddExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExpenseActionPerformed
        addExpense("");
    }//GEN-LAST:event_btnAddExpenseActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        addEmployee("");
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        HolidaySettingDialog hd = new HolidaySettingDialog(null, true);
        hd.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MenuTopDialog mtd = new MenuTopDialog(null, true, shopCode);
        mtd.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        emptyDevice();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        emptyMenu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        emptyExpense();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        emptyEmployee();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        removeItem("MENU");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        removeItem("DEVICE");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        removeItem("EXPENSE");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        removeItem("EMPLOYEE");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void chkMonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkMonItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkMonItemStateChanged

    private void chkTueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkTueItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkTueItemStateChanged

    private void chkWedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkWedItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkWedItemStateChanged

    private void chkThuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkThuItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkThuItemStateChanged

    private void chkFriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkFriItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkFriItemStateChanged

    private void chkSatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkSatItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkSatItemStateChanged

    private void chkSunItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkSunItemStateChanged
        checkSelectAll();
    }//GEN-LAST:event_chkSunItemStateChanged

    private void chkUptoShopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkUptoShopItemStateChanged
        clearSelectAll();
    }//GEN-LAST:event_chkUptoShopItemStateChanged

    private void tableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMenuMouseClicked
        if (evt.getClickCount() == 2) {
            int iSel = tableMenu.getSelectedRow();
            if (iSel != -1) {
                String menuCode = "" + tableMenu.getValueAt(iSel, 0);
                addMenu(menuCode);
            }
        }
    }//GEN-LAST:event_tableMenuMouseClicked

    private void tableDeviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDeviceMouseClicked
        if (evt.getClickCount() == 2) {
            int iSel = tableDevice.getSelectedRow();
            if (iSel != -1) {
                String devCode = "" + tableDevice.getValueAt(iSel, 0);
                addDevice(devCode);
            }
        }
    }//GEN-LAST:event_tableDeviceMouseClicked

    private void tableExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableExpenseMouseClicked
        if (evt.getClickCount() == 2) {
            int iSel = tableExpense.getSelectedRow();
            if (iSel != -1) {
                String expCode = "" + tableExpense.getValueAt(iSel, 0);
                addExpense(expCode);
            }
        }
    }//GEN-LAST:event_tableExpenseMouseClicked

    private void tableEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpMouseClicked
        if (evt.getClickCount() == 2) {
            int iSel = tableEmp.getSelectedRow();
            if (iSel != -1) {
                String empCode = "" + tableEmp.getValueAt(iSel, 0);
                addEmployee(empCode);
            }
        }
    }//GEN-LAST:event_tableEmpMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDevice;
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnAddExpense;
    private javax.swing.JButton btnAddMenu;
    private javax.swing.JButton btnImg;
    private javax.swing.JButton btnSaveShop;
    private javax.swing.JCheckBox chkFri;
    private javax.swing.JCheckBox chkMon;
    private javax.swing.JCheckBox chkSat;
    private javax.swing.JCheckBox chkSun;
    private javax.swing.JCheckBox chkThu;
    private javax.swing.JCheckBox chkTue;
    private javax.swing.JCheckBox chkUptoShop;
    private javax.swing.JCheckBox chkWed;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTabbedPane tabbMain;
    private javax.swing.JTable tableDevice;
    private javax.swing.JTable tableEmp;
    private javax.swing.JTable tableExpense;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTabbedPane tbMenu;
    private javax.swing.JTabbedPane tbMenu1;
    private javax.swing.JTabbedPane tbMenu2;
    private javax.swing.JTabbedPane tbMenu3;
    private javax.swing.JTextField txtShopCode;
    private javax.swing.JTextField txtShopName;
    private javax.swing.JTextField txtShopOwner;
    private javax.swing.JTextField txtTCFri;
    private javax.swing.JTextField txtTCMon;
    private javax.swing.JTextField txtTCSat;
    private javax.swing.JTextField txtTCSun;
    private javax.swing.JTextField txtTCThu;
    private javax.swing.JTextField txtTCTue;
    private javax.swing.JTextField txtTCWed;
    private javax.swing.JTextField txtTOFri;
    private javax.swing.JTextField txtTOMon;
    private javax.swing.JTextField txtTOSat;
    private javax.swing.JTextField txtTOSun;
    private javax.swing.JTextField txtTOThu;
    private javax.swing.JTextField txtTOTue;
    private javax.swing.JTextField txtTOWed;
    private javax.swing.JTextField txtTimeClose;
    private javax.swing.JTextField txtTimeOpen;
    // End of variables declaration//GEN-END:variables

    private void addMenu(String menuCode) {
        MenuDialog menuDialog = new MenuDialog(null, true, shopCode, menuCode);
        menuDialog.setVisible(true);

        Menu item = menuDialog.getData();
        if (item != null && item.getCode() != null) {
            try {
                loadMenu();
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }

    private void addDevice(String devCode) {
        DeviceDialog deviceDialog = new DeviceDialog(null, true, txtShopCode.getText(), devCode);
        deviceDialog.setVisible(true);

        Device item = deviceDialog.getData();
        if (item != null && item.getCode() != null) {
            try {
                loadDevice();
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }

    private void addExpense(String expCode) {
        ExpenseDialog expDialog = new ExpenseDialog(null, true, txtShopCode.getText(), expCode);
        expDialog.setVisible(true);

        Expense item = expDialog.getData();
        if (item != null && item.getCode() != null) {
            try {
                loadExpense();
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }

    private void addEmployee(String empCode) {
        EmployeeDialog empDialog = new EmployeeDialog(null, true, txtShopCode.getText(), empCode);
        empDialog.setVisible(true);

        Employee item = empDialog.getData();
        if (item != null && item.getCode() != null) {
            try {
                loadEmployee();
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }

    private void saveShop() {
        //validate
        if (StringUtil.isEmpty(txtShopCode.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtShopCode.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtTimeOpen.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtTimeOpen.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtTimeClose.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtTimeClose.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtShopName.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtShopName.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtShopOwner.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtShopOwner.requestFocus();
            return;
        }
        if (chkMon.isSelected() == false
                && chkTue.isSelected() == false
                && chkWed.isSelected() == false
                && chkThu.isSelected() == false
                && chkFri.isSelected() == false
                && chkSat.isSelected() == false
                && chkSun.isSelected() == false
                && chkUptoShop.isSelected() == false) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            return;
        }

        data = new Shop();
        data.setCode(txtShopCode.getText());
        data.setTimeOpen(txtTimeOpen.getText());
        data.setTimeClose(txtTimeClose.getText());
        data.setShopName(txtShopName.getText());
        data.setShopOwner(txtShopOwner.getText());
        data.setChkMon(chkMon.isSelected() ? "Y" : "N");
        data.settOMon(txtTOMon.getText());
        data.settCMon(txtTCMon.getText());
        data.setChkTue(chkTue.isSelected() ? "Y" : "N");
        data.settOTue(txtTOTue.getText());
        data.settCTue(txtTCTue.getText());
        data.setChkWed(chkWed.isSelected() ? "Y" : "N");
        data.settOWed(txtTOWed.getText());
        data.settCWed(txtTCWed.getText());
        data.setChkThu(chkThu.isSelected() ? "Y" : "N");
        data.settOThu(txtTOThu.getText());
        data.settCThu(txtTCThu.getText());
        data.setChkFri(chkFri.isSelected() ? "Y" : "N");
        data.settOFri(txtTOFri.getText());
        data.settCFri(txtTCFri.getText());
        data.setChkSat(chkSat.isSelected() ? "Y" : "N");
        data.settOSat(txtTOSat.getText());
        data.settCSat(txtTCSat.getText());
        data.setChkSun(chkSun.isSelected() ? "Y" : "N");
        data.settOSun(txtTOSun.getText());
        data.settCSun(txtTCSun.getText());
        data.setChkUptoShop(chkUptoShop.isSelected() ? "Y" : "N");

        ShopDaoImpl shopDao = new ShopDaoImpl();
        try {
            shopDao.save(data);

            dispose();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void loadData() {
        try {
            loadShop();
            loadDevice();// load device            
            loadMenu();// load menu            
            loadExpense();// load expense            
            loadEmployee();// load employee
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }

    }

    private void loadDevice() throws SQLException {
        DeviceDaoImpl deviceDao = new DeviceDaoImpl();
        List<Device> listDevice = deviceDao.findAll(shopCode);
        int size = modelDevice.getRowCount();
        for (int i = 0; i < size; i++) {
            modelDevice.removeRow(0);
        }
        for (Device device : listDevice) {
            modelDevice.addRow(new Object[]{device.getCode(), device.getId(), device.getName(),});
        }
    }

    private void loadMenu() throws SQLException {
        MenuDaoImpl menuDao = new MenuDaoImpl();
        List<Menu> listMenu = menuDao.findAll(shopCode);
        int size = modelMenu.getRowCount();
        for (int i = 0; i < size; i++) {
            modelMenu.removeRow(0);
        }
        for (Menu menu : listMenu) {
            modelMenu.addRow(new Object[]{menu.getCode(), menu.getId(), menu.getName(), menu.getMenuPrice(), menu.getMenuSpecialPrice(), menu.getMenuDiscPrice()});
        }
    }

    private void loadExpense() throws SQLException {
        ExpenseDaoImpl expDao = new ExpenseDaoImpl();
        List<Expense> listExp = expDao.findAll(shopCode);
        int size = modelExpense.getRowCount();
        for (int i = 0; i < size; i++) {
            modelExpense.removeRow(0);
        }
        for (Expense exp : listExp) {
            modelExpense.addRow(new Object[]{exp.getCode(), exp.getId(), exp.getName()});
        }
    }

    private void loadEmployee() throws SQLException {
        EmployeeDaoImpl empDao = new EmployeeDaoImpl();
        List<Employee> listEmp = empDao.findAll(shopCode);
        int size = modelEmp.getRowCount();
        for (int i = 0; i < size; i++) {
            modelEmp.removeRow(0);
        }
        for (Employee emp : listEmp) {
            modelEmp.addRow(new Object[]{emp.getCode(), emp.getId(), emp.getName()});
        }
    }

    private void emptyDevice() {
        DeviceDaoImpl dao = new DeviceDaoImpl();
        try {
            dao.delete(null);
            loadDevice();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void emptyMenu() {
        MenuDaoImpl dao = new MenuDaoImpl();
        try {
            dao.delete(null);
            loadMenu();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void emptyExpense() {
        ExpenseDaoImpl dao = new ExpenseDaoImpl();
        try {
            dao.delete(null);
            loadExpense();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void emptyEmployee() {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        try {
            dao.delete(null);
            loadEmployee();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void removeItem(String type) {
        try {
            int id;
            switch (type) {
                case "MENU":
                    if (tableMenu.getSelectedRow() == -1) {
                        return;
                    }
                    id = Integer.parseInt(tableMenu.getValueAt(tableMenu.getSelectedRow(), 1).toString());
                    new MenuDaoImpl().delete(id);
                    break;
                case "DEVICE":
                    if (tableDevice.getSelectedRow() == -1) {
                        return;
                    }
                    id = Integer.parseInt(tableDevice.getValueAt(tableDevice.getSelectedRow(), 1).toString());
                    new DeviceDaoImpl().delete(id);
                    break;
                case "EXPENSE":
                    if (tableExpense.getSelectedRow() == -1) {
                        return;
                    }
                    id = Integer.parseInt(tableExpense.getValueAt(tableExpense.getSelectedRow(), 1).toString());
                    new ExpenseDaoImpl().delete(id);
                    break;
                case "EMPLOYEE":
                    if (tableEmp.getSelectedRow() == -1) {
                        return;
                    }
                    id = Integer.parseInt(tableEmp.getValueAt(tableEmp.getSelectedRow(), 1).toString());
                    new EmployeeDaoImpl().delete(id);
                    break;
            }
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }

        loadData();
    }

    private void loadShop() throws SQLException {
        ShopDaoImpl shopDao = new ShopDaoImpl();
        data = shopDao.findById(null);

        txtShopCode.setText(data.getCode());
        txtShopCode.setEditable(false);
        txtTimeOpen.setText(data.getTimeOpen());
        txtTimeClose.setText(data.getTimeClose());
        txtShopName.setText(data.getShopName());
        txtShopOwner.setText(data.getShopOwner());
        chkMon.setSelected(data.getChkMon().equals("Y"));
        txtTOMon.setText(data.gettOMon());
        txtTCMon.setText(data.gettCMon());
        chkTue.setSelected(data.getChkTue().equals("Y"));
        txtTOTue.setText(data.gettOTue());
        txtTCTue.setText(data.gettCTue());
        chkWed.setSelected(data.getChkWed().equals("Y"));
        txtTOWed.setText(data.gettOWed());
        txtTCWed.setText(data.gettCWed());
        chkThu.setSelected(data.getChkThu().equals("Y"));
        txtTOThu.setText(data.gettOThu());
        txtTCThu.setText(data.gettCThu());
        chkFri.setSelected(data.getChkFri().equals("Y"));
        txtTOFri.setText(data.gettOFri());
        txtTCFri.setText(data.gettCFri());
        chkSat.setSelected(data.getChkSat().equals("Y"));
        txtTOSat.setText(data.gettOSat());
        txtTCSat.setText(data.gettCSat());
        chkSun.setSelected(data.getChkSun().equals("Y"));
        txtTOSun.setText(data.gettOSun());
        txtTCSun.setText(data.gettCSun());
        chkUptoShop.setSelected(data.getChkUptoShop().equals("Y"));
    }

    private void checkSelectAll() {
        if (!chkMon.isSelected()) {
            txtTOMon.setText("");
            txtTCMon.setText("");
        } else {
            txtTOMon.setText(txtTimeOpen.getText());
            txtTCMon.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }

        if (!chkTue.isSelected()) {
            txtTOTue.setText("");
            txtTCTue.setText("");
        } else {
            txtTOTue.setText(txtTimeOpen.getText());
            txtTCTue.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }

        if (!chkWed.isSelected()) {
            txtTOWed.setText("");
            txtTCWed.setText("");
        } else {
            txtTOWed.setText(txtTimeOpen.getText());
            txtTCWed.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }

        if (!chkThu.isSelected()) {
            txtTOThu.setText("");
            txtTCThu.setText("");
        } else {
            txtTOThu.setText(txtTimeOpen.getText());
            txtTCThu.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }

        if (!chkFri.isSelected()) {
            txtTOFri.setText("");
            txtTCFri.setText("");
        } else {
            txtTOFri.setText(txtTimeOpen.getText());
            txtTCFri.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }

        if (!chkSat.isSelected()) {
            txtTOSat.setText("");
            txtTCSat.setText("");
        } else {
            txtTOSat.setText(txtTimeOpen.getText());
            txtTCSat.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }

        if (!chkSun.isSelected()) {
            txtTOSun.setText("");
            txtTCSun.setText("");
        } else {
            txtTOSun.setText(txtTimeOpen.getText());
            txtTCSun.setText(txtTimeClose.getText());
            chkUptoShop.setSelected(false);
        }
    }

    private void clearSelectAll() {
        chkMon.setSelected(false);
        chkTue.setSelected(false);
        chkWed.setSelected(false);
        chkThu.setSelected(false);
        chkFri.setSelected(false);
        chkSat.setSelected(false);
        chkSun.setSelected(false);

        checkSelectAll();
    }
}
