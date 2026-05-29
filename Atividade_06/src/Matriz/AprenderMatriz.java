//Pacote que será trabalhado
package Matriz;

//classe a ser trabalhada
public class AprenderMatriz {

    //roda na memoria
    public static void main(String[] args) {
        
        //declarar a matriz
        int [][] matriz = 
        {
        
        //colunas
        {1,2,3}, //linhas
        {4,5,6}, //linhas
        {7,8,9} //linhas
                
        };
        
        //imprime um numero de uma coluna e linha
        System.out.println("Elementos da linha 1, coluna 2: " + matriz[0][1]);
        System.out.println("Elementos da linha 3, coluna 1: " + matriz[2][0]);
        System.out.println("=================================");
        
        //declara a segunda matriz 
        int [][] matriz2 = new int [4][4];
        
        //linha/coluna
        matriz2 [1][1] = 1;
        matriz2 [1][2] = 2;
        matriz2 [1][3] = 3;
        matriz2 [2][1] = 4;
        matriz2 [2][2] = 5;
        matriz2 [2][3] = 6;
        matriz2 [3][1] = 7;
        matriz2 [3][2] = 8;
        matriz2 [3][3] = 9;
        
        //imprime um numero de uma coluna e linha
        System.out.println("Elementos da linha 1, coluna 2: " + matriz2[1][2]);
        System.out.println("Elementos da linha 3, coluna 1: " + matriz2[3][1]);
        System.out.println("=================================");
        
        //for com for em matriz
        System.out.println("Matriz for com for");
        for (int l = 0; l < matriz.length; l++){ //linha
            
            for (int c = 0; c < matriz[1].length; c++) { //coluna
                
                //imprime um numero de uma coluna e linha
                System.out.println(matriz[l][c] + " ");        
            }
        }
        
        System.out.println("=================================");
        
        //for com for em matriz
        System.out.println("Matriz for com for, jeito 2");
        for (int l = 1; l < matriz2.length; l++){ //linha
            
            for (int c = 1; c < matriz2[1].length; c++) { //coluna
                
                //imprime um numero de uma coluna e linha
                System.out.println(matriz2[l][c] + " ");
                
            }
        }
        
        System.out.println("=================================");
        
        //for com for em matriz com soma
        int soma = 0;
        
        for (int l = 1; l < matriz2.length; l++){ //linha
            
            for (int c = 1; c < matriz2[1].length; c++) { //coluna
                
                soma += matriz2 [l] [c];
            }
        }
        
        //imprime o total da matriz
        System.out.println("Soma atual: " + soma); 
        soma = 0;
        
        //maior numero da matriz
        int maior = matriz [0] [0];
        for (int [] linha : matriz) {
            for (int valor : linha) {
                if (valor > maior) {               
                    maior = valor;
                }
            }
        }
        
        //imprime o maior
        System.out.println("Maior elemento: " + maior);
        
        //maior numero da matriz
        int menor = matriz [0] [0];
        for (int [] linha : matriz) {
            for (int valor : linha) {
                if (valor < menor) {               
                    menor = valor;
                }
            }
        }
        
        //imprime o menor
        System.out.println("Menor elemento: " + menor);
        
        //for com for em matriz com soma
        int subtracao = 0;
        
        for (int l = 0; l < 1; l++){ //linha
            
            for (int c = 0; c < matriz2[l].length; c++) { //coluna
                
                subtracao -= matriz2 [l] [c];
                System.out.println("Subtracao atual " + (l-1) + subtracao);
            }
        }
        
        //imprime o total da matriz
        //subtracao = 0;
        
    }
}