//Pacote que será trabalhado
package Matriz;

//importa a biblioteca
import java.util.Scanner;

//classe a ser trabalhada
public class NotaDeAlunos {

    //roda na memoria
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //aciona a biblioteca
        Scanner sc = new Scanner(System.in);
        
        //declarando a matriz
        int [][] notas = new int[3][4];
        
        //for com for
        for (int l = 0; l < notas.length; l++) { //for de controle
            System.out.println("Aluno " + (l + 1) + ": "); //imprime o aluno
            
            int soma = 0;
            
            for (int c = 0; c < notas[l].length; c++) { //for 
                System.out.print("Nota " + (c + 1) + ": "); //imprime a nota
                notas[l][c] = sc.nextInt();    
                
                if (notas[l][c] < 0 || notas[l][c] > 10) {
                    System.out.println("Besta, a nota so vai de 0 a 10");
                    while (notas[l][c] < 0 || notas[l][c] > 10){
                        
                        System.out.println("Digita novamente a nota" + (l + 1) + ": ");
                        notas[l][c] = sc.nextInt();
                    }
                }
                
                //calcula a media
                soma += notas[l][c];
                double media = (double) soma/notas[l].length;

                //imprime a media
                System.out.println("Media do aluno " + (l + 1) + ": " + media);

                //aprovado ou reprovado
                if (media >= 7) {
                    System.out.println("Aprovado");
                }else if (media < 5){
                    System.out.println("Ja era");
                }else{
                    System.out.println("Vai estudar");
                }
            }
        }
        
            /*
            //for com for para media
            for (int l = 0; l < notas.length; l++) {
                int soma = 0;

                for(int c = 0; c < notas[l].length; c++){
                    soma += notas[l][c];
                }



                //imprime a media
                System.out.println("Media do aluno " + (l + 1) + ": " + media);
            }
            double media = (double) soma/notas[l].length; //calcula a media
            */
    }
}
