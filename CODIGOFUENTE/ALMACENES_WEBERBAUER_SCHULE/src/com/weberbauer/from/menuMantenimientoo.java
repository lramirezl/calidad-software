
package com.weberbauer.from;

//reloj
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class menuMantenimientoo extends javax.swing.JFrame implements ActionListener{

     //Declaramos el timer con 1000 milisegundos, y el oyente la misma clase
    Timer timer = new Timer(1000,this);

    public menuMantenimientoo() {
        initComponents();
        setLocationRelativeTo(null);
        //En el constructor iniciamos el timer
        timer.start();
        setTitle("MENU  MANTENIMIENTO");

    }
    public void actionPerformed(ActionEvent e) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        lbHora.setText(sdf.format(new java.util.Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        btnUsuario1 = new javax.swing.JButton();
        btnUsuario2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnProveedorGeneral = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLayeredPane2.setBackground(new java.awt.Color(0, 153, 153));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(212, 208, 200)));
        jLayeredPane2.setForeground(new java.awt.Color(51, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("MENU MANTENIMIENTO");
        jLayeredPane2.add(jLabel1);
        jLabel1.setBounds(70, 20, 450, 40);

        jLayeredPane3.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/mantenimientoFondo.jpg")))); // NOI18N

        btnUsuario1.setBackground(new java.awt.Color(0, 204, 204));
        btnUsuario1.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        btnUsuario1.setForeground(new java.awt.Color(51, 51, 51));
        btnUsuario1.setText("proveedores");
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(btnUsuario1);
        btnUsuario1.setBounds(0, 0, 290, 56);

        btnUsuario2.setBackground(new java.awt.Color(0, 204, 204));
        btnUsuario2.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        btnUsuario2.setForeground(new java.awt.Color(51, 51, 51));
        btnUsuario2.setText("productos");
        btnUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario2ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(btnUsuario2);
        btnUsuario2.setBounds(0, 50, 290, 56);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Entrada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jButton2);
        jButton2.setBounds(0, 100, 290, 55);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Salida");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jButton3);
        jButton3.setBounds(0, 150, 290, 53);

        btnUsuario.setBackground(new java.awt.Color(0, 204, 204));
        btnUsuario.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(51, 51, 51));
        btnUsuario.setText("Usuario");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jLayeredPane3.add(btnUsuario);
        btnUsuario.setBounds(0, 350, 290, 50);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/saliir.jpg"))); // NOI18N
        jButton1.setText(" SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jButton1);
        jButton1.setBounds(0, 400, 290, 60);

        btnFactura.setBackground(new java.awt.Color(0, 204, 204));
        btnFactura.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(51, 51, 51));
        btnFactura.setText("factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        jLayeredPane3.add(btnFactura);
        btnFactura.setBounds(0, 300, 290, 60);

        btnProveedorGeneral.setBackground(new java.awt.Color(0, 204, 204));
        btnProveedorGeneral.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        btnProveedorGeneral.setForeground(new java.awt.Color(51, 51, 51));
        btnProveedorGeneral.setText("proveedor general");
        btnProveedorGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorGeneralActionPerformed(evt);
            }
        });
        jLayeredPane3.add(btnProveedorGeneral);
        btnProveedorGeneral.setBounds(0, 250, 290, 53);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLayeredPane3.add(jPanel1);
        jPanel1.setBounds(0, 200, 290, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbHora.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbHora.setForeground(new java.awt.Color(0, 51, 204));
        lbHora.setText("jLabel13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jLayeredPane3.add(jPanel2);
        jPanel2.setBounds(290, 330, 300, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Entrada entradas = new Entrada();
        entradas.setState(MAXIMIZED_BOTH);
        entradas.setVisible(true);
        //  this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Salidas salidas=new Salidas();
        salidas.setState(MAXIMIZED_BOTH);
        salidas.setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed

        JFrameUsuario usuarios = new JFrameUsuario();
        usuarios.setState(MAXIMIZED_BOTH);
        usuarios.setVisible(true);

    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed

        Proveedores usuarios = new Proveedores();
        usuarios.setState(MAXIMIZED_BOTH);
        usuarios.setVisible(true);


    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario2ActionPerformed

        Productos pro = new Productos();
        pro.setState(MAXIMIZED_BOTH);
        pro.setVisible(true);

    }//GEN-LAST:event_btnUsuario2ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed

    Factura pro = new Factura();
    pro.setState(MAXIMIZED_BOTH);
    pro.setVisible(true);

    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnProveedorGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorGeneralActionPerformed

    ProveedorGeneral pro = new ProveedorGeneral();
    pro.setState(MAXIMIZED_BOTH);
    pro.setVisible(true);

    }//GEN-LAST:event_btnProveedorGeneralActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuMantenimientoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnProveedorGeneral;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JButton btnUsuario2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbHora;
    // End of variables declaration//GEN-END:variables

}
