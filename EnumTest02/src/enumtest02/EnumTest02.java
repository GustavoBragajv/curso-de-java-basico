/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumtest02;

/**
 *
 * @author higor
 */
public class EnumTest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Level meuLevel = Level.HIGH;
        
        switch (meuLevel) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    
}
