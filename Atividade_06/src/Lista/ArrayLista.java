//Pacote que será trabalhado
package Lista;

//importa a biblioteca
import java.util.ArrayList;

//classe a ser trabalhada
public class ArrayLista {

    //roda na memoria
    public static void main(String[] args) {
        
        //declara a lista
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Moranguinho");
        frutas.add("Lichia");
        frutas.add("Acerola");
        
        System.out.println("ArrayList ->" + frutas);
        System.out.println("Posicao ->" + frutas.get(1));
    }
    
}
