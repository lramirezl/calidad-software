package com.weberbauer.from;

import com.weberbauer.utils.calendarioEntrada;
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

public class Entrada extends javax.swing.JFrame {

    private calendarioEntrada calendario;
    public Vector vClie;
    public Vector colNames;
    public ArrayList ct;
    public ArrayList lCli;
    public ArrayList lClp;
    float precio_total;
    float precio_unitario;
    float cantidadIng;
    public int N;
    GestorBD objGBD;
    int ndia = 0;
    int nmes = 0;
    int nano = 0;
    int posnor=0;
    String sql;
    float cantidadModificar=0;
    GestorBD con;
    GestorBD conGraficas;


    public Entrada() {
        initComponents();
        calendario = new calendarioEntrada(this);
        jTable1.setSelectionForeground(Color.GREEN);
        jTable1.setSelectionBackground(Color.blue);
        setTitle("ENTRADAS");
        objGBD = new GestorBD();
        objGBD.conectar();
        conGraficas = new GestorBD();
        conGraficas.conectar();
        lCli = objGBD.listaTabla("proveedor order by razon_social");
        llenarComboC(lCli);
        lClp = objGBD.listaTabla("productos order by len(codigo_producto),codigo_producto");
        llenarComboP(lClp);

        colNames = new Vector();
        colNames.add("FECHA");
        colNames.add("PERIODO");
        colNames.add("N. E.");
        colNames.add("FAMILIA");
        colNames.add("CODIGO");
        colNames.add("PRODUCTO");
        colNames.add("U. M.");
        colNames.add("CANT.");
        colNames.add("P. U.");
        colNames.add("TOTAL");
        colNames.add("PROVEEDOR");
        colNames.add("");
        con = new GestorBD();
        con.conectar();
        txtDescripcion.disable();
        txtFamilia.disable();
        txtUnidad_medida.disable();
        txtFecha_entrada.disable();
        txtPeriodo.disable();
        txtOrden_entrada.disable();
        txtCantidad.disable();
        txtPrecio_unitario.disable();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtPos.setVisible(false);
        mostrarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha_entrada = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        txtOrden_entrada = new javax.swing.JTextField();
        txtPrecio_unitario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
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
        jLabel16 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUnidad_medida = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCNombre = new javax.swing.JComboBox();
        txtFamilia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbCodigo = new javax.swing.JComboBox();
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

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("N . E :");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("CANTIDAD :");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("PRECIO UNITARIO :");

        txtFecha_entrada.setBackground(new java.awt.Color(240, 234, 171));
        txtFecha_entrada.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtFecha_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPeriodo.setBackground(new java.awt.Color(240, 234, 171));
        txtPeriodo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtOrden_entrada.setBackground(new java.awt.Color(240, 234, 171));
        txtOrden_entrada.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtOrden_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrecio_unitario.setBackground(new java.awt.Color(240, 234, 171));
        txtPrecio_unitario.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtPrecio_unitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("fecha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(240, 234, 171));
        txtCantidad.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel8)
                        .add(jLabel9)
                        .add(jLabel7)
                        .add(jLabel6))
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtCantidad)
                    .add(txtPrecio_unitario)
                    .add(txtOrden_entrada)
                    .add(txtPeriodo)
                    .add(txtFecha_entrada, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtFecha_entrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtPeriodo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtOrden_entrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8)
                            .add(txtCantidad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtPrecio_unitario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9)))
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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
        btnNuevo1.setText("ACTUALIZAR ");
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
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(btnNuevo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 933, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSalir)
                    .add(btnGuardar)
                    .add(btnNuevo)
                    .add(btnModificar)
                    .add(btnCancelar)
                    .add(btnEliminar)
                    .add(btnNuevo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(149, 149, 95));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel16.setText("U . M :");

        txtDescripcion.setBackground(new java.awt.Color(240, 234, 171));
        txtDescripcion.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("PRODUCTO :");

        txtUnidad_medida.setBackground(new java.awt.Color(240, 234, 171));
        txtUnidad_medida.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtUnidad_medida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setText("PROVEEDOR : ");

        jCNombre.setBackground(new java.awt.Color(140, 224, 235));
        jCNombre.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        jCNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCNombreActionPerformed(evt);
            }
        });

        txtFamilia.setBackground(new java.awt.Color(240, 234, 171));
        txtFamilia.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtFamilia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFamiliaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("FAMILIA :");

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel15.setText("CODIGO : ");

        cbCodigo.setBackground(new java.awt.Color(140, 224, 235));
        cbCodigo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        cbCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodigoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14)
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel15)
                                .add(jLabel1)))
                        .add(22, 22, 22)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(cbCodigo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(txtUnidad_medida)
                            .add(jCNombre, 0, 256, Short.MAX_VALUE)
                            .add(txtDescripcion)
                            .add(txtFamilia, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel15)
                    .add(cbCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtFamilia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(txtDescripcion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(13, 13, 13)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtUnidad_medida, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel16))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel14)
                    .add(jCNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(18, 18, 18)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(63, 63, 63))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("REGISTRAR ENTRADAS");

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

        txtPos.setText("pos a eliminar");
        txtPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel20)
                    .add(jLabel22)
                    .add(jLabel24)
                    .add(jLabel25)
                    .add(jLabel23))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 447, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel26)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(txtPos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(92, 92, 92))))
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .add(jLabel24)
                        .add(11, 11, 11)
                        .add(jLabel25))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel26)
                        .add(43, 43, 43)
                        .add(txtPos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int ind = jTable1.getSelectedRow();
        Vector n = (Vector) vClie.get(ind);
        txtFecha_entrada.setText(n.get(0).toString());
        txtPeriodo.setText(n.get(1).toString());
        txtOrden_entrada.setText(n.get(2).toString());
        txtFamilia.setText(n.get(3).toString());
        cbCodigo.setSelectedItem(n.get(4).toString());
        txtDescripcion.setText(n.get(5).toString());
        txtUnidad_medida.setText(n.get(6).toString());
        txtCantidad.setText(n.get(7).toString());
        cantidadModificar=Float.parseFloat((n.get(7).toString()).toString());
        txtPrecio_unitario.setText(n.get(8).toString());
        jCNombre.setSelectedItem(n.get(10).toString());
        txtPos.setText(n.get(11).toString());
        posnor=Integer.parseInt(n.get(11).toString());
        btnModificar.setEnabled(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        txtOrden_entrada.enable();
        txtCantidad.enable();
        txtPrecio_unitario.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtFecha_entrada.setText("");
        txtPeriodo.setText("");
        txtOrden_entrada.setText("");
        txtCantidad.setText("");
        txtPrecio_unitario.setText("");
        txtOrden_entrada.requestFocus();
        N = 1;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        txtOrden_entrada.enable();
        txtCantidad.enable();
        txtPrecio_unitario.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        N = 0;
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
        if (RestringirFecha() == true) {
        int pos=0;
        pos=contadorPosiciones()+1;
        cantidadIng = Float.parseFloat(txtCantidad.getText());
        precio_unitario = Float.parseFloat(txtPrecio_unitario.getText());
        precio_total = cantidadIng*precio_unitario;
            if(N==1){
               sql="insert into entrada values('"+
                        String.valueOf(cbCodigo.getSelectedItem())+"','"
                        +txtDescripcion.getText()+"','"+
                        txtFamilia.getText() + "','"+
                        txtUnidad_medida.getText()+"','"+
                        txtFecha_entrada.getText() + "','"+
                        txtPeriodo.getText()+"','"+
                        txtOrden_entrada.getText() + "',"+
                        txtCantidad.getText()+",'"+
                        String.valueOf(jCNombre.getSelectedItem())+"',"+
                        txtPrecio_unitario.getText()+","+
                        precio_total+","+pos+")";
                 objGBD.insertar(sql);
               try {
                    agregarSinoExisteStock();
                    IngresarEnKardex();
                    LlenarpaGraficas();
                } catch (SQLException ex) {
                    Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtDescripcion.setText("");
                txtFamilia.setText("");
                txtUnidad_medida.setText("");
                txtFecha_entrada.setText("");
                txtPeriodo.setText("");
                txtOrden_entrada.setText("");
                txtCantidad.setText("");
                txtPrecio_unitario.setText("");
            }
            else
            {
                sql="update entrada set codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+
                        "', descripcion='"+txtDescripcion.getText()+"'," +
                        "familia='"+txtFamilia.getText()+"',"+
                        "unidad_medida='"+txtUnidad_medida.getText()+"', " +
                        "fecha_mov='"+txtFecha_entrada.getText()+"',"+
                        "periodo='"+txtPeriodo.getText()+"',"+
                        "orden_entrada='"+txtOrden_entrada.getText()+"',"+
                        "cantidad="+txtCantidad.getText()+","+
                        "proveedore='"+String.valueOf(jCNombre.getSelectedItem())+"',"+
                        "precio_unitario="+txtPrecio_unitario.getText()+","+
                        "precio_total="+precio_total+
                        " where pos="+posnor;
                objGBD.insertar(sql);
                try {
                    paraActualizarStockValorizado();
                    paraActualizarKardex(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText());
                    LlenarpaGraficas();
                } catch (SQLException ex) {
                    Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtDescripcion.setText("");
                txtFamilia.setText("");
                txtUnidad_medida.setText("");
                txtFecha_entrada.setText("");
                txtPeriodo.setText("");
                txtOrden_entrada.setText("");
                txtCantidad.setText("");
                txtPrecio_unitario.setText("");
         }
          mostrarTabla();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtDescripcion.disable();
        txtFamilia.disable();
    //    txtSubFamilia.disable();
        txtUnidad_medida.disable();
        txtFecha_entrada.disable();
        txtPeriodo.disable();
        txtOrden_entrada.disable();
        txtCantidad.disable();
        txtPrecio_unitario.disable();
        
        txtDescripcion.setText("");
        txtFamilia.setText("");
      //  txtSubFamilia.setText("");
        txtUnidad_medida.setText("");
        txtFecha_entrada.setText("");
        txtPeriodo.setText("");
        txtOrden_entrada.setText("");
        txtCantidad.setText("");
        txtPrecio_unitario.setText("");

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void txtFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFamiliaActionPerformed

    private void jCNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCNombreActionPerformed


    }//GEN-LAST:event_jCNombreActionPerformed

    private void cbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCodigoActionPerformed

        int ind = cbCodigo.getSelectedIndex();
        if (ind >= 0) {
            ct = (ArrayList) lClp.get(ind);
            txtDescripcion.setText(ct.get(1).toString());
            txtFamilia.setText(ct.get(2).toString());
            txtUnidad_medida.setText(ct.get(3).toString());
        }

    }//GEN-LAST:event_cbCodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    calendario.setVisible(true);
    String f = txtFecha_entrada.getText();
    String m = txtPeriodo.getText();
    setSelectedDateEntradaFecha(f);
    setSelectedDateSalidaMes(m);


    }//GEN-LAST:event_jButton1ActionPerformed

    public void setSelectedDateEntradaFecha(String f){
    txtFecha_entrada.setText(f);
    }

    public void setSelectedDateSalidaMes(String m){
     txtPeriodo.setText(m);
    }


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String fec = txtFecha_entrada.getText();
        String per = txtPeriodo.getText();
        String oe = txtOrden_entrada.getText();
        String fam = txtFamilia.getText();
        String cod = String.valueOf(cbCodigo.getSelectedItem());
        String prod = txtDescripcion.getText();
        String um = txtUnidad_medida.getText();
        int pos = Integer.parseInt(txtPos.getText());
        eliminar_entradas(fec,per,oe,fam,cod,prod,um,pos);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed

        mostrarTabla();
        lCli = objGBD.listaTabla("proveedor order by razon_social");
        llenarComboC(lCli);
        lClp = objGBD.listaTabla("productos order by len(codigo_producto),codigo_producto");
        llenarComboP(lClp);

    }//GEN-LAST:event_btnNuevo1ActionPerformed

public void EliminarStock(){
        String sqlStock;
        float can = Float.parseFloat(txtCantidad.getText());
        float precio = Float.parseFloat(txtPrecio_unitario.getText());
        float preTotal = can * precio;
        float canStock = 0;

    canStock=cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))-cantidad_Salidas(String.valueOf(cbCodigo.getSelectedItem()));
    preTotal=canStock*promedio(String.valueOf(cbCodigo.getSelectedItem()));
    sqlStock="update Stock set cantidad ="+canStock
            +" ,precio ="+preTotal
            +" ,precio_unitario ="+promedio(String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Entradas ="+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Salidas ="+cantidad_Salidas( String.valueOf(cbCodigo.getSelectedItem()))
            +" where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"'";
    System.out.print("2 ...... . ."+sqlStock+"\n");
    objGBD.insertar(sqlStock);
    }

