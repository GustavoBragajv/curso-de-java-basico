/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoexcecao09;

/**
 *
 * @author higor
 */
public class DivisaoNaoExata extends Exception{
    private int numerador;
    private int denominador;
    
    
    public DivisaoNaoExata() {
        super();
    }
    
    public DivisaoNaoExata(int numerador, int denominador) {
        super();
        this.setNumerador(numerador);
        this.setDenominador(denominador);
    }
    
    
    public int getNumerador() {
        return this.numerador;
    }
    
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    
    public int getDenominador() {
        return this.denominador;
    }
    
    
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + numerador + " / " + denominador + " não é um inteiro" ;
    }
    
    
    
        
}
