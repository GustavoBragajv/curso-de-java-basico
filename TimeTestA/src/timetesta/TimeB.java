/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timetesta;

/**
 *
 * @author hbraga
 */
public class TimeB {
    private int horas;
    private int minutos;
    private int segundos;
    
    
    public void setTime(int horas, int minutos, int segundos) {
        if(horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 ||
                segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Hora, minutos e segundos"
                    + "estão fora do padrão");
        }
        
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        
    }
    
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", 
                ((horas == 0 || horas == 12)? 12 : horas % 12), 
                minutos, segundos, (horas < 12 ? "AM" : "PM"));
    }
}
