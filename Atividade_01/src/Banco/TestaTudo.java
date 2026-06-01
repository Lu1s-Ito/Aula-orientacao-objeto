//pacote que vamos usar
package Banco;

//classe de Teste Tudo
public class TestaTudo {

    //teste de rodar na memoria
    public static void main(String[] args) {
        
        //criar objetos a, c, co e cdc
        Agencia a = new Agencia();
        Cliente c = new Cliente();
        Conta co = new Conta();
        CartaoDeCredito cdc = new CartaoDeCredito();
        
            //declarando os valores dos objetos
            
                //Agencia
                a.numero = 3412;
                a.nome = "BDB";
                
                //Cliente
                c.nome = "Massa";
                c.codigo = 01;

                //Conta
                co.numero = 324;
                co.saldo = 3000;
                co.limite = 500;
                
                //Cartao De Credito
                cdc.numero = 456;
                cdc.dataDeValidade = "13/05/28";
                
                    //imprime os dados dos objetos declarados
                        
                        System.out.println("Dados do Cliente");
                        
                        //Cliente
                        System.out.println("Nome:" + c.nome);
                        System.out.println("Codigo:" + c.codigo);
                        
                        System.out.println("-------------------");
                        
                        System.out.println("Dados da Agencia");
                        
                        //Agencia
                        System.out.println("Nome da Agencia:" + a.nome);
                        System.out.println("Numero da Agencia:" + a.numero);
                        
                        System.out.println("-------------------");
                        System.out.println("Dados da conta");
                        
                        //conta
                        System.out.println("Numero:" + co.numero);
                        System.out.println("Saldo:" + co.saldo);
                        System.out.println("Limite:" + co.limite);
                        
                        System.out.println("-------------------");
                        System.out.println("Dados do cartao");
                        
                        //Cartão de Credito
                        System.out.println("Numero de cartao:" + cdc.numero);
                        System.out.println("Data de validade:" + cdc.dataDeValidade);
                        
                        System.out.println("---------------------");
              
    }
    
}
