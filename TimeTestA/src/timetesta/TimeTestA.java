/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timetesta;

import java.awt.DisplayMode;

/**
 *
 * @author hbraga
 */
public class TimeTestA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TimeB time = new TimeB();
        
        
        
        displayTime("Após a criação do objeto tempo", time);
        System.out.println("");
        
        time.setTime(13, 27, 6);
        displayTime("Depois de chamar o setTime", time);
        System.out.println("");
        
        try {
            time.setTime(99, 99, 99);
        } catch(IllegalArgumentException e) {
            System.out.printf("Execão: %s%n%n", e.getMessage());
        }
        displayTime("Depois de chamar setTime com valores inválidos", time);
    }
    
    
    private static void displayTime(String cabeca, TimeB tb) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                cabeca, tb.toUniversalString(), tb.toString());
    }
    
}