void eliminar_entradas(String fec,String per,String oe,String fam,String cod,String pro,String um,int pos)
        {
        int eliminar = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ", "DEPARTAMENTO DE LOGISTICA", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(eliminar==0)
        {
            String sql1 = "delete from entrada where fecha_mov='"+fec+"' and periodo='"+per+"' and orden_entrada='"+oe+"'" +
                    " and familia='"+fam+"' and codigo_producto='"+cod+"' and descripcion='"+pro+"' and unidad_medida='"+um+"' and pos="+pos+"";
            objGBD.consultar(sql1);
            mostrarTabla();
            EliminarStock();
            EliminarKardex(cod,fec,oe);
        }
        else if(eliminar==1){}
    }

//inicio lenin
public void EliminarKardex(String codigo,String fecha,String notaEntrada){

      
      int posicion = 0;
      sql="select pos from kardex where codigo_producto='"+codigo+"' and nota_entrada ='"+notaEntrada+"'  and fecha='"+fecha+"'";
      System.out.print(sql);
      ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
      EliminarDatoKardex();
      System.out.print("\n"+posicion+"\n");
        float restar=0;
        restar = Float.parseFloat(txtCantidad.getText());

             float NuevaEntrada = 0;
             NuevaEntrada=cantidad_EntradasStock(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText());
             sql="update kardex set entrada="+NuevaEntrada+
             " where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and fecha='"+txtFecha_entrada.getText()+"' and nota_entrada='"+ txtOrden_entrada.getText()+"'";
             con.insertar(sql);

            sql = "update kardex set stock= stock - "+restar+" where   pos>="+posicion+"" ;
             con.insertar(sql);
             System.out.print(sql);
             

    }
