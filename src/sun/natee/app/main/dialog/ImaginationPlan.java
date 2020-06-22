package sun.natee.app.main.dialog;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JViewport;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import sun.natee.app.main.dialog.popup.EODDialog;
import sun.natee.app.main.util.StringUtil;

public class ImaginationPlan extends javax.swing.JDialog {

    private final Logger logger = Logger.getLogger(ImaginationPlan.class);

    private final DefaultTableModel model;
    private Timer t;
    private int count = 0;
    private int sizeData = 15;
    private int timeSpeed = 300;
    private BigDecimal totalSell = BigDecimal.ZERO;
    private BigDecimal totalProfit = BigDecimal.ZERO;
    private DecimalFormat moneyText = new DecimalFormat("#,##0.00");

    public ImaginationPlan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initSlider();
        pbProgress.setMaximum(sizeData);
        pbProgress.setMinimum(0);
        model = (DefaultTableModel) tableTask.getModel();
        for (int i = 0; i < sizeData; i++) {
            model.addRow(new Object[]{(i + 1), menuRd01.getText(), "00:00", "รายการที่ต้องทำ (" + (i + 1) + ")", ""});
        }
        JTableHeader tHead = tableTask.getTableHeader();
        tHead.setFont(new Font("Tahoma", Font.PLAIN, 14));

        tableTask.setRowHeight(30);
        tableTask.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tableTask.setRowSelectionInterval(0, 0);

