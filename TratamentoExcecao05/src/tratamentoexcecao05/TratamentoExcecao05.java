/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecao05;

import java.io.EOFException;

/**
 *
 * @author higor
 */
public class TratamentoExcecao05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            throwException();
        } catch (Exception exception) {
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }
    
    
    public static void throwException() throws Exception{
        try {
            System.out.println("Method throwException");
            throw new Exception();
        } catch (Exception exception) {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        finally{
            System.err.println("Finally executed in throwException");
        }
    }
    
    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {
            System.err.println(exception);
        }
        finally {
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
    
}
