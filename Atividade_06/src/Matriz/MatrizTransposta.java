//Pacote que será trabalhado
package Matriz;

//classe a ser trabalhada
public class MatrizTransposta {

    //roda na memoria
    public static void main(String[] args) {
        
        //declarar a matriz
        int [][] matriz = {
        //colunas
        {1,2,3}, //linhas
        {4,5,6}, //linhas
        {7,8,9} //linhas        
        };
        
        //for com for em matriz
        System.out.println("Matriz for com for");
        
        for (int l = 0; l < matriz.length; l++){ //linha
            
            for (int c = 0; c < matriz[1].length; c++) { //coluna
                
                //imprime um numero de uma coluna e linha
                System.out.println(matriz[l][c] + " ");        
            }
        }
            
        System.out.println("=================================");
        
        //matriz transposta
        int linhas = matriz.length; //declarando a linha
        int colunas = matriz[0].length; //declarando a coluna
        int [][] transposta = new int [linhas][colunas]; 
        
        for (int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                transposta[c][l] = matriz[l][c];
            }
        }
        
        System.out.println("Matriz transposta");
        
        for (int [] linha : transposta){
            for (int valor : linha){
               System.out.println();
            }
        }
    }
}
