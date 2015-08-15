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
        
        // TODO code application logic here
        List<String> s = new ArrayList<String>();
        String x;
        do{
            x =JOptionPane.showInputDialog("Compila y este es el Main.java lo que ingreses se carga en una Lista ingresa Juan para Salir");
            s.add(x);
        }while ( !x.equalsIgnoreCase("JUAN") ) ;
        Iterator<String> itera = s.iterator();
        while (itera.hasNext()) {
            //Una forma de recorrer    
           System.out.println("lista con iterador:"); 
           System.out.println(itera.next());           
        }
        for (String nom : s) {
            //Una forma de recorrer
           System.out.println("Lista ForEach:"); 
           System.out.println(nom);
        }
        
    }
    
}
