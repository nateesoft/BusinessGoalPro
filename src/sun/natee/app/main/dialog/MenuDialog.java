package sun.natee.app.main.dialog;

import java.awt.event.KeyEvent;
import java.io.File;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import sun.natee.app.AppConstants;
import sun.natee.app.bean.Ingredient;
import sun.natee.app.bean.Menu;
import sun.natee.app.dao.impl.IngredientDaoImpl;
import sun.natee.app.dao.impl.MenuDaoImpl;
import sun.natee.app.main.util.MsgUtil;
import sun.natee.app.main.util.StringUtil;

public class MenuDialog extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(MenuDialog.class);

    private Menu data = null;
    private final DefaultTableModel modelIngNormal;
    private final DefaultTableModel modelIngSpecial;
    private final DefaultTableModel modelIngDiscount;
    private final String shopCode;

    public MenuDialog(java.awt.Frame parent, boolean modal, String shopCode, String menuCode) {
        super(parent, modal);
        initComponents();
        this.shopCode = shopCode;
        modelIngNormal = (DefaultTableModel) tbIngNormal.getModel();
        modelIngSpecial = (DefaultTableModel) tbIngSpecial.getModel();
        modelIngDiscount = (DefaultTableModel) tbIngDiscount.getModel();
        if (!menuCode.equals("")) {
            txtMenuCode.setText(menuCode);
            loadMenu();
        }
        lbSystem.setText(StringUtil.showSystem());
    }

    public Menu getData() {
        return data;
    }

    public void setData(Menu data) {
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtBasePrice = new javax.swing.JTextField();
        txtMenuCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMenuPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMakeOrderTime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMenuName = new javax.swing.JTextField();
        lblImg = new javax.swing.JLabel();
        btnImg = new javax.swing.JButton();
        txtMenuSpecial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMenuDiscount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbUnitSale = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        tabIng = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbIngNormal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbIngSpecial = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbIngDiscount = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มเมนูสินค้าร้าน");
        setResizable(false);

        btnAddMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnAddMenu.setText("บันทึกข้อมูล");
        btnAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBasePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBasePrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBasePrice.setText("0.00");

        txtMenuCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenuCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMenuCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMenuCodeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ราคาต้นทุน");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัสเมนู");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ราคาขาย");

        txtMenuPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenuPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMenuPrice.setText("0.00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("เวลาทำ");

        txtMakeOrderTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMakeOrderTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ชื่อเมนู");

        txtMenuName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food.jpg"))); // NOI18N
        lblImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img.png"))); // NOI18N
        btnImg.setText("เปลี่ยน...");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        txtMenuSpecial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenuSpecial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMenuSpecial.setText("0.00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ราคาพิเศษ");

        txtMenuDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenuDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMenuDiscount.setText("0.00");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("ราคาส่วนลด");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("หน่วยขาย");

        cbUnitSale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbUnitSale.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "จาน" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMenuCode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbUnitSale, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(76, 76, 76)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnImg)
                                    .addComponent(txtMenuDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMenuName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenuSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(txtMakeOrderTime, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMenuCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtMenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtMakeOrderTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtMenuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtMenuDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtMenuSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbUnitSale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabIng.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbIngNormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ", "อัตราส่วน", "หน่วย"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbIngNormal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbIngNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbIngNormalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbIngNormal);
        if (tbIngNormal.getColumnModel().getColumnCount() > 0) {
            tbIngNormal.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbIngNormal.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbIngNormal.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbIngNormal.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbIngNormal.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        tabIng.addTab("วัตถุดิบเมนูปกติ", jScrollPane1);

        tbIngSpecial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ", "อัตราส่วน", "หน่วย"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbIngSpecial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbIngSpecial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbIngSpecialMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbIngSpecial);
        if (tbIngSpecial.getColumnModel().getColumnCount() > 0) {
            tbIngSpecial.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbIngSpecial.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbIngSpecial.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbIngSpecial.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbIngSpecial.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        tabIng.addTab("วัตถุดิบเมนูสั่งพิเศษ", jScrollPane2);

        tbIngDiscount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ID", "รายการ", "อัตราส่วน", "หน่วย"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbIngDiscount.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbIngDiscount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbIngDiscountMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbIngDiscount);
        if (tbIngDiscount.getColumnModel().getColumnCount() > 0) {
            tbIngDiscount.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbIngDiscount.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbIngDiscount.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbIngDiscount.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbIngDiscount.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        tabIng.addTab("วัตถุดิบเมนูส่วนลด", jScrollPane3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("เพิ่มวัตถุดิบ");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("เพิ่มเมนูสินค้าร้าน");

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("delete all");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("แฟ้มข้อมูล");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("บันทึกวัตถุดิบเมนูสั่งพิเศษจากเมนูปกติ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setText("บันทึกวัตถุดิบเมนูส่วนลดจากเมนูปกติ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem3.setText("ปิดหน้าต่าง");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tabIng, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddMenu))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabIng, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addIngredient("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMenuActionPerformed
        saveMenu();
    }//GEN-LAST:event_btnAddMenuActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser jfc = new JFileChooser();
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            MsgUtil.printLog(selectedFile.getAbsolutePath());
            lblImg.setIcon(new javax.swing.ImageIcon(selectedFile.getAbsolutePath()));
        }
    }//GEN-LAST:event_btnImgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearIngredient();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        deleteItem();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMenuCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenuCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loadMenu();
        }
    }//GEN-LAST:event_txtMenuCodeKeyPressed

    private void tbIngNormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbIngNormalMouseClicked
        if (evt.getClickCount() == 2) {
            loadDataIn(tbIngNormal);
        }
    }//GEN-LAST:event_tbIngNormalMouseClicked

    private void tbIngSpecialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbIngSpecialMouseClicked
        if (evt.getClickCount() == 2) {
            loadDataIn(tbIngSpecial);
        }
    }//GEN-LAST:event_tbIngSpecialMouseClicked

    private void tbIngDiscountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbIngDiscountMouseClicked
        if (evt.getClickCount() == 2) {
            loadDataIn(tbIngDiscount);
        }
    }//GEN-LAST:event_tbIngDiscountMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        saveSpecialFromNormal();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        saveDiscountFromNormal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMenu;
    private javax.swing.JButton btnImg;
    private javax.swing.JComboBox cbUnitSale;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTabbedPane tabIng;
    private javax.swing.JTable tbIngDiscount;
    private javax.swing.JTable tbIngNormal;
    private javax.swing.JTable tbIngSpecial;
    private javax.swing.JTextField txtBasePrice;
    private javax.swing.JTextField txtMakeOrderTime;
    private javax.swing.JTextField txtMenuCode;
    private javax.swing.JTextField txtMenuDiscount;
    private javax.swing.JTextField txtMenuName;
    private javax.swing.JTextField txtMenuPrice;
    private javax.swing.JTextField txtMenuSpecial;
    // End of variables declaration//GEN-END:variables

    private void addIngredient(String ingCode) {
        data = new Menu();

        IngDialog ingDialog = new IngDialog(null, true, txtMenuCode.getText(), ingCode);
        ingDialog.setVisible(true);

        Ingredient item = ingDialog.getData();
        if (item != null && item.getCode() != null) {
            try {
                loadData();
            } catch (SQLException ex) {
                MsgUtil.showMsg(ex.getMessage(), null);
            }
        }
    }

    private void loadData() throws SQLException {
        // load normal ingredient
        IngredientDaoImpl ingDao = new IngredientDaoImpl();
        List<Ingredient> listIng = ingDao.findGroup(txtMenuCode.getText(), AppConstants.MENU_NORMAL);
        int size = modelIngNormal.getRowCount();
        for (int i = 0; i < size; i++) {
            modelIngNormal.removeRow(0);
        }
        for (Ingredient ing : listIng) {
            modelIngNormal.addRow(new Object[]{ing.getCode(), ing.getId(), ing.getName(), ing.getQtyUnit(), ing.getCbUnitSale()});
        }

        // load special ingredient
        listIng = ingDao.findGroup(txtMenuCode.getText(), AppConstants.MENU_SPECIAL);
        size = modelIngSpecial.getRowCount();
        for (int i = 0; i < size; i++) {
            modelIngSpecial.removeRow(0);
        }
        for (Ingredient ing : listIng) {
            modelIngSpecial.addRow(new Object[]{ing.getCode(), ing.getId(), ing.getName(), ing.getQtyUnit(), ing.getCbUnitSale()});
        }

        // load discount ingredient
        listIng = ingDao.findGroup(txtMenuCode.getText(), AppConstants.MENU_DISCOUNT);
        size = modelIngDiscount.getRowCount();
        for (int i = 0; i < size; i++) {
            modelIngDiscount.removeRow(0);
        }
        for (Ingredient ing : listIng) {
            modelIngDiscount.addRow(new Object[]{ing.getCode(), ing.getId(), ing.getName(), ing.getQtyUnit(), ing.getCbUnitSale()});
        }
    }

    private void saveMenu() {
        //validate
        if (StringUtil.isEmpty(txtMenuCode.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtMenuCode.requestFocus();
            return;
        }
        if (StringUtil.isEmpty(txtMenuName.getText())) {
            MsgUtil.showMsg(MsgUtil.ERROR_MSG_VALID_01, null);
            txtMenuName.requestFocus();
            return;
        }

        data = new Menu();
        data.setCode(txtMenuCode.getText());
        data.setName(txtMenuName.getText());
        data.setBasePrice(new BigDecimal(txtBasePrice.getText()));
        data.setMakeOrderTime(Integer.parseInt(txtMakeOrderTime.getText()));
        data.setMenuPrice(new BigDecimal(txtMenuPrice.getText()));
        data.setMenuDiscPrice(new BigDecimal(txtMenuDiscount.getText()));
        data.setMenuSpecialPrice(new BigDecimal(txtMenuSpecial.getText()));
        data.setUnit_sale(cbUnitSale.getSelectedItem().toString());
        data.setShopCode(shopCode);

        MenuDaoImpl menuDao = new MenuDaoImpl();
        try {
            menuDao.save(data);
            dispose();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void clearIngredient() {
        IngredientDaoImpl dao = new IngredientDaoImpl();
        try {
            dao.delete(null);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }

        try {
            loadData();
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void deleteItem() {
        IngredientDaoImpl ing = new IngredientDaoImpl();
        int id = 0;
        switch (tabIng.getSelectedIndex()) {
            case 0:
                if (tbIngNormal.getSelectedRow() < 0) {
                    return;
                }
                id = Integer.parseInt(tbIngNormal.getValueAt(tbIngNormal.getSelectedRow(), 1).toString());
                break;
            case 1:
                if (tbIngSpecial.getSelectedRow() < 0) {
                    return;
                }
                id = Integer.parseInt(tbIngSpecial.getValueAt(tbIngSpecial.getSelectedRow(), 1).toString());
                break;
            case 2:
                if (tbIngDiscount.getSelectedRow() < 0) {
                    return;
                }
                id = Integer.parseInt(tbIngDiscount.getValueAt(tbIngDiscount.getSelectedRow(), 1).toString());
                break;
            default:
                break;
        }
        try {
            ing.delete(id);
            loadData();
        } catch (SQLException e) {
            MsgUtil.showMsg(e.getMessage(), null);
        }
    }

    private void loadMenu() {
        MenuDaoImpl menuImpl = new MenuDaoImpl();
        try {
            Menu menu = menuImpl.findByCode(txtMenuCode.getText(), shopCode);
            if (menu != null) {
                txtMenuCode.setEditable(false);
                txtMenuName.setText(menu.getName());
                txtBasePrice.setText(menu.getBasePrice().toString());
                txtMakeOrderTime.setText("" + menu.getMakeOrderTime());
                txtMenuPrice.setText(menu.getMenuPrice().toString());
                txtMenuDiscount.setText(menu.getMenuDiscPrice().toString());
                txtMenuSpecial.setText(menu.getMenuSpecialPrice().toString());
                cbUnitSale.setSelectedItem(menu.getUnit_sale());

                loadData();
            }
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void loadDataIn(JTable table) {
        data = new Menu();
        int iSel = table.getSelectedRow();
        if (iSel != -1) {
            String ingCode = "" + table.getValueAt(iSel, 0);
            addIngredient(ingCode);
        }
    }

    private void saveSpecialFromNormal() {
        IngredientDaoImpl ingDao = new IngredientDaoImpl();
        try {
            List<Ingredient> listIng = ingDao.findGroup(txtMenuCode.getText(), AppConstants.MENU_NORMAL);
            for (Ingredient ing : listIng) {
                ing.setIngTypeDiscount("N");
                ing.setIngTypeNormal("N");
                ing.setIngTypeSpecial("Y");

                ingDao.save(ing);
            }
            MsgUtil.showMsg("บันทึกข้อมูลสำเร็จ", null);
            loadMenu();
            tabIng.setSelectedIndex(1);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }

    private void saveDiscountFromNormal() {
        IngredientDaoImpl ingDao = new IngredientDaoImpl();
        try {
            List<Ingredient> listIng = ingDao.findGroup(txtMenuCode.getText(), AppConstants.MENU_NORMAL);
            for (Ingredient ing : listIng) {
                ing.setIngTypeDiscount("Y");
                ing.setIngTypeNormal("N");
                ing.setIngTypeSpecial("N");

                ingDao.save(ing);
            }
            MsgUtil.showMsg("บันทึกข้อมูลสำเร็จ", null);
            loadMenu();
            tabIng.setSelectedIndex(2);
        } catch (SQLException ex) {
            MsgUtil.showMsg(ex.getMessage(), null);
        }
    }
}
