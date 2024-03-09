/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoexcecaotrywithresources;

import java.io.IOException;

/**
 *
 * @author higor
 */
public class Leitor1 implements AutoCloseable {
    
    @Override
    public void close() throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Fechando leitor 1");
    }
    
    
}
