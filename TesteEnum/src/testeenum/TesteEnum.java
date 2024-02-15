/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeenum;

/**
 *
 * @author higor
 */

public class TesteEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DiaSemanaTeste[] dias = DiaSemanaTeste.values();
        
        for(int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        
        
        System.out.println("==========");
        for(DiaSemanaTeste dia : DiaSemanaTeste.values()) {
            System.out.println(dia);
        }
    }
    
}
