
package com.weberbauer.from;

import com.weberbauer.utils.calendarioSalida;
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


public class Salidas extends javax.swing.JFrame {

    private calendarioSalida calendario;
    public Vector vClie;
    public Vector colNames;
    public ArrayList ct;
    public ArrayList lCli;
    public int N;
    float cantidad;
    float precio_unitario;
    float precio_total;
    int ndia = 0;
    int nmes = 0;
    int nano = 0;
    int posnor;
    GestorBD objGBD;
    float diferencia;
    GestorBD con;
    float cantidadModificar=0;
    public Salidas() {
        initComponents();
        calendario = new calendarioSalida(this);
        //ponerle color a las letras al celecionar un objeto en la tabla
        jTable1.setSelectionForeground(Color.GREEN);
        jTable1.setSelectionBackground(Color.blue);
        setLocationRelativeTo(null);
        setTitle("SALIDA");
        // conectamos a la Base de Datos
        objGBD = new GestorBD();
        objGBD.conectar();
        lCli = objGBD.listaTabla("Stock");
        llenarComboC(lCli);
        // tabla
        colNames = new Vector();
        colNames.add("FECHA");
        colNames.add("PERIODO");
        colNames.add("O.S.");
        colNames.add("FAMILIA");
        colNames.add("CODIGO");
        colNames.add("PRODUCTO");
        colNames.add("U. M.");
        colNames.add("CANT.");
        colNames.add("P. U.");
        colNames.add("TOTAL");
        colNames.add("DESTINO");
        colNames.add("NOMBRE");
        colNames.add("");
        con = new GestorBD();
        con.conectar();
        mostrarTabla();
        txtDescripcion.enable(false);
        txtFamilia.disable();
        txtPrecio_unitario.disable();
        txtUnidad_medida.disable();
        txtFecha_salida.disable();
        txtPeriodo.disable();
        txtOrden_salida.disable();
        txtCantidad.disable();
        txtSolicitante.disable();
        txtArea.disable();

    }
    void mostrarTabla()
    {
        vClie =  objGBD.vectorConsulta("select fecha_salida, periodo,orden_salida, familia , codigo_producto,descripcion , unidad_medida, cantidad, precio_unitario,precio_total, Area,solicitante,pos from salidas");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        jTable1.setModel(model);
             // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       jTable1.getColumnModel().getColumn(0).setMaxWidth(65); //fecha
       jTable1.getColumnModel().getColumn(1).setMaxWidth(65); //periodo
       jTable1.getColumnModel().getColumn(2).setMaxWidth(65); //numero de salida ( OS )
       jTable1.getColumnModel().getColumn(3).setMinWidth(80); //familia
       jTable1.getColumnModel().getColumn(4).setMaxWidth(65); //codigo
       jTable1.getColumnModel().getColumn(5).setMinWidth(100); //producto
       jTable1.getColumnModel().getColumn(6).setMaxWidth(50); //unidad de medida
       jTable1.getColumnModel().getColumn(7).setMaxWidth(60); //cantidad
       jTable1.getColumnModel().getColumn(8).setMaxWidth(60); //precio unitario
       jTable1.getColumnModel().getColumn(9).setMaxWidth(60); //total
       jTable1.getColumnModel().getColumn(10).setMinWidth(70); //destino
       jTable1.getColumnModel().getColumn(11).setMinWidth(70);//nombre
       jTable1.getColumnModel().getColumn(12).setMaxWidth(0);//posicion
       //agrandar el ancho de las filas
        jTable1.setRowHeight(17);
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
       cbCodigo.removeAllItems();
        for(int i=0;i<al.size();i++){
         ct = (ArrayList) al.get(i);
         cbCodigo.addItem(ct.get(0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFamilia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio_unitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUnidad_medida = new javax.swing.JTextField();
        cbCodigo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtFecha_salida = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOrden_salida = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSolicitante = new javax.swing.JTextField();
        lbCantidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCancelar1 = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("REGISTRAR SALIDAS");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setBackground(new java.awt.Color(175, 175, 74));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("FAMILIA :");

        txtFamilia.setBackground(new java.awt.Color(240, 234, 171));
        txtFamilia.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtFamilia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("PRECIO UNITARIO :");

        txtPrecio_unitario.setBackground(new java.awt.Color(240, 234, 171));
        txtPrecio_unitario.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtPrecio_unitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("PRODUCTO :   ");

        txtDescripcion.setBackground(new java.awt.Color(240, 234, 171));
        txtDescripcion.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("CODIGO :");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("U . M :");

        txtUnidad_medida.setBackground(new java.awt.Color(240, 234, 171));
        txtUnidad_medida.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtUnidad_medida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUnidad_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidad_medidaActionPerformed(evt);
            }
        });

        cbCodigo.setBackground(new java.awt.Color(153, 204, 255));
        cbCodigo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        cbCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCodigo, 0, 231, Short.MAX_VALUE)
                    .addComponent(txtUnidad_medida, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPrecio_unitario)
                        .addComponent(txtDescripcion)
                        .addComponent(txtFamilia, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(175, 175, 74));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel16.setText("FECHA :");

