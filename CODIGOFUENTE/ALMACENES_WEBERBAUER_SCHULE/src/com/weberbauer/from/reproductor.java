package com.weberbauer.from;

import com.weberbauer.utils.videopanel;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class reproductor extends javax.swing.JFrame {
    
   
    public reproductor() {
        initComponents();
        this.setTitle("Reproductor de video");
        setLocationRelativeTo(null);
    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Super = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        control = new javax.swing.JPanel();
        control2 = new javax.swing.JPanel();
        btnPROVEEDORES = new javax.swing.JButton();
        btnEMPRESA = new javax.swing.JButton();
        btnINVENTARIOS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        Super.setBackground(new java.awt.Color(0, 153, 153));
        Super.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        pantalla.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/colegio_imagen.jpg")))); // NOI18N
        pantalla.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pantallaComponentResized(evt);
            }
        });

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        control.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout controlLayout = new javax.swing.GroupLayout(control);
        control.setLayout(controlLayout);
        controlLayout.setHorizontalGroup(
            controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        controlLayout.setVerticalGroup(
            controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        control2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPROVEEDORES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/video de gestion de proveedores.jpg"))); // NOI18N
        btnPROVEEDORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROVEEDORESActionPerformed(evt);
            }
        });

        btnEMPRESA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/video de logistica en la empresa.jpg"))); // NOI18N
        btnEMPRESA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMPRESAActionPerformed(evt);
            }
        });

        btnINVENTARIOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/video gestion de inventarios.jpg"))); // NOI18N
        btnINVENTARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINVENTARIOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout control2Layout = new javax.swing.GroupLayout(control2);
        control2.setLayout(control2Layout);
        control2Layout.setHorizontalGroup(
            control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPROVEEDORES, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEMPRESA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnINVENTARIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        control2Layout.setVerticalGroup(
            control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnINVENTARIOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEMPRESA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPROVEEDORES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SuperLayout = new javax.swing.GroupLayout(Super);
        Super.setLayout(SuperLayout);
        SuperLayout.setHorizontalGroup(
            SuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SuperLayout.createSequentialGroup()
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SuperLayout.createSequentialGroup()
                        .addComponent(control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SuperLayout.setVerticalGroup(
            SuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(SuperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SuperLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPROVEEDORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROVEEDORESActionPerformed

    mediaURL = null;
    reproductorcreado=false;
  //  mediaPanel.detener();

   // mediaPanel.nuevoVideo();
    //reproducirVideo1();



    }//GEN-LAST:event_btnPROVEEDORESActionPerformed


    private void reproducirVideo1(){
        try {
            mediaURL = new URL("file:/C:/Users/LENIN RAMIREZ/Documents/NetBeansProjects/ALMACENES_WEBERBAUER_SCHULE/VIDEOS/GÉSTION DE PROVEEDORES.mpg");
           
            //se obtiene el tamaño del panel de video
            Dimension dp = new Dimension(pantalla.getWidth(), pantalla.getHeight());
            //se crea el reproductor pasando como parametros
            // el archivo y dimensiones
           // mediaPanel = new videopanel(mediaURL, dp);
            reproductorcreado = true;
            mediaPanel.setBounds(0, 0, dp.width, dp.height);
            mediaPanel.setLocation(0, 0);
            mediaPanel.setBackground(new Color(0, 0, 0));
            pantalla.add(mediaPanel);
            pantalla.setVisible(true);
            //se obtiene dimensiones del contenedor de los controles
            // y se pasa como parametro para crear los controles de reproduccion
            Dimension d = new Dimension(control.getWidth(), control.getHeight());
            //control.add(mediaPanel.controles(d));
            control.setVisible(true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reproducirVideo2(){
        try {
            mediaURL = new URL("file:/C:/Users/LENIN/Desktop/PROYECTO CALIDAD DE SOFTWARE/SOFTWARE/CODIGOFUENTE/ALMACENES_WEBERBAUER_SCHULE/VIDEOS/LOGÍSTICA EN LA EMPRESA.mpg");
            Dimension dp = new Dimension(pantalla.getWidth(), pantalla.getHeight());
           // mediaPanel = new videopanel(mediaURL, dp);
            reproductorcreado = true;
            pantalla.add(mediaPanel);
            pantalla.setVisible(true);
            Dimension d = new Dimension(control.getWidth(), control.getHeight());
           // control.add(mediaPanel.controles(d));
            control.setVisible(true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reproducirVideo3(){
        try {
            mediaURL = new URL("file:/C:/Users/LENIN RAMIREZ/Documents/NetBeansProjects/ALMACENES_WEBERBAUER_SCHULE/VIDEOS/GÉSTION DE INVENTARIOS.mpg");

            //se obtiene el tamaño del panel de video
            Dimension dp = new Dimension(pantalla.getWidth(), pantalla.getHeight());
            //se crea el reproductor pasando como parametros
            // el archivo y dimensiones
            //mediaPanel = new videopanel(mediaURL, dp);
            reproductorcreado = true;
            mediaPanel.setBounds(0, 0, dp.width, dp.height);
            mediaPanel.setLocation(0, 0);
            mediaPanel.setBackground(new Color(0, 0, 0));
            pantalla.add(mediaPanel);
            pantalla.setVisible(true);
            //se obtiene dimensiones del contenedor de los controles
            // y se pasa como parametro para crear los controles de reproduccion
            Dimension d = new Dimension(control.getWidth(), control.getHeight());
            //control.add(mediaPanel.controles(d));
            control.setVisible(true);
        } catch (MalformedURLException ex) {
            Logger.getLogger(reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    }//GEN-LAST:event_formComponentResized

    private void pantallaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pantallaComponentResized
}//GEN-LAST:event_pantallaComponentResized

    private void btnEMPRESAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMPRESAActionPerformed

        reproducirVideo2();

    }//GEN-LAST:event_btnEMPRESAActionPerformed
    private void btnINVENTARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINVENTARIOSActionPerformed

        //reproducirVideo3();
       // mediaPanel.reproducir();


    }//GEN-LAST:event_btnINVENTARIOSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      //  System.exit(0);
        dispose();
      //  mediaPanel.detener();

    }//GEN-LAST:event_jButton1ActionPerformed
    
   URL mediaURL = null;
   videopanel mediaPanel;
   Boolean reproductorcreado=false;

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reproductor().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Super;
    private javax.swing.JButton btnEMPRESA;
    private javax.swing.JButton btnINVENTARIOS;
    private javax.swing.JButton btnPROVEEDORES;
    private javax.swing.JPanel control;
    private javax.swing.JPanel control2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pantalla;
    // End of variables declaration//GEN-END:variables
    
}
