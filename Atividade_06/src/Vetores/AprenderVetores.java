//Pacote que será trabalhado
package Vetores;

//classe a ser trabalhada
public class AprenderVetores {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numeros = new int[5];
        
        //declara o valor
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        //outra forma de declara o vetor
        int[] outroVetor = {10,20,30,40,50};
        
        //imprimo os valores
        System.out.println("Quinto elemento: " + numeros[4]);
        System.out.println("Segundo elemento: " + outroVetor[1]);
    }
    
}
