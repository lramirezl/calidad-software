
package com.weberbauer.from;


//reloj
import com.weberbauer.utils.jpColor;
import com.weberbauer.conexion.GestorBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class Menu extends javax.swing.JFrame implements ActionListener{



    //Declaramos el timer con 1000 milisegundos, y el oyente la misma clase
    Timer timer = new Timer(1000,this);
    int tam=10;
    int indice=0;
    int n[];
    String archivo="numeros.txt";
    String visitas="Contador.txt";
    EnlaseMantenimientoo usuman;
    //Grafico mostrarGrafica;
    GestorBD objGBD;
    int numero;
    String bloqueo = "select from usu where ";

    public Menu() {
        initComponents();
        jMenu6.setVisible(false);
        jmiGrafica1.setVisible(false);
      //  mostrarGrafica = new Grafico();
        usuman = new EnlaseMantenimientoo();
        //En el constructor iniciamos el timer
        timer.start();
        setLocationRelativeTo(null);
        setTitle("GESTION DE ALMACEN");
        n = new int[tam];
        objGBD = new GestorBD();
        objGBD.conectar();
        jpColor jpVistac = new jpColor();
        jpVistac.setSize(this.getSize());
        jpVistac.setVistaColor3();
        p03.add(jpVistac);   
        VerificarDisposicion();
    }
    public void actionPerformed(ActionEvent e) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        lbHora.setText(sdf.format(new java.util.Date()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        p01 = new javax.swing.JPanel();
        p02 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p03 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMan = new javax.swing.JMenu();
        jeStock_Valorizado1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jeRegistro = new javax.swing.JMenuItem();
        jeRegistro1 = new javax.swing.JMenuItem();
        Kardex = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiGrafica = new javax.swing.JMenuItem();
        jmiGrafica1 = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setResizable(false);

        p01.setBackground(new java.awt.Color(105, 149, 10));
        p01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p02.setBackground(new java.awt.Color(255, 255, 153));
        p02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel3.setText("GESTION DE ALMACEN");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("  DEPARTAMENTO DE LOGISTICA");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/Logo_Almacenes.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout p03Layout = new org.jdesktop.layout.GroupLayout(p03);
        p03.setLayout(p03Layout);
        p03Layout.setHorizontalGroup(
            p03Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, p03Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 283, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(38, 38, 38)
                .add(jLabel1)
                .addContainerGap())
        );
        p03Layout.setVerticalGroup(
            p03Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p03Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .add(jLabel1)
                .add(105, 105, 105))
            .add(p03Layout.createSequentialGroup()
                .add(53, 53, 53)
                .add(jLabel11)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        lbUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 0, 204));
        lbUsuario.setText("USUARIO");

        org.jdesktop.layout.GroupLayout p02Layout = new org.jdesktop.layout.GroupLayout(p02);
        p02.setLayout(p02Layout);
        p02Layout.setHorizontalGroup(
            p02Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p02Layout.createSequentialGroup()
                .add(p02Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(p02Layout.createSequentialGroup()
                        .add(130, 130, 130)
                        .add(p02Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel3)))
                    .add(p02Layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(lbUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 533, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                .add(p03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        p02Layout.setVerticalGroup(
            p02Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p02Layout.createSequentialGroup()
                .add(36, 36, 36)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lbUsuario))
            .add(p03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Av. Pio XII Nº 123 Monterrico - Surco");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Tlf.  :    4366512 / 4358400      Fax  :   4366560");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("RUC. :    20117356575");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/florani.gif"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/weberbauer/graficos/colegio_imagen.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbHora.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbHora.setForeground(new java.awt.Color(0, 51, 204));
        lbHora.setText("     jLabel13");
        lbHora.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbHoraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        org.jdesktop.layout.GroupLayout p01Layout = new org.jdesktop.layout.GroupLayout(p01);
        p01.setLayout(p01Layout);
        p01Layout.setHorizontalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .add(60, 60, 60)
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 436, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 339, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 254, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 391, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 372, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(p01Layout.createSequentialGroup()
                        .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(p01Layout.createSequentialGroup()
                                .add(jLabel5)
                                .add(103, 103, 103))
                            .add(p01Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel2)))
                        .add(18, 18, 18)
                        .add(jLabel12))
                    .add(p01Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lbHora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 290, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(37, 37, 37))
            .add(p01Layout.createSequentialGroup()
                .add(p02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p01Layout.setVerticalGroup(
            p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01Layout.createSequentialGroup()
                .add(p01Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(p01Layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel5)
                        .add(200, 200, 200)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(122, 122, 122))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, p01Layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(jLabel10)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel6)
                        .add(18, 18, 18)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel9)
                        .add(18, 18, 18)
                        .add(jLabel8))
                    .add(p01Layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lbHora, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(29, 29, 29)
                .add(p02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(39, 39, 39))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        btnMan.setText("Mantenimiento");
        btnMan.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N

        jeStock_Valorizado1.setFont(new java.awt.Font("Arial Unicode MS", 2, 14)); // NOI18N
        jeStock_Valorizado1.setText("Ingresar...");
        jeStock_Valorizado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeStock_Valorizado1ActionPerformed(evt);
            }
        });
        btnMan.add(jeStock_Valorizado1);

        jMenuBar1.add(btnMan);

        jMenu3.setText("Registros");
        jMenu3.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N

        jeRegistro.setBackground(new java.awt.Color(240, 240, 0));
        jeRegistro.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jeRegistro.setText("Ir a los registros del sistema");
        jeRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jeRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeRegistroActionPerformed(evt);
            }
        });
        jMenu3.add(jeRegistro);

        jeRegistro1.setBackground(new java.awt.Color(240, 240, 0));
        jeRegistro1.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jeRegistro1.setText("otros registros");
        jeRegistro1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jeRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeRegistro1ActionPerformed(evt);
            }
        });
        jMenu3.add(jeRegistro1);

        jMenuBar1.add(jMenu3);

        Kardex.setText("KARDEX ");
        Kardex.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        Kardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KardexActionPerformed(evt);
            }
        });

        jMenuItem1.setBackground(new java.awt.Color(240, 240, 0));
        jMenuItem1.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jMenuItem1.setText("Buscar producto");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Kardex.add(jMenuItem1);

        jMenuBar1.add(Kardex);

        jMenu4.setText("Usuarios del sistema");
        jMenu4.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem10.setBackground(new java.awt.Color(240, 240, 0));
        jMenuItem10.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jMenuItem10.setText("Cambio de usuario");
        jMenuItem10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setBackground(new java.awt.Color(240, 240, 0));
        jMenuItem11.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jMenuItem11.setText("Salir");
        jMenuItem11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Acerca de...");
        jMenu6.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N

        jMenuItem12.setBackground(new java.awt.Color(240, 240, 0));
        jMenuItem12.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jMenuItem12.setText("Acerca de...");
        jMenuItem12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu6.add(jMenuItem12);

        jMenuItem13.setBackground(new java.awt.Color(240, 240, 0));
        jMenuItem13.setFont(new java.awt.Font("Arial Unicode MS", 2, 12)); // NOI18N
        jMenuItem13.setText("Ayuda");
        jMenuItem13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Ulitarios");
        jMenu2.setFont(new java.awt.Font("Arial Unicode MS", 3, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmiGrafica.setBackground(new java.awt.Color(240, 240, 0));
        jmiGrafica.setFont(new java.awt.Font("Arial Unicode MS", 2, 14)); // NOI18N
        jmiGrafica.setText("Graficas");
        jmiGrafica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jmiGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGraficaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiGrafica);

        jmiGrafica1.setBackground(new java.awt.Color(240, 240, 0));
        jmiGrafica1.setFont(new java.awt.Font("Arial Unicode MS", 2, 14)); // NOI18N
        jmiGrafica1.setText("Video");
        jmiGrafica1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jmiGrafica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGrafica1ActionPerformed(evt);
            }
        });
        jMenu2.add(jmiGrafica1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 984, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p01, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        new Usuario().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeRegistroActionPerformed
        MDIReportes mdi= new MDIReportes();
        mdi.setExtendedState(MAXIMIZED_BOTH);
        mdi.setVisible(true);
    }//GEN-LAST:event_jeRegistroActionPerformed

    private void KardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KardexActionPerformed
     
    }//GEN-LAST:event_KardexActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        KARDEX_PRODUCTOS kardex = new KARDEX_PRODUCTOS();
        kardex.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGraficaActionPerformed

        Grafico gra=new Grafico();
        gra.setVisible(true);
        
    }//GEN-LAST:event_jmiGraficaActionPerformed

    private void jeStock_Valorizado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeStock_Valorizado1ActionPerformed
        usuman.setVisible(true);
    }//GEN-LAST:event_jeStock_Valorizado1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void lbHoraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbHoraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbHoraAncestorAdded

    private void jmiGrafica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGrafica1ActionPerformed

        reproductor video=new reproductor();
        video.setVisible(true);

    }//GEN-LAST:event_jmiGrafica1ActionPerformed

    private void jeRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeRegistro1ActionPerformed

        MDIOtrosReportes mdiotros= new MDIOtrosReportes();
        mdiotros.setExtendedState(MAXIMIZED_BOTH);
        mdiotros.setVisible(true);

    }//GEN-LAST:event_jeRegistro1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Menu().setVisible(true);

            }
        });
    }

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
            btnMan.setVisible(true);
        }
        else if(disposicion.equals("USUARIO"))
        {
            btnMan.setVisible(false);
        }
        nombreusuario();
    }
     public void nombreusuario(){
        ResultSet rs = null;
        String sql = null;
        sql="select usuario from registro_usu where pos = (select max(pos) from registro_usu) ";
        rs=objGBD.consultar(sql);
        String disposicion=null;
        try {
            while (rs.next()) {
             disposicion=rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbUsuario.setText("USUARIO :  " + disposicion);
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Kardex;
    private javax.swing.JMenu btnMan;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jeRegistro;
    private javax.swing.JMenuItem jeRegistro1;
    private javax.swing.JMenuItem jeStock_Valorizado1;
    private javax.swing.JMenuItem jmiGrafica;
    private javax.swing.JMenuItem jmiGrafica1;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel p01;
    private javax.swing.JPanel p02;
    private javax.swing.JPanel p03;
    // End of variables declaration//GEN-END:variables

}
