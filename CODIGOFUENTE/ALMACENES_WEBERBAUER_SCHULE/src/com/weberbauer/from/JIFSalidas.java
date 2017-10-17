
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

public class JIFSalidas extends javax.swing.JInternalFrame {
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
    String titulo;
    public JIFSalidas() {
        initComponents();
        this.setTitle("SALIDAS 0");
        // conectamos a la Base de Datos
         objGBD = new GestorBD();
         objGBD.conectar();


        // tabla
        colNames = new Vector();
        colNames.add("FECHA");
        colNames.add("PERIODO");
        colNames.add("O. S. ");
        colNames.add("FAMILIA");
        colNames.add("CODIGO");
        colNames.add("PRODUCTO");
        colNames.add("U. M.");
        colNames.add("CANTIDAD");
        colNames.add("P. U.");
        colNames.add("P. T.");
        colNames.add("DESTINO");
        colNames.add("NOMBRE");
        VerificarDisposicion();
        mostrarTabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1025, 640));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("RUC. :    20117356575");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("SALIDAS");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/otro_logo.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p01.setPreferredSize(new java.awt.Dimension(800, 550));

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel2.setText("    FECHA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel4.setText("PERIODO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel5.setText("    FAMILIA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel6.setText(" NOMBRE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 3, 10)); // NOI18N
        jLabel7.setText("DESTINO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
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
        btnGuardarExcel.setBounds(390, 10, 220, 60);

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
        btnSalir.setBounds(610, 10, 210, 60);

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
        btnImpresora.setBounds(180, 10, 210, 60);

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/boton-buscar-over.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p01Layout = new javax.swing.GroupLayout(p01);
        p01.setLayout(p01Layout);
        p01Layout.setHorizontalGroup(
            p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p01Layout.createSequentialGroup()
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt01, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt02)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt03)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt04)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt05)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p01Layout.setVerticalGroup(
            p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p01Layout.createSequentialGroup()
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p01Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(p01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 725, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(758, Short.MAX_VALUE))))
            .addComponent(p01, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p01, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap())
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
        String sql= segunLoscampos(numa,numb,numc, numd,nume);
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
        // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       TABLA1.getColumnModel().getColumn(0).setMaxWidth(70); //fecha
       TABLA1.getColumnModel().getColumn(1).setMaxWidth(70); //periodo
       TABLA1.getColumnModel().getColumn(2).setMaxWidth(65); //numero de salida
       TABLA1.getColumnModel().getColumn(3).setMinWidth(80); //familia
       TABLA1.getColumnModel().getColumn(4).setMaxWidth(65); //codigo
       TABLA1.getColumnModel().getColumn(5).setMinWidth(110); //producto
       TABLA1.getColumnModel().getColumn(6).setMaxWidth(60); //unidad de medida
       TABLA1.getColumnModel().getColumn(7).setMaxWidth(60); //cantidad
       TABLA1.getColumnModel().getColumn(8).setMaxWidth(60); //precio unitario
       TABLA1.getColumnModel().getColumn(9).setMaxWidth(60); //total
       TABLA1.getColumnModel().getColumn(10).setMinWidth(100); //destino
       TABLA1.getColumnModel().getColumn(11).setMinWidth(100); //nombre
       //agrandar el ancho de las filas
        TABLA1.setRowHeight(18);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        TABLA1.getColumnModel().getColumn(0).setCellRenderer(tcr);//fecha
        TABLA1.getColumnModel().getColumn(1).setCellRenderer(tcr);//periodo
        TABLA1.getColumnModel().getColumn(2).setCellRenderer(tcr);//nota de entrada
        TABLA1.getColumnModel().getColumn(4).setCellRenderer(tcr);//codigo
        TABLA1.getColumnModel().getColumn(6).setCellRenderer(tcr);//unidad medida
        TABLA1.getColumnModel().getColumn(7).setCellRenderer(tcr);//cantidad
        TABLA1.getColumnModel().getColumn(8).setCellRenderer(tcr);//precio unutario
        TABLA1.getColumnModel().getColumn(9).setCellRenderer(tcr);//precio total
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
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'" + " and Area like  '%" + pe5 + "%'";

        } else if (a == 1 && b == 1 && c == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'" + " and Area like  '%" + pe5 +"%'";
        } else if (b == 1 && c == 1 && d == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where " + " and periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'" + " and Area like  '%" + pe5 + "%'";
        } else if (a == 1 && c == 1 && d == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'" + " and Area like  '%" + pe5 + "%'";
        } else if (a == 1 && b == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and periodo like  '%"+ p2 + "%'" + " and Area like  '%" + pe5 +"%'";
        } else if (a == 1 && c == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and familia like  '%" + p3 + "%'" + " and Area like  '%" + pe5 + "%'";
        } else if (a == 1 && d == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and solicitante like  '%" + p4 + "%'" + " and Area like  '%" + pe5 +"%'";
        } else if (b == 1 && c == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where " + " and periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'" + " and Area like  '%" + pe5 +"%'";
        } else if (b == 1 && d == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where periodo like  '%" + p2 + "%'" + " and solicitante like  '%" + p4 + "%'" + " and Area like  '%" + pe5 +"%'";
        } else if (c == 1 && d == 1 && e == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where " + " familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'" + " and Area like  '%" + pe5 + "%'";
        } else if (a == 1 && b == 1 && c == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "'" + " and solicitante= '" + p4+"%'";
        } else if (a == 1 && b == 1 && c == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'";
        } else if (b == 1 && c == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where  periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'";
        } else if (a == 1 && c == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%"+ p1 + "%'" + " and familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'";
        } else if (a == 1 && b == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%"+ p1 + "%'" + " and periodo like  '%" + p2 + "%'" + " and solicitante like  '%" + p4 + "%'";
        } else if (a == 1 && b == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and periodo like  '%" + p2 +"%'";
        } else if (a == 1 && c == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and familia like  '%" + p3 + "%'";
        } else if (a == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'" + " and solicitant like  '%" + p4 +"%'";
        } else if (b == 1 && c == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where periodo like  '%" + p2 + "%'" + " and familia like  '%" + p3 + "%'";
        } else if (b == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where" + " periodo like  '%"+ p2 + "%'" + " and Area like  '%" + pe5 + "%'";
        } else if (c == 1 && d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where familia like  '%" + p3 + "%'" + " and solicitante like  '%" + p4 + "%'";
        } else if (a == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where fecha_salida like  '%" + p1 + "%'";
        } else if (b == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where periodo like  '%" + p2 + "%'";
        } else if (c == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where familia like  '%" + p3 + "%'";
        } else if (d == 1) {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where solicitante like  '%" + p4 + "%'";
        } else {
            sql = "select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas "
                    + "where Area like  '%" + pe5 + "%'";
        }

        setNumeros();
        return sql;
    }

    void mostrarTabla() {
        vClie = objGBD.vectorConsulta("select fecha_salida, periodo,orden_salida, familia, codigo_producto, descripcion, unidad_medida , cantidad, precio_unitario, precio_total, Area,solicitante from salidas ");
        DefaultTableModel model = new DefaultTableModel(vClie, colNames);
        TABLA1.setModel(model);
        // jTable1.getColumnModel().getColumn(0).setMaxWidth(1500);
       TABLA1.getColumnModel().getColumn(0).setMaxWidth(70); //fecha
       TABLA1.getColumnModel().getColumn(1).setMaxWidth(70); //periodo
       TABLA1.getColumnModel().getColumn(2).setMaxWidth(65); //numero de salida
       TABLA1.getColumnModel().getColumn(3).setMinWidth(80); //familia
       TABLA1.getColumnModel().getColumn(4).setMaxWidth(65); //codigo
       TABLA1.getColumnModel().getColumn(5).setMinWidth(110); //producto
       TABLA1.getColumnModel().getColumn(6).setMaxWidth(60); //unidad de medida
       TABLA1.getColumnModel().getColumn(7).setMaxWidth(60); //cantidad
       TABLA1.getColumnModel().getColumn(8).setMaxWidth(60); //precio unitario
       TABLA1.getColumnModel().getColumn(9).setMaxWidth(60); //total
       TABLA1.getColumnModel().getColumn(10).setMinWidth(100); //destino
       TABLA1.getColumnModel().getColumn(11).setMinWidth(100); //nombre
               //agrandar el ancho de las filas
        TABLA1.setRowHeight(18);
        //centrar los datos de la tabla
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        TABLA1.getColumnModel().getColumn(0).setCellRenderer(tcr);//fecha
        TABLA1.getColumnModel().getColumn(1).setCellRenderer(tcr);//periodo
        TABLA1.getColumnModel().getColumn(2).setCellRenderer(tcr);//nota de entrada
        TABLA1.getColumnModel().getColumn(4).setCellRenderer(tcr);//codigo
        TABLA1.getColumnModel().getColumn(6).setCellRenderer(tcr);//unidad medida
        TABLA1.getColumnModel().getColumn(7).setCellRenderer(tcr);//cantidad
        TABLA1.getColumnModel().getColumn(8).setCellRenderer(tcr);//precio unutario
        TABLA1.getColumnModel().getColumn(9).setCellRenderer(tcr);//precio total
    }

    public void setNumeros() {
        numa = 0;
        numb = 0;
        numc = 0;
        numd = 0;
        nume = 0;
        p1 = null;
        p2 = null;
        p3 = null;
        p4 = null;
        pe5 = null;
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
