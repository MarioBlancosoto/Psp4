/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4psp;

import javax.swing.JOptionPane;

/**
 *
 * @author ytaly
 */
public class Exercicio4Psp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fios par = new Fios(" Pares ",0);
        Fios impar = new Fios("Impares",1); 
        Fios dosTres = new Fios("Dos O Tres ",2);
        int select= Integer.parseInt(JOptionPane.showInputDialog("Introduce la instrucción \n 1.Pares \n 2.Impares \n 3.Terminados en dos y tres "));
        do{
        switch(select){
           
            case 1: par.start();
              break;
               
            case 2:impar.start();
              break;
                
            case 3:dosTres.start();
              break;
              
        }
        }while(select!=100);
    } 
    
}
