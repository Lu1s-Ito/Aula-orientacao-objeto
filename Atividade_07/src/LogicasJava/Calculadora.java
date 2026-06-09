//Pacote que será trabalhado
package LogicasJava;

//classe a ser trabalhada
public class  Calculadora{
    
    int resultado;
    
    //cria o construtor
    public int somar(int a, int b) {
        
        //atributo local
         resultado = a + b;
        return resultado;
    }
    
    public int subtracao () {
        int resultadoSubtracao = resultado - 5;
        return resultadoSubtracao;
    }
}
