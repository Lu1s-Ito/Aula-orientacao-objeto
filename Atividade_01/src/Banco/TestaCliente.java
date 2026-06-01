//pacote que vamos usar
package Banco;

//classe de teste 
public class TestaCliente {

    //rodar na memoria
    public static void main(String[] args) {
        
        //criando objeto c1 do objeto Cliente
        Cliente c1 = new Cliente();
        
            //declarando os valores do que tem dentro do objeto
            c1.codigo = 05;
            c1.nome = "Luis";
        
        //criando objeto c2 do objeto Cliente
        Cliente c2 = new Cliente();
            
            //declarando os valores do que tem dentro do objeto
            c2.codigo = 10;
            c2.nome = "Massa";
            
              //imprimi os valores do objeto c1
              System.out.println("Nome:" + c1.nome);
              System.out.println("Codigo:" + c1.codigo);
              
              //imprimi os valores do objeto c2
              System.out.println("Nome:" + c2.nome);
              System.out.println("Codigo:" + c2.codigo);
        
    }
    
}