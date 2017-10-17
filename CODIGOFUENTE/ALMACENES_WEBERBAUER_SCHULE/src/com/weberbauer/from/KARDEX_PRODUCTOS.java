package com.weberbauer.from;

import com.weberbauer.utils.ImprimirTabla;
import com.weberbauer.conexion.GestorBD;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class KARDEX_PRODUCTOS extends javax.swing.JFrame {

    public Vector vClie;
    public Vector colNames;
    public int N;
    GestorBD objGBD;
    ImprimirTabla impTab = new ImprimirTabla();
    int numa=0;
    int numb=0;
    int numc=0;
    int numd=0;
    int nume=0;
    String p1;
    String p2;
    String p3;
    String p4;
    String pe5;
    String titulo="KARDEX";
    public KARDEX_PRODUCTOS() {
        initComponents();
        this.setTitle("KARDEX");
        objGBD = new GestorBD();
        objGBD.conectar();
        colNames = new Vector();
        colNames.add("FECHA");
        colNames.add("PERIODO");
        colNames.add("N.E");
        colNames.add("O.SALIDA");
        colNames.add("FAMILIA");
        colNames.add("CODIGO");
        colNames.add("PRODUCTO");
        colNames.add("U.M");
        colNames.add("ENTRADA");
        colNames.add("SALIDA");
        colNames.add("STOCK");
        colNames.add("DESTINO");
        colNames.add("NOMBRE");
        VerificarDisposicion();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        p01 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt01 = new javax.swing.JTextField();
        txt02 = new javax.swing.JTextField();
        txt03 = new javax.swing.JTextField();
        txt04 = new javax.swing.JTextField();
        txt05 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnGuardarExcel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImpresora = new javax.swing.JButton();
        btnRCompleto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("KARDEX DE PRODUCTO");

        p01.setBackground(new java.awt.Color(208, 224, 245));
        p01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p01.setPreferredSize(new java.awt.Dimension(800, 550));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Familia");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Codigo");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(63, 63, 63)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel4)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("    Producto");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel5)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   Destino");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel6)
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 3, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("   Nombre");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel7)
        );

        txt01.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt01ActionPerformed(evt);
            }
        });

        txt02.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt03.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt04.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt05.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TABLA1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        TABLA1.setForeground(new java.awt.Color(102, 102, 102));
        TABLA1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TABLA1);

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/boton-buscar-over.gif"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(0, 102, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        btnGuardarExcel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarExcel.setForeground(new java.awt.Color(0, 0, 153));
        btnGuardarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/Excel.jpg"))); // NOI18N
        btnGuardarExcel.setText("GUARDAR");
        btnGuardarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarExcelActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnGuardarExcel);
        btnGuardarExcel.setBounds(400, 10, 220, 60);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/saliir.jpg"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnSalir);
        btnSalir.setBounds(620, 10, 210, 60);

        btnImpresora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImpresora.setForeground(new java.awt.Color(0, 0, 153));
        btnImpresora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/impresora-epson.jpg"))); // NOI18N
        btnImpresora.setText("IMPRIMIR");
        btnImpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpresoraActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnImpresora);
        btnImpresora.setBounds(180, 10, 220, 60);

        btnRCompleto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRCompleto.setForeground(new java.awt.Color(0, 0, 153));
        btnRCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/Actualizaar.gif"))); // NOI18N
        btnRCompleto.setText("REGISTRO");
        btnRCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCompletoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnRCompleto);
        btnRCompleto.setBounds(10, 10, 170, 60);

        org.jdesktop.layout.GroupLayout p01Layout = new org.jdesktop.layout.GroupLayout(p01);
        p01.setLayout(p01Layout);
        p01Layout.setHorizontalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .addContainerGap()
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, p01Layout.createSequentialGroup()
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, txt01)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txt02, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txt03)
                            .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txt04)
                            .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txt05)
                            .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(46, 46, 46)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 843, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p01Layout.setVerticalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .addContainerGap()
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(p01Layout.createSequentialGroup()
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txt01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txt02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(p01Layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txt03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txt04, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txt05, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jButton2))
                .add(8, 8, 8)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/otro_logo.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel9.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel10.setText("RUC. :    20117356575");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel11.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(314, 314, 314)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(jLabel11)
                            .add(jLabel8)))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel10)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 182, Short.MAX_VALUE)
                .add(jLabel3)
                .addContainerGap())
            .add(p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(35, 35, 35)
                                .add(jLabel8))
                            .add(jLabel3))
                        .add(13, 13, 13)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel10)
                        .add(11, 11, 11)
                        .add(jLabel11)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void VerificarDisposicion(){
        ResultSet rs = null;
        String sql = null;
        sql="select disposicion from registro_usu where pos = (select max(pos) from registro_usu) ";
        rs=objGBD.consultar(sql);
        String disposicion=null;
        try {
            while (rs.next()) {
             disposicion=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(disposicion.equals("ADMINISTRADOR")){
            btnImpresora.setVisible(true);
            btnGuardarExcel.setVisible(true);
        }
        else if(disposicion.equals("USUARIO"))
        {
            btnImpresora.setVisible(false);
            btnGuardarExcel.setVisible(false);
        }
    }

    private void txt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt01ActionPerformed

    }//GEN-LAST:event_txt01ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VerificarCampos();
        ExtraerCampos();
        String sql= segunLoscampos(numa,numb,numc, numd,nume);
        ObtenerporProducto(sql);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarExcelActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION ){
            try {
                //se obtiene la direccion donde se guardara el archivo
                String url = fileChooser.getSelectedFile().toString();
                //se guarda el archivo en la direcciontal
                exportTable(TABLA1, new File( url+".xls"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            // catch (IOException ex)
            // {
            // ex.printStackTrace();
            // }
        }
    }//GEN-LAST:event_btnGuardarExcelActionPerformed

public void exportTable(JTable table, File file) throws IOException
 {
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);
        for(int i=0; i < model.getColumnCount(); i++)
            {
            out.write(model.getColumnName(i) + "\t");
            }
        out.write("\n");
        for(int i=0; i< model.getRowCount(); i++)
            {
            for(int j=0; j < model.getColumnCount(); j++)
                {
                out.write(model.getValueAt(i,j).toString()+"\t");
                }
            out.write("\n");
            }
        out.close();
 }


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpresoraActionPerformed

        impTab.ImpTabla(TABLA1,titulo);
    }//GEN-LAST:event_btnImpresoraActionPerformed

    private void btnRCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCompletoActionPerformed

        mostrarTabla();
}//GEN-LAST:event_btnRCompletoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new KARDEX_PRODUCTOS().setVisible(true);
            }
        });
    }

    public void ObtenerporProducto(String sql) {
        vClie = objGBD.vectorConsulta(sql);
        System.out.print(sql);
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        TABLA1.setModel(model);
      // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       TABLA1.getColumnModel().getColumn(0).setMaxWidth(65); //fecha
       TABLA1.getColumnModel().getColumn(1).setMaxWidth(65); //periodo
       TABLA1.getColumnModel().getColumn(2).setMaxWidth(65); //nota entrada
       TABLA1.getColumnModel().getColumn(3).setMaxWidth(65); //orden salida
       TABLA1.getColumnModel().getColumn(4).setMinWidth(50); //familia
       TABLA1.getColumnModel().getColumn(5).setMaxWidth(60); //codigo
       TABLA1.getColumnModel().getColumn(6).setMinWidth(50); //producto
       TABLA1.getColumnModel().getColumn(7).setMaxWidth(60); //unida medida
       TABLA1.getColumnModel().getColumn(8).setMaxWidth(60); //entrada
       TABLA1.getColumnModel().getColumn(9).setMaxWidth(60); //salida
       TABLA1.getColumnModel().getColumn(10).setMaxWidth(60); //stock
       TABLA1.getColumnModel().getColumn(11).setMinWidth(40); //destino
       TABLA1.getColumnModel().getColumn(12).setMinWidth(40); //nombre
       //agrandar el ancho de las filas
        TABLA1.setRowHeight(18);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        TABLA1.getColumnModel().getColumn(0).setCellRenderer(tcr);//fecha
        TABLA1.getColumnModel().getColumn(1).setCellRenderer(tcr);//peridod
        TABLA1.getColumnModel().getColumn(2).setCellRenderer(tcr);//nota entrada
        TABLA1.getColumnModel().getColumn(3).setCellRenderer(tcr);//orden salida
        TABLA1.getColumnModel().getColumn(5).setCellRenderer(tcr);//codigo
        TABLA1.getColumnModel().getColumn(7).setCellRenderer(tcr);//unidad de medida
        TABLA1.getColumnModel().getColumn(8).setCellRenderer(tcr);//entrada
        TABLA1.getColumnModel().getColumn(9).setCellRenderer(tcr);//salida
        TABLA1.getColumnModel().getColumn(10).setCellRenderer(tcr);//stock

    }
    public void VerificarCampos() {
        if (!txt01.getText().equals("")) {
            numa = 1;
        }
        if (!txt02.getText().equals("")) {
            numb = 1;
        }
        if (!txt03.getText().equals("")) {
            numc = 1;
        }
        if (!txt04.getText().equals("")) {
            numd = 1;
        }
        if (!txt05.getText().equals("")) {
            nume = 1;
        }

        System.out.print(numa + "   " + numb + "  " + numc + "  " + numd + " " + nume + "\n");
    }
    public void ExtraerCampos() {
        p1 = txt01.getText();
        p2 = txt02.getText();
        p3 = txt03.getText();
        p4 = txt04.getText();
        pe5 = txt05.getText();
        System.out.print(p1 + "   " + p2 + "  " + p3 + "  " + p4 + " " + pe5 + "\n");
    }
    public String segunLoscampos(int a, int b, int c, int d, int e) {
        String sql = null;
        if (a == 1 && b == 1 && c == 1 && d == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "               
                    + " where familia  like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p2 + "%'"
                    + " and descripcion  like '%" + p3 + "%'"
                    + " and destino  like '%" + p4 + "%'"
                    + " and solicitante  like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (a == 1 && b == 1 && c == 1 && e == 1) {
              sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                   
                    + " where familia like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p2 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (b == 1 && c == 1 && d == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "            
                    + " where codigo_producto like '%" + p2 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and destino like '%" + p4 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (a == 1 && c == 1 && d == 1 && e == 1) {
              sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "               
                    + " where familia like '%" + p1 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and destino like '%" + p4 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (a == 1 && b == 1 && e == 1) {
               sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                
                    + " where familia like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p2 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (a == 1 && c == 1 && e == 1) {
               sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "               
                    + " where familia like '%" + p1 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (a == 1 && d == 1 && e == 1) {
              sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                 
                    + " where familia like '%" + p1 + "%'"
                    + " and destino like '%" + p4 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (b == 1 && c == 1 && e == 1) {
              sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                  
                    + " where codigo_producto like '%" + p2 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (b == 1 && d == 1 && e == 1) {
              sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "
                   + " where codigo_producto  like '%" + p2 + "%'"
                    + "  and destino like '%" + p4 + "%'"
                    + "  and solicitante  like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (c == 1 && d == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                  
                    + " where descripcion like '%" + p3 + "%'"
                    + " and destino like '%" + p4 + "%'"
                    + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (a == 1 && b == 1 && c == 1 && d == 1) {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                 
                    + " where familia like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p2 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and destino like '%" + p4 + "%'" +
                    " order by pos";
        } else if (a == 1 && b == 1 && c == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                  
                    + " where familia like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p2 + "%'"
                    + " and descripcion like '%" + p3 + "%'" +
                    " order by pos";
        } else if (b == 1 && c == 1 && d == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                 
                    + " where codigo_producto like '%" + p2 + "%'"
                    + " and descripcion like '%" + p3 + "%'"
                    + " and destino like '%" + p4 + "%'" +
                    " order by pos";
        } else if (a == 1 && c == 1 && d == 1) {
              sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                
                    + " where familia= '" + p1 + "%'"
                    + " and descripcion= '" + p3 + "%'"
                    + " and destino= '" + p4 + "%'" +
                    " order by pos";
        } else if (a == 1 && b == 1 && d == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                  
                    + " where familia like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p2 + "%'"
                    + " and destino like '%" + p4 + "%'" +
                    " order by pos";
        } else if (a == 1 && b == 1) {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                 
                    + "where familia like '%" + p1+"%'"
                    + " and codigo_producto like '%" + p2+"%'" +
                    " order by pos";
        } else if (a == 1 && c == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                   
                    + " where familia like '%" + p1 + "%'"
                    + " and descripcion like '%" + p3 + "%'" +
                    " order by pos";
        } else if (a == 1 && d == 1) {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "                 
                    + "where familia  like '%" + p1 + "%'"
                    + " and destino like '%" + p4 + "%'" +
                    " order by pos";
        } else if (b == 1 && c == 1) {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "                  
                    + "where codigo_producto  like '%" + p2 + "%'"
                    + " and descripcion  like '%" + p3 + "%'" +
                    " order by pos";
        } else if (b == 1 && d == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                   
                    + "where codigo_producto  like '%" + p2 + "%'"
                    + " and destino  like '%" + p4 + "%'" +
                    " order by pos";
        } else if (c == 1 && d == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "                
                    + "where descripcion like  '" + p3 + "%'"
                    + " and destino like '" + p4 +"%'" +
                    " order by pos";
        }else if (a == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "
                     + "where familia  like '%" + p1 +"%'"
                     + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (b == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "

                     + "where codigo_producto  like '%" + p2 + "%'"
                     + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        } else if (c == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "
                     + " where descripcion like '%" + p3 + "%'"
                     + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        }else if (d == 1 && e == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "
                      + " where destino  like '%" + p4 + "%'"
                     + " and solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        }else if (a == 1) {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "                 
                    + "where familia  like '%" + p1 +"%'" +
                    " order by pos";
        } else if (b == 1) {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex  "        
                    + "where codigo_producto  like '%" + p2 + "%'" +
                    " order by pos";
        } else if (c == 1) {
             sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "               
                    + " where descripcion like '%" + p3 + "%'" +
                    " order by pos";
        } else if (d == 1) {
                     sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "                
                    + " where destino  like '%" + p4 + "%'" +
                             " order by pos";
        } else {
            sql = "select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex "
                    + " where solicitante like '%" + pe5 + "%'" +
                    " order by pos";
        }

        setNumeros();
        return sql;
    }
    void mostrarTabla() {
        vClie = objGBD.vectorConsulta("select fecha  ,periodo,nota_entrada,orden_salida,familia,codigo_producto,descripcion,unidad_medida,entrada, salida, stock,destino,solicitante from kardex order by pos ");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        TABLA1.setModel(model);
       // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       TABLA1.getColumnModel().getColumn(0).setMaxWidth(65); //fecha
       TABLA1.getColumnModel().getColumn(1).setMaxWidth(65); //periodo
       TABLA1.getColumnModel().getColumn(2).setMaxWidth(65); //nota entrada
       TABLA1.getColumnModel().getColumn(3).setMaxWidth(65); //orden salida
       TABLA1.getColumnModel().getColumn(4).setMinWidth(50); //familia
       TABLA1.getColumnModel().getColumn(5).setMaxWidth(60); //codigo
       TABLA1.getColumnModel().getColumn(6).setMinWidth(50); //producto
       TABLA1.getColumnModel().getColumn(7).setMaxWidth(60); //unida medida
       TABLA1.getColumnModel().getColumn(8).setMaxWidth(60); //entrada
       TABLA1.getColumnModel().getColumn(9).setMaxWidth(60); //salida
       TABLA1.getColumnModel().getColumn(10).setMaxWidth(60); //stock
       TABLA1.getColumnModel().getColumn(11).setMinWidth(40); //destino
       TABLA1.getColumnModel().getColumn(12).setMinWidth(40); //nombre
       //agrandar el ancho de las filas
        TABLA1.setRowHeight(18);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        TABLA1.getColumnModel().getColumn(0).setCellRenderer(tcr);//fecha
        TABLA1.getColumnModel().getColumn(1).setCellRenderer(tcr);//peridod
        TABLA1.getColumnModel().getColumn(2).setCellRenderer(tcr);//nota entrada
        TABLA1.getColumnModel().getColumn(3).setCellRenderer(tcr);//orden salida
        TABLA1.getColumnModel().getColumn(5).setCellRenderer(tcr);//codigo
        TABLA1.getColumnModel().getColumn(7).setCellRenderer(tcr);//unidad de medida
        TABLA1.getColumnModel().getColumn(8).setCellRenderer(tcr);//entrada
        TABLA1.getColumnModel().getColumn(9).setCellRenderer(tcr);//salida
        TABLA1.getColumnModel().getColumn(10).setCellRenderer(tcr);//stock

    }
    public void setNumeros() {
        numa = 0;
        numb = 0;
        numc=0;
        numd = 0;
        nume = 0;
        p1=null;
        p2=null;
        p3=null;
        p4=null;
        pe5=null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA1;
    private javax.swing.JButton btnGuardarExcel;
    private javax.swing.JButton btnImpresora;
    private javax.swing.JButton btnRCompleto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p01;
    private javax.swing.JTextField txt01;
    private javax.swing.JTextField txt02;
    private javax.swing.JTextField txt03;
    private javax.swing.JTextField txt04;
    private javax.swing.JTextField txt05;
    // End of variables declaration//GEN-END:variables

}
