/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecao09;

/**
 *
 * @author higor
 */
public class TratamentoExcecao09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeradores = {4, 8, 5, 16, 25, 32, 64, 13, 9};
        int[] denominadores = {2, 4, 6, 8, 0, 10, 0, 2};
        
        for(int i = 0; i < numeradores.length; i++) {
            try{
                if(numeradores[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeradores[i], denominadores[i]);
                }
                System.out.println(numeradores[i] + " / " + denominadores[i] + " = " +
                        (numeradores[i] / denominadores[i]));
            } catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
    
}
