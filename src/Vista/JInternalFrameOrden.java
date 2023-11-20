/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import java.util.*;
import java.sql.Date;
import java.sql.Time;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class JInternalFrameOrden extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameOrden
     */
    public JInternalFrameOrden() {
        initComponents();
        jTextFieldIDOrden.setEnabled(false);
    }
    
public void limpiarCampos() {
jTextFieldIDOrden.setText("");
jTextFieldFechaOrden.setText("");
jTextFieldHoraOrden.setText("");
jTextFieldMesa.setText("");
jTextFieldIDCliente.setText("");    
}
    
public void obtenerDatos(){
     
    List<Orden> Ordenes =new DAOOrden().obtenerDatos();
    DefaultTableModel modelo= new DefaultTableModel();
    
    String[] columnas={"id_orden","fecha_orden","hora_orden","no_mesa","id_cliente"};
    
  modelo.setColumnIdentifiers(columnas);
  
  for (Orden au:Ordenes) {
      
      String[]renglon={Integer.toString(au.getId_orden()),
          au.getFecha_orden().toString(),
          au.getHora_orden().toString(),au.getNo_mesa(),
          Integer.toString(au.getId_cliente())};
      modelo.addRow(renglon);
  }
    jTableOrden.setModel(modelo);
}

public void actualizarOrden (){
    int id_orden=Integer.parseInt(this.jTextFieldIDOrden.getText());
    Date fecha_orden=Date.valueOf(this.jTextFieldFechaOrden.getText());
    Time hora_orden=Time.valueOf(this.jTextFieldHoraOrden.getText());
    String mesa=jTextFieldMesa.getText();
    int id_cliente=Integer.parseInt(this.jTextFieldIDCliente.getText());
  
    DAOOrden dao=new DAOOrden();
    int res=dao.Actualizar(id_orden, fecha_orden, hora_orden, mesa, id_cliente);
        if (res==1) {
            JOptionPane.showMessageDialog(rootPane, "Orden Actualizada");
        } else {
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrio un ERROR!");
        }   
    }

public void actualizarInterfazOrden(List<Orden> ordenes) {
    DefaultTableModel modelo = new DefaultTableModel();
   
    String[] columnas = {"id_orden", "fecha_orden", "hora_orden", "no_Mesa", "id_cliente"};
    modelo.setColumnIdentifiers(columnas);

    for (Orden orden : ordenes) {
        Object[] renglon = {
                orden.getId_orden(),
                orden.getFecha_orden(),
                orden.getHora_orden(),
                orden.getNo_mesa(),
                orden.getId_cliente()
        };
        modelo.addRow(renglon);
    }

    jTableOrden.setModel(modelo);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIDOrden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFechaOrden = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHoraOrden = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMesa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIDCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrden = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Registrar / Actualizar");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("ID");

        jTextFieldIDOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIDOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDOrdenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Fecha");

        jTextFieldFechaOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaOrdenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Hora");

        jTextFieldHoraOrden.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldHoraOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraOrdenActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Mesa");

        jTextFieldMesa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMesaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("ID");

        jTextFieldIDCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldIDOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHoraOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIDOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHoraOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Transacciones ");

        jButtonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addComponent(jButtonAgregar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonActualizar))
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscar)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        jTableOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Orden", "Fecha", "Hora", "Mesa", "ID_Cliente"
            }
        ));
        jScrollPane1.setViewportView(jTableOrden);

        jPanel3.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDOrdenActionPerformed

    private void jTextFieldFechaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaOrdenActionPerformed

    private void jTextFieldHoraOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraOrdenActionPerformed

    private void jTextFieldMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMesaActionPerformed

    private void jTextFieldIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDClienteActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        String fecha=jTextFieldFechaOrden.getText();
        String hora=jTextFieldHoraOrden.getText();
        String mesa=jTextFieldMesa.getText();
        String cliente=jTextFieldIDCliente.getText();

        if (fecha.contentEquals("")||(hora.contentEquals("")||
            mesa.contentEquals("")||cliente.contentEquals(""))){
        JOptionPane.showMessageDialog(rootPane,
            "Todos los campos son obligatorios");
        } else {
            try {
                
                Date fecha_orden=Date.valueOf(this.jTextFieldFechaOrden.getText());
                Time hora_orden=Time.valueOf(this.jTextFieldHoraOrden.getText());
                int id_cliente=Integer.parseInt(this.jTextFieldIDCliente.getText());
                Orden au =new DAOOrden().Insertar(fecha_orden, hora_orden, mesa, id_cliente);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
            obtenerDatos();
            limpiarCampos();
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jButtonAgregar.setEnabled(false);
        int fila=this.jTableOrden.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(rootPane,
                "Seleccione un registro de la tabla");
        } else {
            try {
                int id_orden=Integer.parseInt((String)this.jTableOrden.getValueAt(fila ,0).toString());
                Date fecha_orden=Date.valueOf((String)this.jTableOrden.getValueAt(fila, 1).toString());
                Time hora_orden=Time.valueOf((String)this.jTableOrden.getValueAt(fila, 2).toString());
                String mesa=(String)this.jTableOrden.getValueAt(fila, 3);
                int id_cliente=Integer.parseInt((String)this.jTableOrden.getValueAt(fila, 4).toString());

                jTextFieldIDOrden.setText("" + id_orden);
                jTextFieldFechaOrden.setText(String.valueOf(fecha_orden));
                jTextFieldHoraOrden.setText(String.valueOf(hora_orden));
                jTextFieldMesa.setText(mesa);
                jTextFieldIDCliente.setText("" + id_cliente);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
    jButtonAgregar.setEnabled(true);
        actualizarOrden();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int fila = this.jTableOrden.getSelectedRow();
        int id_orden = Integer.parseInt((String)
                this.jTableOrden.getValueAt(fila, 0).toString());

        DAOOrden dao = new DAOOrden();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Seleccione un registro de la tabla");
        } else {
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminira la orden, ¿desea continuar?",
                    "Eliminar Orden", JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                dao.Eliminar(id_orden);
                obtenerDatos();
                JOptionPane.showMessageDialog(null, "Orden eliminado correctamente");
            }
        }  
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private boolean busquedaActivaOrden = false;
    
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
                                          
    String terminoBusqueda = jTextFieldBuscar.getText().trim();
    if (!terminoBusqueda.isEmpty()) {
        actualizarInterfazOrden(new DAOOrden().buscarOrdenes(terminoBusqueda));
        busquedaActivaOrden = true;
    } else if (busquedaActivaOrden) {
        actualizarInterfazOrden(new DAOOrden().obtenerDatos());
        busquedaActivaOrden = false;
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un término de búsqueda.",
                "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrden;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldFechaOrden;
    private javax.swing.JTextField jTextFieldHoraOrden;
    private javax.swing.JTextField jTextFieldIDCliente;
    private javax.swing.JTextField jTextFieldIDOrden;
    private javax.swing.JTextField jTextFieldMesa;
    // End of variables declaration//GEN-END:variables
}
