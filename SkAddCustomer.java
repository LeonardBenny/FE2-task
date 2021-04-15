
package com.students.sportsutilityshop;

/**
 *
 * @author Leonard Benny
 */

public class SkAddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    public SkAddCustomer() {
        initComponents();
        this.setSize(745,380);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SkAddCustomer = new javax.swing.JPanel();
        SkAddCustomerTitle = new javax.swing.JLabel();
        SkAddCustomerNameTitle = new javax.swing.JLabel();
        SkAddCustomerDescriptionTitle = new javax.swing.JLabel();
        SkAddCustomerBrandTitle = new javax.swing.JLabel();
        SkAddCustomerColourTitle = new javax.swing.JLabel();
        SkAddCustomerName = new javax.swing.JTextField();
        SkAddCustomerDescription = new javax.swing.JTextField();
        SkAddCustomerBrand = new javax.swing.JTextField();
        SkAddCustomerColour = new javax.swing.JTextField();
        SkAddCustomerCancel = new javax.swing.JButton();
        SkAddCustomerSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        SkAddCustomer.setLayout(null);

        SkAddCustomerTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SkAddCustomerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SkAddCustomerTitle.setText("Add Customer Form");
        SkAddCustomer.add(SkAddCustomerTitle);
        SkAddCustomerTitle.setBounds(0, 0, 740, 60);

        SkAddCustomerNameTitle.setText("Customer Name :");
        SkAddCustomer.add(SkAddCustomerNameTitle);
        SkAddCustomerNameTitle.setBounds(200, 120, 120, 20);

        SkAddCustomerDescriptionTitle.setText("Customer Contact :");
        SkAddCustomer.add(SkAddCustomerDescriptionTitle);
        SkAddCustomerDescriptionTitle.setBounds(200, 160, 120, 20);

        SkAddCustomerBrandTitle.setText("Customer Address :");
        SkAddCustomer.add(SkAddCustomerBrandTitle);
        SkAddCustomerBrandTitle.setBounds(200, 200, 130, 20);

        SkAddCustomerColourTitle.setText("UserName (Unique) :");
        SkAddCustomer.add(SkAddCustomerColourTitle);
        SkAddCustomerColourTitle.setBounds(200, 240, 130, 20);
        SkAddCustomer.add(SkAddCustomerName);
        SkAddCustomerName.setBounds(340, 110, 230, 30);
        SkAddCustomer.add(SkAddCustomerDescription);
        SkAddCustomerDescription.setBounds(340, 150, 230, 30);
        SkAddCustomer.add(SkAddCustomerBrand);
        SkAddCustomerBrand.setBounds(340, 190, 230, 30);

        SkAddCustomerColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkAddCustomerColourActionPerformed(evt);
            }
        });
        SkAddCustomer.add(SkAddCustomerColour);
        SkAddCustomerColour.setBounds(340, 230, 230, 30);

        SkAddCustomerCancel.setText("Cancel");
        SkAddCustomerCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkAddCustomerCancelActionPerformed(evt);
            }
        });
        SkAddCustomer.add(SkAddCustomerCancel);
        SkAddCustomerCancel.setBounds(460, 270, 100, 30);

        SkAddCustomerSave.setText("Save");
        SkAddCustomer.add(SkAddCustomerSave);
        SkAddCustomerSave.setBounds(340, 270, 100, 30);

        getContentPane().add(SkAddCustomer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkAddCustomerColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkAddCustomerColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkAddCustomerColourActionPerformed

    private void SkAddCustomerCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkAddCustomerCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkAddCustomerCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SkAddCustomer;
    private javax.swing.JTextField SkAddCustomerBrand;
    private javax.swing.JLabel SkAddCustomerBrandTitle;
    private javax.swing.JButton SkAddCustomerCancel;
    private javax.swing.JTextField SkAddCustomerColour;
    private javax.swing.JLabel SkAddCustomerColourTitle;
    private javax.swing.JTextField SkAddCustomerDescription;
    private javax.swing.JLabel SkAddCustomerDescriptionTitle;
    private javax.swing.JTextField SkAddCustomerName;
    private javax.swing.JLabel SkAddCustomerNameTitle;
    private javax.swing.JButton SkAddCustomerSave;
    private javax.swing.JLabel SkAddCustomerTitle;
    // End of variables declaration//GEN-END:variables
}
