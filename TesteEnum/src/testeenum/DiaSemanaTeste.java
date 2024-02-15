/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package testeenum;

/**
 *
 * @author higor
 */
public enum DiaSemanaTeste {
    DOMINGO(0), SEGUNDA(1), TERCA(2), 
    QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6);
    
    
    private int valor;

    
    private DiaSemanaTeste(int valor) {
        this.setValor(valor);
    }
    
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    public int getValor() {
        return this.valor;
    }
}
