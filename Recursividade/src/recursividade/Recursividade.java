/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividade;

import java.util.Scanner;

/**
 *
 * @author hbraga
 */
public class Recursividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Recursividade");
        System.out.println("=======================");
        System.out.println("Calculando o fatorial de um número");
        
        System.out.print("Digite um valor positivo: ");
        byte num = teclado.nextByte();
        
        int fat = fatorial(num);
        
        System.out.print("O fatorial de " + num + " é igual a: " + num + "!: ");
        for(int i = num; i >= 1; i--) {
            System.out.print(i);
            if(i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print(" X ");
            }
        }
        System.out.print(fat);
        System.out.println("");
    }
    
    
    public static int fatorial(int n) {
        if((n == 0) || (n == 1)){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    
}