        txtFecha_salida.setBackground(new java.awt.Color(240, 234, 171));
        txtFecha_salida.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtFecha_salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel17.setText("PERIODO :");

        txtPeriodo.setBackground(new java.awt.Color(240, 234, 171));
        txtPeriodo.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("O . S :");

        txtOrden_salida.setBackground(new java.awt.Color(240, 234, 171));
        txtOrden_salida.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtOrden_salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setText("DESTINO :");

        txtArea.setBackground(new java.awt.Color(240, 234, 171));
        txtArea.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel12.setText("SOLICITANTE :");

        txtSolicitante.setBackground(new java.awt.Color(240, 234, 171));
        txtSolicitante.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtSolicitante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbCantidad.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        lbCantidad.setText("CANTIDAD  :   ");

        jButton1.setText("fecha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(240, 234, 171));
        txtCantidad.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidad)
                    .addComponent(txtPeriodo)
                    .addComponent(txtFecha_salida, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(txtOrden_salida)
                    .addComponent(txtArea)
                    .addComponent(txtSolicitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtFecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtOrden_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCantidad)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(175, 175, 74));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnSalir.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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

        btnGuardar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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

        btnCancelar1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnCancelar1.setText("ELIMINAR");
        btnCancelar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnNuevo1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnNuevo1.setText("ACTUALIZAR");
        btnNuevo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar1)
                    .addComponent(btnNuevo1))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("STOCK :");

        txtStock.setBackground(new java.awt.Color(240, 234, 171));
        txtStock.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(168, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel25.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel24.setText("RUC. :    20117356575");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel23.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/otro_logo.png"))); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPos.setText("pos a eliminar");
        txtPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
    }//GEN-LAST:event_txtPeriodoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtFecha_salida.disable();
        txtPeriodo.disable();
        txtOrden_salida.disable();
        txtCantidad.disable();
        txtSolicitante.disable();
        txtArea.disable();
        txtFecha_salida.setText("");
        txtPeriodo.setText("");
        txtOrden_salida.setText("");
        txtCantidad.setText("");
        txtSolicitante.setText("");
        txtArea.setText("");
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
        if (RestringirFecha() == true) {
        int pos = 0;
        String sql = "select max(pos) from salidas";
        ResultSet rsnum = objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                pos = rsnum.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        pos = pos + 1;
        cantidad = Float.parseFloat(txtCantidad.getText());
        precio_unitario = promedio(cbCodigo.getSelectedItem().toString());
        precio_total = cantidad * precio_unitario;
        float cant = 0;
        sql = "select cantidad from Stock where codigo_producto= '" + cbCodigo.getSelectedItem() + "'";
        ResultSet rs2 = objGBD.consultar(sql);
        try {
            while (rs2.next()) {
                cant = rs2.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Salidas.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (N == 1) {
            if (cant < cantidad) {
                JOptionPane.showMessageDialog(null, " La cantidad que va a retirar del Almacen supera el stock registrado");
            } else {
                sql = "insert into salidas values('" +
                        cbCodigo.getSelectedItem().toString() + "','" +
                        txtDescripcion.getText() + "','" +
                        txtFamilia.getText() + "','" +
                        txtUnidad_medida.getText() + "','" +
                        txtFecha_salida.getText() + "','" +
                        txtPeriodo.getText() + "','" +
                        txtOrden_salida.getText() + "'," +
                        Float.parseFloat(txtCantidad.getText()) + ",'" +
                        txtSolicitante.getText() + "','" +
                        txtArea.getText() + "'," +
                        Float.parseFloat(txtPrecio_unitario.getText()) + "," +
                        precio_total + "," + pos + ")";
                objGBD.insertar(sql);

                try {
                    agregarSinoExisteStock();
                    IngresarEnKardex();
                } catch (SQLException ex) {
                    Logger.getLogger(Salidas.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Datos almacenados correctamente");
                txtFecha_salida.setText("");
                txtPeriodo.setText("");
                txtOrden_salida.setText("");
                txtCantidad.setText("");
                txtSolicitante.setText("");
                txtArea.setText("");
            }
        } else {

        float actual=cantidadModificar;
        float modificado=Float.parseFloat(txtCantidad.getText());
        float diferenciaStock=0;
        diferenciaStock=modificado-actual;

            if(diferenciaStock>Stock(cbCodigo.getSelectedItem().toString())){
             JOptionPane.showMessageDialog(null, " La cantidad que va a MODIFICAR  del Almacen supera el stock registrado");
            }  else{
            sql = " update salidas set " +
                    "descripcion='" + txtDescripcion.getText() + "'," +
                    "familia='" + txtFamilia.getText() + "'," +
                    "precio_unitario='" + txtPrecio_unitario.getText() + "'," +
                    "unidad_medida='" + txtUnidad_medida.getText() + "', " +
                    "fecha_salida='" + txtFecha_salida.getText() + "'," +
                    "periodo='" + txtPeriodo.getText() + "'," +
                    "orden_salida='" + txtOrden_salida.getText() + "'," +
                    "cantidad=" + txtCantidad.getText() + "," +
                    "precio_total=" + precio_total +
                    " where pos=" + posnor;
                    objGBD.insertar(sql);
             System.out.print(sql);

            try {
                paraActualizarStock();
               paraActualizarKardex(cbCodigo.getSelectedItem().toString(),txtFecha_salida.getText(),txtOrden_salida.getText());

            } catch (SQLException ex) {
                Logger.getLogger(Salidas.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Datos modificados correctamente");
            txtFecha_salida.setText("");
            txtPeriodo.setText("");
            txtOrden_salida.setText("");
            txtCantidad.setText("");
            txtSolicitante.setText("");
            txtArea.setText("");
        }
        }
        mostrarTabla();

         }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtFecha_salida.enable();
        txtPeriodo.enable();
        txtOrden_salida.enable();
        txtCantidad.enable();
        txtSolicitante.enable();
        txtArea.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        N = 0;
}//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      txtFecha_salida.enable();
        txtPeriodo.enable();
        txtOrden_salida.enable();
        txtCantidad.enable();
        txtSolicitante.enable();
        txtArea.enable();
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtFecha_salida.setText("");
        txtPeriodo.setText("");
        txtOrden_salida.setText("");
        txtCantidad.setText("");
        txtSolicitante.setText("");
        txtArea.setText("");
        txtSolicitante.requestFocus();
        N = 1;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtUnidad_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidad_medidaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtUnidad_medidaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int ind = jTable1.getSelectedRow();
        Vector n = (Vector) vClie.get(ind);
        txtFecha_salida.setText(n.get(0).toString());
        txtPeriodo.setText(n.get(1).toString());
        txtOrden_salida.setText(n.get(2).toString());
        txtFamilia.setText(n.get(3).toString());
        cbCodigo.setSelectedItem(n.get(4).toString());//codigo
        txtDescripcion.setText(n.get(5).toString());
        txtUnidad_medida.setText(n.get(6).toString());
        txtCantidad.setText(n.get(7).toString());
        cantidadModificar=Float.parseFloat((n.get(7).toString()).toString());
        diferencia=Float.parseFloat(n.get(7).toString());
        txtPrecio_unitario.setText(n.get(8).toString());
        txtArea.setText(n.get(10).toString());
        txtSolicitante.setText(n.get(11).toString());        
        posnor=Integer.parseInt(n.get(12).toString());
        txtPos.setText(n.get(12).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void cbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCodigoActionPerformed

        int ind = cbCodigo.getSelectedIndex();
        if (ind >= 0) {
            ct = (ArrayList) lCli.get(ind);
            txtDescripcion.setText(ct.get(1).toString());
            txtFamilia.setText(ct.get(2).toString());
            txtUnidad_medida.setText(ct.get(3).toString());
            txtPrecio_unitario.setText(ct.get(4).toString());
        }
}//GEN-LAST:event_cbCodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        calendario.setVisible(true);
        String f = txtFecha_salida.getText();
        String m = txtPeriodo.getText();
        setSelectedDateEntradaFecha(f);
        setSelectedDateSalidaMes(m);

    }//GEN-LAST:event_jButton1ActionPerformed

    public void setSelectedDateEntradaFecha(String f){
    txtFecha_salida.setText(f);
    }

    public void setSelectedDateSalidaMes(String m){
     txtPeriodo.setText(m);
    }


    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed

        String fec = txtFecha_salida.getText();
        String per = txtPeriodo.getText();
        String oe = txtOrden_salida.getText();
        String fam = txtFamilia.getText();
        String cod = String.valueOf(cbCodigo.getSelectedItem());
        String prod = txtDescripcion.getText();
        String um = txtUnidad_medida.getText();
        int pos = Integer.parseInt(txtPos.getText());
        eliminar_salidas(fec,per,oe,fam,cod,prod,um,pos);

    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtPosActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed

        lCli = objGBD.listaTabla("Stock");
        llenarComboC(lCli);
        mostrarTabla();

    }//GEN-LAST:event_btnNuevo1ActionPerformed
/////lenin analizar codigo a eliminar
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

void eliminar_salidas(String fec,String per,String oe,String fam,String cod,String pro,String um,int pos)
        {
        int eliminar = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ", "DEPARTAMENTO DE LOGISTICA", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(eliminar==0)
        {
            String sql1 = "delete from salidas where fecha_salida='"+fec+"' and periodo='"+per+"' and orden_salida='"+oe+"'" +
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
      String sql="select pos from kardex where codigo_producto='"+codigo+"' and nota_entrada ='"+notaEntrada+"'  and fecha='"+fecha+"'";
      ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        float restar=0;
        restar = Float.parseFloat(txtCantidad.getText());
          //   float NuevaEntrada = 0;
            // NuevaEntrada=cantidad_Salidas(String.valueOf(cbCodigo.getSelectedItem()));
             sql="update kardex set salida= salida -"+restar+
             " where codigo_producto='"+String.valueOf(cbCodigo.getSelectedItem())+"' and fecha='"+txtFecha_salida.getText()+"' and orden_salida='"+ txtOrden_salida.getText()+"'";
             con.insertar(sql);
            sql = "update kardex set stock= stock + "+restar+" where   pos>="+posicion+"" ;
             con.insertar(sql);
    }
/////lenin fin del analisis


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salidas().setVisible(true);
            }
        });
    }
