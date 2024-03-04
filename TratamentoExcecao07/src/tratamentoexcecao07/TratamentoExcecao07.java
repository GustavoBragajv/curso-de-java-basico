/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecao07;

/**
 *
 * @author higor
 */
public class TratamentoExcecao07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    
    
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception throw in method 1", exception);
        }
    }
    
    
    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exception throw in method 2", exception);
        }
    }
    
    
    public static void method3() throws Exception {
        throw new Exception("Exception throw in method 3");
    }
    
}
