package Proveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.Inicio;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;*/
public class proveedores extends javax.swing.JFrame {
    Inicio jF_inicio;
    Conection con = new Conection();
    Connection cn = con.conexion();
    public proveedores() {
        initComponents();
    }
    public proveedores(Inicio jF_inicio){
        initComponents();
        this.cn = con.conexion();
        this.jF_inicio = jF_inicio;
        //this.llenarComboProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_primero_pv = new javax.swing.JButton();
        jb_anterior_pv = new javax.swing.JButton();
        jb_siguiente_pv = new javax.swing.JButton();
        jb_ultimo_pv = new javax.swing.JButton();
        jb_agregar_pv = new javax.swing.JButton();
        jb_eliminar_pv = new javax.swing.JButton();
        jb_modificar_pv = new javax.swing.JButton();
        jb_guardar_pv = new javax.swing.JButton();
        jb_cancelar_pv = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jB_regresa_pd = new javax.swing.JButton();
        jB_regresar_ti_pd = new javax.swing.JButton();
        jL_id_proveedor_pv = new javax.swing.JLabel();
        jT_id_proveedor_pv = new javax.swing.JTextField();
        jL_nombre_pv = new javax.swing.JLabel();
        jT_nombre_pv = new javax.swing.JTextField();
        jL_direccion_pv = new javax.swing.JLabel();
        jT_direccion_pv = new javax.swing.JTextField();
        jL_telefono_pv = new javax.swing.JLabel();
        jT_telefono_pv = new javax.swing.JTextField();
        jL_rfc_pv = new javax.swing.JLabel();
        jT_rfc_pv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jL_id_contacto_cn = new javax.swing.JLabel();
        jT_id_contacto_cn = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jL_nobmbre_cn = new javax.swing.JLabel();
        jL_telefono_cn = new javax.swing.JLabel();
        jL_correo_cn = new javax.swing.JLabel();
        jT_nombre_cn = new javax.swing.JTextField();
        jT_telefono_cn = new javax.swing.JTextField();
        jT_correo_cn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_primero_pv.setText("|<");
        jb_primero_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_primero_pvMouseClicked(evt);
            }
        });

        jb_anterior_pv.setText("<<");
        jb_anterior_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_anterior_pvMouseClicked(evt);
            }
        });

        jb_siguiente_pv.setText(">>");
        jb_siguiente_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguiente_pvMouseClicked(evt);
            }
        });

        jb_ultimo_pv.setText(">|");
        jb_ultimo_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ultimo_pvMouseClicked(evt);
            }
        });

        jb_agregar_pv.setText("Agregar");
        jb_agregar_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_pvMouseClicked(evt);
            }
        });

        jb_eliminar_pv.setText("Eliminar");
        jb_eliminar_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminar_pvMouseClicked(evt);
            }
        });

        jb_modificar_pv.setText("Modificar");
        jb_modificar_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificar_pvMouseClicked(evt);
            }
        });

        jb_guardar_pv.setText("Guardar");
        jb_guardar_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardar_pvMouseClicked(evt);
            }
        });

        jb_cancelar_pv.setText("Cancelar");
        jb_cancelar_pv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cancelar_pvMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jB_regresa_pd.setBackground(new java.awt.Color(102, 102, 255));
        jB_regresa_pd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1.png"))); // NOI18N
        jB_regresa_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_regresa_pdActionPerformed(evt);
            }
        });

        jB_regresar_ti_pd.setBackground(new java.awt.Color(102, 102, 255));
        jB_regresar_ti_pd.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        jB_regresar_ti_pd.setForeground(new java.awt.Color(255, 255, 255));
        jB_regresar_ti_pd.setText("FerreProgreso");
        jB_regresar_ti_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_regresar_ti_pdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_regresar_ti_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(jB_regresa_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_regresar_ti_pd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_regresa_pd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jL_id_proveedor_pv.setText("Id Proveedor:");

        jL_nombre_pv.setText("Nombre:");

        jL_direccion_pv.setText("Direccion:");

        jL_telefono_pv.setText("Telefono:");

        jL_rfc_pv.setText("RFC:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Direccion", "Telefono", "RFC"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Guardarrr");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jL_id_contacto_cn.setText("Clave contacto:");

        jL_nobmbre_cn.setText("Nombre:");

        jL_telefono_cn.setText("Telefono:");

        jL_correo_cn.setText("Correo:");

        jT_correo_cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_correo_cnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_id_proveedor_pv)
                            .addComponent(jL_nombre_pv)
                            .addComponent(jL_direccion_pv)
                            .addComponent(jL_telefono_pv)
                            .addComponent(jL_rfc_pv))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jT_nombre_pv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_id_proveedor_pv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jT_direccion_pv, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_telefono_pv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_rfc_pv, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jb_primero_pv)
                                            .addGap(18, 18, 18)
                                            .addComponent(jb_anterior_pv))
                                        .addComponent(jb_agregar_pv))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jb_eliminar_pv)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jb_siguiente_pv)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jb_ultimo_pv))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jb_modificar_pv)
                                    .addGap(66, 66, 66)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb_guardar_pv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_cancelar_pv)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_id_contacto_cn)
                                    .addComponent(jL_correo_cn)
                                    .addComponent(jL_telefono_cn)
                                    .addComponent(jL_nobmbre_cn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jT_id_contacto_cn)
                                    .addComponent(jT_nombre_cn)
                                    .addComponent(jT_telefono_cn)
                                    .addComponent(jT_correo_cn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb_primero_pv)
                                    .addComponent(jb_anterior_pv)
                                    .addComponent(jb_siguiente_pv)
                                    .addComponent(jb_ultimo_pv)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb_agregar_pv)
                                    .addComponent(jb_eliminar_pv)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jb_modificar_pv)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_cancelar_pv)
                            .addComponent(jb_guardar_pv)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_id_proveedor_pv)
                            .addComponent(jT_id_proveedor_pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_nombre_pv)
                            .addComponent(jT_nombre_pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_direccion_pv)
                            .addComponent(jT_direccion_pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_telefono_pv)
                            .addComponent(jT_telefono_pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_rfc_pv)
                            .addComponent(jT_rfc_pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_id_contacto_cn)
                    .addComponent(jT_id_contacto_cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_nobmbre_cn)
                    .addComponent(jT_nombre_cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_telefono_cn)
                    .addComponent(jT_telefono_cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_correo_cn)
                    .addComponent(jT_correo_cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
/*
    private void jb_primero_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_primero_pvMouseClicked
        primerRegistro();
    }//GEN-LAST:event_jb_primero_pvMouseClicked

    private void jb_anterior_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_anterior_pvMouseClicked
        registroAnterior();
    }//GEN-LAST:event_jb_anterior_pvMouseClicked

    private void jb_siguiente_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_siguiente_pvMouseClicked
        siguienteRegistro();
    }//GEN-LAST:event_jb_siguiente_pvMouseClicked

    private void jb_ultimo_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ultimo_pvMouseClicked
        ultimoRegistro();
    }//GEN-LAST:event_jb_ultimo_pvMouseClicked

    private void jb_agregar_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_pvMouseClicked
        agregarRegistro();
    }//GEN-LAST:event_jb_agregar_pvMouseClicked

    private void jb_eliminar_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminar_pvMouseClicked
        String descripcion=this.jtf_descripcion_pd.getText();
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar el producto " +descripcion+"", "Eliminar producto", JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);
        if(JOptionPane.OK_OPTION==confirmar){
            JOptionPane.showMessageDialog(null, "Se ha eliminado el producto(" +descripcion+")", "Eliminado", JOptionPane.WARNING_MESSAGE);
            borrarRegistro();}
        else{
        }
    }//GEN-LAST:event_jb_eliminar_pvMouseClicked

    private void jb_modificar_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificar_pvMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea modificar este registro", "Modificar producto", JOptionPane.YES_OPTION);
        if(JOptionPane.OK_OPTION==confirmar)
        modificarRegistro();
    }//GEN-LAST:event_jb_modificar_pvMouseClicked

    private void jb_guardar_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardar_pvMouseClicked
        String descripcion=this.jtf_descripcion_pd.getText();
        JOptionPane.showMessageDialog(null, "Se ha guardado el producto(" +descripcion+")", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        guardarRegistro();
    }//GEN-LAST:event_jb_guardar_pvMouseClicked

    private void jb_cancelar_pvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cancelar_pvMouseClicked
        cancelarRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelar_pvMouseClicked
*/
    private void jB_regresa_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_regresa_pdActionPerformed
        jF_inicio.setVisible(true);
        jF_inicio.setTitle("JP-Saf");
        jF_inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_regresa_pdActionPerformed

    private void jB_regresar_ti_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_regresar_ti_pdActionPerformed
        jF_inicio.setVisible(true);
        jF_inicio.setTitle("JP-Saf");
        jF_inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_regresar_ti_pdActionPerformed

    private void guardarRegistro(){
        try {
            PreparedStatement pps = cn.prepareStatement("insert into proveedor(id_proveedor,nombre,direccion,telefono,rfc,id_contacto)values(?,?,?,?,?,?)");
            pps.setString(1,  jT_id_proveedor_pv.getText());
            pps.setString(2,  jT_nombre_pv.getText());
            pps.setString(3,  jT_direccion_pv.getText());
            pps.setString(4,  jT_telefono_pv.getText());
            pps.setString(5,  jT_rfc_pv.getText());
            pps.setString(6,  jT_id_contacto_cn.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("insert into contacto(id_contacto,nombre,telefono,correo)values(?,?,?,?)");
            pps.setString(1,  jT_id_contacto_cn.getText());
            pps.setString(2,  jT_nombre_cn.getText());
            pps.setString(3,  jT_telefono_cn.getText());
            pps.setString(4,  jT_correo_cn.getText());
            pps.executeUpdate();
            this.guardarRegistro();
        } catch (SQLException ex) {
            Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jT_correo_cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_correo_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_correo_cnActionPerformed

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
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_regresa_pd;
    private javax.swing.JButton jB_regresar_ti_pd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jL_correo_cn;
    private javax.swing.JLabel jL_direccion_pv;
    private javax.swing.JLabel jL_id_contacto_cn;
    private javax.swing.JLabel jL_id_proveedor_pv;
    private javax.swing.JLabel jL_nobmbre_cn;
    private javax.swing.JLabel jL_nombre_pv;
    private javax.swing.JLabel jL_rfc_pv;
    private javax.swing.JLabel jL_telefono_cn;
    private javax.swing.JLabel jL_telefono_pv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jT_correo_cn;
    private javax.swing.JTextField jT_direccion_pv;
    private javax.swing.JTextField jT_id_contacto_cn;
    private javax.swing.JTextField jT_id_proveedor_pv;
    private javax.swing.JTextField jT_nombre_cn;
    private javax.swing.JTextField jT_nombre_pv;
    private javax.swing.JTextField jT_rfc_pv;
    private javax.swing.JTextField jT_telefono_cn;
    private javax.swing.JTextField jT_telefono_pv;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_agregar_pv;
    private javax.swing.JButton jb_anterior_pv;
    private javax.swing.JButton jb_cancelar_pv;
    private javax.swing.JButton jb_eliminar_pv;
    private javax.swing.JButton jb_guardar_pv;
    private javax.swing.JButton jb_modificar_pv;
    private javax.swing.JButton jb_primero_pv;
    private javax.swing.JButton jb_siguiente_pv;
    private javax.swing.JButton jb_ultimo_pv;
    // End of variables declaration//GEN-END:variables
}
