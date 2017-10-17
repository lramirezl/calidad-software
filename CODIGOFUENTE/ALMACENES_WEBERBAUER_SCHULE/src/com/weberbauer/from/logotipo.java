
package com.weberbauer.from;

import com.weberbauer.utils.jpColor;
import java.awt.Color;

public class logotipo extends javax.swing.JFrame{

    Thread runner;
    int Xpos = 500;
    Usuario Password;

    public logotipo() {
        initComponents();
        setResizable(false);
        Password= new Usuario();
        setLocationRelativeTo(null);
       setTitle("BIENVENIDOS A LA GESTION DE ALMACEN");
       barr();
     // barra.setVisible(false);

    }

public void barr()
{
        jpColor jpVista = new jpColor();
        jpVista.setSize(this.getSize());
        jpVista.setVistaColor();
        p01.add(jpVista);

        Runnable miRunnable = new Runnable()
        {

            public void run() {
                barra.setValue(0);
                barra.setForeground(Color.RED);

                try {

                    Thread.sleep(200);
                    barra.setValue(1);

                    Thread.sleep(200);
                    barra.setValue((int) 1.5);

                    Thread.sleep(200);
                    barra.setValue((int) 1.6);

                    Thread.sleep(200);
                    barra.setValue((int) 1.7);

                    Thread.sleep(200);
                    barra.setValue((int) 1.8);

                    Thread.sleep(200);
                    barra.setValue((int) 1.9);


                    Thread.sleep(200);
                    barra.setValue(2);

                    Thread.sleep(200);
                    barra.setValue((int) 2.5);


                    Thread.sleep(200);
                    barra.setValue(3);

                    Thread.sleep(200);
                    barra.setValue((int) 3.5);



                    Thread.sleep(200);
                    barra.setValue(4);


                    Thread.sleep(200);
                    barra.setValue(5);


                    Thread.sleep(200);
                    barra.setValue(6);

                    Thread.sleep(200);
                    barra.setValue(7);


                    Thread.sleep(200);
                    barra.setValue(8);

                    Thread.sleep(200);
                    barra.setValue(9);


                    Thread.sleep(200);
                    barra.setValue(10);

                    Thread.sleep(200);
                    barra.setValue(11);



                    Thread.sleep(200);
                    barra.setValue(12);

                    Thread.sleep(200);
                    barra.setValue(13);


                    Thread.sleep(200);
                    barra.setValue(14);

                    Thread.sleep(200);
                    barra.setValue(16);

                    Thread.sleep(200);
                    barra.setValue(18);

                    Thread.sleep(200);
                    barra.setValue(20);

                    Thread.sleep(200);
                    barra.setValue(22);

                    Thread.sleep(200);
                    barra.setValue(24);

                    Thread.sleep(100);
                    barra.setValue(26);

                    Thread.sleep(100);
                    barra.setValue(28);

                    Thread.sleep(100);
                    barra.setValue(30);

                    Thread.sleep(100);
                    barra.setValue(32);

                    Thread.sleep(100);
                    barra.setValue(34);



                    Thread.sleep(100);
                    barra.setValue(36);


                    Thread.sleep(100);
                    barra.setValue(38);


                    Thread.sleep(100);
                    barra.setValue(40);

                    Thread.sleep(100);
                    barra.setValue(41);

                    Thread.sleep(100);
                    barra.setValue(42);


                    Thread.sleep(100);
                    barra.setValue(43);

                    Thread.sleep(100);
                    barra.setValue(44);

                    Thread.sleep(100);
                    barra.setValue(45);

                    Thread.sleep(200);
                    barra.setValue(46);

                    Thread.sleep(100);
                    barra.setValue(47);

                    Thread.sleep(200);
                    barra.setValue(48);

                    Thread.sleep(100);
                    barra.setValue(49);

                    Thread.sleep(200);
                    barra.setValue(50);

                    Thread.sleep(300);
                    barra.setValue(70);


                    Thread.sleep(200);
                    barra.setValue(100);

                    Thread.sleep(200);
                    Password.setVisible(true);


                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread hilo = new Thread(miRunnable);
        hilo.start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p01 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/paracargar.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        barra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout p01Layout = new org.jdesktop.layout.GroupLayout(p01);
        p01.setLayout(p01Layout);
        p01Layout.setHorizontalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(barra, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p01Layout.setVerticalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 297, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(barra, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 328, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logotipo().setVisible(true);
            }
        });



    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel p01;
    // End of variables declaration//GEN-END:variables

}
