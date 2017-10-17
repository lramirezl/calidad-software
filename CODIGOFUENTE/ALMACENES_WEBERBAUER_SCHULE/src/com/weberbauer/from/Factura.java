package com.weberbauer.from;

import com.weberbauer.utils.calendarioFactura;
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

public class Factura extends javax.swing.JFrame {

    private calendarioFactura calendario;
    public Vector vClie;
    public Vector colNames;
    public ArrayList ct;
    public ArrayList lCli;
    public int N;
    GestorBD objGBD;

    public Factura() {
        initComponents();
        calendario = new calendarioFactura(this);
        jTable1.setSelectionForeground(Color.RED);
        jTable1.setSelectionBackground(Color.lightGray);
        setTitle("FACTURA");
        objGBD = new GestorBD();
        objGBD.conectar();
        lCli = objGBD.listaTabla("proveedor_general");
        llenarComboC(lCli);

        colNames = new Vector();
        colNames.add("FECHA");
        colNames.add("PERIODO");
        colNames.add("RAZON SOCIAL");
        colNames.add("RUC");
        colNames.add("TIPO");
        colNames.add("DOCUMENTO");
        colNames.add("TOTAL S/");
        colNames.add("TOTAL $");
        colNames.add("");
        
        txtCDolares.disable();
        txtRuc.disable();
        txtFecha_factura.disable();
        txtPeriodo.disable();
        txtTipo.disable();
        txtDocumento.disable();
        txtCSoles.disable();
        txtCDolares.setText("");
        txtRuc.setText("");
        txtFecha_factura.setText("");
        txtPeriodo.setText("");
        txtTipo.setText("");
        txtDocumento.setText("");
        txtCSoles.setText("");
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        mostrarTabla();
        txtPos.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha_factura = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        btnFecha = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jCNombre = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtCDolares = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCSoles = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(149, 149, 95));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("FECHA :");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("PERIODO : ");

        txtFecha_factura.setBackground(new java.awt.Color(240, 234, 171));
        txtFecha_factura.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtFecha_factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPeriodo.setBackground(new java.awt.Color(240, 234, 171));
        txtPeriodo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnFecha.setText("fecha");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel16.setText("RUC :");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setText("PROVEEDOR : ");

