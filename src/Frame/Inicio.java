/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel
 */
public class Inicio extends javax.swing.JFrame {
    public static Login frmLog;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIngreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
        lblMusica = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIngreso.setBackground(new java.awt.Color(255, 255, 255));
        pnlIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlIngreso.setForeground(new java.awt.Color(255, 255, 255));
        pnlIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        pnlIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 90));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        pnlIngreso.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calculator_32px.png"))); // NOI18N
        lblCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCalculadoraMouseClicked(evt);
            }
        });
        pnlIngreso.add(lblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 120, 30, 30));

        lblMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Musical_Notes_32px.png"))); // NOI18N
        lblMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMusicaMouseClicked(evt);
            }
        });
        pnlIngreso.add(lblMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 170, 30, 30));

        lblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Globe_32px.png"))); // NOI18N
        pnlIngreso.add(lblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 158, 0));
        jLabel1.setText("Bienvenido al Sistema");
        pnlIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        getContentPane().add(pnlIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 30, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 750, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(29, 158, 0));
        jLabel18.setText("Cronograma");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(29, 158, 0));
        jLabel14.setText("Programado");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(29, 158, 0));
        jLabel15.setText("Notas");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(29, 158, 0));
        jLabel16.setText("Socios");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(29, 158, 0));
        jLabel17.setText("Mantenimiento");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(29, 158, 0));
        jLabel13.setText("Google Drive");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Clock_96px.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 180));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Today_96px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 190, 180));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Idea_96px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 190, 180));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Google_Drive_96px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 180));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Handshake_96px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 190, 180));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Maintenance_96px.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 190, 180));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Buscar...");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 158, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 180, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_32px.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 750, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, lblInternet);

        AnimationClass internett = new AnimationClass();
        internett.jLabelXLeft(10, -40, 10, 5, lblInternet);

        AnimationClass calculadora = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, lblCalculadora);

        AnimationClass calculadoraa = new AnimationClass();
        internett.jLabelXLeft(10, -40, 10, 5, lblCalculadora);

        AnimationClass musica = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, lblMusica);

        AnimationClass musicaa = new AnimationClass();
        internett.jLabelXLeft(10, -40, 10, 5, lblMusica);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalculadoraMouseClicked

    }//GEN-LAST:event_lblCalculadoraMouseClicked

    private void lblMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusicaMouseClicked

    }//GEN-LAST:event_lblMusicaMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Login?","Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMusica;
    private javax.swing.JPanel pnlIngreso;
    // End of variables declaration//GEN-END:variables
}