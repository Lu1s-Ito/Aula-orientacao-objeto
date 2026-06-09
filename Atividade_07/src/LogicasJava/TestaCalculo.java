//Pacote que será trabalhado
package LogicasJava;

//classe a ser trabalhada
public class  TestaCalculo{

    //roda na memoria
    public static void main(String[] args) {
        
        //cria um objeto
        Calculadora c = new Calculadora();
        
        int resultadoSoma = c.somar(5, 7);
        
        
        System.out.println("Nadashi: " + c.subtracao());
        System.out.println("Ytadashi: " + resultadoSoma);
    }
    
}
