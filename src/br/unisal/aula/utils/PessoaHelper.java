
package br.unisal.aula.utils;

import br.unisal.aula.exceptions.NotaCampoInvalidoException;
import br.unisal.aula.exceptions.NotaNumeroInvalidoException;
import br.unisal.aula.model.Pessoa;

public class PessoaHelper {
    
     public static Pessoa criarPessoa(String prova1Str, String pesoprova1Str , String prova2Str , String pesoprova2Str) {

        if (prova1Str.isEmpty() || pesoprova1Str.isEmpty() || prova2Str.isEmpty() || pesoprova2Str.isEmpty() ) {
            throw new NotaCampoInvalidoException();
        }

        double prova1 , prova2 , pesoprova1 , pesoprova2;

        try {
            prova1 = Double.parseDouble(prova1Str.replace(',', '.'));
            pesoprova1 = Double.parseDouble(pesoprova1Str.replace(',', '.'));
            prova2 = Double.parseDouble(prova2Str.replace(',', '.'));
            pesoprova2 = Double.parseDouble(pesoprova2Str.replace(',', '.'));
            
        } catch (NumberFormatException ex) {
            throw new NotaNumeroInvalidoException();
        }

        return criarPessoa(prova1, prova2, pesoprova1, pesoprova2);
    }

    public static Pessoa criarPessoa(double prova1, double pesoprova1 , double prova2 , double pesoprova2) {
        Pessoa pessoa = new Pessoa(prova1, prova2, pesoprova1, pesoprova2);
        return pessoa;
    }
    
}
