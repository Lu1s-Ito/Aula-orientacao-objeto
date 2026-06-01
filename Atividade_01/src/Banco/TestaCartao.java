//pacote que vamos usar
package Banco;

//classe de teste do cartão
public class TestaCartao {

    //teste de rodar na memoria
    public static void main(String[] args) {
        
        //criando objeto cdc1
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
            //declarando os atributos do cdc1
            cdc1.numero = 150;
            cdc1.dataDeValidade = "13/05/2030";
            
        
        //criando segundo objeto
        CartaoDeCredito cdc2 = new CartaoDeCredito();
        
            //declarando os atributos do cdc2
            cdc2.numero = 225;
            cdc2.dataDeValidade = "25/07/2035";
            
                //imprime os dados do objeto cdc1
                System.out.println("Numero de cartao:" + cdc1.numero);
                System.out.println("Data de validade:" + cdc1.dataDeValidade);
                
                System.out.println("---------------------------------------");
                
                //imprime os dados do objeto cdc2
                System.out.println("Numero de cartao:" + cdc2.numero);
                System.out.println("Data de validade:" + cdc2.dataDeValidade);
    }
    
}