        t = new Timer(timeSpeed, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tableTask.getSelectionModel().addSelectionInterval(count, count);
                Rectangle rect = tableTask.getCellRect(count, 0, true);
                Point pt = ((JViewport) tableTask.getParent()).getViewPosition();
                rect.setLocation(rect.x - pt.x, rect.y);
                tableTask.scrollRectToVisible(rect);
                lbShowMsg.setText(tableTask.getValueAt(count, 3).toString());

                count++;
                pbProgress.setValue(count);
                if (count >= tableTask.getRowCount()) {
                    t.stop();
                    btnPlay.setSelected(false);
                    count = 0;
                    EODDialog eod = new EODDialog(null, true, totalSell, totalProfit);
                    eod.setVisible(true);
                    tableTask.clearSelection();
                    tableTask.setRowSelectionInterval(0, 0);
                    lbShowMsg.setText("");
                    panelMsg.setBackground(null);
                    lbShowMsg.setForeground(Color.BLACK);
                    pbProgress.setValue(0);
                    totalSell = BigDecimal.ZERO;
                    totalProfit = BigDecimal.ZERO;

                    rect = new Rectangle();
                    rect.setLocation(0, 0);
                    tableTask.scrollRectToVisible(rect);

                    return;
                }
                totalSell = totalSell.add(new BigDecimal("30"));
                totalProfit = totalProfit.add(new BigDecimal("30").multiply(new BigDecimal("0.1")));
                if (count % 4 == 0) {
                    panelMsg.setBackground(Color.BLUE);
                    lbShowMsg.setForeground(Color.WHITE);
                } else if (count % 3 == 0) {
                    panelMsg.setBackground(Color.YELLOW);
                    lbShowMsg.setForeground(Color.BLACK);
                } else if (count % 7 == 0) {
                    panelMsg.setBackground(Color.RED);
                    lbShowMsg.setForeground(Color.BLACK);
                } else {
                    panelMsg.setBackground(null);
                    lbShowMsg.setForeground(Color.BLACK);
                }

                txtTotalSell.setText(moneyText.format(totalSell.doubleValue()));
                txtTotalProfit.setText(moneyText.format(totalProfit.doubleValue()));
            }
        });
        lbSystem.setText(StringUtil.showSystem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSlider2 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JToggleButton();
        panelMsg = new javax.swing.JPanel();
        lbShowMsg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalSell = new javax.swing.JTextField();
        txtTotalProfit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pbProgress = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbSystem = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalProfit1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRd01 = new javax.swing.JRadioButtonMenuItem();
        menuRd02 = new javax.swing.JRadioButtonMenuItem();
        menuRd03 = new javax.swing.JRadioButtonMenuItem();
        menuRd04 = new javax.swing.JRadioButtonMenuItem();
        menuRd05 = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Running Imagination Plan");
        setResizable(false);

        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ประเภท", "เวลา", "รายการ", "หมายเหตุ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTask);
        if (tableTask.getColumnModel().getColumnCount() > 0) {
            tableTask.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableTask.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clock.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSlider2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSlider2.setValue(65);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ราคาค่าเช่าที่");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ราคาต้นทุนวัตถุดิบ");

        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSlider1.setValue(10);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("01/11/2018");

        btnPlay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        btnPlay.setText("Play");
        btnPlay.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnPlayStateChanged(evt);
            }
        });

        panelMsg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbShowMsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbShowMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMsgLayout = new javax.swing.GroupLayout(panelMsg);
        panelMsg.setLayout(panelMsgLayout);
        panelMsgLayout.setHorizontalGroup(
            panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMsgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbShowMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMsgLayout.setVerticalGroup(
            panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMsgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbShowMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ยอดขาย :");

        txtTotalSell.setEditable(false);
        txtTotalSell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalSell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalSell.setText("0.00");

        txtTotalProfit.setEditable(false);
        txtTotalProfit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalProfit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalProfit.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("กำไร :");

        pbProgress.setStringPainted(true);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 1, 2, 1, new java.awt.Color(0, 204, 102)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ประมวลกิจกรรมต่อวัน");

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

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previous.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/begin.png"))); // NOI18N
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnStart.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btnEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/end.png"))); // NOI18N
        btnEnd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEnd.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("06:30:45");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("จำนวนวัน :");

        txtTotalProfit1.setEditable(false);
        txtTotalProfit1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalProfit1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalProfit1.setText("0");

        jMenu1.setText("กระบวนการแสดงผล");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        buttonGroup1.add(menuRd01);
        menuRd01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuRd01.setSelected(true);
        menuRd01.setText("แสดงผลรายวัน");
        jMenu1.add(menuRd01);

        buttonGroup1.add(menuRd02);
        menuRd02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuRd02.setText("แสดงผลรายสัปดาห์");
        jMenu1.add(menuRd02);

        buttonGroup1.add(menuRd03);
        menuRd03.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuRd03.setText("แสดงผลรายเดือน");
        jMenu1.add(menuRd03);

        buttonGroup1.add(menuRd04);
        menuRd04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuRd04.setText("แสดงผลรายไตรมาส");
        jMenu1.add(menuRd04);

        buttonGroup1.add(menuRd05);
        menuRd05.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuRd05.setText("แสดงผลรายปี");
        jMenu1.add(menuRd05);
        jMenu1.add(jSeparator1);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("ปิดหน้าจอ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalSell, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalProfit1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addComponent(pbProgress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTotalSell, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotalProfit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(pbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        String lb = "ราคาต้นทุนวัตถุดิบ";
        jLabel1.setText(lb + " (" + jSlider1.getValue() + "%)");
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        String lb = "ราคาค่าเช่าที่";
        jLabel2.setText(lb + " (" + jSlider2.getValue() + "%)");
    }//GEN-LAST:event_jSlider2StateChanged

    private void btnPlayStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnPlayStateChanged
        if (btnPlay.isSelected()) {
            btnPlay.setText("Pause");
            btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pause.png")));
            start();
        } else {
            btnPlay.setText("Play");
            btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
            stop();
        }
    }//GEN-LAST:event_btnPlayStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnNext;
    private javax.swing.JToggleButton btnPlay;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JLabel lbShowMsg;
    private javax.swing.JLabel lbSystem;
    private javax.swing.JRadioButtonMenuItem menuRd01;
    private javax.swing.JRadioButtonMenuItem menuRd02;
    private javax.swing.JRadioButtonMenuItem menuRd03;
    private javax.swing.JRadioButtonMenuItem menuRd04;
    private javax.swing.JRadioButtonMenuItem menuRd05;
    private javax.swing.JPanel panelMsg;
    private javax.swing.JProgressBar pbProgress;
    private javax.swing.JTable tableTask;
    private javax.swing.JTextField txtTotalProfit;
    private javax.swing.JTextField txtTotalProfit1;
    private javax.swing.JTextField txtTotalSell;
    // End of variables declaration//GEN-END:variables

    private void initSlider() {
        String lb1 = "ราคาต้นทุนวัตถุดิบ";
        jLabel1.setText(lb1 + " (" + jSlider1.getValue() + "%)");

        String lb2 = "ราคาค่าเช่าที่";
        jLabel2.setText(lb2 + " (" + jSlider2.getValue() + "%)");
    }

    private void start() {
        if (t != null) {
            t.start();
        }
    }

    private void stop() {
        if (t != null) {
            t.stop();
        }
    }
}
