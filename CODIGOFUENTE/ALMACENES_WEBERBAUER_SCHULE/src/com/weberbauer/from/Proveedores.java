
package com.weberbauer.from;

import com.weberbauer.conexion.GestorBD;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Proveedores extends javax.swing.JFrame {

    public Vector vClie;
    public Vector colNames;
    public int N;
    GestorBD objGBD;

    Menu menu;

    public Proveedores() {
        initComponents();
        //enmarcar las letras de verde
        jTable1.setSelectionForeground(Color.GREEN);
        jTable1.setSelectionBackground(Color.blue);
        //setLocationRelativeTo(null);


        setLocationRelativeTo(null);
        setTitle("PROVEEDORES");

        // conectamos a la Base de Datos
        objGBD = new GestorBD();
        objGBD.conectar();

        // tabla
        colNames = new Vector();
        colNames.add("CODIGO");
        colNames.add("RUC");
        colNames.add("RAZON SOCIAL");
        colNames.add("CATEGORIA");
        colNames.add("TELEFONO");
        colNames.add("DIRECCION");
        colNames.add("EMAIL");

        mostrarTabla();

        //inabilitar los botones y los txtfiel
        txtCodigo.disable();
        txtRuc.disable();
        txtRazonsocial.disable();
        txtCategoria.disable();
        txtTelefono.disable();
        txtDireccion.disable();
        txtEmail.disable();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        //mostrar frames
        menu = new Menu();


    }

   void mostrarTabla()
   {
        vClie = objGBD.vectorTabla("proveedor order by len(codigo),codigo");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        jTable1.setModel(model);
        //para darle el tamaño de las columnas
        jTable1.getColumnModel().getColumn(0).setMaxWidth(60);//codigo
        jTable1.getColumnModel().getColumn(1).setMaxWidth(80);//ruc
        jTable1.getColumnModel().getColumn(2).setMinWidth(100);//razon social
        jTable1.getColumnModel().getColumn(3).setMinWidth(70);//categoria
        jTable1.getColumnModel().getColumn(4).setMaxWidth(100);//telefono
        jTable1.getColumnModel().getColumn(5).setMinWidth(170);//direccion
        jTable1.getColumnModel().getColumn(6).setMinWidth(150);//email
        //agrandar el ancho de las filas
        jTable1.setRowHeight(17);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(tcr);//codigo
        jTable1.getColumnModel().getColumn(1).setCellRenderer(tcr);//ruc
        jTable1.getColumnModel().getColumn(4).setCellRenderer(tcr);//telefono

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
        txtRuc = new javax.swing.JTextField();
        txtRazonsocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
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
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
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
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setForeground(new java.awt.Color(153, 153, 0));

        txtCodigo.setBackground(new java.awt.Color(240, 234, 171));
        txtCodigo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtRuc.setBackground(new java.awt.Color(240, 234, 171));
        txtRuc.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtRuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });

        txtRazonsocial.setBackground(new java.awt.Color(240, 234, 171));
        txtRazonsocial.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtRazonsocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRazonsocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonsocialActionPerformed(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(240, 234, 171));
        txtTelefono.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("CODIGO : ");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("RUC : ");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("RAZON SOCIAL : ");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("CATEGORIA : ");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("TELEFONO : ");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("DIRECCION : ");

        txtDireccion.setBackground(new java.awt.Color(240, 234, 171));
        txtDireccion.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("EMAIL : ");

        txtEmail.setBackground(new java.awt.Color(240, 234, 171));
        txtEmail.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCategoria.setBackground(new java.awt.Color(240, 234, 171));
        txtCategoria.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRazonsocial, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txtCategoria)
                    .addComponent(txtDireccion))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRuc)
                    .addComponent(txtTelefono)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel24.setText("RUC. :    20117356575");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel23.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("PROVEEDORES");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel25.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/otro_logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                        .addComponent(jLabel26))
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed


    }//GEN-LAST:event_txtRucActionPerformed

    private void txtRazonsocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonsocialActionPerformed


    }//GEN-LAST:event_txtRazonsocialActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //        System.exit(0);
        this.setVisible(false);
}//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtCodigo.disable();
        txtRuc.disable();
        txtRazonsocial.disable();
        txtCategoria.disable();
        txtTelefono.disable();
        txtDireccion.disable();
        txtEmail.disable();
        txtCodigo.setText("");
        txtRuc.setText("");
        txtRazonsocial.setText("");
        txtCategoria.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
           
  if(txtCodigo.getText().length()==0)
  {
  JOptionPane.showMessageDialog(this,"ingrese el codigo del proveedor");
  txtCodigo.requestFocus();
  } 
  else if(txtRuc.getText().length()==0)
  {
  JOptionPane.showMessageDialog(this,"ingrese su razzon social del proveedor");
  txtRuc.requestFocus();
  } 
  else if(txtRazonsocial.getText().length()==0)
  {
  JOptionPane.showMessageDialog(this,"ingrese el ruc del proveedor");
  txtRazonsocial.requestFocus();
  } 
  else if(txtCategoria.getText().length()==0)
  {
  JOptionPane.showMessageDialog(this,"ingrese la direccion del proveedor");
  txtCategoria.requestFocus();
  } 
  else if(txtTelefono.getText().length()==0)
  {
  JOptionPane.showMessageDialog(this,"ingrese el Email del proveedor");
  txtTelefono.requestFocus();
  } 
  else
  {
      String codig = txtCodigo.getText();
      int cantidad = CantidadCodigo(codig);
      if(N==1)
      {
          if(cantidad == 0)
          {
          String sql="insert into proveedor values('"+
          txtCodigo.getText()+"','"+txtRuc.getText()+"','"+
          txtRazonsocial.getText()+"','"+
          txtCategoria.getText() + "','"+ txtTelefono.getText()+"','"+
          txtDireccion.getText() + "','"+ txtEmail.getText()+"')";
          String sql1="insert into proveedor_general values('"+
          txtCodigo.getText()+"','"+txtRuc.getText()+"','"+
          txtRazonsocial.getText()+"','"+
          txtCategoria.getText() + "','"+ txtTelefono.getText()+"','"+
          txtDireccion.getText() + "','"+ txtEmail.getText()+"')";
          objGBD.insertar(sql1);
          txtCodigo.setText("");
          txtRuc.setText("");
          txtRazonsocial.setText("");
          txtCategoria.setText("");
          txtTelefono.setText("");
          txtDireccion.setText("");
          txtEmail.setText("");
          txtCodigo.requestFocus();
          objGBD.insertar(sql);
          mostrarTabla();
          }
          else
          {
          JOptionPane.showMessageDialog(this, "Codigo existente... ingrese otro codigo : ");
          }
       }
       else
       {
       String sql="update proveedor set " +
       "ruc='"+txtRuc.getText()+"', " +
       "razon_social='"+txtRazonsocial.getText()+ "', " +
       "categoria='"+txtCategoria.getText()+"', " +
       "telefono='"+txtTelefono.getText()+"', " +
       "direccion='"+txtDireccion.getText()+"', " +
       "email='"+txtEmail.getText()+"' where codigo ='"+txtCodigo.getText()+"'";

       String sql1="update proveedor_general set " +
       "ruc='"+txtRuc.getText()+"', " +
       "razon_social='"+txtRazonsocial.getText()+ "', " +
       "categoria='"+txtCategoria.getText()+"', " +
       "telefono='"+txtTelefono.getText()+"', " +
       "direccion='"+txtDireccion.getText()+"', " +
       "email='"+txtEmail.getText()+"' where codigo ='"+txtCodigo.getText()+"'";
       objGBD.insertar(sql1);
       txtCodigo.setText("");
       txtRuc.setText("");
       txtRazonsocial.setText("");
       txtCategoria.setText("");
       txtTelefono.setText("");
       txtDireccion.setText("");
       txtEmail.setText("");
       txtCodigo.requestFocus();
       objGBD.insertar(sql);
       mostrarTabla();
      
       }
   }    
        
    }//GEN-LAST:event_btnGuardarActionPerformed





    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        txtCodigo.disable();
        txtRuc.enable();
        txtRazonsocial.enable();
        txtCategoria.enable();
        txtTelefono.enable();
        txtDireccion.enable();
        txtEmail.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtCodigo.requestFocus();
        N = 0;

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCodigo.enable();
        txtRuc.enable();
        txtRazonsocial.enable();  
        txtCategoria.enable();
        txtTelefono.enable();
        txtDireccion.enable();
        txtEmail.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(false);
        txtCodigo.setText("");
        txtRuc.setText("");
        txtRazonsocial.setText("");
 
        txtCategoria.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtCodigo.requestFocus();
        N = 1;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int ind = jTable1.getSelectedRow();
        Vector n = (Vector) vClie.get(ind);
        txtCodigo.setText(n.get(0).toString());
        txtRuc.setText(n.get(1).toString());
        txtRazonsocial.setText(n.get(2).toString());
        txtCategoria.setText(n.get(3).toString());
        txtTelefono.setText(n.get(4).toString());
        txtDireccion.setText(n.get(5).toString());
        txtEmail.setText(n.get(6).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed


        int eliminar = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ", "DEPARTAMENTO DE LOGISTICA", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(eliminar==0)
        {
            String cod = txtCodigo.getText();
            String ruc = txtRuc.getText();
            String Rs = txtRazonsocial.getText();
            String tel = txtTelefono.getText();
            String dir = txtDireccion.getText();
            String Ema = txtEmail.getText();
            String cat = txtCategoria.getText();
            String sql = "delete from proveedor where codigo='"+cod+"' and ruc='"+ruc+"' and " +
                    "razon_social='"+Rs+"'and telefono='"+tel+"' and direccion='"+dir+"' and email='"+Ema+"' and categoria='"+cat+"'";
            objGBD.consultar(sql);
            mostrarTabla();
            String sql1 = "delete from proveedor_general where codigo='"+cod+"' and ruc='"+ruc+"' and " +
                    "razon_social='"+Rs+"'and telefono='"+tel+"' and direccion='"+dir+"' and email='"+Ema+"' and categoria='"+cat+"'";
            objGBD.consultar(sql1);
        }
        else if(eliminar==1)
        {

        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    public int CantidadCodigo(String codigoproveedor){
        int StoActual = 0;
        String sql="select count(codigo) from proveedor where codigo='"+codigoproveedor+"'";
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
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtRazonsocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
