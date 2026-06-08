//Pacote que será trabalhado
package TryCatch;

//classe a ser trabalhada
public class  Finality{

    //roda na memoria
    public static void main(String[] args) {
        
        //faz o try
        try{
            int resultado = 10/2;
            
            System.out.println("Resultado: " + resultado);
        
        }catch(ArithmeticException e) {
            
        }
    }
    
}
