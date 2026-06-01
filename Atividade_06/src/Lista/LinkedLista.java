//Pacote que será trabalhado
package Lista;

//importa a biblioteca
import java.util.LinkedList;

//classe a ser trabalhada
public class LinkedLista {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara a lista
        LinkedList<String> frutas = new LinkedList <>();
        
        //Declaro os valores
        frutas.add("Moranguinho"); 
        frutas.add("Lichia");
        frutas.add("Acerola");
        frutas.addFirst("Maca"); //adiciona mais um item no começo
        frutas.addLast("Tomate"); //adiciona no final mais um item
        frutas.add(2, "Cereja"); //adiciona na posição 2 o item
        
        //imprime na tela
        System.out.println("Frutas ->" + frutas); //imprime todas as frutas
        System.out.println("Fruta ->" + frutas.get(1)); //immprime uma fruta especifica
    }
}