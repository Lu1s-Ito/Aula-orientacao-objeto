//Pacote que será trabalhado
package Vetores;

import java.util.Arrays;

//classe a ser trabalhada
public class VetorIR {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numeros = {10,20,30,40,50};

        //inserindo o novo indice e valor
        int[] novoVetor = new int[numeros.length + 1];
        
        for (int i = 0, j = 0; i < numeros.length; i++){
            
            if (i == 2) {
                novoVetor[i] = 25;
            }else{
            
                novoVetor[i] = numeros[j];
                j++;
                
            }
            
        }
        
        //imprime os novos indices e valores
        System.out.println("Numeros " + Arrays.toString(novoVetor));
    }
    
}
