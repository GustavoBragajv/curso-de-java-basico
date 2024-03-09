/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecaocustomizada;

import java.util.Scanner;

/**
 *
 * @author higor
 */
public class TratamentoExcecaoCustomizada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    
    
    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "Hbraga";
        String senhaDB = "Martins";
        System.out.print("Usuário: ");
        String usuarioDigitado = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = teclado.nextLine();
        
        if(!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        
        System.out.println("Usuário logado com sucesso.");
    }
        
    
}
