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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class JIFProveedoresGeneral extends javax.swing.JInternalFrame {
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
    String p1;
    String p2;
    String p3;
    String p4;
    String titulo;
    public JIFProveedoresGeneral() {
        initComponents();
        this.setTitle("Rgistro");
        // conectamos a la Base de Datos
         objGBD = new GestorBD();
         objGBD.conectar();
        // tabla
        colNames = new Vector();
        colNames.add("CODIGO");
        colNames.add(" RUC ");
        colNames.add("RAZON SOCIAL");
        colNames.add("TELEFONO ");
        colNames.add("DIRECCION");
        colNames.add("E-MAIL");
        colNames.add("CATEGORIA");
        VerificarDisposicion();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        txt04 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt03 = new javax.swing.JTextField();
        txt02 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt01 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnGuardarExcel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImpresora = new javax.swing.JButton();
        btnRCompleto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("PROVEEDORES GENERALES");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("RUC. :    20117356575");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p5.setPreferredSize(new java.awt.Dimension(800, 550));

        txt04.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(77, 123, 158));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CATEGORIA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jPanel5.setBackground(new java.awt.Color(77, 123, 158));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   RAZON SOCIAL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        txt03.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt02.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(77, 123, 158));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("      RUC");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt01.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        txt01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt01ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(77, 123, 158));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    CODIGO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        btnGuardarExcel.setBounds(400, 10, 210, 60);

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
        btnSalir.setBounds(610, 10, 190, 60);

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
        btnImpresora.setBounds(170, 10, 230, 60);

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
        btnRCompleto.setBounds(10, 10, 160, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/boton-buscar-over.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt01, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt03)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt02)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt04)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(139, 139, 139)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, 0, 19, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/otro_logo.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGap(10, 10, 10)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap())
            .addComponent(p5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        VerificarCampos();
        ExtraerCampos();
        String sql= segunLoscampos(numa,numb,numc, numd);
        ObtenerporProducto(sql);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCompletoActionPerformed

        mostrarTabla();
    }//GEN-LAST:event_btnRCompletoActionPerformed

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
        //agrandar el ancho de las fila
        TABLA1.setRowHeight(18);
        //para darle el tamaño de las columnas
        TABLA1.getColumnModel().getColumn(0).setMaxWidth(70);//codigo
        TABLA1.getColumnModel().getColumn(1).setMinWidth(20);//ruc
        TABLA1.getColumnModel().getColumn(2).setMinWidth(160);//razon social
        TABLA1.getColumnModel().getColumn(3).setMinWidth(40);//telefono
        TABLA1.getColumnModel().getColumn(4).setMinWidth(170);//direccion
        TABLA1.getColumnModel().getColumn(5).setMinWidth(170);//email
        TABLA1.getColumnModel().getColumn(6).setMinWidth(170);//categoria

        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        TABLA1.getColumnModel().getColumn(0).setCellRenderer(tcr);//codigo
        TABLA1.getColumnModel().getColumn(1).setCellRenderer(tcr);//ruc
        TABLA1.getColumnModel().getColumn(3).setCellRenderer(tcr);//telefono
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
        System.out.print(numa + "   " + numb + "  " + numc + "  " + numd + " "+ "\n");
    }
    public void ExtraerCampos() {
        p1 = txt01.getText();
        p2 = txt02.getText();
        p3 = txt03.getText();
        p4 = txt04.getText();
        System.out.print(p1 + "   " + p2 + "  " + p3 + "  " + p4 + " " + "\n");
    }
    public String segunLoscampos(int a, int b, int c, int d) {
        String sql = null;
       if (a == 1 && b == 1 && c == 1 && d == 1) {
                  sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                    + "where"
                    + " codigo  like '%" + p1 + "%'"
                    + " and razon_social like '%" + p2 + "%'"
                    + " and ruc like '%" + p3 + "%'"
                    + " and categoria like '%" + p4 + "%' order by len(codigo),codigo";
        } else if (a == 1 && b == 1 && c == 1) {
             sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                     + "where"
                    + " codigo  like '%" + p1 + "%'"
                    + " and razon_social like '%" + p2 + "%'"
                    + " and ruc like '%" + p3 + "%' order by len(codigo),codigo";
        } else if (b == 1 && c == 1 && d == 1) {
            sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                    + "where"
                    + " razon_social like '%" + p2 + "%'"
                    + " and ruc like '%" + p3 + "%'"
                    + " and categoria like '%" + p4 + "%' order by len(codigo),codigo";
        } else if (a == 1 && c == 1 && d == 1) {
            sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                    + "where"
                    + " codigo  like '%" + p1 + "%'"
                    + " and ruc like '%" + p3 + "%'"
                    + " and categoria like '%" + p4 + "%' order by len(codigo),codigo";
        } else if (a == 1 && b == 1 && d == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                   + "where"
                    + " codigo  like '%" + p1 + "%'"
                    + " and razon_social like '%" + p2 + "%'"
            + " and categoria like '%" + p4 + "%' order by len(codigo),codigo";
        } else if (a == 1 && b == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                   + "where"
                    + " codigo  like '%" + p1 + "%'"
                    + " and razon_social like '%" + p2 + "%' order by len(codigo),codigo";
        } else if (a == 1 && c == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                   + "where"
                    + " codigo  like '%" + p1 + "%'"
                    + " and ruc like '%" + p3 + "%' order by len(codigo),codigo";
        } else if (a == 1 && d == 1) {
            sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                    + "where"
                    + " codigo  like '%" + p1 +"%'"
                    + " and categoria like '%" + p4 +"%' order by len(codigo),codigo";
        } else if (b == 1 && c == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                   + "where"
                    + " razon_social like '%" + p2 + "%'"
                    + " and ruc like '%" + p3 + "%' order by len(codigo),codigo";
        } else if (b == 1 && d == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                   + "where"
                    + " razon_social like '%" + p2 + "%'"
                     + " and categoria like '%" + p4 +"%' order by len(codigo),codigo";
        } else if (c == 1 && d == 1) {
            sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general  "
                    + "where"
                    + " ruc like '%" + p3 + "%'"
                    + " and categoria like '%" + p4 + "%' order by len(codigo),codigo";
        } else if (a == 1) {
          sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                    + "where codigo  like '%" + p1 + "%' order by len(codigo),codigo";
        } else if (b == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general  "
                    + "where razon_social like '%" + p2 + "%' order by len(codigo),codigo";
        } else if (c == 1) {
           sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                    + "where ruc like '%" + p3 + "%' order by len(codigo),codigo";
        } else if (d == 1) {
                       sql = "select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general "
                               + "where categoria like '%" + p4 + "%' order by len(codigo),codigo";
        }
   System.out.print(sql);
        setNumeros();
        return sql;
    }
    void mostrarTabla(){
        vClie = objGBD.vectorConsulta("select codigo, ruc,razon_social, telefono, direccion,email, categoria from proveedor_general ");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        TABLA1.setModel(model);
        //agrandar el ancho de las fila
        TABLA1.setRowHeight(18);
        //para darle el tamaño de las columnas
        TABLA1.getColumnModel().getColumn(0).setMaxWidth(70);//codigo
        TABLA1.getColumnModel().getColumn(1).setMinWidth(20);//ruc
        TABLA1.getColumnModel().getColumn(2).setMinWidth(160);//razon social
        TABLA1.getColumnModel().getColumn(3).setMinWidth(40);//telefono
        TABLA1.getColumnModel().getColumn(4).setMinWidth(170);//direccion
        TABLA1.getColumnModel().getColumn(5).setMinWidth(170);//email
        TABLA1.getColumnModel().getColumn(6).setMinWidth(170);//categoria

        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        TABLA1.getColumnModel().getColumn(0).setCellRenderer(tcr);//codigo
        TABLA1.getColumnModel().getColumn(1).setCellRenderer(tcr);//ruc
        TABLA1.getColumnModel().getColumn(3).setCellRenderer(tcr);//telefono

    }
    public void setNumeros() {
        numa = 0;
        numb = 0;
        numc=0;
        numd = 0;

        p1=null;
        p2=null;
        p3=null;
        p4=null;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA1;
    private javax.swing.JButton btnGuardarExcel;
    private javax.swing.JButton btnImpresora;
    private javax.swing.JButton btnRCompleto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p5;
    private javax.swing.JTextField txt01;
    private javax.swing.JTextField txt02;
    private javax.swing.JTextField txt03;
    private javax.swing.JTextField txt04;
    // End of variables declaration//GEN-END:variables

}
