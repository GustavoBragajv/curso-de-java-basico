/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmetodos;

import java.util.Arrays;

/**
 *
 * @author hbraga
 */
public class ArraysMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = {9, 5, 0, 7, 4, 2, 6, 3, 1, 8};
        int[] num2 = {5, 4, 3, 2, 1, 9, 8, 7, 6, 6};
        
        
        
        Arrays.sort(num);
        //Arrays.fill(num, 10);
        
        //System.arraycopy(num, 0, num2, 0, num.length);
        
        int valor = 7;

        
        System.out.println("");
        int pos = Arrays.binarySearch(num, valor);
        System.out.println(pos);
        
        // Para que o Arrys.binarySearch funcione o Arrays em questão precisa
        // estar em ordem.
        
        for(int n : num) {
            System.out.printf("%d -> ", n);
        }

        
        System.out.println("");
        for(int n2 : num2) {
            System.out.printf("%d -> ", n2);
        }
        
        System.out.println("");
        
        
        if(Arrays.equals(num, num2)) {
            System.out.println("Os arrays são iguais");
        } else {
            System.out.println("Os arrays não são iguais");
        }
        
        
        
    }
    
}
