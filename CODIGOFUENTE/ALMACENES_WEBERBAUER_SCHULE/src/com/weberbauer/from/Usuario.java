
package com.weberbauer.from;

import com.weberbauer.conexion.GestorBD;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//tabla

public class Usuario extends javax.swing.JFrame {

    GestorBD objGBD;
    ArrayList lUsu;
    int c; 
    int num=0;

    public Usuario() {
        initComponents();

      setTitle("ACCESO");

      objGBD = new GestorBD();
      objGBD.conectar();
      c =0;
      int numero;
      setLocationRelativeTo(null);

    }
    void reconocerContrase()
      {
          
          if(txtUsu.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Ingrese Usuario");
              return;
          }

          else if (txtPass.getText().length()==0){
              JOptionPane.showMessageDialog(this,"Ingrese contraseña");
              return;
          }
          else
          {
            String SQL = "Select * from usuario where "+
                "usuario = '" + txtUsu.getText() + "' and " +
                "contra = '" + txtPass.getText() + "' and " +
                "disposicion = '" + cbDisposicion.getSelectedItem() + "'";
                int nU = 0;
                try{
                  ResultSet rU = objGBD.consultar(SQL);
                while(rU.next()){
                nU = nU + 1;
                    }
        }catch (Exception ex) { ex.printStackTrace(); }

        if(nU == 0){
            JOptionPane.showMessageDialog(this,"Su usuario y contrasena no son los correctos por favor ingrese de nuevo");
            c = c + 1;
        }
        else{
            IngresarUsuario();
            JOptionPane.showMessageDialog(this,"usted esta ingresando a la gestion de almacen, los cambios que realiza seran responsabilidad suya");
            Menu menu= new Menu();
            menu.setVisible(true);
            setVisible(false);
        }

        if(c==3){
            JOptionPane.showMessageDialog(this,"Supero el numero de intentos permitidos");
            System.exit(0);
        }
          }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p01 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        bntIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cbDisposicion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p01.setBackground(new java.awt.Color(125, 187, 77));
        p01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCancelar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        bntIngresar.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        bntIngresar.setText("INGRESAR");
        bntIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bntIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIngresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("contraseña");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("usuario");

        txtUsu.setFont(new java.awt.Font("Arial Unicode MS", 1, 10)); // NOI18N
        txtUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPass.setFont(new java.awt.Font("Arial Unicode MS", 1, 10)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("disposicion");

        cbDisposicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "USUARIO" }));

        org.jdesktop.layout.GroupLayout p01Layout = new org.jdesktop.layout.GroupLayout(p01);
        p01.setLayout(p01Layout);
        p01Layout.setHorizontalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(p01Layout.createSequentialGroup()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, p01Layout.createSequentialGroup()
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(bntIngresar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbDisposicion, 0, 134, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtUsu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .add(txtPass, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .add(25, 25, 25))
        );
        p01Layout.setVerticalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtUsu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(cbDisposicion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(bntIngresar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIngresarActionPerformed

        reconocerContrase();

    }//GEN-LAST:event_bntIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        System.exit(0);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    public void IngresarUsuario(){


        ///inicio para la frecha y hora
    long time=System.currentTimeMillis();
    Date fecha=new Date(time);
    String s=fecha.toString();
    String[] fechaString=s.split(" ");
    String mesS=fechaString[1];
    String diaNumeroS=fechaString[2];
    String[] horaS=fechaString[3].split(":");
    String horasS=horaS[0];
    String minutosS=horaS[1];
    String segundosS=horaS[2];
    String anhoS=fechaString[5];
    System.out.println("Fecha: "+diaNumeroS+"/"+mesS+"/"+anhoS+" Hora: "+horasS+":"+minutosS+":"+segundosS);
    String FechaIngresar,HoraIngresar;
    FechaIngresar = diaNumeroS+"/"+mesS+"/"+anhoS;
    HoraIngresar = horasS+":"+minutosS+":"+segundosS;
    //fin
        int  pos = PosicionesUsuario() + 1;
        if(cbDisposicion.getSelectedIndex()==0)
        {
         String sql=null;
         sql="insert into registro_usu values('"+txtUsu.getText() +"','"+txtPass.getText()+"','"+cbDisposicion.getSelectedItem()+"','"+FechaIngresar+"','"+HoraIngresar+"',"+pos+")";
         objGBD.insertar(sql);
        }
        else if(cbDisposicion.getSelectedIndex()==1)
        {
         String sql=null;
         sql="insert into registro_usu values('"+txtUsu.getText() +"','"+txtPass.getText()+"','"+cbDisposicion.getSelectedItem()+"','"+FechaIngresar+"','"+HoraIngresar+"',"+pos+")";
         objGBD.insertar(sql);
        }
    }
    public int PosicionesUsuario(){
      int posicion = 0;
      String sql="select max(pos) from registro_usu";
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntIngresar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cbDisposicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel p01;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables

}
