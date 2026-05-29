//Pacote que será trabalhado
package Vetores;

//adicionar a biblioteca
import java.util.Arrays;

//classe a ser trabalhada
public class PraticaVetor {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numeros = {5, 25, 45, 50, 65, 75, 80, 85, 90, 95};
        System.out.println("Numeros originais: " + Arrays.toString(numeros));
        
        //soma
        int soma = 0;
        
        //maior
        int maior = numeros[0];
        
        //menor
        int menor = numeros[0];
        
        //usando for-each
        for (int num : numeros) {
            soma += num;
            
            if(num > maior)
                maior = num;
            
            if(num < menor)
                menor = num;
        }
        
        //media
        double media = (double) soma / numeros.length;
        
        //imprime a soma, maior e menor
        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
        System.out.println("==========================================================");
        
        //inserir mais um vetor
        int[] novoVetor = new int[numeros.length + 2];
        
        for (int i = 0, j = 0; i < novoVetor.length; i++) {
            
            if (i == 4) {
                novoVetor[i] = 55; // Insere o 55 na 3 posição
            }
            
            else if (i == 1) {
                novoVetor[i] = 20;
            
            }else {
                novoVetor[i] = numeros[j]; // Copia o valor do vetor original
                j++; // Só avança o j se copiamos do vetor original
            }
        }
        
        //remove o utimo indice
        int[] removeVetor = new int[novoVetor.length -1];
        
        for (int i = 0, j = 0; i < removeVetor.length; i++)
            
            if (i != 12) {
                removeVetor[j] = novoVetor[i];
                j++;
            }
         
        
        //imprime os numeros inseridos e removidos
        System.out.println("Inserir e remover");
        System.out.println("----------------------------------------------------------");
        System.out.println("Numeros com insert : " + Arrays.toString(novoVetor));
        System.out.println("Remove o utimo numero: " + Arrays.toString(removeVetor));
    }
        
}