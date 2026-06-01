package Matriz;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Declarando a matriz (3 seções, 4 prateleiras por seção)
        int [][] prateleiras = new int[3][4];
        int maior = 0; 
        int soma;
        int total = 0;
        int sMaior = 0;
        int sMenor = 0;
        int pMaior = 0;
        int pMenor = 0;
        
        //leitura dos dados e soma por seção / total
        for (int s = 0; s < prateleiras.length; s++) {
            soma = 0;
            
            for (int p = 0; p < prateleiras[s].length; p++) {
                System.out.print("Secao " + (s + 1) + " - Prateleira " + (p + 1) + ": ");
                prateleiras[s][p] = sc.nextInt();
                
                soma += prateleiras[s][p];
            }
            
            System.out.println("Total de produtos na secao " + (s + 1) + ": " + soma);
            System.out.println("---------------------------------------");
            
            total += soma;
        }
        
        System.out.println("Total de produtos no armazem: " + total);
        System.out.println("=======================================");
        
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

        System.out.print("Maior numero de produtos - " + "Secao " + sMaior + " - Prateleira " + pMaior + ": ");
        //System.out.println("=======================================");

        
        /*
        for (int s = 0; s < prateleiras.length; s++) {
            int somaMedia = 0;
            
            for (int p = 0; p < prateleiras[s].length; p++) {
                somaMedia += prateleiras[s][p];
            }
            // prateleiras[s].length é igual a 4
            double media = (double) somaMedia / prateleiras[s].length; 
            System.out.println("Media de produtos por prateleira na Secao " + (s + 1) + ": " + media);
        }
        */
        sc.close(); // Boa prática: fechar o Scanner
    }
}