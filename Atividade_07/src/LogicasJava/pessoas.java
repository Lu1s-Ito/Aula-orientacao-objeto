//Pacote que será trabalhado
package LogicasJava;

//classe a ser trabalhada
public class  pessoas{
    
    //cria o metodo
    private String pessoa;
    static String especie = "Humano";
    
    //cria os metodos
    /*
    public static String getEspecie() {
        return especie;
    }
    */
    public String getPessoa() { //cria o metodo de entrada
        return pessoa;
    }
    
    public void setPessoa(String pessoa) { //cria o metodo de saida
        this.pessoa = pessoa;
    }
    /*
    public static void setEspecie(String especie) {
        pessoas.especie = especie;
    }
    */
}