public void agregarSinoExisteStock() throws SQLException {
        float preTotal = 0;
        float canStock = 0;
        String sql = null;
        canStock=cantidad_Entradas( cbCodigo.getSelectedItem().toString())-cantidad_Salidas(cbCodigo.getSelectedItem().toString());

        preTotal = canStock * promedio(cbCodigo.getSelectedItem().toString());
        sql = "update Stock set cantidad =" + canStock
                + " ,precio =" + preTotal
                + " ,precio_unitario =" + precio_unitario
                + " ,total_Entradas ="+cantidad_Entradas( cbCodigo.getSelectedItem().toString())
                + " ,total_Salidas ="+cantidad_Salidas( cbCodigo.getSelectedItem().toString())
                + " where codigo_producto= '" + cbCodigo.getSelectedItem()
                + "'";
        objGBD.insertar(sql);
    }
public void paraActualizarStock() throws SQLException {
        float preTotal = 0;
        float canStock = 0;
        String sql = null;
        canStock=cantidad_Entradas(cbCodigo.getSelectedItem().toString())-cantidad_Salidas(cbCodigo.getSelectedItem().toString());      
        preTotal = canStock * promedio(cbCodigo.getSelectedItem().toString());
        sql = "update Stock set cantidad =" + canStock
                + " ,precio =" + preTotal
                + " ,precio_unitario =" + precio_unitario
                + " ,total_Entradas ="+cantidad_Entradas( cbCodigo.getSelectedItem().toString())
                + " ,total_Salidas ="+cantidad_Salidas( cbCodigo.getSelectedItem().toString())
                + " where codigo_producto= '" + cbCodigo.getSelectedItem() + "'";
        objGBD.insertar(sql);
    }
