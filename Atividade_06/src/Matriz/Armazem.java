//Pacote que será trabalhado
package Matriz;

//importa a biblioteca
import java.util.Scanner;

//classe a ser trabalhada
public class Armazem {

    //roda na memoria
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //aciona a biblioteca
        Scanner sc = new Scanner(System.in);
        
        //declarando a matriz
        int [][] prateleiras = new int[3][4];
        
        //for com for
        for (int s = 0; s <prateleiras.length; s++) {
            
            int soma = 0;
            
            for (int p = 0; p < prateleiras[s].length; p++){
                System.out.println("Secao" + (s + 1)+ ": " + "Prateleira " + (p + 1) + ": ");
                prateleiras[s][p] = sc.nextInt();
                
                soma += prateleiras[s][p];
            }
            
            System.out.println("Total de itens na secao " + (s + 1) + ": " + soma);
            soma = 0;
        }
        
        int soma = 0;
        
        soma += prateleiras.length;
        
        System.out.println("Total de itens no armazem: ");
    }
}