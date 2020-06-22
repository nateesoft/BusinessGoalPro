package sun.natee.app.main.dialog.calendar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;

public class TopMonthDialog extends javax.swing.JDialog {

    private final Calendar currentYear;
    private final Calendar backYear;
    private final String currentMonth = new SimpleDateFormat("MMM", Locale.ENGLISH).format(new Date());

    public TopMonthDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        currentYear = Calendar.getInstance(Locale.ENGLISH);
        backYear = Calendar.getInstance(Locale.ENGLISH);
        backYear.add(Calendar.YEAR, -1);
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnTop = new javax.swing.JPanel();
        nextMonth = new javax.swing.JButton();
        btnShowMonth = new javax.swing.JButton();
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

        btnShowMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnShowMonth.setText("2018");
        btnShowMonth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnShowMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMonthActionPerformed(evt);
            }
        });

        pnMain.setLayout(new java.awt.GridLayout(3, 4));

        btn0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn0.setText("Jan");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnMain.add(btn0);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn1.setText("Feb");
        pnMain.add(btn1);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn2.setText("Mar");
        pnMain.add(btn2);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn3.setText("Apr");
        pnMain.add(btn3);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn4.setText("May");
        pnMain.add(btn4);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn5.setText("Jun");
        pnMain.add(btn5);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn6.setText("Jul");
        pnMain.add(btn6);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn7.setText("Aug");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnMain.add(btn7);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn8.setText("Sep");
        pnMain.add(btn8);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn9.setText("Oct");
        pnMain.add(btn9);

        btn10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn10.setText("Nov");
        pnMain.add(btn10);

        btn11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn11.setText("Dec");
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
                        .addComponent(btnShowMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnShowMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        loadBackYear();
    }//GEN-LAST:event_btnBackMonthActionPerformed

    private void nextMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthActionPerformed
        loadNextYear();
    }//GEN-LAST:event_nextMonthActionPerformed

    private void btnShowMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMonthActionPerformed
        TopYearDialog year = new TopYearDialog(null, true);
        year.setVisible(true);
    }//GEN-LAST:event_btnShowMonthActionPerformed

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
    private javax.swing.JButton btnShowMonth;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton nextMonth;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTop;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        JButton[] button = new JButton[12];
        int x = 0;
        button[x++] = btn0;
        button[x++] = btn1;
        button[x++] = btn2;
        button[x++] = btn3;
        button[x++] = btn4;
        button[x++] = btn5;
        button[x++] = btn6;
        button[x++] = btn7;
        button[x++] = btn8;
        button[x++] = btn9;
        button[x++] = btn10;
        button[x++] = btn11;
        for (JButton button1 : button) {
            button1.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            if (button1.getText().equals(currentMonth)) {
                button1.setForeground(Color.BLUE);
            } else {
                button1.setForeground(Color.BLACK);
            }
        }
        btnShowMonth.setText(new SimpleDateFormat("yyyy", Locale.ENGLISH).format(currentYear.getTime()));
    }

    private void loadBackYear() {
        currentYear.add(Calendar.YEAR, -1);
        backYear.add(Calendar.YEAR, -1);
        btnShowMonth.setText(new SimpleDateFormat("yyyy", Locale.ENGLISH).format(currentYear.getTime()));
    }

    private void loadNextYear() {
        currentYear.add(Calendar.YEAR, 1);
        backYear.add(Calendar.YEAR, 1);
        btnShowMonth.setText(new SimpleDateFormat("yyyy", Locale.ENGLISH).format(currentYear.getTime()));
    }
}
