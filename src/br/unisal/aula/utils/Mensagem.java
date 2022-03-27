
package br.unisal.aula.utils;

import javax.swing.JOptionPane;


public class Mensagem {
    
    private Mensagem(){}
    
    
    public static void erro(String texto){
         JOptionPane.showMessageDialog(null, texto);
    }
    
}