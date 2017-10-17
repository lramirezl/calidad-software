
package com.weberbauer.from;

import com.weberbauer.utils.Graficos;
import com.weberbauer.conexion.GestorBD;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Grafico extends javax.swing.JFrame {

    Graficos migrafico = new Graficos();
    GestorBD conection=null;

    public Grafico() {
        initComponents();
        this.setTitle("GRAFICA");
        conection = new GestorBD();
        conection.conectar();
        try {
            Grafico1MESES();
            Grafico2ANOS();
        } catch (SQLException ex) {
            Logger.getLogger(Grafico.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        CONTENEDOR2 = new javax.swing.JPanel();
        CONTENEDOR = new javax.swing.JPanel();
        GUARDAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CONTENEDOR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CONTENEDOR2Layout = new javax.swing.GroupLayout(CONTENEDOR2);
        CONTENEDOR2.setLayout(CONTENEDOR2Layout);
        CONTENEDOR2Layout.setHorizontalGroup(
            CONTENEDOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        CONTENEDOR2Layout.setVerticalGroup(
            CONTENEDOR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gastos anuales", CONTENEDOR2);

        CONTENEDOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout CONTENEDORLayout = new javax.swing.GroupLayout(CONTENEDOR);
        CONTENEDOR.setLayout(CONTENEDORLayout);
        CONTENEDORLayout.setHorizontalGroup(
            CONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        CONTENEDORLayout.setVerticalGroup(
            CONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gastos mensuales", CONTENEDOR);

        GUARDAR.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        GUARDAR.setText("GUARDAR");
        GUARDAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GUARDAR)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        migrafico.Guardar();
}//GEN-LAST:event_GUARDARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }
   public void Grafico1MESES() throws SQLException{
          //tamaño del grafico
        Dimension d = CONTENEDOR.getSize();//toma el tamaño del contenedor
        String[] data = {"Grafico de entradas Mensuales","Meses","Entradas"};
        //se crea el grafico
        migrafico.crear_grafico_de_barras(d, llenarValoresMeses(), datosMes(), llenarMeses(), data);
        //se crea un jlabel para colocar el grafico
        JLabel j = new JLabel();
        j.setBounds(0, 0, d.width, d.height);
        //se carga el grafico de memoria
        migrafico.cargar_grafico(j);
        //se añade al contenedor
        CONTENEDOR.add(j);
        this.repaint();
    }
   public void Grafico2ANOS() throws SQLException{
          //tamaño del grafico
        Dimension d = CONTENEDOR2.getSize();//toma el tamaño del contenedor
        //se crean los datos
        String[] data = {"Grafico de entradas Anuales","Anios","Entradas"};
        //se crea el grafico
        migrafico.crear_grafico_de_barras(d, llenarValoresAnos(), datosAno(), llenarAnos(), data);
        //se crea un jlabel para colocar el grafico
        JLabel j = new JLabel();
        j.setBounds(0, 0, d.width, d.height);
        //se carga el grafico de memoria
        migrafico.cargar_grafico(j);
        //se añade al contenedor
        CONTENEDOR2.add(j);
        this.repaint();
    }


   public int[] llenarValoresMeses() throws SQLException{
      int i = 0;
      String sql=null;
     int meses[]= new int[contadorMeses()];
      sql = "select sum(cantidad) from fechas_entradas group by mes,ano order by ano,mes";
      ResultSet rsuselt = conection.consultar(sql);
      while (rsuselt.next()) {
           meses[i]=Integer.parseInt(rsuselt.getString(1));
      i++;
      }
      return meses;
  }
   public String[] llenarMeses() throws SQLException{
      int i = 0;
      String sql=null;
      String nombreMes[]= new String[contadorMeses()];
      sql = "select mes from fechas_entradas group by mes,ano order by ano,mes";
      ResultSet rsuselt = conection.consultar(sql);  
      while (rsuselt.next()) {
           nombreMes[i]=Mes(Integer.parseInt(rsuselt.getString(1)));
      i++;
      }
      return nombreMes;    
  }
   public int contadorMeses() throws SQLException{
      int contador=0;
      String sql = "select sum(cantidad) from fechas_entradas group by mes,ano order by mes,ano";
      ResultSet rContar = conection.consultar(sql);
      while (rContar.next()) {
          contador=contador+1;
      }
      System.out.print(contador);
      return contador;
   }
   public String[] datosMes() throws SQLException{
      int i = 0;
      String sql=null;
      String datos[]= new String[contadorMeses()];
      sql = "select mes from fechas_entradas group by mes,ano order by ano,mes";
      ResultSet rsuselt = conection.consultar(sql);
      while (rsuselt.next()) {
           datos[i]="Entradas vs Meses";
      i++;
      }
      return datos;
   }
   public String Mes(int meses){
    String mes="q mes sera";
    if(meses==1){
        mes="Enero";
    }else if(meses==2){
        mes="Febrero";
    }else if(meses==3){
        mes="Marzo";
    } else if(meses==4){
        mes="Abril";
    } else if(meses==5){
        mes="Mayo";
    } else if(meses==6){
        mes="Junio";
    } else if(meses==7){
        mes="Julio";
    } else if(meses==8){
        mes="Agosto";
    } else if(meses==9){
        mes="Setiembre";
    } else if(meses==10){
        mes="Octubre";
    } else if(meses==11){
        mes="Noviembre";
    } else{
        mes="Diciembre";
    }
    return mes;
}


    public int[] llenarValoresAnos() throws SQLException{
      int i = 0;
      String sql=null;
     int meses[]= new int[contadorAnos()];
      sql = "select sum(cantidad),ano from fechas_entradas group by ano order by ano";
      ResultSet rsuselt = conection.consultar(sql);
      while (rsuselt.next()) {
           meses[i]=Integer.parseInt(rsuselt.getString(1));
      i++;
      }
      return meses;
  }
    public String[] llenarAnos() throws SQLException{
      int i = 0;
      String sql=null;
      String nombreMes[]= new String[contadorAnos()];
      sql = "select ano from fechas_entradas group by ano order by ano";
      ResultSet rsuselt = conection.consultar(sql);
      while (rsuselt.next()) {
           nombreMes[i]=Anos(Integer.parseInt(rsuselt.getString(1)));
      i++;
      }
      return nombreMes;
  }
    public int contadorAnos() throws SQLException{
      int contador=0;
      String sql = "select sum(cantidad) from fechas_entradas group by ano order by ano";
      ResultSet rContar = conection.consultar(sql);
      while (rContar.next()) {
          contador=contador+1;
      }
      System.out.print(contador);
      return contador;
   }
    public String[] datosAno() throws SQLException{
      int i = 0;
      String sql=null;
      String datos[]= new String[contadorAnos()];
      sql = "select ano from fechas_entradas group by ano order by ano";
      ResultSet rsuselt = conection.consultar(sql);
      while (rsuselt.next()) {
           datos[i]="Entradas vs Años";
      i++;
      }
      return datos;
   }
    public String Anos(int ano){
    String anos="que mes sera?";
    if(ano==2010){
        anos="2010";
    }else if(ano==2011){
        anos="2011";
    }else if(ano==2012){
        anos="2012";
    } else if(ano==2013){
        anos="2013";
    } else if(ano==2014){
        anos="2014";
    } else if(ano==2015){
        anos="2015";
    } else if(ano==2016){
        anos="2016";
    } else if(ano==2017){
        anos="2017";
    } else if(ano==2018){
        anos="2018";
    } else if(ano==2019){
        anos="2011";
    } else if(ano==2020){
        anos="2020";
    } else{
        anos="2021";
    }
    return anos;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONTENEDOR;
    private javax.swing.JPanel CONTENEDOR2;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
