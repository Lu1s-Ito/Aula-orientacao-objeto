//Pacote que será trabalhado
package AtributoGlobal;

//classe a ser trabalhada
public class  Calculadora{
    
    int resultado;
    
    //cria o construtor
    int somar(int a, int b) {
        
        //atributo local
         resultado = a + b;
        return resultado;
    }
    
    int subtracao () {
        int resultadoSubtracao = resultado - 5;
        return resultadoSubtracao;
    }
}
