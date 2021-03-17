/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.principal;

import br.model.Cliente;
import br.service.ComunicadorTCP;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class TCPCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String mensagem;
        
        ComunicadorTCP comunicacao = new ComunicadorTCP("127.0.0.1", 6789); //192.168.1.85
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("daniel correa da silva\n");
        cliente.setCpf("999.999.999-99\n");
        cliente.setCelular("(62) 99999-9999\n");
        while(true){
            System.out.println("Entre com sua mensagem:");
            mensagem = teclado.nextLine();
            comunicacao.enviarMensagem(mensagem);
            System.out.println(comunicacao.receberMensagem());
            
            //comunicacao.fecharConexao();
        }
    }
    
}
