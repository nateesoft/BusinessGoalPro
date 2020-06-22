package com.app.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class TestDerberApp extends javax.swing.JDialog {

    private final String dbURL = "jdbc:derby:myDB;create=true;user=app;password=app";
    private Connection conn = null;
    private Statement stmt = null;

    public TestDerberApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        openConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        btnCreateTable = new javax.swing.JButton();
        btnShowData = new javax.swing.JButton();
        btnOpenConnection = new javax.swing.JButton();
        lbConnect = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDropTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ทดสอบฐานข้อมูล Derby");
        setResizable(false);

        jLabel1.setText("ID:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setText("USERNAME:");

        jLabel3.setText("PASSWORD:");

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USERNAME", "NAME", "LAST NAME", "AGE", "SALARY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableData.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(3).setPreferredWidth(200);
            tableData.getColumnModel().getColumn(4).setPreferredWidth(80);
            tableData.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        btnDel.setText("DELETE");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnCreateTable.setText("Create Table");
        btnCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTableActionPerformed(evt);
            }
        });

        btnShowData.setText("Show Data");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });

        btnOpenConnection.setText("Open Connection");
        btnOpenConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenConnectionActionPerformed(evt);
            }
        });

        lbConnect.setText("Connection: Not Connect");

        jLabel4.setText("Name:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Last Name:");

        jLabel6.setText("Age:");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setText("Salary:");

        btnDropTable.setText("Drop Table");
        btnDropTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOpenConnection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDropTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtPass)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName)
                                    .addComponent(txtLastName)
                                    .addComponent(txtAge)
                                    .addComponent(txtSalary))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateTable)
                    .addComponent(btnShowData)
                    .addComponent(btnOpenConnection)
                    .addComponent(lbConnect)
                    .addComponent(btnDropTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        delete();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTableActionPerformed
        createTable();
    }//GEN-LAST:event_btnCreateTableActionPerformed

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        showData();
    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnOpenConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenConnectionActionPerformed
        openConnection();
    }//GEN-LAST:event_btnOpenConnectionActionPerformed

    private void btnDropTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropTableActionPerformed
        dropTable();
    }//GEN-LAST:event_btnDropTableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreateTable;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDropTable;
    private javax.swing.JButton btnOpenConnection;
    private javax.swing.JButton btnShowData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConnect;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void openConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(dbURL);
            lbConnect.setText("Connect: Success");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addData() {
        String id = txtId.getText();
        String username = txtUser.getText();
        String password = txtPass.getText();
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        String age = txtAge.getText();
        String salary = txtSalary.getText();

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into login values (" + id + ",'" + username + "','" + password + "')");
            stmt.executeUpdate("insert into profile values (" + id + ",'" + username + "','" + name + "', '" + lastName + "', " + age + ", " + salary + ")");
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        showData();
    }

    private DefaultTableModel model = null;

    private void showData() {
        if (conn == null) {
            return;
        }
        if (model == null) {
            model = (DefaultTableModel) tableData.getModel();
        }

        if (model.getRowCount() > 0) {
            int size = model.getRowCount();
            for (int i = 0; i < size; i++) {
                model.removeRow(0);
            }
        }

        try {
            stmt = conn.createStatement();
            String sql = "select login.id, login.username, profile.name, profile.last_name, profile.age, profile.salary "
                    + "from login inner join profile on login.username=profile.username "
                    + "where 1=1 ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6)
                });
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        txtId.setText("");
        txtUser.setText("");
        txtPass.setText("");
        txtId.setFocusable(true);
    }

    private void delete() {
        int rowSel = tableData.getSelectedRow();
        if (rowSel != -1) {
            String username = tableData.getValueAt(rowSel, 1).toString();
            try {
                stmt = conn.createStatement();
                stmt.executeUpdate("delete from login where username=" + username);
                stmt.executeUpdate("delete from profile where username=" + username);
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            showData();
        }
    }

    private boolean isTableExists(String tableName) throws SQLException {
        if (conn != null) {
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, tableName.toUpperCase(), null);
            if (rs.next()) {
                System.out.println("Table " + tableName + " is already exists !!");
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    private void createTable() {
        if (conn == null) {
            return;
        }
        try {
            stmt = conn.createStatement();
            String sql1 = "create table login ("
                    + "id int not null,"
                    + "username varchar(10) not null,"
                    + "password varchar(10) not null"
                    + ")";
            if (!isTableExists("login")) {
                stmt.execute(sql1);
            }

            String sql2 = "create table profile ("
                    + "id int not null,"
                    + "username varchar(10) not null,"
                    + "name varchar(150) not null,"
                    + "last_name varchar(200) not null,"
                    + "age int not null,"
                    + "salary int not null"
                    + ")";
            if (!isTableExists("profile")) {
                stmt.execute(sql2);
            }

            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void dropTable() {
        if (conn == null) {
            return;
        }
        try {
            stmt = conn.createStatement();
            String sql1 = "drop table login";
            stmt.execute(sql1);

            String sql2 = "drop table profile";
            stmt.execute(sql2);
            
            String sql3 = "drop table target_plan";
            stmt.execute(sql3);

            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        TestDerberApp app = new TestDerberApp(null, true);
        app.setVisible(true);
    }
}
