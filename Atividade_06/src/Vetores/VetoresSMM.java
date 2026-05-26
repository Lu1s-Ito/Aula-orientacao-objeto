//Pacote que será trabalhado
package Vetores;

//classe a ser trabalhada
public class VetoresSMM {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numeros = {10,20,30,40,50};

        //declara as variaveis
        
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
        
        //imprime o total
        System.out.println("Soma: " + soma);
        
        //imprime o maior
        System.out.println("Maior: " + maior);
        
        //imprime o menor
        System.out.println("Menor: " + menor);
        
        //media
        System.out.println("Media: " + media);
    }
    
}