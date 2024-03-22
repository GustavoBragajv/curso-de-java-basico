/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadsteste1;

/**
 *
 * @author higor
 */
public class ThreadsTeste1 implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadsTeste1 thread = new ThreadsTeste1();
        Thread obj = new Thread(thread);
        
        obj.start();
        System.out.println("Este código esta fora do thread");
        
    }
    
    public void run() {
        System.out.println("Este código esta dentro do thread");
    }
    
}
