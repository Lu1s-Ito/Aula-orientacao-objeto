//Pacote que será trabalhado
package TryCatch;

//classe a ser trabalhada
public class Exemplo {

    //roda na memoria
    public static void main(String[] args) {
        
        //Criar duas variaveis
        int a = 10;
        int b = 0;
        
        //faz o try e catch
        try {
            int resutado = a/b;
            System.out.println("Resutado: " + resutado);
        }catch (ArithmeticException e)  {
            System.out.println("Erro: nao e posivel dividir por 0");
        }
        System.out.println("Nada de estranho");
        
        System.out.println("=====================================");
        
        try{
            int[] num = {1, 2, 3};
            
            System.out.println("numero no indice 3 " + num[3]);
            
            int resutado2 = a/b;
            
            System.out.println("Resultado: " + resutado2);
            
        }catch (ArithmeticException e) {
            
            System.out.println("Erro: nao e possivel dividir por zero");
            
        }catch(ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Erro: Indice fora do limite");
        }
        
    }
}
