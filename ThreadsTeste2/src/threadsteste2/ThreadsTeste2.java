/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadsteste2;

/**
 *
 * @author higor
 */
public class ThreadsTeste2 extends Thread{
    public static int amount = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadsTeste2 thread = new ThreadsTeste2();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    
    public void run(){
        amount++;
    }
}
