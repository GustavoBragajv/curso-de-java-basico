/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesenum;

/**
 *
 * @author higor
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;
    
    
    public Data() {
        super();
    }
    
    
    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        super();
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        this.setdiaSemana(diaSemana);
    }
        
    
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    
    public int getDia() {
        return this.dia;
    }
    
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    
    public int getMes() {
        return this.mes;
    }
    
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public int getAno() {
        return this.ano;
    }
    
    
    public void setdiaSemana(DiaSemana diaSemana){
        this.diaSemana = diaSemana;
    }
    
    
    public DiaSemana getdiaSemana() {
        return this.diaSemana;
    }
    
    
    public void info() {
        System.out.println("Dia: " + this.getDia());
        System.out.println("Mês: " + this.getMes());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Dia Semana: " + this.getdiaSemana());
    }
}
    