
package com.weberbauer.from;

import com.weberbauer.conexion.GestorBD;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {

    public Vector vClie;
    public Vector colNames;
    public int N;
    GestorBD objGBD;

    public Productos() {
        initComponents();
        jTable1.setSelectionForeground(Color.GREEN);
        jTable1.setSelectionBackground(Color.blue);

        setLocationRelativeTo(null);
        setTitle("PRODUCTOS");

        // conectamos a la Base de Datos
        objGBD = new GestorBD();
        objGBD.conectar();

        // tabla
        colNames = new Vector();
        colNames.add("CODIGO");
        colNames.add("PRODUCTO");
        colNames.add("FAMILIA");
        colNames.add("U.M.");

        mostrarTabla();

        //inabilitar los botones y los txtfiel
        txtCodigo.disable();
        txtProducto.disable();
        txtFamilia.disable();
        txtUMedida.disable();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }

   void mostrarTabla()
   {
        vClie = objGBD.vectorTabla("productos order by len(codigo_producto),codigo_producto");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        jTable1.setModel(model);
        //agrandar el ancho de las filas
        jTable1.setRowHeight(17);
        //para darle el tamaño de las columnas
        jTable1.getColumnModel().getColumn(0).setMaxWidth(80); //codigo
        jTable1.getColumnModel().getColumn(1).setMinWidth(150); //producto
        jTable1.getColumnModel().getColumn(2).setMinWidth(150); //familia
        jTable1.getColumnModel().getColumn(3).setMaxWidth(70); //unidad medida
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(tcr);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(tcr);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtFamilia = new javax.swing.JTextField();
        txtUMedida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(232, 129, 73));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnModificar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnEliminar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(42, 42, 42)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setForeground(new java.awt.Color(153, 153, 0));

        txtCodigo.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtProducto.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txtProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        txtFamilia.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txtFamilia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFamiliaActionPerformed(evt);
            }
        });

        txtUMedida.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txtUMedida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUMedidaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        jLabel2.setText("CODIGO : ");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        jLabel1.setText("PRODUCTO : ");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        jLabel3.setText("FAMILIA : ");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        jLabel6.setText("UNIDAD DE MEDIDA : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo)
                    .addComponent(txtFamilia, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUMedida)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtUMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setText("RUC. :    20117356575");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel23.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel13.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("PRODUCTOS");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/Logo_chiko.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel25))
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed


    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFamiliaActionPerformed


    }//GEN-LAST:event_txtFamiliaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //        System.exit(0);
        this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtCodigo.disable();
        txtProducto.disable();
        txtFamilia.disable();
        txtUMedida.disable();
        txtCodigo.setText("");
        txtProducto.setText("");
        txtFamilia.setText("");
        txtUMedida.setText("");
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    public int BuscarCodigo(String cod){

        int cod1=0;
        String sql="SELECT COUNT(codigo)  FROM productos WHERE codigo = '"+cod+"'";
        ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                cod1 = rsnum.getInt(0);
            }
        }
         catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod1;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


        if(txtCodigo.getText().length()==0) {
            JOptionPane.showMessageDialog(this,"ingrese el codigo del producto");
            txtCodigo.requestFocus();
        } else if(txtProducto.getText().length()==0) {
            JOptionPane.showMessageDialog(this,"ingrese el producto");
            txtProducto.requestFocus();
        } else if(txtFamilia.getText().length()==0) {
            JOptionPane.showMessageDialog(this,"ingrese la familia del producto");
            txtFamilia.requestFocus();
        } else if(txtUMedida.getText().length()==0) {
            JOptionPane.showMessageDialog(this,"ingrese la unidad de medida del producto");
            txtUMedida.requestFocus();
        } else {
            String codig = txtCodigo.getText();
                   int cantidad = CantidadCodigo(codig);
            if(N==1 )
               {                   
                   if(cantidad == 0)
                   {
                     String sql="insert into productos values('"+
                        txtCodigo.getText()+"','"+txtProducto.getText()+"','"+
                        txtFamilia.getText()+"','"+
                        txtUMedida.getText() + "')";
                      txtCodigo.setText("");
                      txtProducto.setText("");
                      txtFamilia.setText("");
                      txtUMedida.setText("");
                      txtCodigo.requestFocus();
                       objGBD.insertar(sql);
                       mostrarTabla();
                     }
                     else
                     {
                      JOptionPane.showMessageDialog(this, "Codigo existente... ingrese otro codigo : ");
                      }
                }

               else{
                   String sql="update productos set " +
                        "producto='"+txtProducto.getText()+"', " +
                        "familia='"+txtFamilia.getText()+ "', " +
                        "unidad_medida='"+txtUMedida.getText()+"'  where codigo_producto ='"+txtCodigo.getText()+"'";
                txtCodigo.setText("");
                txtProducto.setText("");
                txtFamilia.setText("");
                txtUMedida.setText("");
                txtCodigo.requestFocus();
                objGBD.insertar(sql);
                mostrarTabla();
            }
                
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public int CantidadCodigo(String codigoproducto){
        int StoActual = 0;
        String sql="select count(codigo_producto) from productos where codigo_producto='"+codigoproducto+"'";
        ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                StoActual = rsnum.getInt(1);
            }
        }
         catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return StoActual;
    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        txtProducto.enable();
        txtFamilia.enable();
        txtUMedida.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtProducto.requestFocus();
        txtCodigo.enable();
        N = 0;
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCodigo.enable();
        txtProducto.enable();
        txtFamilia.enable();
        txtUMedida.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(false);
        txtCodigo.setText("");
        txtProducto.setText("");
        txtFamilia.setText("");
        txtUMedida.setText("");
        txtCodigo.requestFocus();
        N = 1;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int ind = jTable1.getSelectedRow();
        Vector n = (Vector) vClie.get(ind);
        txtCodigo.setText(n.get(0).toString());
        txtProducto.setText(n.get(1).toString());
        txtFamilia.setText(n.get(2).toString());
        txtUMedida.setText(n.get(3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int eliminar = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ", "DEPARTAMENTO DE LOGISTICA", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(eliminar==0)
        {
            String cod = txtCodigo.getText();
            String pro = txtProducto.getText();
            String fam = txtFamilia.getText();
            String um = txtUMedida.getText();
            String sql = "delete from productos where codigo_producto='"+cod+"' and producto='"+pro+"'" +
                    " and familia ='"+fam+"' and unidad_medida='"+um+"'";
            objGBD.consultar(sql);
            mostrarTabla();
        }
        else if(eliminar==1)
        {            
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped

    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtUMedidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUMedidaKeyTyped

    }//GEN-LAST:event_txtUMedidaKeyTyped

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtUMedida;
    // End of variables declaration//GEN-END:variables

}
