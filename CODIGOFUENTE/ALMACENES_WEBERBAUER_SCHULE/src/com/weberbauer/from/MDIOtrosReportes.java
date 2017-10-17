package com.weberbauer.from;

import com.weberbauer.utils.ImprimirTabla;




public class MDIOtrosReportes extends javax.swing.JFrame {

    ImprimirTabla impTab = new ImprimirTabla();
    JIFProveedoresGeneral h1 = new JIFProveedoresGeneral();
    JIFFactura h2 = new JIFFactura();
    JIFUsuario h3 = new JIFUsuario();

    int cont1 = 0;
    int cont2 = 0;
    int cont3 = 0;

    //Menu menu=new Menu();
    
    public MDIOtrosReportes() {
        initComponents();
     this.setExtendedState(MAXIMIZED_BOTH);
     this.setTitle("REGISTRO");
    
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(58, 121, 69));
        desktopPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        desktopPane.setForeground(new java.awt.Color(153, 153, 0));
        desktopPane.setPreferredSize(new java.awt.Dimension(1025, 650));

        jToolBar1.setBackground(new java.awt.Color(58, 121, 69));
        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jToolBar1.setRollover(true);

        jButton5.setBackground(new java.awt.Color(58, 121, 69));
        jButton5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Proveedores Generales");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        b01.setBackground(new java.awt.Color(58, 121, 69));
        b01.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        b01.setForeground(new java.awt.Color(255, 255, 255));
        b01.setText("Factura");
        b01.setFocusable(false);
        b01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b01.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });
        jToolBar1.add(b01);

        jButton3.setBackground(new java.awt.Color(58, 121, 69));
        jButton3.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Usuario");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton6.setBackground(new java.awt.Color(58, 121, 69));
        jButton6.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Salir");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed
        // TODO add your handling code here:
        h1.setVisible(false);
        h2.setVisible(true);
        h3.setVisible(false);

        if (cont2 == 0) {
            desktopPane.add(h2);
            h2.setSize(1200, 640);
            h2.show();
            cont2 = 1;
        }
}//GEN-LAST:event_b01ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        h1.setVisible(false);
        h2.setVisible(false);
        h3.setVisible(true);
        if (cont3 == 0) {
            desktopPane.add(h3);
            h3.setSize(920, 640);
            h3.show();
            cont3 = 1;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        h1.setVisible(true);
        h2.setVisible(false);
        h3.setVisible(false);
        if (cont1 == 0) {
            desktopPane.add(h1);
            h1.setSize(1150, 640);
            h1.show();
            cont1 = 1;
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIOtrosReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b01;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}