public void LlenarpaGraficas() {
        String fecha = new String();
        String dia = null;
        String mes = null;
        String ano = null;
        String sql = null;
        char letra;
        int slash = 0;
        int entro0 = 0;
        int entro1 = 0;
        int entro2 = 0;
        fecha = txtFecha_salida.getText();
        for (int i = 0; i < fecha.length(); i++) {
            letra = fecha.charAt(i);
            if (letra == '/') {
                slash++;
            } else {
                if (slash == 1) {
                    if (entro1 == 1) {
                        mes = mes.concat(mes);
                    } else {
                        mes = String.valueOf(letra);
                        entro1 = 1;
                    }
                } else if (slash == 2) {
                    if (entro2 == 1) {
                        ano = ano.concat(ano);
                    } else {
                        ano = String.valueOf(letra);
                        entro2 = 1;
                    }
                } else {
                    if (entro0 == 1) {
                        dia = dia.concat(dia);
                    } else {
                        dia = String.valueOf(letra);
                        entro0 = 1;
                    }
                }
            }
        }

        ndia = Integer.parseInt(dia);
        nmes = Integer.parseInt(mes);
        nano = Integer.parseInt(ano);
        sql = "insert into fechas_entradas values(" + precio_total + "," + cantidad + "," + ndia + "," + nmes + "," + nano + ")";
        objGBD.insertar(sql);
    }
