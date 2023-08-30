/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.awt.Graphics;

public class FrmPrincipal extends javax.swing.JFrame {


    public FrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent (Graphics g){
                super.paintComponent(g);
                g.setColor(Color.white);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        }
        ;
        menuBar = new javax.swing.JMenuBar();
        mnuTienda = new javax.swing.JMenu();
        mnuAlmacen = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuLogin = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/tienda.png"))); // NOI18N
        mnuTienda.setText("Tienda");
        menuBar.add(mnuTienda);

        mnuAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/almacen.png"))); // NOI18N
        mnuAlmacen.setText("Almacen");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuAlmacen.add(jMenuItem3);

        menuBar.add(mnuAlmacen);

        mnuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/ayuda.png"))); // NOI18N
        mnuConsultas.setText("contacto");
        menuBar.add(mnuConsultas);

        mnuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/login.png"))); // NOI18N
        mnuLogin.setText("Login  ");
        menuBar.add(mnuLogin);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img4/salir.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        menuBar.add(mnuSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      FrmProductos frm=new FrmProductos();
      escritorio.add(frm);
      frm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_mnuSalirMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuAlmacen;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenu mnuTienda;
    // End of variables declaration//GEN-END:variables

}
