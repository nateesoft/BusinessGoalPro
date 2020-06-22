package sun.natee.app.main.dialog.calendar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JButton;

public class TopYearDialog extends javax.swing.JDialog {

    private final Map<Integer, Integer[]> data = new HashMap<>();
    private int currentIndex;
    private boolean foundIndex = false;
    private final JButton[] button = new JButton[12];
    private final int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy", Locale.ENGLISH).format(new Date()));

    public TopYearDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initUI();
        loadYearBetween();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnTop = new javax.swing.JPanel();
        nextMonth = new javax.swing.JButton();
        btnShowYearLength = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btnBackMonth = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show Calendar");
        setResizable(false);

        nextMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nextMonth.setText(">");
        nextMonth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nextMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthActionPerformed(evt);
            }
        });

        btnShowYearLength.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnShowYearLength.setText("2018");
        btnShowYearLength.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnShowYearLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowYearLengthActionPerformed(evt);
            }
        });

        pnMain.setLayout(new java.awt.GridLayout(3, 4));

        btn0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnMain.add(btn0);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn1);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn2);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn3);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn4);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn5);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn6);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnMain.add(btn7);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn8);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn9);

        btn10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn10);

        btn11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnMain.add(btn11);

        btnBackMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBackMonth.setText("<");
        btnBackMonth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBackMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
        pnTop.setLayout(pnTopLayout);
        pnTopLayout.setHorizontalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTopLayout.createSequentialGroup()
                        .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnTopLayout.createSequentialGroup()
                        .addComponent(btnBackMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowYearLength, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnTopLayout.setVerticalGroup(
            pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowYearLength, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnBackMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMonthActionPerformed
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = 0;
        }
        loadYearBetween();
    }//GEN-LAST:event_btnBackMonthActionPerformed

    private void nextMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthActionPerformed
        currentIndex++;
        if (currentIndex > 150) {
            currentIndex = 150;
        }
        loadYearBetween();
    }//GEN-LAST:event_nextMonthActionPerformed

    private void btnShowYearLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowYearLengthActionPerformed

    }//GEN-LAST:event_btnShowYearLengthActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackMonth;
    private javax.swing.JButton btnShowYearLength;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton nextMonth;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTop;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        int a = 0;
        button[a++] = btn0;
        button[a++] = btn1;
        button[a++] = btn2;
        button[a++] = btn3;
        button[a++] = btn4;
        button[a++] = btn5;
        button[a++] = btn6;
        button[a++] = btn7;
        button[a++] = btn8;
        button[a++] = btn9;
        button[a++] = btn10;
        button[a++] = btn11;

        int count = 0;
        for (int i = 0; i < 150; i++) {
            Integer[] temp = new Integer[12];
            if (i == 0) {
                temp[0] = 0;
                count = 1900;
                temp[1] = count++;
                temp[2] = count++;
                temp[3] = count++;
                temp[4] = count++;
                temp[5] = count++;
                temp[6] = count++;
                temp[7] = count++;
                temp[8] = count++;
                temp[9] = count++;
                temp[10] = count++;
                temp[11] = count++;
            } else {
                count -= 2;
                temp[0] = count++;
                temp[1] = count++;
                temp[2] = count++;
                temp[3] = count++;
                temp[4] = count++;
                temp[5] = count++;
                temp[6] = count++;
                temp[7] = count++;
                temp[8] = count++;
                temp[9] = count++;
                temp[10] = count++;
                temp[11] = count++;

                if (count >= currentYear && !foundIndex) {
                    currentIndex = i;
                    foundIndex = true;
                }
            }

            data.put(i, temp);
        }
    }

    private void loadYearBetween() {
        Integer[] dataInt = data.get(currentIndex);
        btnShowYearLength.setText(dataInt[0] + " - " + dataInt[dataInt.length-1]);
        for (int i = 0; i < dataInt.length; i++) {
            String yearAt = "" + dataInt[i];
            if (yearAt.equals("0")) {
                button[i].setText("");
            } else {
                button[i].setText("" + dataInt[i]);
            }

            if (yearAt.equals("" + currentYear)) {
                button[i].setForeground(Color.BLUE);
            } else {
                button[i].setForeground(Color.BLACK);
            }

            button[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
        }
    }

}