        txtRuc.setBackground(new java.awt.Color(240, 234, 171));
        txtRuc.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtRuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCNombre.setBackground(new java.awt.Color(140, 224, 235));
        jCNombre.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        jCNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNombreActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14)
                            .add(jLabel6))
                        .add(30, 30, 30))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jCNombre, 0, 281, Short.MAX_VALUE)
                    .add(txtRuc)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtFecha_factura)
                            .add(txtPeriodo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnFecha, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtFecha_factura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .add(15, 15, 15)
                        .add(txtPeriodo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(btnFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel14))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtRuc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel16))
                .addContainerGap(61, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .add(jLabel6)
                .add(119, 119, 119))
        );

        jPanel1.setBackground(new java.awt.Color(149, 149, 95));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "UNIDAD DE MEDIDA", "CANTIDAD", "PRECIO", "TOTAL", "nullhbh", "nullnhbh", "nulln n ", "nullhvhb", "null b", "Title 11"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(300);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(500);
        }

        btnNuevo.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo1.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        btnNuevo1.setText("FACTURA");
        btnNuevo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(btnNuevo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 131, Short.MAX_VALUE)
                        .add(btnNuevo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnModificar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnGuardar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnEliminar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(72, 72, 72)
                        .add(btnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSalir)
                    .add(btnGuardar)
                    .add(btnNuevo)
                    .add(btnModificar)
                    .add(btnCancelar)
                    .add(btnEliminar)
                    .add(btnNuevo1))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(149, 149, 95));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtCDolares.setBackground(new java.awt.Color(240, 234, 171));
        txtCDolares.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtCDolares.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCDolaresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("TOTAL EN DOLARES :");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("TOTAL EN SOLES :");

        txtCSoles.setBackground(new java.awt.Color(240, 234, 171));
        txtCSoles.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtCSoles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDocumento.setBackground(new java.awt.Color(240, 234, 171));
        txtDocumento.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("DOCUMENTO :");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("TIPO :");

        txtTipo.setBackground(new java.awt.Color(240, 234, 171));
        txtTipo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel9)
                    .add(jLabel8)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                        .add(jLabel7)
                        .add(85, 85, 85)))
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtCDolares)
                    .add(txtCSoles)
                    .add(txtDocumento)
                    .add(txtTipo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(txtTipo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtCSoles, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtCDolares, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("REGISTRAR FACTURA");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel23.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel24.setText("RUC. :    20117356575");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel25.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/Logo_chiko.png"))); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPos.setText("posicion ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel20)
                            .add(jLabel22)
                            .add(jLabel24)
                            .add(jLabel25)
                            .add(jLabel23))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 446, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel26)
                            .add(layout.createSequentialGroup()
                                .add(txtPos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(84, 84, 84)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel20)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel22)
                        .add(13, 13, 13)
                        .add(jLabel23)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel24)
                            .add(txtPos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(11, 11, 11)
                        .add(jLabel25))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel26)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int ind = jTable1.getSelectedRow();
        Vector n = (Vector) vClie.get(ind);
        txtFecha_factura.setText(n.get(0).toString());
        txtPeriodo.setText(n.get(1).toString());
        jCNombre.setSelectedItem(n.get(2).toString());
        txtRuc.setText(n.get(3).toString());
        txtTipo.setText(n.get(4).toString());
        txtDocumento.setText(n.get(5).toString());
        txtCSoles.setText(n.get(6).toString());
        txtCDolares.setText(n.get(7).toString());
        txtPos.setText(n.get(8).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        txtTipo.enable();
        txtDocumento.enable();
        txtCSoles.enable();
        txtCDolares.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtFecha_factura.setText("");
        txtPeriodo.setText("");
        txtTipo.setText("");
        txtDocumento.setText("");
        txtCSoles.setText("");
        txtCDolares.setText("");
        txtTipo.requestFocus();
        N = 1;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        txtTipo.enable();
        txtDocumento.enable();
        txtCSoles.enable();
        txtCDolares.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtTipo.requestFocus();
        N = 0;
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if(txtFecha_factura.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "ingrese la frecha");
            btnFecha.requestFocus();
        }
        else if(txtRuc.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "seleccione un proveedor");
            jCNombre.requestFocus();
        }
        else if(txtTipo.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "seleccione un proveedor");
            txtTipo.requestFocus();
        }
        else if(txtDocumento.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "seleccione un proveedor");
            txtDocumento.requestFocus();
        }
        else if(txtCSoles.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "seleccione un proveedor");
            txtCSoles.requestFocus();
        }
        else if(txtCDolares.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "seleccione un proveedor");
            txtCDolares.requestFocus();
        }
        else
        {
        String sql;
        int pos=0;
        pos=contadorPosiciones()+1;
            if(N==1){
               sql="insert into factura values('"+
                        txtFecha_factura.getText() + "','"+
                        txtPeriodo.getText()+"','"+
                        String.valueOf(jCNombre.getSelectedItem())+"','"+
                        txtRuc.getText()+"','"+
                        txtTipo.getText() + "','"+
                        txtDocumento.getText()+"',"+
                        txtCSoles.getText()+","+
                        txtCDolares.getText()+","+pos+")";
                objGBD.insertar(sql);
                txtCDolares.setText("");
                txtRuc.setText("");
                txtFecha_factura.setText("");
                txtPeriodo.setText("");
                txtTipo.setText("");
                txtDocumento.setText("");
                txtCSoles.setText("");
            }
            else
            {
                sql="update factura set fecha_pro='"+txtFecha_factura.getText()+"',"+
                        "periodo='"+txtPeriodo.getText()+"', " +
                        "razon_social='"+jCNombre.getSelectedItem()+"',"+
                        "ruc='"+txtRuc.getText()+"',"+
                        "tipo='"+txtTipo.getText()+"',"+
                        "documento='"+txtDocumento.getText()+"',"+
                        "total_soles="+txtCSoles.getText()+","+
                        "total_dolares="+txtCDolares.getText()+
                        " where pos="+txtPos.getText();
                objGBD.insertar(sql);                
                txtCDolares.setText("");
                txtRuc.setText("");
                txtFecha_factura.setText("");
                txtPeriodo.setText("");
                txtTipo.setText("");
                txtDocumento.setText("");
                txtCSoles.setText("");
         }
        }
          mostrarTabla();
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    public int contadorPosiciones(){
      int posicion = 0;
      String sql="select max(pos) from factura";
       ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    return posicion;
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtRuc.disable();
        txtTipo.disable();
        txtDocumento.disable();
        txtCSoles.disable();
        txtCDolares.disable();
        txtRuc.setText("");
        txtFecha_factura.setText("");
        txtPeriodo.setText("");
        txtTipo.setText("");
        txtDocumento.setText("");
        txtCSoles.setText("");
        txtCDolares.setText("");
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void txtCDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCDolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCDolaresActionPerformed

    private void jCNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNombreActionPerformed

        int ind = jCNombre.getSelectedIndex();
        if (ind >= 0) {
            ct = (ArrayList) lCli.get(ind);
            txtRuc.setText(ct.get(1).toString());
        }

    }//GEN-LAST:event_jCNombreActionPerformed

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed

    calendario.setVisible(true);
    String f = txtFecha_factura.getText();
    String m = txtPeriodo.getText();
    setSelectedDateEntradaFecha(f);
    setSelectedDateSalidaMes(m);


    }//GEN-LAST:event_btnFechaActionPerformed

    public void setSelectedDateEntradaFecha(String f){
    txtFecha_factura.setText(f);
    }

    public void setSelectedDateSalidaMes(String m){
     txtPeriodo.setText(m);
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int eliminar = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ", "DEPARTAMENTO DE LOGISTICA", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(eliminar==0)
        {
            String sql1 = "delete from factura where " +
                    "fecha_pro='"+txtFecha_factura.getText()+"' and periodo='"+txtPeriodo.getText()+"' " +
                    "and  razon_social = '"+jCNombre.getSelectedItem()+"' and ruc = '"+txtRuc.getText()+"' " +
                    "and tipo = '"+txtTipo.getText()+"'  and documento = '"+txtDocumento.getText()+"' and pos="+txtPos.getText()+"";
            objGBD.consultar(sql1);
            mostrarTabla();
        }
        else if(eliminar==1){}
        
    }//GEN-LAST:event_btnEliminarActionPerformed


    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed

        lCli = objGBD.listaTabla("proveedor_general");
        llenarComboC(lCli);
        mostrarTabla();

    }//GEN-LAST:event_btnNuevo1ActionPerformed

    void mostrarTabla(){
        vClie =  objGBD.vectorConsulta("select * from factura order by len(pos), pos");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
       jTable1.setModel(model);
      // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       jTable1.getColumnModel().getColumn(0).setMaxWidth(70); //fecha factura-
       jTable1.getColumnModel().getColumn(1).setMaxWidth(65); //periodo-
       jTable1.getColumnModel().getColumn(2).setMinWidth(100); //razon social
       jTable1.getColumnModel().getColumn(3).setMaxWidth(80); //ruc-
       jTable1.getColumnModel().getColumn(4).setMinWidth(100); //tipo
       jTable1.getColumnModel().getColumn(5).setMinWidth(100); //documento
       jTable1.getColumnModel().getColumn(6).setMaxWidth(70); //total soles-
       jTable1.getColumnModel().getColumn(7).setMaxWidth(70); //total dolares-
       jTable1.getColumnModel().getColumn(8).setMaxWidth(20); //pos-
               //agrandar el ancho de las filas
        jTable1.setRowHeight(18);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(tcr);//fecha
        jTable1.getColumnModel().getColumn(1).setCellRenderer(tcr);//periodo
        jTable1.getColumnModel().getColumn(3).setCellRenderer(tcr);//ruc
        jTable1.getColumnModel().getColumn(6).setCellRenderer(tcr);//total soles
        jTable1.getColumnModel().getColumn(7).setCellRenderer(tcr);//total dolares
    }
    public void llenarComboC(ArrayList al){
        jCNombre.removeAllItems();
        for(int i=0;i<al.size();i++){
         ct = (ArrayList) al.get(i);
         jCNombre.addItem(ct.get(2));
         //txtRuc.setText(ct.get(1).toString());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox jCNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCDolares;
    private javax.swing.JTextField txtCSoles;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFecha_factura;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

}
