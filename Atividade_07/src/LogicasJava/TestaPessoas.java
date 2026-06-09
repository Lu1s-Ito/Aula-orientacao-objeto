//Pacote que será trabalhado
package LogicasJava;

//classe a ser trabalhada
public class  TestaPessoas{

    //roda na memoria
    public static void main(String[] args) {
        
        //cria os objetos
        pessoas p1 = new pessoas();
        pessoas p2 = new pessoas();
        
        //imprime os atributos
        System.out.println(p1.especie);
        System.out.println(p2.especie);
        
        //alterando p1, altera tudo
        p1.especie = "Mutante";
        System.out.println(p2.especie);
        
    }
    
}
