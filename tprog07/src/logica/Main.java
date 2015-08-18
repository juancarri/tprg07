/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author matias.heredia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> s;
        s = new ArrayList<>();
        String x;
        do{
            x =JOptionPane.showInputDialog("Compila y este es el Main.java lo que ingreses se carga en una Lista ingresa Juan para Salir");
            s.add(x);
        }while ( !x.equalsIgnoreCase("JUAN") ) ;
        Iterator<String> itera = s.iterator();
        JOptionPane.showMessageDialog(null,"lista con iterador:");
        
        while (itera.hasNext()) {
            //Una forma de recorrer    
            JOptionPane.showMessageDialog(null,itera.next());
                    
        }
        JOptionPane.showMessageDialog(null,"Lista ForEach:");
        String total="";
        for (String nom : s) {
            //Una forma de recorrer
          total = total + "\n " + nom; 
          
        }
        JOptionPane.showMessageDialog(null,total);
    }
    
}
