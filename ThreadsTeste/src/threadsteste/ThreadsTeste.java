/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadsteste;

/**
 *
 * @author higor
 */
public class ThreadsTeste extends Thread{
    public static void main(String[] args) {
        ThreadsTeste thread = new ThreadsTeste();
        thread.start();
        System.out.println("Este código está fora da thread");
    }
    
    public void run() {
        System.out.println("Este código está dentro da thread");
    }
    
}
