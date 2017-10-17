
package com.weberbauer.from;

import com.weberbauer.conexion.GestorBD;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameUsuario extends javax.swing.JFrame {

    public Vector vUsu;
    public Vector colNames;
    public int N;
    GestorBD objGBD;

    public JFrameUsuario() {
        initComponents();

        setLocationRelativeTo(null);
        setTitle("Mantenimiento de Usuario");
        objGBD = new GestorBD();
        // conectamos a la Base de Datos
        objGBD.conectar();
        // tabla
        colNames = new Vector();
        colNames.add("login");
        colNames.add("password");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        pPassword = new javax.swing.JPasswordField();
        pPassword1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbDisposicion = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 102, 102));
        txtUsuario.setEnabled(false);

        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(0, 102, 102));
        btnInsertar.setText("INGRESAR");
        btnInsertar.setEnabled(false);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        pPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pPassword.setForeground(new java.awt.Color(0, 102, 102));
        pPassword.setEnabled(false);

        pPassword1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pPassword1.setForeground(new java.awt.Color(0, 102, 102));
        pPassword1.setEnabled(false);
        pPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPassword1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONFIRMAR CONTRASEÑA");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 102));
        btnNuevo.setText("NUEVO USUARIO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIPO DE USUARIO");

        cbDisposicion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDisposicion.setForeground(new java.awt.Color(0, 102, 102));
        cbDisposicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "USUARIO" }));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cbDisposicion, 0, 202, Short.MAX_VALUE)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(pPassword)
                                .add(pPassword1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .add(txtUsuario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(75, 75, 75)
                        .add(btnInsertar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(32, 32, 32)
                        .add(btnNuevo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(pPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(pPassword1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(cbDisposicion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnNuevo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnInsertar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 102, 102));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CREAR UNA CUENTA NUEVA");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .add(jPanel2Layout.createSequentialGroup()
                .add(190, 190, 190)
                .add(btnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 322, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
}//GEN-LAST:event_btnSalirActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        if(txtUsuario.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"ingrese el usuario");
            txtUsuario.requestFocus();
        }
        else if(pPassword.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"ingrese la contraseña");
            pPassword.requestFocus();
        }
        else if(pPassword1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this,"vuelva a escribir la contraseña");
            pPassword1.requestFocus();
        }
       // else if(pPassword.getText().length()!=pPassword1.getText().length())
        else if ( !pPassword.getText().equals(pPassword1.getText()) )
        {
            JOptionPane.showMessageDialog(this,"los datos ingresados en la confirmacion de contraseña no es la correcta \n  ingrese otra ves la contraseña");
            pPassword1.setText("");
            pPassword1.requestFocus();
        }

        else
        {
                    String sql;
                    if(N==1)
                    {
                    sql="insert into usuario values('"+txtUsuario.getText()+"','"+pPassword.getText()+"','"+cbDisposicion.getSelectedItem()+"')";
                    }
                    else
                    {
                    sql="update usu set usuario="+txtUsuario.getText()+" where contrasena="+pPassword.getText();

                    }
                    objGBD.insertar(sql);
                    JOptionPane.showMessageDialog(this,"Datos almacenados correctamente");
                    txtUsuario.setText("");
                    pPassword.setText("");
                    pPassword1.setText("");
                    txtUsuario.setEnabled(true);
                    pPassword.setEnabled(true);
                    pPassword1.setEnabled(true);
                    btnInsertar.setEnabled(true);
                }

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void pPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPassword1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        N = 1;
        txtUsuario.setEnabled(true);
        pPassword.setEnabled(true);
        pPassword1.setEnabled(true);
        btnInsertar.setEnabled(true);
        txtUsuario.requestFocus();

    }//GEN-LAST:event_btnNuevoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbDisposicion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pPassword;
    private javax.swing.JPasswordField pPassword1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
