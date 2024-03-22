/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadsteste3;

/**
 *
 * @author higor
 */
public class ThreadsTeste3 extends Thread{
    public static int amount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadsTeste3 thread = new ThreadsTeste3();
        thread.start();
        
        while(thread.isAlive()) {
            System.out.println("Waiting....");
        }
        
        System.out.println("ThreadsTeste3: " + amount);
        amount++;
        System.out.println("ThreadsTeste3: " + amount);
    }
    
    public void run() {
        amount++;
    }
    
}
