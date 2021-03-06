/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management.application.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import shop.management.application.DbConnector;
import shop.management.application.model.Product;
import shop.management.application.model.User;

/**
 *
 * @author rIslam
 */
public class AccountsStatusForm extends javax.swing.JFrame {

    /**
     * Creates new form AccountsStatusForm
     * @throws java.sql.SQLException
     */
    private static User user = new User();
    
    public AccountsStatusForm() throws SQLException {
        initComponents();
        showCashWaletBalance();
        calculatingGrandTotal();
    }
     public AccountsStatusForm(User u) throws SQLException {
        initComponents();
        showCashWaletBalance();
        calculatingGrandTotal();
        AccountsStatusForm.user = u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cashWalet_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inventoryTotalPrice_lbl = new javax.swing.JLabel();
        totalQty_lbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        withdraw_txt = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        withdraw_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deposite_txt = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deposite_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACCOUNT'S STATUS");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true), "Account Balance Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cashWalet_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cashWalet_lbl.setForeground(new java.awt.Color(153, 0, 0));
        cashWalet_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashWalet_lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Anik Telecom. Ulipur, Kurigram 5620.");

        inventoryTotalPrice_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inventoryTotalPrice_lbl.setForeground(new java.awt.Color(153, 0, 0));
        inventoryTotalPrice_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryTotalPrice_lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        totalQty_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        totalQty_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalQty_lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Deposit or Withdraw", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Withdraw panel"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Amount :");

        withdraw_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        withdraw_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        withdraw_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Reciever name:");

        withdraw_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/management/application/res/showall.png"))); // NOI18N
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdraw_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(withdraw_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdraw_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdraw_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Deposite Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Amount:");

        deposite_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deposite_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deposite_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Purpose :");

        deposite_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/management/application/res/showall.png"))); // NOI18N
        deposite_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposite_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(deposite_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(deposite_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(deposite_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deposite_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0120.rashedul@gmail.com");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/management/application/res/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Controls", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/management/application/res/view.png"))); // NOI18N
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashWalet_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inventoryTotalPrice_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalQty_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(44, 44, 44)))
                .addComponent(cashWalet_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalQty_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventoryTotalPrice_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deposite_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposite_btnActionPerformed
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String query = "SELECT * FROM cashwalet WHERE CashWaletId = 1";
        float amount = 0;
        try {
            con = DbConnector.ConnectDB();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("CashWaletId");
                String location = rs.getString("Location");
                amount = rs.getFloat("Amount");
                //cashWalet_lbl.setText("You have : [ ৳ "+amount+" ] in your Cash Walet.");
            }
            if (!"".equals(deposite_txt.getText())) {
                query = null;
                ps = null;
                con = DbConnector.ConnectDB();
                int value = JOptionPane.showConfirmDialog(null, "Do you really want to Deposite !","Deposite",JOptionPane.YES_NO_OPTION);
                float depositeAmount = Float.parseFloat(deposite_txt.getText());
                if (value == 0) {
                    query = "UPDATE cashwalet SET Location = ?, Amount = ? WHERE CashWaletId = ?";
                    try {   
                        ps = con.prepareStatement(query);
                        ps.setString(1, "");
                        ps.setFloat(2, (amount + depositeAmount));
                        ps.setInt(3, 1);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Amount ৳ "+depositeAmount+" deposited successfully.");
                        showCashWaletBalance();
                        amount = 0;
                        //depositeAmount = 0;
                        deposite_txt.setText("");
                        withdraw_txt.setText("");
                        
                        ps = null;
                            /********************/
                            ps = con.prepareStatement("INSERT INTO transectionstrack (Description,Date, TransectionBy,Amount,Purpose) VALUES (?,?,?,?,?)");
                            ps.setString(1, "Money Deposite.");
                            Calendar now = Calendar.getInstance();
                            SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");
                            String addDate = dateFormate.format(now.getTime());
                            ps.setString(2, addDate);
                            ps.setString(3, user.getUserName());
                            ps.setFloat(4, depositeAmount);
                            ps.setString(5, jTextField2.getText());
                            ps.executeUpdate();
                            amount = 0;
                            depositeAmount = 0;
                            deposite_txt.setText("");
                            withdraw_txt.setText("");
                            jTextField2.setText("");
                        
                    } catch (SQLException e) {
                
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Confirm amount frist!");
                deposite_txt.setText("");
                withdraw_txt.setText("");
                jTextField2.setText("");
            }
        } catch (SQLException e) {
        }
        finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_deposite_btnActionPerformed

    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_btnActionPerformed
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String query = "SELECT * FROM cashwalet WHERE CashWaletId = 1";
        float amount = 0;
        float withdrawAmount = 0;
        if (!"".equals(withdraw_txt.getText())) {
            try {
                con = DbConnector.ConnectDB();
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("CashWaletId");
                    String location = rs.getString("Location");
                    amount = rs.getFloat("Amount");
                    //cashWalet_lbl.setText("You have : [ ৳ "+amount+" ] in your Cash Walet.");
                }
            
                withdrawAmount = Float.parseFloat(withdraw_txt.getText());
                if (!"".equals(withdraw_txt.getText()) && amount > withdrawAmount) {
                    query = null;
                    ps = null;
                    con = DbConnector.ConnectDB();
                    int value = JOptionPane.showConfirmDialog(null, "Do you really want to Withdraw ?","Withdraw",JOptionPane.YES_NO_OPTION);
                    //float depositeAmount = Float.parseFloat(deposite_txt.getText());
                    if (value == 0) {
                        query = "UPDATE cashwalet SET Location = ?, Amount = ? WHERE CashWaletId = ?";
                        try {   
                            ps = con.prepareStatement(query);
                            ps.setString(1, "");
                            ps.setFloat(2, (amount - withdrawAmount));
                            ps.setInt(3, 1);
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "৳ "+withdrawAmount+" Withdrawed successfully.");
                            showCashWaletBalance();
                        
                            ps = null;
                            /********************/
                            ps = con.prepareStatement("INSERT INTO transectionstrack (Description,Date, TransectionBy,Amount,RecievedBy) VALUES (?,?,?,?,?)");
                            ps.setString(1, "Money Withdraw.");
                            Calendar now = Calendar.getInstance();
                            SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");
                            String addDate = dateFormate.format(now.getTime());
                            ps.setString(2, addDate);
                            ps.setString(3, user.getUserName());
                            ps.setFloat(4, withdrawAmount);
                            ps.setString(5,jTextField1.getText());
                            ps.executeUpdate();
                            amount = 0;
                            withdrawAmount = 0;
                            deposite_txt.setText("");
                            withdraw_txt.setText("");
                            jTextField1.setText("");
                        } catch (SQLException e) {
                
                        }
                    }
                
                }else{
                    JOptionPane.showMessageDialog(null, "Confirm amount frist or check if the limit exceeded.");
                    deposite_txt.setText("");
                    withdraw_txt.setText("");
                }
            } catch (SQLException e) {
            }
            finally{
                try {
                    rs.close();
                    ps.close();
                    con.close();
                } catch (SQLException e) {
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Confirm amount frist.");
        }
    }//GEN-LAST:event_withdraw_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new ActivitiesForm(user).setVisible(true);
            this.dispose();
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new TransectionTrackForm(user).setVisible(true);
            this.dispose();
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountsStatusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountsStatusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountsStatusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountsStatusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AccountsStatusForm().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AccountsStatusForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    private void showCashWaletBalance(){
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        String query = "SELECT * FROM cashwalet WHERE CashWaletId = 1";
        try {
            con = DbConnector.ConnectDB();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("CashWaletId");
                String location = rs.getString("Location");
                float amount = rs.getFloat("Amount");
                cashWalet_lbl.setText("You have : [ ৳ "+amount+" ] in your Cash Walet.");
                amount = 0;
            }
        } catch (SQLException e) {
        }
        finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
            }
        }
    
    }
    private void calculatingGrandTotal() throws SQLException{
        int totalQty = 0;
        float grandTotal = 0;
        for (Product allItem : getAllItems()) {
            grandTotal += ( allItem.getBuyingPrice() * allItem.getQty());
            totalQty += allItem.getQty();
        }
        String tk = "৳";
        getAllItems().clear();
        inventoryTotalPrice_lbl.setText("Grand Total for Inventory Items : [ "+tk+" "+Float.toString(grandTotal)+" ]");
        totalQty_lbl.setText("Total Available Items : [ "+Integer.toString(totalQty)+" ]");
        totalQty = 0;
        grandTotal = 0;
    }
    public ArrayList<Product> getAllItems() throws SQLException{
        ArrayList<Product> products = new ArrayList<>();
        Connection con = DbConnector.ConnectDB();
        String query  = "SELECT * FROM products";
        Statement st = con.createStatement();
        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            Product product;
            while(rs.next()){
//                product = new Product(rs.getInt("ProductId"),rs.getString("Name"),rs.getString("Category"),
//                    rs.getString("Company"),rs.getFloat("PurchaseCost"),rs.getInt("Quantity"),
//                    rs.getDate("InhouseDate").toString(),rs.getBytes("Image"),rs.getString("Supplier"),rs.getString("Description"));
                  product = new Product(rs.getInt("ProductId"),rs.getInt("Quantity"),rs.getFloat("PurchaseCost"));
                products.add(product);
            }
        } catch (SQLException ex) {
           
        }
        finally{
            try {
                rs.close();
                st.close();
                con.close();
            } catch (SQLException e) {
            }
        }
        return products;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cashWalet_lbl;
    private javax.swing.JButton deposite_btn;
    private javax.swing.JTextField deposite_txt;
    private javax.swing.JLabel inventoryTotalPrice_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel totalQty_lbl;
    private javax.swing.JButton withdraw_btn;
    private javax.swing.JTextField withdraw_txt;
    // End of variables declaration//GEN-END:variables
}
