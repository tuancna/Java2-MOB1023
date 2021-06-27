/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mob1023_lab06;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tuanc
 */
public class MiniLott extends javax.swing.JFrame {

    /**
     * Creates new form MiniLott
     */
    public MiniLott() {
        initComponents();
        txtTram.setEditable(false);
        txtChuc.setEditable(false);
        txtDonVi.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTram = new javax.swing.JTextField();
        txtChuc = new javax.swing.JTextField();
        txtDonVi = new javax.swing.JTextField();
        btnTram = new javax.swing.JButton();
        btnChuc = new javax.swing.JButton();
        btnDonVi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Lott");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XỔ SỐ");

        txtTram.setEditable(false);
        txtTram.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTram.setPreferredSize(new java.awt.Dimension(90, 22));

        txtChuc.setEditable(false);
        txtChuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtChuc.setPreferredSize(new java.awt.Dimension(90, 22));

        txtDonVi.setEditable(false);
        txtDonVi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonVi.setPreferredSize(new java.awt.Dimension(90, 22));

        btnTram.setText("Start");
        btnTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramActionPerformed(evt);
            }
        });

        btnChuc.setText("Start");
        btnChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChucActionPerformed(evt);
            }
        });

        btnDonVi.setText("Start");
        btnDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonViActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTram)
                    .addComponent(btnChuc)
                    .addComponent(btnDonVi))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramActionPerformed
        // TODO add your handling code here:
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                int r = (int) (Math.random() * 10);
                txtTram.setText(String.valueOf(r));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MiniLott.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            
            int tram = (int) (Math.random() * 10);
            txtTram.setText(String.valueOf(tram));
            check();
        });
        
        thread.start();
        btnTram.setEnabled(false);
    }//GEN-LAST:event_btnTramActionPerformed

    private void btnChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChucActionPerformed
        // TODO add your handling code here:
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                int r = (int) (Math.random() * 10);
                txtChuc.setText(String.valueOf(r));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MiniLott.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            
            int chuc = (int) (Math.random() * 10);
            txtChuc.setText(String.valueOf(chuc));
            check();
        });
        
        thread.start();
        btnChuc.setEnabled(false);
    }//GEN-LAST:event_btnChucActionPerformed

    private void btnDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonViActionPerformed
        // TODO add your handling code here:
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 100; i++){
                int r = (int) (Math.random() * 10);
                txtDonVi.setText(String.valueOf(r));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MiniLott.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
            
            int dv = (int) (Math.random() * 10);
            txtDonVi.setText(String.valueOf(dv));
            check();
        });
        
        thread.start();
        btnDonVi.setEnabled(false);
    }//GEN-LAST:event_btnDonViActionPerformed

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
            java.util.logging.Logger.getLogger(MiniLott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniLott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniLott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniLott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniLott().setVisible(true);
            }
        });
    }
    
    private void check(){
        if(!(txtTram.getText().length() == 0) && !(txtChuc.getText().length() == 0) && !(txtDonVi.getText().length() == 0)){
            JOptionPane.showMessageDialog(this, "Number: " + txtTram.getText() + "" + txtChuc.getText() + "" + txtDonVi.getText(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuc;
    private javax.swing.JButton btnDonVi;
    private javax.swing.JButton btnTram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtChuc;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtTram;
    // End of variables declaration//GEN-END:variables
}
