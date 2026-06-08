//Pacote que será trabalhado
package AtributoGlobal;

//classe a ser trabalhada
public class  Configuracao{
    
    //cria os atributos
    private static final double PI = 3.14;
    private static final String VERSAO = "1.0.0";

    public static double getPI() {
        return PI;
    }

    public static String getVERSAO() {
        return VERSAO;
    }
}
