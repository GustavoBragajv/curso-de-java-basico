/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecaoregrassobrescrita;

/**
 *
 * @author higor
 */
public class TratamentoExcecaoRegrasSobrescrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        
        try {
            pessoa.salvar();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        try {
            funcionario.salvar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
