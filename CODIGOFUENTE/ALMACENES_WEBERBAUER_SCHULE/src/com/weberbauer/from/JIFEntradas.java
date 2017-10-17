
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JIFEntradas extends javax.swing.JInternalFrame {

    //imprimir_pagina
    ImprimirTabla impTab= new ImprimirTabla();

    public Vector vClie;
    public Vector colNames;
    public int N;
    GestorBD objGBD;
    int numero=0;
    int numa;
    int numb;
    int numc;
    int numd;
    int nume;
    String p1;
    String p2;
    String p3;
    String p4;
    String pe5;
    String titulo=null;

    public JIFEntradas() {
        initComponents();
        //restringir a los usuarios
        //---------
        this.setTitle("ENTRADA");
        // conectamos a la Base de Datos
         objGBD = new GestorBD();
         objGBD.conectar();
        // tabla
        colNames = new Vector();
        colNames.add("FECHA");
        colNames.add("PERIODO");
        colNames.add("N. E.");
        colNames.add("FAMILIA");
        colNames.add("CODIGO");
        colNames.add("RODUCTO");
        colNames.add("U. M.");
        colNames.add("CANTIDAD");
        colNames.add("PRECIO U.");
        colNames.add("TOTAL");
        colNames.add("PROVEEDOR");
        VerificarDisposicion();
        mostrarTabla();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnGuardarExcel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImpresora = new javax.swing.JButton();
        btnRCompleto = new javax.swing.JButton();
        btnBucar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1025, 640));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("ENTRADAS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("RUC. :    20117356575");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        p01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p01.setPreferredSize(new java.awt.Dimension(800, 550));

        jPanel2.setBackground(new java.awt.Color(149, 149, 95));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("     FECHA");

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

        jPanel3.setBackground(new java.awt.Color(149, 149, 95));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PERIODO ");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel4)
        );

        jPanel4.setBackground(new java.awt.Color(149, 149, 95));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("     FAMILIA");

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

        jPanel5.setBackground(new java.awt.Color(149, 149, 95));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  CODIGO");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel6)
        );

        jPanel6.setBackground(new java.awt.Color(149, 149, 95));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  PROVEEDOR");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

        TABLA1.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
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

        jLayeredPane1.setBackground(new java.awt.Color(0, 102, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        btnGuardarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/Excel.jpg"))); // NOI18N
        btnGuardarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarExcelActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnGuardarExcel);
        btnGuardarExcel.setBounds(290, 10, 100, 60);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/saliir.jpg"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnSalir);
        btnSalir.setBounds(390, 10, 110, 60);

        btnImpresora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/impresora-epson.jpg"))); // NOI18N
        btnImpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpresoraActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnImpresora);
        btnImpresora.setBounds(180, 10, 110, 60);

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

        btnBucar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/boton-buscar-over.gif"))); // NOI18N
        btnBucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout p01Layout = new org.jdesktop.layout.GroupLayout(p01);
        p01.setLayout(p01Layout);
        p01Layout.setHorizontalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, p01Layout.createSequentialGroup()
                .addContainerGap()
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, p01Layout.createSequentialGroup()
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, txt01)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(txt02)
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
                        .add(96, 96, 96)
                        .add(btnBucar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19))
                    .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 514, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p01Layout.setVerticalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .addContainerGap()
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(p01Layout.createSequentialGroup()
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel3, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .add(btnBucar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/otro_logo.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(jLabel8)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 473, Short.MAX_VALUE)
                        .add(jLabel12))
                    .add(jLabel10)
                    .add(jLabel11))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel8)
                        .add(13, 13, 13)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel10)
                        .add(11, 11, 11)
                        .add(jLabel11))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel12)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
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
        // TODO add your handling code here:
}//GEN-LAST:event_txt01ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

                this.setVisible(false);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarExcelActionPerformed

           JFileChooser fileChooser = new JFileChooser();
           int result = fileChooser.showSaveDialog(null);
           if ( result == JFileChooser.APPROVE_OPTION ){
            try
            {
                //se obtiene la direccion donde se guardara el archivo
               String url = fileChooser.getSelectedFile().toString();
               //se guarda el archivo en la direcciontal
               exportTable(TABLA1, new File( url+".xls"));
            }
            catch (IOException ex)
            {
            ex.printStackTrace();
            }
       }

    }//GEN-LAST:event_btnGuardarExcelActionPerformed

    private void btnImpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpresoraActionPerformed

                impTab.ImpTabla(TABLA1,titulo);

    }//GEN-LAST:event_btnImpresoraActionPerformed

    private void btnRCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCompletoActionPerformed

        mostrarTabla();

    }//GEN-LAST:event_btnRCompletoActionPerformed

    private void btnBucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarActionPerformed

        VerificarCampos();
        ExtraerCampos();
        String sql= segunLoscampos(numa,numb,numc, numd,nume);
        ObtenerporProducto(sql);


    }//GEN-LAST:event_btnBucarActionPerformed

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



    public void ObtenerporProducto(String sql) {
        vClie = objGBD.vectorConsulta(sql);
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        TABLA1.setModel(model);
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
            sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where fecha_mov like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 +"%'"
                    + " and proveedore like '%" + pe5 + "%'";

        } else if (a == 1 && b == 1 && c == 1 && e == 1) {
            sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where fecha_mov  like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (b == 1 && c == 1 && d == 1 && e == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (a == 1 && c == 1 && d == 1 && e == 1) {
           sql = "select * from entrada_registro "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'"
                    + " and proveedore like '%" + pe5 + "'";
        } else if (a == 1 && b == 1 && e == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where "
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'"
                    + " and precio_unitario like '%" + pe5 + "%'";
        } else if (a == 1 && c == 1 && e == 1) {
  sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (a == 1 && d == 1 && e == 1) {
 sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where "
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (b == 1 && c == 1 && e == 1) {
 sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and precio_unitario like '%" + pe5 + "%'";
        } else if (b == 1 && d == 1 && e == 1) {
  sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " periodo like '%" + p2 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (c == 1 && d == 1 && e == 1) {
  sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (a == 1 && b == 1 && c == 1 && d == 1) {
 sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'";
        } else if (a == 1 && b == 1 && c == 1) {
            sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'";
        } else if (b == 1 && c == 1 && d == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'";
        } else if (a == 1 && c == 1 && d == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and familia like '%" + p3 + "%'"
                    + " and codigo_producto like '%" + p4 + "%'";
        } else if (a == 1 && b == 1 && d == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (a == 1 && b == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and periodo like '%" + p2 + "%'";
        } else if (a == 1 && c == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 + "%'"
                    + " and familia like '%" + p3 + "%'";
        } else if (a == 1 && d == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " fecha_mov  like '%" + p1 +"%'"
                    + " and codigo_producto like '%" + p4 +"%'";
        } else if (b == 1 && c == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " periodo like '%" + p2 + "%'"
                    + " and familia like '%" + p3 + "%'";
        } else if (b == 1 && d == 1) {
          sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " periodo like '%" + p2 + "%'"
                    + " and codigo_producto like '%" + p4 +"%'";
        } else if (a == 1 && e == 1) {
          sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                  + "where " +
                   " fecha_mov  like '%" + p1 +"%'"
                  + " and proveedore like '%" + pe5 + "%'";
        } else if (b == 1 && e == 1) {
              sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where"
                    + " periodo like '%" + p2 + "%'"
                    + " and proveedore like '%" + pe5 + "%'";
        } else if (c == 1 && e == 1) {
            sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
             + " where "
             + "  familia like '%" + p3 + "%'"
             + " and proveedore like '%" + pe5 + "%'";
        }else if (d == 1 && e == 1) {
            sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
               + " where "
               + "  codigo_producto like '%" + p4 +"%'"
               + " and proveedore like '%" + pe5 + "%'";
        }else if (c == 1 && d == 1) {
        sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                   + "where"
                    + " familia like '%" + p3 + "%'"
                   + " and codigo_producto like '%" + p4 +"%'";
        } else if (a == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where fecha_mov  like '%" + p1 + "%'";
        } else if (b == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where periodo like '%" + p2 + "%'";
        } else if (c == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                   + "where familia like '%" + p3 + "%'";
        } else if (d == 1) {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where codigo_producto like '%" + p4 + "%'";
        } else {
           sql = "select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada "
                    + "where proveedore like '%" + pe5 + "%'";
        }
        setNumeros();
        System.out.print(sql);
        return sql;
    }
    void mostrarTabla(){
        vClie = objGBD.vectorConsulta("select fecha_mov, periodo,orden_entrada, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, proveedore from entrada ");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        TABLA1.setModel(model);
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
    private javax.swing.JButton btnBucar;
    private javax.swing.JButton btnGuardarExcel;
    private javax.swing.JButton btnImpresora;
    private javax.swing.JButton btnRCompleto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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