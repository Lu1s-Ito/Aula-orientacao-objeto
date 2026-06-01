//pacote que vamos usar
package Banco;

//classe de Teste Agenía
public class TestaAgencia {
    
    //teste de rodar na memoria
    public static void main(String[] args) {
        
        //criando o objeto a1
        Agencia a1 = new Agencia();
        
            //declarando os valores do atributo de a1
            a1.numero = 5252;
            a1.nome = "Caixa";
            
        //criando o objeto a2
        Agencia a2 = new Agencia();
        
            //declarando os valores do atributo de a2
            a2.numero = 6782;
            a2.nome = "BDB";
            
                //imprime os dados de a1
                System.out.println("Numero da Agencia:" + a1.numero);
                System.out.println("Nome da Agencia:" + a1.nome);
                
                System.out.println("-----------------------------------");
                
                //imprime os dados de a2
                System.out.println("Numero da Agencia:" + a2.numero);           
                System.out.println("Nome da Agencia:" + a1.nome);
    }
}
