//Pacote que será trabalhado
package Matriz;

//importa a biblioteca
import java.util.Scanner;

//classe a ser trabalhada
public class Armazem {

    //roda na memoria
    @SuppressWarnings("empty-statement")
    public static void main(String[] args, boolean n) {
        
        //aciona a biblioteca
        Scanner sc = new Scanner(System.in);
        
        //declarando a matriz
        int [][] prateleiras = new int[3][4];
        int maior = prateleiras[0][0];
        int soma = 0;
        int total = 0;     
        int sMaior = 0;
        int sMenor = 0;
        int pMaior = 0;
        int pMenor = 0;
        
        
        //for com for
        for (int s = 0; s <prateleiras.length; s++) {
            
            for (int p = 0; p < prateleiras[s].length; p++){
                System.out.println("Secao " + (s + 1)+ ": " + "Prateleira " + (p + 1) + ": ");
                prateleiras[s][p] = sc.nextInt();
                
                soma += prateleiras[s][p];
            }
            
            System.out.println("Total de produtos na secao " + (s + 1) + ": " + soma);
            //soma = 0;
            System.out.println("                            ");
            
            total += soma;
            System.out.println("Total de produtos no armazem: " + total);
        }
        
        sMaior = prateleiras[0][0];
        pMaior = prateleiras[0][0];
        maior = prateleiras[0][0]; 
        for (int[] secao : prateleiras) {   
            for (int valor : secao) {       
                if (valor > maior) {
                    maior = valor;
                }
            }
        }

        System.out.print("Maior numero de produtos" + "Secao " + sMaior + " - Prateleira " + pMaior + ": ");
        //System.out.println("=======================================");

        /*
        //media de 
        for (int s = 0; s <prateleiras.length; s++) {
            
            for(int p = 0; p <prateleiras.length; p++) {
                soma += prateleiras[s][p];
                
            }
            double media = (double) soma / prateleiras[s].length;
            System.out.println("Media das prateleiras: " + media);
        }
        
        */
    }
}