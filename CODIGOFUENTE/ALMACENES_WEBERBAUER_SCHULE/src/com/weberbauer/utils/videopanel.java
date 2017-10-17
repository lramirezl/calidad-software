package com.weberbauer.utils;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
/*import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
*/
public class videopanel extends javax.swing.JPanel {
/*private Player mediaPlayer;
private Component controls;   
private Component video2;
*/
  
/*    
public videopanel(URL mediaURL, Dimension d)
{
        Manager.setHint( Manager.LIGHTWEIGHT_RENDERER, true );
        try
        {
            mediaPlayer = Manager.createRealizedPlayer( mediaURL );
            video2 = mediaPlayer.getVisualComponent();
            video2.setSize(d.width, d.height);
            controls = mediaPlayer.getControlPanelComponent();
            controls.setSize(d.width, 50);
            if ( video2 != null )
            add( video2 ); //agrega el componente del reproductor al panel          
            mediaPlayer.start(); // comienza la reproduccion
        } // fin try
        catch ( NoPlayerException noPlayerException )
        {
        System.err.println( "No se encontro medio disponible, osea no se reproduce archivo" );
        } // fin catch
        catch ( CannotRealizeException cannotRealizeException )
        {
        System.err.println( "no se pudo realizar el reproductor" );
        } // fin catch
        catch ( IOException iOException )
        {
        System.err.println( "Error de lectura del archivo" );
        } // fin catch
    }
    
    public Component controles (){     
        return controls;        
    }

    public void reproducir (){
     if ( video2 != null )
        add( video2 ); //agrega el componente del reproductor al panel
         mediaPlayer.start(); // comienza la reproduccion
    }

    public void detener(){
     if ( video2 != null )
        add( video2 ); //agrega el componente del reproductor al panel
         mediaPlayer.stop(); // comienza la reproduccion
    }
    public void nuevoVideo(){
     if ( video2 == null )
            video2 = null;
              add(video2);
    }

    public Component controles(Dimension d){
        controls.setSize(d);
        return controls;
    } 
    
    // ***NUEVO*** actualiza las dimensiones del reproductor y sus controles
    public void UpdateSize(Dimension d){               
        video2.setSize(d);         
        video2.setLocation(0,0);        
        controls.setSize(d.width, 50);        
    }
*/
}