public float promedio(String codigo) {
        String sql = "select avg(precio_unitario) from entrada group by codigo_producto having codigo_producto ='" + codigo + "'";
        float prom = 0;
        ResultSet rs = objGBD.consultar(sql);
        try {
            while (rs.next()) {
                prom = rs.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prom;
    }
public float cantidad_Entradas(String producto){
        float entradas = 0;
        String sql = "select sum(cantidad) from entrada where codigo_producto ='" + producto + "'";
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
        String sql = "select sum(cantidad) from salidas where codigo_producto ='" + producto + "'";
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
        String codigo = null;
      String sql="select codigo_producto from Kardex" +
              " where codigo_producto='"+cbCodigo.getSelectedItem().toString()
              +"' and fecha='"+txtFecha_salida.getText()
              +"' and orden_salida='"+ txtOrden_salida.getText()
              +"' and destino='"+txtArea.getText()
              +"'  and solicitante='"+txtSolicitante.getText()+"'";
     ResultSet rs= objGBD.consultar(sql);
        try {
            while (rs.next()) {
                hay = hay+1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    int posi=0;
    posi=contadorPosicionesKardex()+1;

    if(hay==0){
        float stock= Stock( cbCodigo.getSelectedItem().toString());
  sql="insert into  Kardex(fecha,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada,salida,stock,destino,solicitante,pos)" +
          " values ('"+txtFecha_salida.getText()+"','"+txtPeriodo.getText()+"','','"+txtOrden_salida.getText()+"'"+
          ",'"+txtFamilia.getText()+"','"+cbCodigo.getSelectedItem().toString()+"','"+txtDescripcion.getText()+"'"+
          ",'"+txtUnidad_medida.getText()+"',"+0+","+txtCantidad.getText()+","+stock+",'"+txtArea.getText()+"'"+
          ",'"+txtSolicitante.getText()+"',"+posi+")";
    con.insertar(sql);
    }else{
        float NuevaEntrada = 0;
        float NuevoStock = 0;

        NuevaEntrada=SalidaActualKardex(cbCodigo.getSelectedItem().toString(),txtFecha_salida.getText(),txtOrden_salida.getText())+Float.parseFloat(txtCantidad.getText());
        NuevoStock=StockActualKardex(cbCodigo.getSelectedItem().toString(),txtFecha_salida.getText(),txtOrden_salida.getText())-Float.parseFloat(txtCantidad.getText());
        sql="update Kardex set salida="+NuevaEntrada+",stock="+NuevoStock+
             " where codigo_producto='"+cbCodigo.getSelectedItem().toString()
             +"' and fecha='"+txtFecha_salida.getText()
             +"' and orden_salida='"+ txtOrden_salida.getText()
             +"' and destino='"+txtArea.getText()
             +"' and solicitante='"+txtSolicitante.getText()+"'";
         System.out.print("\n1 ....."+sql+"\n");
         con.insertar(sql);
       
         int posicion = 0; 
        sql="select pos from Kardex where codigo_producto='"+cbCodigo.getSelectedItem().toString()
                +"' and fecha='"+txtFecha_salida.getText()
                +"' and orden_salida='"+ txtOrden_salida.getText()
                +"' and destino='"+txtArea.getText()
                +"' and solicitante='"+txtSolicitante.getText()+"'";
         System.out.print("\n2......."+sql+"\n");
            ResultSet rsnum=con.consultar(sql);
        
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }

        sql="select stock,pos from Kardex where codigo_producto='"+cbCodigo.getSelectedItem().toString()+"' and pos >"+posicion;
         System.out.print("\n3 .. ... "+sql+"\n");
        ResultSet rs2 = con.consultar(sql);


        float restarEsto=Float.parseFloat(txtCantidad.getText());
        float modificarEsto=0;
        float paraCalcular=0;
        float paraPosicionar=0;
        
               while (rs2.next()) {
               
                paraCalcular=Float.parseFloat(rs2.getString(1));
                paraPosicionar=Float.parseFloat(rs2.getString(2));
                modificarEsto = paraCalcular - restarEsto;
                System.out.print("   "+paraCalcular+"         "+"posicion = ="+paraPosicionar+"         "+"Stock ==="+modificarEsto+"\n");            
                con.insertar("update Kardex set stock="+modificarEsto+"  where pos="+paraPosicionar);
            }         
    }
    
    }
public float SalidaActualKardex(String codigo,String fecha,String orden_entrada){
        float enActual = 0;
        String sql = "select salida from Kardex where codigo_producto='" + codigo 
                + "' and fecha='" + fecha 
                + "' and orden_salida='" + orden_entrada
                +"' and destino='"+txtArea.getText()
                +"' and solicitante='"+txtSolicitante.getText()+"'";   
        
        ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                enActual = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("\n"+sql+"\t"+enActual+"\n");
        return enActual;
    }  
public float StockActualKardex(String codigo,String fecha,String orden_entrada){
        float StoActual = 0;
          String sql = "select stock from Kardex where codigo_producto='" + codigo
                + "' and fecha='" + fecha
                + "' and orden_salida='" + orden_entrada
                +"' and destino='"+txtArea.getText()
                +"' and solicitante='"+txtSolicitante.getText()+"'";
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
public int contadorPosicionesKardex(){
        int posicion = 0;
        String sql = "select count(codigo_producto) from Kardex";
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
        String sql = "select cantidad from Stock where codigo_producto='" + codigo + "'";
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
public void paraActualizarKardex(String codigo,String fecha,String  notaEntrada) throws SQLException{
     int posicion = 0;
     String sql="";
      sql="select pos from Kardex where codigo_producto='"+codigo+"' and orden_salida ='"+notaEntrada+
              "'  and fecha='"+fecha+
              "' and destino='"+txtArea.getText()
              +"' and solicitante='"+txtSolicitante.getText()+"'";
      ResultSet rsnum=objGBD.consultar(sql);
        try {
            while (rsnum.next()) {
                posicion = rsnum.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("\n"+sql+"\n"+posicion+"\n");

        float actual=cantidadModificar;
        float modificado=Float.parseFloat(txtCantidad.getText());

        System.out.print(" esta es la modificacion "+actual+" ====== "+modificado+"\n");

        float sumarEsto=0;
        float restarEsto=0;
        float modificarEsto=0;
        float paraCalcular=0;
        int paraPosicionar=0;
        sql="select stock,pos from Kardex where codigo_producto='"+codigo+"' and pos >="+posicion;
        System.out.print("\n"+sql+"\n");
        ResultSet rs2 = objGBD.consultar(sql);

        if( actual > modificado ){
             float NuevaSalida = 0;

              System.out.print(" \n esta es la modificacion  actual > modificado \n")  ;
              sumarEsto = actual-modificado;

             NuevaSalida=cantidad_SalidasStock(cbCodigo.getSelectedItem().toString(),txtFecha_salida.getText(),txtOrden_salida.getText());
             sql="update Kardex set salida="+NuevaSalida+
             " where codigo_producto='"+cbCodigo.getSelectedItem().toString()+"'" +
                     " and fecha='"+txtFecha_salida.getText()+"'" +
                     " and orden_salida='"+txtOrden_salida.getText()+
                     "' and destino='"+txtArea.getText()
                +"' and solicitante='"+txtSolicitante.getText()+"'";
             con.insertar(sql);
             System.out.print(" \n esta es "+cantidad_SalidasStock(cbCodigo.getSelectedItem().toString(),txtFecha_salida.getText(),txtOrden_salida.getText())+"      "+sumarEsto+" \n");

            try {
               while (rs2.next()) {
                paraCalcular=Float.parseFloat(rs2.getString(1));
                paraPosicionar=Integer.parseInt(rs2.getString(2));
                modificarEsto = paraCalcular+sumarEsto;
                System.out.print("   "+paraCalcular+"         "+paraPosicionar+"         "+modificarEsto+"\n");
                  sql="update Kardex set stock="+String.valueOf(modificarEsto)+"where pos="+paraPosicionar;
                con.insertar(sql);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }

        }else if(actual < modificado){


            float NuevaSalida = 0;

              System.out.print(sql+" \n esta es la modificacion  actual > modificado \n")  ;
              restarEsto = modificado - actual;

             NuevaSalida=cantidad_SalidasStock(cbCodigo.getSelectedItem().toString(),txtFecha_salida.getText(),txtOrden_salida.getText());
             sql="update Kardex set salida="+NuevaSalida+
             " where codigo_producto='"+cbCodigo.getSelectedItem().toString()+"'" +
                     " and fecha='"+txtFecha_salida.getText()+"'" +
                     " and orden_salida='"+txtOrden_salida.getText()+
                     "' and destino='"+txtArea.getText()
                +"' and solicitante='"+txtSolicitante.getText()+"'";
             con.insertar(sql);
              System.out.print("\n"+sql+" esta es "+NuevaSalida+"-"+restarEsto+" \n");

            try {
               while (rs2.next()) {
                paraCalcular=Float.parseFloat(rs2.getString(1));
                paraPosicionar=Integer.parseInt(rs2.getString(2));
                modificarEsto = paraCalcular-restarEsto;
                System.out.print("   "+paraCalcular+"         "+paraPosicionar+"         "+modificarEsto+"\n");
                sql = "update Kardex set stock="+String.valueOf(modificarEsto)+"where pos="+paraPosicionar;
                con.insertar(sql);
            }
              } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
public float cantidad_SalidasStock(String producto,String fecha, String orden){
        float entradas = 0;
        String sql="";
        sql="select sum(cantidad) from salidas where codigo_producto ='"+producto+
                "' and fecha_salida='"+fecha+
                "' and orden_salida='"+orden+
                "' and Area='"+txtArea.getText()
                +"' and solicitante='"+txtSolicitante.getText()+"'";
        ResultSet rsnum=con.consultar(sql);
        try {
            while (rsnum.next()) {
                entradas = rsnum.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("\n"+sql+"\n"+entradas +"\n");
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
            int cantidades = 0;
            fecha=txtFecha_salida.getText();
            System.out.print(fecha.length());
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
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbCodigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtFecha_salida;
    private javax.swing.JTextField txtOrden_salida;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtPrecio_unitario;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtUnidad_medida;
    // End of variables declaration//GEN-END:variables

}
