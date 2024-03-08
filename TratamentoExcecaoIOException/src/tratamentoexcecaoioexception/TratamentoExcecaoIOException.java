/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecaoioexception;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author higor
 */
public class TratamentoExcecaoIOException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        criarNovoArquivo();
    }
    
    
    public static void criarNovoArquivo() {
        File arquivo = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso." + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
