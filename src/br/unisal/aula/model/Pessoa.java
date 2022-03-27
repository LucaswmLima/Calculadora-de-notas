/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisal.aula.model;


public class Pessoa {
    
    
    private double prova1;
    private double pesoprova1;
    private double prova2;
    private double pesoprova2;
    
    
    public Pessoa(double prova1, double pesoprova1 , double prova2 , double pesoprova2) {
        this.prova1 = prova1;
        this.pesoprova1 = pesoprova1;
        this.prova2 = prova2;
        this.pesoprova2 = pesoprova2;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getPesoprova1() {
        return pesoprova1;
    }

    public void setPesoprova1(double pesoprova1) {
        this.pesoprova1 = pesoprova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getPesoprova2() {
        return pesoprova2;
    }

    public void setPesoprova2(double pesoprova2) {
        this.pesoprova2 = pesoprova2;
    }
    
    
    
}
