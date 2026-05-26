//Pacote que será trabalhado
package Vetores;

//adicionar a biblioteca
import java.util.Arrays;

//classe a ser trabalhada
public class VetorIR {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numeros = {10,20,30,40,50};
        System.out.println("Numeros originais: " + Arrays.toString(numeros));

        //inserindo o novo indice e valor
        int[] novoVetor = new int[numeros.length + 1];
        
        // Inserindo o novo índice e valor
        for (int i = 0, j = 0; i < novoVetor.length; i++) {
            
            if (i == 2) {
                novoVetor[i] = 25; // Insere o 25 na posição 2
            } else {
                novoVetor[i] = numeros[j]; // Copia o valor do vetor original
                j++; // Só avança o j se copiamos do vetor original
            }
        }
        
        //remover o vetor no indice 3
        int[] vetorEmovido = new int[novoVetor.length -1];
        
        //processo que ira remover o vetor
        // Remover o vetor no índice 3
            for (int i = 0, j = 0; i < novoVetor.length; i++) {

                if (i != 3) { // Ignora o índice 3 para fazer a "remoção"
                    vetorEmovido[j] = novoVetor[i];
                    j++;
                }
            }

         //imprime os novos indices e valores
        System.out.println("Numeros com insert : " + Arrays.toString(novoVetor));
        System.out.println("Numeros Removido:  " + Arrays.toString(vetorEmovido));
        
        }
        
    }