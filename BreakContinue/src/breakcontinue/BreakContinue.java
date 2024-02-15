/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakcontinue;

/**
 *
 * @author hbraga
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 5;
        
        for(int cont = 0; cont <= 90; cont++) {
            if(cont == 5) {
                continue;
            } else if(cont == 46) {
                break;
            }
            System.out.println(cont);
        }
    }
    
}
