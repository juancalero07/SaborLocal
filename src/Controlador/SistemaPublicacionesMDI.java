/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Controlador;

import Vista.*;


/**
 *
 * @author HP
 */
public class SistemaPublicacionesMDI extends javax.swing.JFrame {

    private JInternalFrameCliente Clientes;
    private JInternalFrameCategoria Categoria;
    private JInternalFrameProductos Productos;
    private JInternalFrameOrden Ordenes;
            
    
    /**
     * Creates new form SistemaPublicacionesMDI
     */
    public SistemaPublicacionesMDI() {
        initComponents();
        
        
        setTitle("SaborLocal");
        Clientes= new JInternalFrameCliente();
        desktopPane.add(Clientes);
        
        Categoria= new JInternalFrameCategoria();
        desktopPane.add(Categoria);
        
        Productos = new JInternalFrameProductos();
        desktopPane.add(Productos);
        
        Ordenes = new JInternalFrameOrden();
        desktopPane.add(Ordenes);
        
        
    }

            
            
            
            
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        VerClienteMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        VerCategoriaMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/client (1).png"))); // NOI18N
        Cliente.setMnemonic('e');
        Cliente.setText("Cliente");

        VerClienteMenuItem.setMnemonic('d');
        VerClienteMenuItem.setText("Ver clientes");
        VerClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClienteMenuItemActionPerformed(evt);
            }
        });
        Cliente.add(VerClienteMenuItem);

        menuBar.add(Cliente);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/options-lines (1).png"))); // NOI18N
        jMenu1.setText("Categoria");

        VerCategoriaMenuItem.setText("Ver Categoria");
        VerCategoriaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCategoriaMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(VerCategoriaMenuItem);

        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diet (1).png"))); // NOI18N
        jMenu2.setText("Productos");

        jMenuItemProductos.setText("Ver productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemProductos);

        menuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dish (1).png"))); // NOI18N
        jMenu3.setText("Orden");

        jMenuItem1.setText("Ver orden");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        menuBar.add(jMenu3);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout (1).png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Salir");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Salir");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void VerCategoriaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCategoriaMenuItemActionPerformed
    Categoria.obtenerDatos();
    Categoria.setVisible(true);
    }//GEN-LAST:event_VerCategoriaMenuItemActionPerformed

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
    Productos.obtenerDatos();
    Productos.setVisible(true);
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Ordenes.obtenerDatos();
    Ordenes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void VerClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClienteMenuItemActionPerformed
        Clientes.obtenerDatos();
        Clientes.setVisible(true);
    }//GEN-LAST:event_VerClienteMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
    this.dispose();
    }//GEN-LAST:event_contentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaPublicacionesMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaPublicacionesMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem VerCategoriaMenuItem;
    private javax.swing.JMenuItem VerClienteMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}