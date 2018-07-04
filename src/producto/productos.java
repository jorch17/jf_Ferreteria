
package producto;
import java.sql.DriverManager; 
import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import principal.Inicio;

public final class productos extends javax.swing.JFrame {
    Inicio jF_inicio;
    int contador = 0;
    private Connection conexion;     
    private Statement st;     
    private ResultSet rs;
    
    public productos() {
        initComponents();
    }
    public productos(Inicio jF_inicio){
        initComponents();
        Conectar();
        //agregarItem();
        this.jF_inicio = jF_inicio;
        //this.llenarComboProductos();
    }
    void tituloTabla(){
        DefaultTableModel modelo =  new DefaultTableModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Descrpcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Unidad");
        modelo.addColumn("Contenido");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Stock");
        modelo.addColumn("Existencia");
        jT_tabla_pd.setModel(modelo);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_id_producto_pd = new javax.swing.JLabel();
        jtf_id_producto_pd = new javax.swing.JTextField();
        jl_descripcion_pd = new javax.swing.JLabel();
        jl_marca_pd = new javax.swing.JLabel();
        jtf_marca_pd = new javax.swing.JTextField();
        jl_compra_pd = new javax.swing.JLabel();
        jtf_compra_pd = new javax.swing.JTextField();
        jl_venta_pd = new javax.swing.JLabel();
        jtf_venta_pd = new javax.swing.JTextField();
        jl_unidad_pd = new javax.swing.JLabel();
        jtf_unidad_pd = new javax.swing.JTextField();
        jl_contenido_pd = new javax.swing.JLabel();
        jtf_contenido_pd = new javax.swing.JTextField();
        jl_stock_pd = new javax.swing.JLabel();
        jtf_stock_pd = new javax.swing.JTextField();
        jl_existencia_pd = new javax.swing.JLabel();
        jtf_existencia_pd = new javax.swing.JTextField();
        jb_primero_pd = new javax.swing.JButton();
        jb_anterior_pd = new javax.swing.JButton();
        jb_siguiente_pd = new javax.swing.JButton();
        jb_ultimo_pd = new javax.swing.JButton();
        jb_agregar_pd = new javax.swing.JButton();
        jb_eliminar_pd = new javax.swing.JButton();
        jb_modificar_pd = new javax.swing.JButton();
        jb_guardar_pd = new javax.swing.JButton();
        jb_cancelar_pd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tabla_pd = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jB_regresa_pd = new javax.swing.JButton();
        jB_regresar_ti_pd = new javax.swing.JButton();
        jtf_descripcion_pd = new javax.swing.JTextField();
        jb_editar_pd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos");

        jl_id_producto_pd.setText("Id_producto :");

        jl_descripcion_pd.setText("Descripcion :");

        jl_marca_pd.setText("Marca :");
        jl_marca_pd.setToolTipText("");

        jl_compra_pd.setText("Precio Compra :");

        jl_venta_pd.setText("Precio Venta :");

        jl_unidad_pd.setText("Unidad Medida :");

        jl_contenido_pd.setText("Contenido :");

        jl_stock_pd.setText("Stock Minimo :");

        jl_existencia_pd.setText("Existencia :");

        jb_primero_pd.setText("|<");
        jb_primero_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_primero_pdMouseClicked(evt);
            }
        });

        jb_anterior_pd.setText("<<");
        jb_anterior_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_anterior_pdMouseClicked(evt);
            }
        });

        jb_siguiente_pd.setText(">>");
        jb_siguiente_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguiente_pdMouseClicked(evt);
            }
        });

        jb_ultimo_pd.setText(">|");
        jb_ultimo_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ultimo_pdMouseClicked(evt);
            }
        });

        jb_agregar_pd.setText("Agregar");
        jb_agregar_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_pdMouseClicked(evt);
            }
        });

        jb_eliminar_pd.setText("Eliminar");
        jb_eliminar_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminar_pdMouseClicked(evt);
            }
        });

        jb_modificar_pd.setText("Modificar");
        jb_modificar_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificar_pdMouseClicked(evt);
            }
        });

        jb_guardar_pd.setText("Guardar");
        jb_guardar_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardar_pdMouseClicked(evt);
            }
        });

        jb_cancelar_pd.setText("Cancelar");
        jb_cancelar_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cancelar_pdMouseClicked(evt);
            }
        });

        jT_tabla_pd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Categoria", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jT_tabla_pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_tabla_pdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_tabla_pd);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jB_regresa_pd.setBackground(new java.awt.Color(102, 102, 255));
        jB_regresa_pd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1.png"))); // NOI18N
        jB_regresa_pd.setBorder(null);
        jB_regresa_pd.setBorderPainted(false);
        jB_regresa_pd.setContentAreaFilled(false);
        jB_regresa_pd.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1 (copia).png"))); // NOI18N
        jB_regresa_pd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1 (otra copia).png"))); // NOI18N
        jB_regresa_pd.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home1 (otra copia).png"))); // NOI18N
        jB_regresa_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_regresa_pdActionPerformed(evt);
            }
        });

        jB_regresar_ti_pd.setBackground(new java.awt.Color(0, 0, 0));
        jB_regresar_ti_pd.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        jB_regresar_ti_pd.setForeground(new java.awt.Color(255, 255, 255));
        jB_regresar_ti_pd.setText("ZINNIA");
        jB_regresar_ti_pd.setContentAreaFilled(false);
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
                .addGap(299, 299, 299)
                .addComponent(jB_regresa_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jB_regresar_ti_pd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_regresa_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jb_editar_pd.setText("Editar");
        jb_editar_pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editar_pdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_venta_pd)
                            .addGap(4, 4, 4)
                            .addComponent(jtf_venta_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jl_compra_pd)
                            .addGap(2, 2, 2)
                            .addComponent(jtf_compra_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jl_descripcion_pd)
                                .addComponent(jl_marca_pd))
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_marca_pd)
                                .addComponent(jtf_descripcion_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_id_producto_pd)
                            .addGap(2, 2, 2)
                            .addComponent(jtf_id_producto_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_stock_pd)
                            .addComponent(jl_existencia_pd))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_existencia_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_stock_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_unidad_pd)
                            .addComponent(jl_contenido_pd))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_contenido_pd)
                            .addComponent(jtf_unidad_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_guardar_pd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_cancelar_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb_agregar_pd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb_primero_pd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb_anterior_pd))
                                    .addComponent(jb_eliminar_pd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_siguiente_pd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_ultimo_pd))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jb_editar_pd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_modificar_pd, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_unidad_pd)
                            .addComponent(jtf_unidad_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_contenido_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_contenido_pd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_stock_pd)
                            .addComponent(jtf_stock_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_existencia_pd)
                            .addComponent(jtf_existencia_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_id_producto_pd)
                                    .addComponent(jtf_id_producto_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_descripcion_pd)
                                    .addComponent(jtf_descripcion_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_marca_pd)
                                    .addComponent(jtf_marca_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtf_compra_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jl_venta_pd)
                                            .addComponent(jtf_venta_pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jl_compra_pd)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb_primero_pd)
                                    .addComponent(jb_anterior_pd)
                                    .addComponent(jb_siguiente_pd)
                                    .addComponent(jb_ultimo_pd))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb_editar_pd)
                                    .addComponent(jb_agregar_pd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb_modificar_pd)
                                    .addComponent(jb_eliminar_pd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_cancelar_pd)
                                    .addComponent(jb_guardar_pd))))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_siguiente_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_siguiente_pdMouseClicked
        siguienteRegistro();
    }//GEN-LAST:event_jb_siguiente_pdMouseClicked

    private void jb_anterior_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_anterior_pdMouseClicked
        registroAnterior();
    }//GEN-LAST:event_jb_anterior_pdMouseClicked

    private void jb_primero_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_primero_pdMouseClicked
        primerRegistro();
    }//GEN-LAST:event_jb_primero_pdMouseClicked

    private void jb_ultimo_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ultimo_pdMouseClicked
        ultimoRegistro();
    }//GEN-LAST:event_jb_ultimo_pdMouseClicked

    private void jb_guardar_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardar_pdMouseClicked
        String descripcion=this.jtf_descripcion_pd.getText();
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea guardar producto" +descripcion+"", "Guardar producto", JOptionPane.INFORMATION_MESSAGE, JOptionPane.ERROR_MESSAGE);
        if(JOptionPane.OK_OPTION==confirmar){
        JOptionPane.showMessageDialog(null, "Se ha guardado el producto(" +descripcion+")", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        guardarRegistro();}
    }//GEN-LAST:event_jb_guardar_pdMouseClicked

    private void jb_agregar_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_pdMouseClicked
        agregarRegistro();
    }//GEN-LAST:event_jb_agregar_pdMouseClicked

    private void jb_eliminar_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminar_pdMouseClicked
        String descripcion=this.jtf_descripcion_pd.getText();
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea eliminar el producto " +descripcion+"", "Eliminar producto", JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);
        if(JOptionPane.OK_OPTION==confirmar){
        JOptionPane.showMessageDialog(null, "Se ha eliminado el producto(" +descripcion+")", "Eliminado", JOptionPane.WARNING_MESSAGE);
        borrarRegistro();}
        else{
        }
    }//GEN-LAST:event_jb_eliminar_pdMouseClicked

    private void jb_modificar_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificar_pdMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "Desea modificar este registro", "Modificar producto", JOptionPane.YES_OPTION);
        if(JOptionPane.OK_OPTION==confirmar)
        modificarRegistro();
    }//GEN-LAST:event_jb_modificar_pdMouseClicked

    private void jb_cancelar_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cancelar_pdMouseClicked
        cancelarRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelar_pdMouseClicked

    private void jB_regresa_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_regresa_pdActionPerformed
        jF_inicio.setVisible(true);
        jF_inicio.setTitle("ZINNIA");
        jF_inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_regresa_pdActionPerformed

    private void jB_regresar_ti_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_regresar_ti_pdActionPerformed
        jF_inicio.setVisible(true);
        jF_inicio.setTitle("ZINNIA");
        jF_inicio.setLocationRelativeTo(null);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_regresar_ti_pdActionPerformed

    private void jT_tabla_pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_tabla_pdMouseClicked
            jb_primero_pd.setEnabled(false);
            jb_siguiente_pd.setEnabled(false);
            jb_anterior_pd.setEnabled(false);
            jb_ultimo_pd.setEnabled(false);
            jb_cancelar_pd.setEnabled(true);
            localiza();
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_tabla_pdMouseClicked

    private void jb_editar_pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editar_pdActionPerformed
        editarRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_editar_pdActionPerformed
      
    /*
    private void llenarComboProductos(){
        try{ 
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/Ferre","root","SOCIALempireS20");                     
            st=conexion.createStatement();  
            jcb_combo_buscar.removeAllItems();
            rs=st.executeQuery("select * from producto;");
            while(rs.next()){
                this.jcb_combo_buscar.addItem(rs.getString("descripcion"));
            }
            contador++;
           }catch(SQLException err){ 
                JOptionPane.showMessageDialog(null,"Error 1"+err.getMessage()); 
            } 
    }*/
    
    private void localiza(){
        try {             
        int seleccion = jT_tabla_pd.getSelectedRow();
        jtf_id_producto_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,0)));
        jtf_descripcion_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,1)));
        jtf_marca_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,2)));
        jtf_unidad_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,3)));
        jtf_contenido_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,4)));
        jtf_compra_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,5)));
        jtf_venta_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,6)));
        jtf_stock_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,7)));
        jtf_existencia_pd.setText(String.valueOf(jT_tabla_pd.getValueAt(seleccion,8)));
        rs=st.executeQuery("Select * from producto;");  
        jT_tabla_pd.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());   
        }
    } 
  
    public void Conectar(){
         try{ 
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/Ferre","root","151617");                     
            st=conexion.createStatement(); 
            this.tituloTabla();
            rs=st.executeQuery("Select * from producto;");      
            jT_tabla_pd.setModel(DbUtils.resultSetToTableModel(rs));
            rs=st.executeQuery("Select * from producto;");
            rs.next(); 
                this.jtf_id_producto_pd.setText(rs.getString("id_producto"));                         
                this.jtf_descripcion_pd.setText(rs.getString("descripcion"));             
                this.jtf_marca_pd.setText(rs.getString("marca"));
                this.jtf_compra_pd.setText(rs.getString("precio_compra")); 
                this.jtf_venta_pd.setText(rs.getString("precio_venta")); 
                this.jtf_unidad_pd.setText(rs.getString("unidad_medida")); 
                this.jtf_contenido_pd.setText(rs.getString("contenido")); 
                this.jtf_stock_pd.setText(rs.getString("stock_minimo")); 
                this.jtf_existencia_pd.setText(rs.getString("existencia")); 
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
        this.jtf_id_producto_pd.setText(rs.getString("id_producto"));                
        this.jtf_descripcion_pd.setText(rs.getString("descripcion"));             
        this.jtf_marca_pd.setText(rs.getString("marca"));
        this.jtf_compra_pd.setText(rs.getString("precio_compra")); 
        this.jtf_venta_pd.setText(rs.getString("precio_venta")); 
        this.jtf_unidad_pd.setText(rs.getString("unidad_medida")); 
        this.jtf_contenido_pd.setText(rs.getString("contenido")); 
        this.jtf_stock_pd.setText(rs.getString("stock_minimo")); 
        this.jtf_existencia_pd.setText(rs.getString("existencia"));            
        } 
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}
    
    private void registroAnterior(){    
    try{  
        if(rs.isFirst()==false) {                 
            rs.previous();                 
        this.jtf_id_producto_pd.setText(rs.getString("id_producto"));                
        this.jtf_descripcion_pd.setText(rs.getString("descripcion"));             
        this.jtf_marca_pd.setText(rs.getString("marca"));
        this.jtf_compra_pd.setText(rs.getString("precio_compra")); 
        this.jtf_venta_pd.setText(rs.getString("precio_venta")); 
        this.jtf_unidad_pd.setText(rs.getString("unidad_medida")); 
        this.jtf_contenido_pd.setText(rs.getString("contenido")); 
        this.jtf_stock_pd.setText(rs.getString("stock_minimo")); 
        this.jtf_existencia_pd.setText(rs.getString("existencia"));             
        } 
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}
    
    private void primerRegistro(){    
    try{ 
        if(rs.isFirst()==false) {                 
            rs.first();                 
        this.jtf_id_producto_pd.setText(rs.getString("id_producto"));                
        this.jtf_descripcion_pd.setText(rs.getString("descripcion"));             
        this.jtf_marca_pd.setText(rs.getString("marca"));
        this.jtf_compra_pd.setText(rs.getString("precio_compra")); 
        this.jtf_venta_pd.setText(rs.getString("precio_venta")); 
        this.jtf_unidad_pd.setText(rs.getString("unidad_medida")); 
        this.jtf_contenido_pd.setText(rs.getString("contenido")); 
        this.jtf_stock_pd.setText(rs.getString("stock_minimo")); 
        this.jtf_existencia_pd.setText(rs.getString("existencia"));             
        }         
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}
            
    private void ultimoRegistro(){    
    try{  
        if(rs.isLast()==false) {                 
            rs.last();                 
        this.jtf_id_producto_pd.setText(rs.getString("id_producto"));                
        this.jtf_descripcion_pd.setText(rs.getString("descripcion"));             
        this.jtf_marca_pd.setText(rs.getString("marca"));
        this.jtf_compra_pd.setText(rs.getString("precio_compra")); 
        this.jtf_venta_pd.setText(rs.getString("precio_venta")); 
        this.jtf_unidad_pd.setText(rs.getString("unidad_medida")); 
        this.jtf_contenido_pd.setText(rs.getString("contenido")); 
        this.jtf_stock_pd.setText(rs.getString("stock_minimo")); 
        this.jtf_existencia_pd.setText(rs.getString("existencia"));           
        }         
    }catch(SQLException err) {             
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());         
    }     
}
    
    private void agregarRegistro(){
            jtf_compra_pd.setText("");
            jtf_contenido_pd.setText("");
            jtf_descripcion_pd.setText("");
            jtf_existencia_pd.setText("");
            jtf_id_producto_pd.setText("");
            jtf_marca_pd.setText("");
            jtf_stock_pd.setText("");
            jtf_unidad_pd.setText("");
            jtf_venta_pd.setText("");
            this.habilitarjtables();
            this.deshabilitarbuttons();
            jb_cancelar_pd.setEnabled(true);
            jb_guardar_pd.setEnabled(true);
    }
        
    private void guardarRegistro() {      
       try{ 
            
            String id_producto=this.jtf_id_producto_pd.getText(); 
            String descripcion=this.jtf_descripcion_pd.getText(); 
            String marca=this.jtf_marca_pd.getText(); 
            String precio_compra=this.jtf_compra_pd.getText(); 
            String precio_venta=this.jtf_venta_pd.getText(); 
            String unidad_medida=this.jtf_unidad_pd.getText(); 
            String contenido=this.jtf_contenido_pd.getText(); 
            String stock_minimo=this.jtf_stock_pd.getText(); 
            String existencia=this.jtf_existencia_pd.getText(); 
            
            st.executeUpdate("Insert into producto (id_producto,descripcion,marca,precio_compra,precio_venta,unidad_medida,contenido,stock_minimo,existencia)"+"values('"+ id_producto+"','"+descripcion+"','"+marca+"','"+precio_compra+"','"+precio_venta+"','"+unidad_medida+"','"+contenido+"','"+stock_minimo+"','"+existencia+"');"); 
            this.Conectar();  
            this.deshabilitarjtables();
            this.deshabilitarbuttons();
            this.habilitar();
        } catch(SQLException err)         { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 

    } 
    private void editarRegistro(){
            Conectar();               
            this.habilitarjtables();
            this.habilitarbuttons();
            jb_guardar_pd.setEnabled(false);            
            jb_editar_pd.setEnabled(false);
            jb_agregar_pd.setEnabled(false);
       
    }
    private void cancelarRegistro(){
            Conectar();
            this.deshabilitarjtables();
            this.deshabilitarbuttons();
            this.habilitar();
    }
    
    private void borrarRegistro(){
        try{ 
            String id_producto=this.jtf_id_producto_pd.getText(); 
            st.executeUpdate("delete from producto where id_producto='"+ id_producto+"';");
            Conectar();
            this.deshabilitarjtables();
            this.deshabilitarbuttons();
            this.habilitar();
       } catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 
    }
    
    private void modificarRegistro(){
    try{ 
            String descripcion=this.jtf_descripcion_pd.getText(); 
            String marca=this.jtf_marca_pd.getText(); 
            String precio_compra=this.jtf_compra_pd.getText(); 
            String precio_venta=this.jtf_venta_pd.getText(); 
            String unidad_medida=this.jtf_unidad_pd.getText(); 
            String contenido=this.jtf_contenido_pd.getText(); 
            String stock_minimo=this.jtf_stock_pd.getText(); 
            String existencia=this.jtf_existencia_pd.getText(); 
            String id_producto=this.jtf_id_producto_pd.getText(); 
            st.executeUpdate("update producto set descripcion='"+ descripcion +"', marca='"+ marca +"', precio_compra='"+precio_compra+"',precio_venta='"+precio_venta+"',unidad_medida='"+unidad_medida+"',contenido='"+contenido+"',stock_minimo='"+stock_minimo+"',existencia='"+existencia+"' where id_producto='"+id_producto+"';");
            this.Conectar();
            this.deshabilitarjtables();
            this.deshabilitarbuttons();
            this.habilitar();
       } catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
        }
        
    }
    
    private void deshabilitarjtables(){
        
        jtf_id_producto_pd.setEnabled(false);
        jtf_descripcion_pd.setEnabled(false);
        jtf_marca_pd.setEnabled(false);
        jtf_compra_pd.setEnabled(false);
        jtf_venta_pd.setEnabled(false);
        jtf_unidad_pd.setEnabled(false);
        jtf_contenido_pd.setEnabled(false);
        jtf_stock_pd.setEnabled(false);
        jtf_existencia_pd.setEnabled(false);
}
    private void habilitarjtables(){
        jtf_id_producto_pd.setEnabled(true);
        jtf_descripcion_pd.setEnabled(true);
        jtf_marca_pd.setEnabled(true);
        jtf_compra_pd.setEnabled(true);
        jtf_venta_pd.setEnabled(true);
        jtf_unidad_pd.setEnabled(true);
        jtf_contenido_pd.setEnabled(true);
        jtf_stock_pd.setEnabled(true);
        jtf_existencia_pd.setEnabled(true);
}
    private void habilitarbuttons(){
        jb_primero_pd.setEnabled(true);
        jb_siguiente_pd.setEnabled(true);
        jb_anterior_pd.setEnabled(true);
        jb_ultimo_pd.setEnabled(true);
        jb_cancelar_pd.setEnabled(true);
        jb_guardar_pd.setEnabled(true);
        jb_eliminar_pd.setEnabled(true);
        jb_modificar_pd.setEnabled(true);
        jb_editar_pd.setEnabled(true);
        jb_agregar_pd.setEnabled(true);
}   
    private void deshabilitarbuttons(){
        jb_primero_pd.setEnabled(false);
        jb_siguiente_pd.setEnabled(false);
        jb_anterior_pd.setEnabled(false);
        jb_ultimo_pd.setEnabled(false);
        jb_cancelar_pd.setEnabled(false);
        jb_guardar_pd.setEnabled(false);
        jb_eliminar_pd.setEnabled(false);
        jb_modificar_pd.setEnabled(false);
        jb_editar_pd.setEnabled(false);
        jb_agregar_pd.setEnabled(false);
}
    private void habilitar(){
        jb_primero_pd.setEnabled(true);
        jb_siguiente_pd.setEnabled(true);
        jb_anterior_pd.setEnabled(true);
        jb_ultimo_pd.setEnabled(true);
        jb_agregar_pd.setEnabled(true);
        jb_editar_pd.setEnabled(true);
    }
    /*private void buscarRegistro(){
           Conectar();
           Conectar2();
           this.primerRegistro();
    }*/
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new productos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_regresa_pd;
    private javax.swing.JButton jB_regresar_ti_pd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_tabla_pd;
    private javax.swing.JButton jb_agregar_pd;
    private javax.swing.JButton jb_anterior_pd;
    private javax.swing.JButton jb_cancelar_pd;
    private javax.swing.JButton jb_editar_pd;
    private javax.swing.JButton jb_eliminar_pd;
    private javax.swing.JButton jb_guardar_pd;
    private javax.swing.JButton jb_modificar_pd;
    private javax.swing.JButton jb_primero_pd;
    private javax.swing.JButton jb_siguiente_pd;
    private javax.swing.JButton jb_ultimo_pd;
    private javax.swing.JLabel jl_compra_pd;
    private javax.swing.JLabel jl_contenido_pd;
    private javax.swing.JLabel jl_descripcion_pd;
    private javax.swing.JLabel jl_existencia_pd;
    private javax.swing.JLabel jl_id_producto_pd;
    private javax.swing.JLabel jl_marca_pd;
    private javax.swing.JLabel jl_stock_pd;
    private javax.swing.JLabel jl_unidad_pd;
    private javax.swing.JLabel jl_venta_pd;
    private javax.swing.JTextField jtf_compra_pd;
    private javax.swing.JTextField jtf_contenido_pd;
    private javax.swing.JTextField jtf_descripcion_pd;
    private javax.swing.JTextField jtf_existencia_pd;
    private javax.swing.JTextField jtf_id_producto_pd;
    private javax.swing.JTextField jtf_marca_pd;
    private javax.swing.JTextField jtf_stock_pd;
    private javax.swing.JTextField jtf_unidad_pd;
    private javax.swing.JTextField jtf_venta_pd;
    // End of variables declaration//GEN-END:variables
}



