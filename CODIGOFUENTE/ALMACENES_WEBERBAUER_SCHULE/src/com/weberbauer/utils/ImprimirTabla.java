
package com.weberbauer.utils;

import java.awt.Font;
import java.text.MessageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JTable;

public class ImprimirTabla {
public ImprimirTabla(){
    
}

private Font font;

 public void ImpTabla(JTable tabla, String titulo){
        MessageFormat header = new MessageFormat(" COOP. SERV. EDUC. AUGUSTO WEBERBAUER LTDA. ");
        MessageFormat footer = new MessageFormat("DEPARTAMENTO DE LOGISTICA \n "+"page {0,number,integer} "+"          fecha");

        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            tabla.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se puede imprimir %s%n", e.getMessage());
        }
 }
}
