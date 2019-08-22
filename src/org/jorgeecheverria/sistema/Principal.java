/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorgeecheverria.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author ICT02
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sumar suma =  new Sumar(0,0);
        int opcion = 0;
        
        suma.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Primer Valor !!!"));
        suma.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Segundo Valor  !!!"));        
        
        JOptionPane.showMessageDialog(null,"Total de la Sumatoria"+ suma.sumatoria(suma.valor1,suma.valor2));
        
        
        
        
        
        
        
                // TODO code application logic here
                
                
    }
    
}
