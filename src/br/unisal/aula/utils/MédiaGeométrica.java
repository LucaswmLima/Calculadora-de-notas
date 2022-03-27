/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisal.aula.utils;

import br.unisal.aula.model.Pessoa;


public class MédiaGeométrica {
    
   

    private static final double NOTA_MINIMA_GEOMETRICA = 6.9;
    

    private MédiaGeométrica() {
    }

    public static double calcular(double prova1, double prova2) {
        return Math.sqrt(prova1*prova2);        
    }

    public static double calcular(Pessoa pessoa) {
        
        return Math.sqrt(pessoa.getProva1()*pessoa.getProva2());
    }

    public static String getResultadoFormatado(Pessoa pessoa) {
        double notageometrica = calcular(pessoa);
        String status1 = getStatus(pessoa);
        String resultado1 = String.format(" Nota: %.1f (%s)", notageometrica, status1);
        return resultado1;
    }

    public static String getStatus(Pessoa pessoa) {
        double notageometrica = calcular(pessoa);
        
            if (notageometrica >= NOTA_MINIMA_GEOMETRICA) 
            {
            return "APROVADO";
            
            } 
            else 
            {            
            return "REPROVADO"; 
            }
        
    }
}

    

