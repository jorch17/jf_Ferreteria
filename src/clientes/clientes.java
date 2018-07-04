package clientes;
import java.sql.DriverManager; 
import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement; 
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import principal.Inicio;


public class clientes extends javax.swing.JFrame {
    Inicio jF_inicio;
    private Connection conexion;     
    private Statement st;     
    private ResultSet rs; 


    public clientes() {
        initComponents();
    }
    public clientes(Inicio jF_inicio){
        initComponents();
        Conectar();   
        this.jF_inicio = jF_inicio;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jl_nombre_cl = new javax.swing.JLabel();
        jtf_nombre_cl = new javax.swing.JTextField();
        jl_apellidos_cl = new javax.swing.JLabel();
        jtf_apellidos_cl = new javax.swing.JTextField();
        jl_rfc_cl = new javax.swing.JLabel();
        jtf_rfc_cl = new javax.swing.JTextField();
        jl_direccion_cl = new javax.swing.JLabel();
        jtf_direccion_cl = new javax.swing.JTextField();
        jl_telefono_cl = new javax.swing.JLabel();
        jtf_telefono_cl = new javax.swing.JTextField();
        jl_correo_cl = new javax.swing.JLabel();
        jtf_correo_cl = new javax.swing.JTextField();
        jb_primero_cl = new javax.swing.JButton();
        jb_anterior_cl = new javax.swing.JButton();
        jb_siguiente_cl = new javax.swing.JButton();
        jb_ultimo_cl = new javax.swing.JButton();
        jb_agregar_cl = new javax.swing.JButton();
        jb_eliminar_cl = new javax.swing.JButton();
        jb_guardar_cl = new javax.swing.JButton();
        jb_modificar_cl = new javax.swing.JButton();
        jl_id_cliente_cl = new javax.swing.JLabel();
        jb_cancelar_cl = new javax.swing.JButton();
        jtf_id_cliente_cl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tabla_cl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jB_regresa_cl = new javax.swing.JButton();
        jB_regresar_ti_cl = new javax.swing.JButton();
        jb_editar_cl = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 138, 121));
        jLabel1.setFont(new java.awt.Font("Montserrat Alternates Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FerreProgreso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jl_nombre_cl.setText("Nombre :");

        jl_apellidos_cl.setText("Apellidos :");

        jl_rfc_cl.setText("RFC :");

        jl_direccion_cl.setText("Direccion :");

        jl_telefono_cl.setText("Teléfono :");

        jl_correo_cl.setText("Correo :");
        jl_correo_cl.setToolTipText("");

        jb_primero_cl.setText("|<");
        jb_primero_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_primero_clMouseClicked(evt);
            }
        });

        jb_anterior_cl.setText("<<");
        jb_anterior_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_anterior_clMouseClicked(evt);
            }
        });

        jb_siguiente_cl.setText(">>");
        jb_siguiente_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguiente_clMouseClicked(evt);
            }
        });

        jb_ultimo_cl.setText(">|");
        jb_ultimo_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ultimo_clMouseClicked(evt);
            }
        });

        jb_agregar_cl.setText("Agregar");
        jb_agregar_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_clMouseClicked(evt);
            }
        });

        jb_eliminar_cl.setText("Eliminar");
        jb_eliminar_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminar_clMouseClicked(evt);
            }
        });
        jb_eliminar_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminar_clActionPerformed(evt);
            }
        });

        jb_guardar_cl.setText("Guardar");
        jb_guardar_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardar_clMouseClicked(evt);
            }
        });

        jb_modificar_cl.setText("Modificar");
        jb_modificar_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificar_clMouseClicked(evt);
            }
        });

        jl_id_cliente_cl.setText("Id_cliente :");

        jb_cancelar_cl.setText("Cancelar");
        jb_cancelar_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cancelar_clMouseClicked(evt);
            }
        });

        jT_tabla_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_tabla_clMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_tabla_cl);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jB_regresa_cl.setBackground(new java.awt.Color(0, 0, 0));
        jB_regresa_cl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1.png"))); // NOI18N
        jB_regresa_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_regresa_clActionPerformed(evt);
            }
        });

        jB_regresar_ti_cl.setBackground(new java.awt.Color(0, 0, 0));
        jB_regresar_ti_cl.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        jB_regresar_ti_cl.setForeground(new java.awt.Color(255, 255, 255));
        jB_regresar_ti_cl.setText("ZINNIA");
        jB_regresar_ti_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_regresar_ti_clActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_regresar_ti_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(jB_regresa_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jB_regresar_ti_cl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_regresa_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_editar_cl.setText("Editar");
        jb_editar_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_editar_clMouseClicked(evt);
            }
        });
        jb_editar_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editar_clActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_eliminar_cl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_id_cliente_cl)
                                .addGap(4, 4, 4)
                                .addComponent(jtf_id_cliente_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_nombre_cl)
                                        .addGap(2, 2, 2)
                                        .addComponent(jtf_nombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_apellidos_cl)
                                        .addGap(1, 1, 1)
                                        .addComponent(jtf_apellidos_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_rfc_cl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_rfc_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jl_correo_cl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_correo_cl))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jl_telefono_cl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtf_telefono_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_direccion_cl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_direccion_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_primero_cl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_anterior_cl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_siguiente_cl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_ultimo_cl))
                            .addComponent(jb_agregar_cl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jb_modificar_cl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_editar_cl))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jb_guardar_cl)
                                    .addGap(34, 34, 34)
                                    .addComponent(jb_cancelar_cl))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_cliente_cl)
                            .addComponent(jtf_id_cliente_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombre_cl)
                            .addComponent(jtf_nombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_direccion_cl)
                            .addComponent(jtf_direccion_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_apellidos_cl)
                            .addComponent(jtf_apellidos_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_telefono_cl)
                            .addComponent(jtf_telefono_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_rfc_cl)
                            .addComponent(jtf_rfc_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_correo_cl)
                            .addComponent(jtf_correo_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_primero_cl)
                            .addComponent(jb_anterior_cl)
                            .addComponent(jb_siguiente_cl)
                            .addComponent(jb_ultimo_cl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_agregar_cl)
                            .addComponent(jb_eliminar_cl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_modificar_cl)
                            .addComponent(jb_editar_cl))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_guardar_cl)
                            .addComponent(jb_cancelar_cl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_primero_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_primero_clMouseClicked
        primerRegistro();
    }//GEN-LAST:event_jb_primero_clMouseClicked

    private void jb_anterior_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_anterior_clMouseClicked
        registroAnterior();
    }//GEN-LAST:event_jb_anterior_clMouseClicked

    private void jb_siguiente_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_siguiente_clMouseClicked
        siguienteRegistro();
    }//GEN-LAST:event_jb_siguiente_clMouseClicked

    private void jb_ultimo_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ultimo_clMouseClicked
        ultimoRegistro();
    }//GEN-LAST:event_jb_ultimo_clMouseClicked

    private void jb_agregar_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_clMouseClicked
        agregarRegistro();
    }//GEN-LAST:event_jb_agregar_clMouseClicked

    private void jb_eliminar_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminar_clMouseClicked
        String descripcion=this.jtf_nombre_cl.getText();
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar el cliente " +descripcion+"", "Eliminar cliente", JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);
        if(JOptionPane.OK_OPTION==confirmar){
        JOptionPane.showMessageDialog(null, "Se ha eliminado el cliente(" +descripcion+")", "Eliminado", JOptionPane.WARNING_MESSAGE);
        borrarRegistro();}
        else{
        }
    }//GEN-LAST:event_jb_eliminar_clMouseClicked
    private void jb_guardar_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardar_clMouseClicked
        String descripcion=this.jtf_nombre_cl.getText();
        JOptionPane.showMessageDialog(null, "Se ha guardado el cliente(" +descripcion+")", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        guardarRegistro();
    }//GEN-LAST:event_jb_guardar_clMouseClicked

    private void jb_modificar_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificar_clMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea modificar este registro", "Modificar cliente", JOptionPane.YES_OPTION);
        if(JOptionPane.OK_OPTION==confirmar)
        modificarRegistro();
    }//GEN-LAST:event_jb_modificar_clMouseClicked

    private void jb_cancelar_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cancelar_clMouseClicked
        cancelarRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelar_clMouseClicked

    private void jb_eliminar_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminar_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_eliminar_clActionPerformed

    private void jB_regresa_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_regresa_clActionPerformed
        jF_inicio.setVisible(true);
        jF_inicio.setTitle("ZINNIA");
        jF_inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_regresa_clActionPerformed
    
    private void jB_regresar_ti_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_regresar_ti_clActionPerformed
        jF_inicio.setVisible(true);
        jF_inicio.setTitle("ZINNIA");
        jF_inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_regresar_ti_clActionPerformed

    private void jT_tabla_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_tabla_clMouseClicked
        this.localiza();
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_tabla_clMouseClicked

    private void jb_editar_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editar_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_editar_clActionPerformed

    private void jb_editar_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_editar_clMouseClicked
        editarRegistro();
    }//GEN-LAST:event_jb_editar_clMouseClicked
    
    
    private void localiza(){
        try {             
        int seleccion = jT_tabla_cl.getSelectedRow();
        jtf_id_cliente_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,0)));
        jtf_nombre_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,1)));
        jtf_apellidos_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,2)));
        jtf_direccion_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,3)));
        jtf_telefono_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,4)));
        jtf_rfc_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,5)));
        jtf_correo_cl.setText(String.valueOf(jT_tabla_cl.getValueAt(seleccion,6)));
        rs=st.executeQuery("Select * from cliente;");  
        jT_tabla_cl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());   
        }
    } 
    public void Conectar(){
         try{ 
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/Ferre2","root","151617");                     
            st=conexion.createStatement(); 

            rs=st.executeQuery("Select * from cliente;");
            jT_tabla_cl.setModel(DbUtils.resultSetToTableModel(rs));
            rs=st.executeQuery("Select * from cliente;");                        
            rs.next();           
                this.jtf_id_cliente_cl.setText(rs.getString("id_cliente"));                         
                this.jtf_nombre_cl.setText(rs.getString("nombre"));             
                this.jtf_apellidos_cl.setText(rs.getString("apellidos"));
                this.jtf_rfc_cl.setText(rs.getString("rfc")); 
                this.jtf_direccion_cl.setText(rs.getString("direccion")); 
                this.jtf_telefono_cl.setText(rs.getString("telefono")); 
                this.jtf_correo_cl.setText(rs.getString("correo")); 
                if(rs.isFirst()==false) {                 
                rs.first(); }
                this.deshabilitarjtables();
                this.deshabilitarbuttons();
                this.habilitar();
        }catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 

    }
    private void siguienteRegistro(){    
    try{             
        if(rs.isLast()==false) {                 
            rs.next();                 
            this.jtf_id_cliente_cl.setText(rs.getString("id_cliente"));                         
            this.jtf_nombre_cl.setText(rs.getString("nombre"));             
            this.jtf_apellidos_cl.setText(rs.getString("apellidos"));
            this.jtf_rfc_cl.setText(rs.getString("rfc")); 
            this.jtf_direccion_cl.setText(rs.getString("direccion")); 
            this.jtf_telefono_cl.setText(rs.getString("telefono")); 
            this.jtf_correo_cl.setText(rs.getString("correo"));          
        }         
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}     
    private void registroAnterior(){    
    try{             
        if(rs.isFirst()==false) {                 
            rs.previous();                 
            this.jtf_id_cliente_cl.setText(rs.getString("id_cliente"));                         
            this.jtf_nombre_cl.setText(rs.getString("nombre"));             
            this.jtf_apellidos_cl.setText(rs.getString("apellidos"));
            this.jtf_rfc_cl.setText(rs.getString("rfc")); 
            this.jtf_direccion_cl.setText(rs.getString("direccion")); 
            this.jtf_telefono_cl.setText(rs.getString("telefono")); 
            this.jtf_correo_cl.setText(rs.getString("correo"));           
        }         
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
} 
        private void primerRegistro(){    
        try{             
            if(rs.isFirst()==false) {                 
                rs.first();                 
                this.jtf_id_cliente_cl.setText(rs.getString("id_cliente"));                         
                this.jtf_nombre_cl.setText(rs.getString("nombre"));             
                this.jtf_apellidos_cl.setText(rs.getString("apellidos"));
                this.jtf_rfc_cl.setText(rs.getString("rfc")); 
                this.jtf_direccion_cl.setText(rs.getString("direccion")); 
                this.jtf_telefono_cl.setText(rs.getString("telefono")); 
                this.jtf_correo_cl.setText(rs.getString("correo"));            
            }         
        }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}
            
        private void ultimoRegistro(){    
    try{             
        if(rs.isLast()==false) {                 
            rs.last();                 
            this.jtf_id_cliente_cl.setText(rs.getString("id_cliente"));                         
            this.jtf_nombre_cl.setText(rs.getString("nombre"));             
            this.jtf_apellidos_cl.setText(rs.getString("apellidos"));
            this.jtf_rfc_cl.setText(rs.getString("rfc")); 
            this.jtf_direccion_cl.setText(rs.getString("direccion")); 
            this.jtf_telefono_cl.setText(rs.getString("telefono")); 
            this.jtf_correo_cl.setText(rs.getString("correo"));            
        }         
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}
    
        private void agregarRegistro(){
            jtf_id_cliente_cl.setText("");
            jtf_nombre_cl.setText("");
            jtf_apellidos_cl.setText("");
            jtf_rfc_cl.setText("");
            jtf_direccion_cl.setText("");
            jtf_telefono_cl.setText("");
            jtf_correo_cl.setText("");
            this.habilitarjtables();
            this.deshabilitarbuttons();
        }    
    
    
        private void guardarRegistro() {      
            try{ 
            
            String id_cliente=this.jtf_id_cliente_cl.getText(); 
            String nombre=this.jtf_nombre_cl.getText(); 
            String apellidos=this.jtf_apellidos_cl.getText(); 
            String rfc=this.jtf_rfc_cl.getText(); 
            String direccion=this.jtf_direccion_cl.getText(); 
            String telefono=this.jtf_telefono_cl.getText(); 
            String correo=this.jtf_correo_cl.getText(); 
      
            st.executeUpdate("Insert into cliente (id_cliente,nombre,apellidos,rfc,direccion,telefono,correo)"+"values('"+ id_cliente+"','"+nombre+"','"+apellidos+"','"+rfc+"','"+direccion+"','"+telefono+"','"+correo+"');"); 
            this.Conectar();
            this.deshabilitarjtables();
            this.deshabilitarbuttons();
            this.habilitar();
            this.primerRegistro();

        } catch(SQLException err)         { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
            
        }
         
    public void editarRegistro(){
            Conectar();               
            this.habilitarjtables();
            this.habilitarbuttons();
            jb_guardar_cl.setEnabled(false);            
            jb_editar_cl.setEnabled(false);
            jb_agregar_cl.setEnabled(false);
    }    
    private void cancelarRegistro(){
           Conectar();
           this.deshabilitarjtables();
           this.deshabilitarbuttons();
           this.habilitar();
           this.primerRegistro();
    }
    
    private void borrarRegistro(){
        try{ 
            String id_cliente=this.jtf_id_cliente_cl.getText(); 
           st.executeUpdate("delete from cliente where id_cliente='"+ id_cliente+"';");
           Conectar();
           this.deshabilitarjtables();
           this.deshabilitarbuttons();
           this.habilitar();
           this.primerRegistro();

       } catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 
    }
        
        
       private void modificarRegistro(){
                try{ 
            String id_cliente=this.jtf_id_cliente_cl.getText(); 
            String nombre=this.jtf_nombre_cl.getText(); 
            String apellidos=this.jtf_apellidos_cl.getText(); 
            String rfc=this.jtf_rfc_cl.getText(); 
            String direccion=this.jtf_direccion_cl.getText(); 
            String telefono=this.jtf_telefono_cl.getText(); 
            String correo=this.jtf_correo_cl.getText();
            
           st.executeUpdate("update cliente set nombre='"+nombre+"', apellidos='"+apellidos+"', rfc='"+rfc+"',direccion='"+direccion+"',telefono='"+telefono+"',correo='"+correo+"' where id_cliente='"+id_cliente+"';");
           this.Conectar();
           this.deshabilitarjtables();
           this.deshabilitarbuttons();
           this.habilitar();
           this.primerRegistro();

       } catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
        }
        
    }
       
       private void deshabilitarjtables(){
        
        jtf_id_cliente_cl.setEnabled(false);
        jtf_nombre_cl.setEnabled(false);
        jtf_apellidos_cl.setEnabled(false);
        jtf_rfc_cl.setEnabled(false);
        jtf_direccion_cl.setEnabled(false);
        jtf_telefono_cl.setEnabled(false);
        jtf_correo_cl.setEnabled(false);
}
    private void habilitarjtables(){
        jtf_id_cliente_cl.setEnabled(true);
        jtf_nombre_cl.setEnabled(true);
        jtf_apellidos_cl.setEnabled(true);
        jtf_rfc_cl.setEnabled(true);
        jtf_direccion_cl.setEnabled(true);
        jtf_telefono_cl.setEnabled(true);
        jtf_correo_cl.setEnabled(true);
        
}
    private void habilitarbuttons(){
        jb_primero_cl.setEnabled(true);
        jb_siguiente_cl.setEnabled(true);
        jb_anterior_cl.setEnabled(true);
        jb_ultimo_cl.setEnabled(true);
        jb_cancelar_cl.setEnabled(true);
        jb_guardar_cl.setEnabled(true);
        jb_eliminar_cl.setEnabled(true);
        jb_modificar_cl.setEnabled(true);
        jb_agregar_cl.setEnabled(true);
}   
    private void deshabilitarbuttons(){
        jb_primero_cl.setEnabled(false);
        jb_siguiente_cl.setEnabled(false);
        jb_anterior_cl.setEnabled(false);
        jb_ultimo_cl.setEnabled(false);
        jb_cancelar_cl.setEnabled(false);
        jb_guardar_cl.setEnabled(false);
        jb_eliminar_cl.setEnabled(false);
        jb_modificar_cl.setEnabled(false);
        jb_agregar_cl.setEnabled(false);
}
    private void habilitar(){
        jb_primero_cl.setEnabled(true);
        jb_siguiente_cl.setEnabled(true);
        jb_anterior_cl.setEnabled(true);
        jb_ultimo_cl.setEnabled(true);
        jb_agregar_cl.setEnabled(true);
        jb_modificar_cl.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_regresa_cl;
    private javax.swing.JButton jB_regresar_ti_cl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_tabla_cl;
    private javax.swing.JButton jb_agregar_cl;
    private javax.swing.JButton jb_anterior_cl;
    private javax.swing.JButton jb_cancelar_cl;
    private javax.swing.JButton jb_editar_cl;
    private javax.swing.JButton jb_eliminar_cl;
    private javax.swing.JButton jb_guardar_cl;
    private javax.swing.JButton jb_modificar_cl;
    private javax.swing.JButton jb_primero_cl;
    private javax.swing.JButton jb_siguiente_cl;
    private javax.swing.JButton jb_ultimo_cl;
    private javax.swing.JLabel jl_apellidos_cl;
    private javax.swing.JLabel jl_correo_cl;
    private javax.swing.JLabel jl_direccion_cl;
    private javax.swing.JLabel jl_id_cliente_cl;
    private javax.swing.JLabel jl_nombre_cl;
    private javax.swing.JLabel jl_rfc_cl;
    private javax.swing.JLabel jl_telefono_cl;
    private javax.swing.JTextField jtf_apellidos_cl;
    private javax.swing.JTextField jtf_correo_cl;
    private javax.swing.JTextField jtf_direccion_cl;
    private javax.swing.JTextField jtf_id_cliente_cl;
    private javax.swing.JTextField jtf_nombre_cl;
    private javax.swing.JTextField jtf_rfc_cl;
    private javax.swing.JTextField jtf_telefono_cl;
    // End of variables declaration//GEN-END:variables
}