//fin lenin

//public void EliminarKardex(String codigo,String notaEntrada,String fecha){
//
//      EliminarDatoKardex();
//      int posicion = 0;
//      sql="select pos from kardex where codigo_producto='"+codigo+"' and nota_entrada ='"+notaEntrada+"'  and fecha='"+fecha+"'";
//      ResultSet rsnum=objGBD.consultar(sql);
//        try {
//            while (rsnum.next()) {
//                posicion = rsnum.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.print(sql+"\n"+posicion+"\n");
//
//        float restarEsto=0;
//        float modificarEsto=0;
//        float paraCalcular=0;
//        int paraPosicionar=0;
//        sql="select stock,pos from kardex where codigo_producto='"+codigo+"' and pos >="+posicion;
//        System.out.print(sql+"\n");
//        ResultSet rs2 = objGBD.consultar(sql);
//
//            float NuevaEntrada = 0;
//
//              System.out.print(sql+" \n esta es la modificacion  modificado < actual \n")  ;
//              restarEsto = Float.parseFloat(txtCantidad.getText());
//
//             NuevaEntrada=cantidad_EntradasStock(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText());
//             sql="update kardex set entrada="+NuevaEntrada+
//             " where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and fecha='"+txtFecha_entrada.getText()+"' and nota_entrada='"+ txtOrden_entrada.getText()+"'";
//             con.insertar(sql);
//             System.out.print(cantidad_EntradasStock(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText()));
//             System.out.print(" esta es "+restarEsto+"\n"+NuevaEntrada+" \n");
//            try {
//               while (rs2.next()) {
//                paraCalcular=Float.parseFloat(rs2.getString(1));
//                paraPosicionar=Integer.parseInt(rs2.getString(2));
//                modificarEsto = paraCalcular- restarEsto;
//                System.out.print("   "+paraCalcular+"         "+paraPosicionar+"         "+modificarEsto+"\n");
//                sql = "update kardex set stock="+String.valueOf(modificarEsto)+"where pos>="+paraPosicionar ;
//                con.insertar(sql);
//            }
//              } catch (SQLException ex) {
//            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }


