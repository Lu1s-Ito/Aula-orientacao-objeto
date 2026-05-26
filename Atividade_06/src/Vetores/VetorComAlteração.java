//Pacote que será trabalhado
package Vetores;

//classe a ser trabalhada
public class VetorComAlteração {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numeros = {10,20,30,40,50};
        
        //usando for-each
        for (int num : numeros) {
            System.out.println("elementos: " + num);
        
        }
        
        //altera o Vetor
        numeros[1] = 25;
        
        System.out.println("==============");
        
        //declara que alterou o vetor
        System.out.println("Vetor alterado");
        
        //declara com alteração
        for (int num : numeros) {
            System.out.println("elementos: " + num);
        }
        
    }
    
}
