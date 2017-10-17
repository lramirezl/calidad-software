package com.weberbauer.utils;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.*;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficos {
private BufferedImage _image ;//para la imagen en memoria
    private JFreeChart grafico ;// el grafico
    private Dimension d;//dimension del grafico

    public Graficos(){
    }
    /* Crea el grafico */
    public void crear_grafico_de_barras(Dimension d, int[] v, String[] arg1, String arg2[],String[] data){
        this.d= d;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //se llenan los datos
        for(int i=0; i<=v.length-1;i++){
            dataset.setValue(v[i], arg1[i], arg2[i]);
        }
        //se crea el grafico
        grafico = ChartFactory.createLineChart3D(data[0], data[1], data[2], dataset, PlotOrientation.VERTICAL , true, false, true);
        grafico.setBackgroundPaint(Color.orange);
        grafico.setBackgroundPaint(new GradientPaint(0f, 0f, new Color(216, 216, 255), 175f, 175f, new Color(255, 255, 255), false));
        //se coloca el grafico en memoria
        _image = grafico.createBufferedImage(this.d.width,this.d.height);
         ChartFrame cha;

        System.err.println("grafico creado");
    }

    /* carga la imagen que esta en memoria en el objeto jLabel */
    public void cargar_grafico(JLabel lb){
        ImageIcon imagenFondo = new ImageIcon(_image);
        lb.setIcon(imagenFondo);
        lb.repaint();
    }
    /* presenta la ventana de dialogo "guardar" y salva el grafico generado en JPG */
     public void Guardar(){
       JFileChooser fileChooser = new JFileChooser();
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){
            try {
                //se obtiene la direccion donde se guardara la imagen
                String url = fileChooser.getSelectedFile().toString();
                //Se guarda la imagen
                ChartUtilities.saveChartAsJPEG(new File(url + ".jpg"), grafico, d.width, d.height);
            } catch (IOException ex) {
                Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }
}