//lenin selecccionar fecha kardex a eliminar
public String FechaAELiminarKardex()
{
    String FechaELiminar="";
      sql="select fecha from  kardex where entrada = "+Float.parseFloat(txtCantidad.getText())+" and salida = 0 and " +
              "pos = (select pos from kardex where fecha = '"+txtFecha_entrada.getText()+"' and periodo= '"+txtPeriodo.getText()+"' and " +
              "nota_entrada= '"+txtOrden_entrada.getText()+"' and familia = '"+txtFamilia.getText()+"' and codigo_producto = '"+cbCodigo.getSelectedItem()+"' and " +
              "descripcion = '"+txtDescripcion.getText()+"' and unidad_medida = '"+txtUnidad_medida.getText()+"' )";
      ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                FechaELiminar = rsnum.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(FechaELiminar);
    return FechaELiminar;
}
//fin lenin
//lenin comenzar a verificar para eliminar
 public void EliminarDatoKardex()
 {
    String FechaEliminar = FechaAELiminarKardex();
    if(FechaEliminar.equals(""))
    {
     
    }
    else if (!FechaEliminar.equals(""))
    {     
            String sql1 = " delete from  kardex where fecha= '"+FechaEliminar+"' ";
            objGBD.consultar(sql1);
    }
 }
 //fin lenin


    void mostrarTabla(){
        vClie =  objGBD.vectorConsulta("select fecha_mov, periodo,orden_entrada , familia , codigo_producto,descripcion , unidad_medida, cantidad, precio_unitario,precio_total, proveedore,pos from entrada order by len(codigo_producto),codigo_producto,orden_entrada");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
       jTable1.setModel(model);
      // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       jTable1.getColumnModel().getColumn(0).setMaxWidth(65); //fecha
       jTable1.getColumnModel().getColumn(1).setMaxWidth(65); //periodo
       jTable1.getColumnModel().getColumn(2).setMaxWidth(65); //numero de entrada
       jTable1.getColumnModel().getColumn(3).setMinWidth(100); //familia
       jTable1.getColumnModel().getColumn(4).setMaxWidth(65); //codigo
       jTable1.getColumnModel().getColumn(5).setMinWidth(110); //producto
       jTable1.getColumnModel().getColumn(6).setMaxWidth(40); //unidad de medida
       jTable1.getColumnModel().getColumn(7).setMaxWidth(60); //cantidad
       jTable1.getColumnModel().getColumn(8).setMaxWidth(60); //precio unitario
       jTable1.getColumnModel().getColumn(9).setMaxWidth(60); //total
       jTable1.getColumnModel().getColumn(10).setMinWidth(150); //proveedor->razon social proveedor
       jTable1.getColumnModel().getColumn(11).setMaxWidth(5);
               //agrandar el ancho de las filas
        jTable1.setRowHeight(18);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(tcr);//fecha
        jTable1.getColumnModel().getColumn(1).setCellRenderer(tcr);//periodo
        jTable1.getColumnModel().getColumn(2).setCellRenderer(tcr);//nota de entrada
        jTable1.getColumnModel().getColumn(4).setCellRenderer(tcr);//codigo
        jTable1.getColumnModel().getColumn(6).setCellRenderer(tcr);//unidad medida
        jTable1.getColumnModel().getColumn(7).setCellRenderer(tcr);//cantidad
        jTable1.getColumnModel().getColumn(8).setCellRenderer(tcr);//precio unutario
        jTable1.getColumnModel().getColumn(9).setCellRenderer(tcr);//precio total
    }
    public void llenarComboC(ArrayList al){
        jCNombre.removeAllItems();
        for(int i=0;i<al.size();i++){
         ct = (ArrayList) al.get(i);
         jCNombre.addItem(ct.get(2));
        }
    }
    public void llenarComboP(ArrayList al){
        cbCodigo.removeAllItems();
        for(int i=0;i<al.size();i++){
         ct = (ArrayList) al.get(i);
         cbCodigo.addItem(ct.get(0));
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    public void agregarSinoExisteStock() throws SQLException{
        float can = Float.parseFloat(txtCantidad.getText());
        float precio = Float.parseFloat(txtPrecio_unitario.getText());
        float preTotal = can * precio;
        int hay = 0;
        float canStock = 0;
    sql="select codigo_producto from Stock where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"'";
    ResultSet rs=objGBD.consultar(sql);
    while(rs.next()){
        hay=hay+1;
    }
    if(hay==0){
     sql="insert into Stock values('"+
                        String.valueOf(cbCodigo.getSelectedItem())
                        +"','"+txtDescripcion.getText()
                        +"','"+txtFamilia.getText()
                        +"','"+txtUnidad_medida.getText()
                        +"',"+txtPrecio_unitario.getText()
                        +","+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))
                        +","+0+","+txtCantidad.getText()
                        +","+preTotal+")";
                objGBD.insertar(sql);
                System.out.print(sql);
                mostrarTabla();
    }else{
    canStock=cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))-cantidad_Salidas(String.valueOf(cbCodigo.getSelectedItem()));
    System.out.print("res >  "+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))+"-"+cantidad_Salidas(String.valueOf(cbCodigo.getSelectedItem()))+"= "+canStock);
    preTotal=canStock*promedio(String.valueOf(cbCodigo.getSelectedItem()));
    sql="update Stock set cantidad ="+canStock
            +" ,precio ="+preTotal
            +" ,precio_unitario ="+promedio(String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Entradas ="+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Salidas ="+cantidad_Salidas( String.valueOf(cbCodigo.getSelectedItem()))
            +" where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"'";
    objGBD.insertar(sql);
    }
    }
    public void paraActualizarStockValorizado() throws SQLException{
        float preTotal = 0;
        float cantStock = 0;
    sql="select sum (cantidad) from entrada group by codigo_producto having codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"'";
    ResultSet rs2=objGBD.consultar(sql);
     while(rs2.next()){
         cantStock=rs2.getFloat(1);
    }
    preTotal=cantStock*promedio(String.valueOf(cbCodigo.getSelectedItem()));
    sql="update Stock set cantidad ="+cantStock
            +", precio ="+preTotal
            +" ,precio_unitario ="+promedio(String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Entradas ="+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Salidas ="+cantidad_Salidas( String.valueOf(cbCodigo.getSelectedItem()))
            +" where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"'";
    objGBD.insertar(sql);
    }
    public void paraActualizarStock() throws SQLException{
        float can = Float.parseFloat(txtCantidad.getText());
        float precio = Float.parseFloat(txtPrecio_unitario.getText());
        float preTotal = can * precio;
        int hay = 0;
        float canStock = 0;
    sql="select codigo_producto from Stock where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"'";
    ResultSet rs=objGBD.consultar(sql);
    while(rs.next()){
        hay=hay+1;
    }
    if(hay==0){
     sql="insert into Stock values('"+
                        String.valueOf(cbCodigo.getSelectedItem())
                        +"','"+txtDescripcion.getText()
                        +"','"+txtFamilia.getText()
                        +"','"+txtUnidad_medida.getText()
                        +"',"+txtPrecio_unitario.getText()
                        +","+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))
                        +","+0+","+txtCantidad.getText()
                        +","+preTotal+")";
     System.out.print(sql);
                objGBD.insertar(sql);
                mostrarTabla();
    }else{
    canStock=cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))-cantidad_Salidas(String.valueOf(cbCodigo.getSelectedItem()));
    System.out.print("res >  "+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))+"-"+cantidad_Salidas(String.valueOf(cbCodigo.getSelectedItem()))+"= "+canStock);
    preTotal=canStock*promedio(String.valueOf(cbCodigo.getSelectedItem()));
    sql="update Stock set cantidad ="+canStock
            +" ,precio ="+preTotal
            +" ,precio_unitario ="+promedio(String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Entradas ="+cantidad_Entradas( String.valueOf(cbCodigo.getSelectedItem()))
            +" ,total_Salidas ="+cantidad_Salidas( String.valueOf(cbCodigo.getSelectedItem()))
            +" where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"'";
    objGBD.insertar(sql);
    }
    }
    public void LlenarpaGraficas() throws SQLException{
            String fecha=new String();
            String dia = null;
            String mes = null;
            String ano = null;
            sql=null;
            char letra;
            int slash=0;
            int entro0=0;
            int entro1=0;
            int entro2=0;
            float cantidad = 0;
            fecha=txtFecha_entrada.getText();
            int hay = 0;
            sql="select fecha from fechas_entradas where fecha= '" +txtFecha_entrada.getText()+"'";
            ResultSet rs=conGraficas.consultar(sql);
            while(rs.next()){
            hay=hay+1;
            }
            System.out.print(fecha.length());
            if(hay==0){
            for(int i=0;i<fecha.length();i++){
                letra=fecha.charAt(i);
                if(letra=='/'){
                    slash++;
                }else{

                    if(slash==1){
                        if(entro1==1){
                           mes=mes.concat(String.valueOf(letra));
                        }else{
                          mes=String.valueOf(letra);
                          entro1=1;
                        }


                    }else if(slash==2){
                        if(entro2==1){
                           ano=ano.concat(String.valueOf(letra));
                        }else{
                          ano=String.valueOf(letra);
                          entro2=1;
                        }
                    } else {
                        if (entro0 == 1) {
                            dia = dia.concat(String.valueOf(letra));
                        } else {
                            dia = String.valueOf(letra);
                            entro0 = 1;
                        }
                    }
                    }
            }
            ndia=Integer.parseInt(dia);
            nmes=Integer.parseInt(mes);
            nano=Integer.parseInt(ano);
            System.out.print(ndia+"   "+nmes+"    "+nano+"\n");
            sql="select sum(cantidad) from entrada where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"' and fecha_mov='"+txtFecha_entrada.getText()+"'";
            ResultSet rs4=conGraficas.consultar(sql);
             while(rs4.next()){
               cantidad=rs4.getFloat(1);
             }
            sql="insert into fechas_entradas values("+cantidad+","+ndia+","+nmes+","+nano+",'"+txtFecha_entrada.getText()+"')";
            conGraficas.insertar(sql);
            }else{
            sql="select sum(cantidad) from entrada where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())+"' and fecha_mov='"+txtFecha_entrada.getText()+"'";
            ResultSet rs4=conGraficas.consultar(sql);
             while(rs4.next()){
               cantidad=rs4.getFloat(1);
             }

            sql="update fechas_entradas set cantidad="+cantidad+" where fecha='"+txtFecha_entrada.getText()+"'";
            conGraficas.insertar(sql);
            }

            
    }
    public float promedio(String codigo){
     sql="select avg(precio_unitario) from entrada group by codigo_producto having codigo_producto ='"+codigo+"'";
     float promedio = 0;
     ResultSet rs= objGBD.consultar(sql);
        try {
            while (rs.next()) {
                promedio = rs.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
     return promedio;
    }
    public int contadorPosiciones(){
        int posicion = 0;
      sql="select max(pos) from entrada";
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
    public float cantidad_Entradas(String producto){
        float entradas = 0;
         sql="select sum(cantidad) from entrada where codigo_producto ='"+producto+"'";
    ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                entradas = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entradas;
    }
    public float cantidad_Salidas(String producto){
        float salidas = 0;
         sql="select sum(cantidad) from salidas where codigo_producto ='"+producto+"'";
    ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                salidas = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salidas;
      }
    public void IngresarEnKardex() throws SQLException{
    int hay = 0;
        sql="select codigo_producto from Kardex where codigo_producto= '" +String.valueOf(cbCodigo.getSelectedItem())
            +"' and fecha='"+txtFecha_entrada.getText()+"' and nota_entrada='"+ txtOrden_entrada.getText()+"'";
    ResultSet rs=objGBD.consultar(sql);
    while(rs.next()){
        hay=hay+1;
    }
    int posi=0;
    posi=contadorPosicionesKardex()+1;
    if(hay==0){
    float stock= Stock( String.valueOf(cbCodigo.getSelectedItem()));
    sql="insert into Kardex values('"+txtFecha_entrada.getText()+"','"
            +txtPeriodo.getText()+"','"
            +txtOrden_entrada.getText() + "','','"+
            txtFamilia.getText() + "','"
            +String.valueOf(cbCodigo.getSelectedItem())+"','"
            +txtDescripcion.getText()+"','"
            +txtUnidad_medida.getText()+"',"+
            Float.parseFloat(txtCantidad.getText())+",'"+0+"',"+
            stock+",' ',' ',"+posi
            +")";
    System.out.print(sql);
    objGBD.insertar(sql);


    }else{
        float NuevaEntrada = 0;
        float NuevoStock = 0;

        NuevaEntrada=EntradaActualKardex(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText())+Float.parseFloat(txtCantidad.getText());
        NuevoStock=StockActualKardex(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText())+Float.parseFloat(txtCantidad.getText());
        sql="update Kardex set entrada="+NuevaEntrada+",stock="+NuevoStock+
             " where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and fecha='"+txtFecha_entrada.getText()+"' and nota_entrada='"+ txtOrden_entrada.getText()+"'";
         objGBD.insertar(sql);
       
         int posicion = 0; 
        sql="select pos from Kardex where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and nota_entrada ='"+txtOrden_entrada.getText()+"'  and fecha='"+txtFecha_entrada.getText()+"'";
      ResultSet rsnum=objGBD.consultar(sql);
        
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }
   
        sql="select stock,pos from Kardex where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and pos >"+posicion;
        System.out.print(sql+"\n");
        ResultSet rs2 = objGBD.consultar(sql);

        float sumarEsto=Float.parseFloat(txtCantidad.getText());
        float modificarEsto=0;
        float paraCalcular=0;
        int paraPosicionar=0;
        

               while (rs2.next()) {
               
                paraCalcular=Float.parseFloat(rs2.getString(1));
                paraPosicionar=Integer.parseInt(rs2.getString(2));
                modificarEsto = paraCalcular + sumarEsto;
                System.out.print("   "+paraCalcular+"         "+"posicion = ="+paraPosicionar+"         "+"Stock ==="+modificarEsto+"\n");            
                con.insertar("update Kardex set stock="+modificarEsto+"  where pos="+paraPosicionar);
            }
          
    }
    }
    public int contadorPosicionesKardex(){
        int posicion = 0;
      sql="select max(pos) from Kardex";
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
    public  float Stock(String codigo){
        float stock=0;
        sql="select sum(cantidad) from Stock where codigo_producto='"+codigo+"'";
        ResultSet rs= objGBD.consultar(sql);
        try {
            while (rs.next()) {
                stock = rs.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stock;
    }
    public float EntradaActualKardex(String codigo,String fecha,String orden_entrada){
        float enActual = 0;
        sql="select entrada from Kardex where codigo_producto='"+codigo+"' and fecha='"+fecha+"' and nota_entrada='"+orden_entrada+"'";
        ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                enActual = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enActual;
    }
    public float StockActualKardex(String codigo,String fecha,String orden_entrada){
        float StoActual = 0;
        sql="select stock from Kardex where codigo_producto='"+codigo+"' and fecha='"+fecha+"' and nota_entrada='"+orden_entrada+"'";
        ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                StoActual = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return StoActual;
    }
    public void paraActualizarKardex(String codigo,String fecha,String  notaEntrada) throws SQLException{
     int posicion = 0;  
      sql="select pos from Kardex where codigo_producto='"+codigo+"' and nota_entrada ='"+notaEntrada+"'  and fecha='"+fecha+"'";
      ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        float actual=cantidadModificar;
        float modificado=Float.parseFloat(txtCantidad.getText());
        
        float sumarEsto=0;
        float restarEsto=0;
        float modificarEsto=0;
        float paraCalcular=0;
        int paraPosicionar=0;
        sql="select stock,pos from Kardex where codigo_producto='"+codigo+"' and pos >="+posicion;
        ResultSet rs2 = objGBD.consultar(sql);       
       
        if( actual < modificado ){
             float NuevaEntrada = 0;
             sumarEsto = modificado-actual;
             NuevaEntrada=cantidad_EntradasStock(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText());
             sql="update Kardex set entrada="+NuevaEntrada+
             " where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and fecha='"+txtFecha_entrada.getText()+"' and nota_entrada='"+ txtOrden_entrada.getText()+"'";
             con.insertar(sql);
            try {
               while (rs2.next()) {
                paraCalcular=Float.parseFloat(rs2.getString(1));
                paraPosicionar=Integer.parseInt(rs2.getString(2));
                modificarEsto = paraCalcular+sumarEsto;
                sql = "update Kardex set stock="+String.valueOf(modificarEsto)+"where pos="+paraPosicionar;
                con.insertar(sql);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }else if(modificado < actual){

            float NuevaEntrada = 0;

              restarEsto = actual - modificado;
              
             NuevaEntrada=cantidad_EntradasStock(String.valueOf(cbCodigo.getSelectedItem()),txtFecha_entrada.getText(),txtOrden_entrada.getText());
             sql="update Kardex set entrada="+NuevaEntrada+
             " where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and fecha='"+txtFecha_entrada.getText()+"' and nota_entrada='"+ txtOrden_entrada.getText()+"'";
             con.insertar(sql);
             try {
               while (rs2.next()) {  
                paraCalcular=Float.parseFloat(rs2.getString(1));
                paraPosicionar=Integer.parseInt(rs2.getString(2));
                modificarEsto = paraCalcular- restarEsto;
                sql = "update Kardex set stock="+String.valueOf(modificarEsto)+"where pos="+paraPosicionar;
                con.insertar(sql);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }      
        }    
    }
    public float cantidad_EntradasStock(String producto,String fecha, String orden){
        float entradas = 0;
         sql="select sum(cantidad) from entrada where codigo_producto ='"+producto+"' and fecha_mov='"+fecha+"' and orden_entrada='"+orden+"'";
        ResultSet rsnum=con.consultar(sql);
        try {
            while (rsnum.next()) {
                entradas = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entradas;
    }
    public boolean RestringirFecha() throws SQLException{
            boolean continuar=false;
            String fecha=new String();
            String dia = null;
            String mes = null;
            String ano = null;
            char letra;
            int slash=0;
            int entro0=0;
            int entro1=0;
            int entro2=0;
            fecha=txtFecha_entrada.getText();
            int hay = 0;
            if(hay==0){
            for(int i=0;i<fecha.length();i++){
                letra=fecha.charAt(i);
                if(letra=='/'){
                    slash++;
                }else{

                    if(slash==1){
                        if(entro1==1){
                           mes=mes.concat(String.valueOf(letra));
                        }else{
                          mes=String.valueOf(letra);
                          entro1=1;
                        }


                    }else if(slash==2){
                        if(entro2==1){
                           ano=ano.concat(String.valueOf(letra));
                        }else{
                          ano=String.valueOf(letra);
                          entro2=1;
                        }
                    } else {
                        if (entro0 == 1) {
                            dia = dia.concat(String.valueOf(letra));
                        } else {
                            dia = String.valueOf(letra);
                            entro0 = 1;
                        }
                    }
                    }
            }
            ndia=Integer.parseInt(dia);
            nmes=Integer.parseInt(mes);
            nano=Integer.parseInt(ano);
           
            if(dia.length()>2){
                JOptionPane.showMessageDialog(null,"El DIA sugerido NO existe");
            }else if(mes.length()>2){
                JOptionPane.showMessageDialog(null,"El MES sugerido NO existe");
            }else if(ano.length()>4){
                JOptionPane.showMessageDialog(null,"El AÑO sugerido NO existe");
            }else if(nmes>12){
                JOptionPane.showMessageDialog(null,"El MES sugerido NO existe");
            }else if(ndia>31){
               JOptionPane.showMessageDialog(null," El DIA sugerido NO existe");
            }else if(nano>3000){
               JOptionPane.showMessageDialog(null," El AÑO sugerido esta  fuera  de rango establecido ");
            }else{
                continuar=true;
            }
    }
            return continuar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtFecha_entrada;
    private javax.swing.JTextField txtOrden_entrada;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtPrecio_unitario;
    private javax.swing.JTextField txtUnidad_medida;
    // End of variables declaration//GEN-END:variables

}
