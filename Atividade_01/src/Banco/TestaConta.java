//pacote que vamos usar
package Banco;

//classe de Teste Conta
public class TestaConta {

    //teste de rodar na memoria
    public static void main(String[] args) {
        
        //criando o objeto c1
        Conta c1 = new Conta();
        
           //declarando os valores do atributo de c1
           c1.numero = 01;
           c1.saldo = 3000.00;
           c1.limite = 500.00;
           
        //criando o objeto c2
        Conta c2 = new Conta();
        
           //declarando os valores do atributo de c1
           c2.numero = 02;
           c2.saldo = 3200.00;
           c2.limite = 700.00;
           
                //imprime os dados de c1
                System.out.println("Numero:" + c1.numero);
                System.out.println("Saldo:" + c1.saldo);
                System.out.println("Limite:" + c1.limite);
                
                System.out.println("--------------------------");
                    
                    //imprime o valor depositado
                    System.out.println("Valor depositado:0.99" + c1.saldo);
                
                    //depositar um novo valor
                    c1.deposita(0.99);
           
                    //imprime o novo valor
                    System.out.println("valor atualizado:" + c1.saldo);
                
                System.out.println("--------------------------");
                
                //imprime os dados de c2
                System.out.println("Numero:" + c2.numero);
                System.out.println("Saldo:" + c2.saldo);
                System.out.println("Limite:" + c2.limite);
                
                System.out.println("--------------------------");
                
                    //imprime o valor sacado
                    System.out.println("valor sacado: metade do valor" + c2.saldo);
                    
                    //sacar um novo valor
                    c2.saque(c2.saldo /2);
                    
                    //imprime o novo valor
                    System.out.println("Valor atualizado:" + c2.saldo);
    }
}
