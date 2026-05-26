//Pacote que será trabalhado
package Vetores;

//classe a ser trabalhada
public class VetoresComFor {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara o vetor
        int[] numerosFor = {10, 20, 30, 40, 50};
        
        //usando um for tradicional
        for(int i = 0; i < numerosFor.length; i++) {
            System.out.println("elemento " + (i + 1) + ": " + numerosFor[i]);
        }
        
        //System.out.println("                                 ");
        System.out.println("=================================");
        //System.out.println("                                 ");
        
        //usando for-each
        for (int num : numerosFor) {
            System.out.println("elementos: " + num);
        
        }
        
    }
    
}
