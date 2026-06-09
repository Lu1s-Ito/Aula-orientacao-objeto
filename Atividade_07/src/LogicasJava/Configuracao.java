//Pacote que será trabalhado
package LogicasJava;

//classe a ser trabalhada
public class  Configuracao{
    
    //cria os atributos
    private static final double PI = 3.14;
    private static final String VERSAO = "1.0.0";
    private final double raio = 2.5;

    public double getRaio() {
        return raio;
    }

    public static double getPI() {
        return PI;
    }

    public static String getVERSAO() {
        return VERSAO;
    }
    
    public static double calculaAreaCirculo(double raio) {
        return PI * raio * raio;
    }
}
