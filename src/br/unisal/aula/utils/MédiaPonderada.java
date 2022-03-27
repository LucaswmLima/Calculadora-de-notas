
package br.unisal.aula.utils;

import br.unisal.aula.model.Pessoa;


public class MédiaPonderada {    
   

    private static final double NOTA_MINIMA_PONDERADA = 6.8;
    

    private MédiaPonderada() {
    }

    public static double calcular(double prova1, double prova2, double pesoprova1, double pesoprova2) {
        return (prova1*pesoprova1)+(prova2*pesoprova2);
    }

    public static double calcular(Pessoa pessoa) {
        return (pessoa.getProva1()* pessoa.getPesoprova1())+(pessoa.getProva2()* pessoa.getPesoprova2());
    }

    public static String getResultadoFormatado(Pessoa pessoa) {
        double notaponderada = calcular(pessoa);
        String status2 = getStatus(pessoa);
        String resultado2 = String.format(" Nota: %.1f (%s)", notaponderada, status2);
        return resultado2;
    }

    public static String getStatus(Pessoa pessoa) {
        double notaaritmetica = calcular(pessoa);
        
            if (notaaritmetica >= NOTA_MINIMA_PONDERADA) 
            {
            return "APROVADO";
            
            } 
            else 
            {            
            return "REPROVADO"; 
            }
        
    }
}