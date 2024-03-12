/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parking;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Rokvic Nkola
 */
public class Parking extends javax.swing.JFrame {

    /**
     * Creates new form Parking
     */
    public Parking() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        Image icon = new ImageIcon(this.getClass().getResource("Parking.png")).getImage();
        this.setIconImage(icon);
        this.setTitle("Parking");
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
        jLabelA2 = new javax.swing.JLabel();
        jLabelA3 = new javax.swing.JLabel();
        jLabelA1 = new javax.swing.JLabel();
        jButtonA3 = new javax.swing.JButton();
        jButtonA2 = new javax.swing.JButton();
        jButtonA1 = new javax.swing.JButton();
        jLabelB1 = new javax.swing.JLabel();
        jLabelB2 = new javax.swing.JLabel();
        jLabelB3 = new javax.swing.JLabel();
        jButtonB3 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.gray);

        jLabelA2.setText("A2 Parking spot is free");

        jLabelA3.setText("A3 Parking spot is free");

        jLabelA1.setText("A1 Parking spot is free");

        jButtonA3.setBackground(java.awt.Color.green);
        jButtonA3.setText("A3");
        jButtonA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonA3MouseClicked(evt);
            }
        });

        jButtonA2.setBackground(java.awt.Color.green);
        jButtonA2.setText("A2");
        jButtonA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonA2MouseClicked(evt);
            }
        });

        jButtonA1.setBackground(java.awt.Color.green);
        jButtonA1.setText("A1");
        jButtonA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonA1MouseClicked(evt);
            }
        });

        jLabelB1.setText("B1 Parking spot is free");

        jLabelB2.setText("B2 Parking spot is free");

        jLabelB3.setText("B3 Parking spot is free");

        jButtonB3.setBackground(java.awt.Color.green);
        jButtonB3.setText("B3");
        jButtonB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB3MouseClicked(evt);
            }
        });

        jButtonB2.setBackground(java.awt.Color.green);
        jButtonB2.setText("B2");
        jButtonB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB2MouseClicked(evt);
            }
        });

        jButtonB1.setBackground(java.awt.Color.green);
        jButtonB1.setText("B1");
        jButtonB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonB1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelB3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelB3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonA1MouseClicked
        // TODO add your handling code here:
        Car car = new Car();
        car.setLocationRelativeTo(this);
        car.setVisible(true);
        car.setLBL(jButtonA1.getText());
        if (jButtonA1.getBackground() != Color.red) {
            jButtonA1.setBackground(Color.red);
            Date date = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
            String tt = dateForm.format(date);
            jLabelA1.setText(" busy: " + tt);
        } else {
            jButtonA1.setBackground(Color.green);
            jLabelA1.setText("A1 Parking is empty.");
        }
    }//GEN-LAST:event_jButtonA1MouseClicked

    private void jButtonA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonA2MouseClicked
        // TODO add your handling code here:
        Car car = new Car();
        car.setLocationRelativeTo(this);
        car.setVisible(true);
        car.setLBL(jButtonA2.getText());
        if (jButtonA2.getBackground() != Color.red) {
            jButtonA2.setBackground(Color.red);
            Date date = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
            String tt = dateForm.format(date);
            jLabelA2.setText(" busy: " + tt);
        } else {
            jButtonA2.setBackground(Color.green);
            jLabelA2.setText("A2 Parking is empty.");
        }
    }//GEN-LAST:event_jButtonA2MouseClicked

    private void jButtonA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonA3MouseClicked
        // TODO add your handling code here:
        Car car = new Car();
        car.setLocationRelativeTo(this);
        car.setVisible(true);
        car.setLBL(jButtonA3.getText());
        if (jButtonA3.getBackground() != Color.red) {
            jButtonA3.setBackground(Color.red);
            Date date = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
            String tt = dateForm.format(date);
            jLabelA3.setText(" busy: " + tt);
        } else {
            jButtonA3.setBackground(Color.green);
            jLabelA3.setText("A3 Parking is empty.");
        }
    }//GEN-LAST:event_jButtonA3MouseClicked

    private void jButtonB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB1MouseClicked
        // TODO add your handling code here:
        Car car = new Car();
        car.setLocationRelativeTo(this);
        car.setVisible(true);
        car.setLBL(jButtonB1.getText());
        if (jButtonB1.getBackground() != Color.red) {
            jButtonB1.setBackground(Color.red);
            Date date = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
            String tt = dateForm.format(date);
            jLabelB1.setText(" busy: " + tt);
        } else {
            jButtonB1.setBackground(Color.green);
            jLabelB1.setText("B1 Parking is empty.");
        }
    }//GEN-LAST:event_jButtonB1MouseClicked

    private void jButtonB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB2MouseClicked
        // TODO add your handling code here:
        Car car = new Car();
        car.setLocationRelativeTo(this);
        car.setVisible(true);
        car.setLBL(jButtonB2.getText());
        if (jButtonB2.getBackground() != Color.red) {
            jButtonB2.setBackground(Color.red);
            Date date = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
            String tt = dateForm.format(date);
            jLabelB2.setText(" busy: " + tt);
        } else {
            jButtonB2.setBackground(Color.green);
            jLabelB2.setText("B2 Parking is empty.");
        }
    }//GEN-LAST:event_jButtonB2MouseClicked

    private void jButtonB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonB3MouseClicked
        // TODO add your handling code here:
        Car car = new Car();
        car.setLocationRelativeTo(this);
        car.setVisible(true);
        car.setLBL(jButtonB3.getText());
        if (jButtonB3.getBackground() != Color.red) {
            jButtonB3.setBackground(Color.red);
            Date date = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("YY/MM/dd hh:mm:ss");
            String tt = dateForm.format(date);
            jLabelB3.setText(" busy: " + tt);
        } else {
            jButtonB3.setBackground(Color.green);
            jLabelB3.setText("B3 Parking is empty.");
        }
    }//GEN-LAST:event_jButtonB3MouseClicked

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
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonA1;
    public javax.swing.JButton jButtonA2;
    public javax.swing.JButton jButtonA3;
    public javax.swing.JButton jButtonB1;
    public javax.swing.JButton jButtonB2;
    public javax.swing.JButton jButtonB3;
    public javax.swing.JLabel jLabelA1;
    public javax.swing.JLabel jLabelA2;
    public javax.swing.JLabel jLabelA3;
    public javax.swing.JLabel jLabelB1;
    public javax.swing.JLabel jLabelB2;
    public javax.swing.JLabel jLabelB3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}