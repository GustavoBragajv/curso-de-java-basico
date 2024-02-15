/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thisteste;

/**
 *
 * @author hbraga
 */
public class ThisTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
    
}


class SimpleTime {
    private int horas;
    private int minutos;
    private int segundos;
    
    
    public SimpleTime(){};
    
    
    public SimpleTime(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    
    public String buildString() {
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()",
                this.toUniversalString(), 
                "toUniversalString()", toUniversalString());
    }
    
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }
}
