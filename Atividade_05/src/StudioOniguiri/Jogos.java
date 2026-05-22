//define de que pacote é essa classe
package StudioOniguiri;

//define a classe, e o que terá nela
public class Jogos extends Funcionarios{
        
    //define os atributos dessa classe
    private String nome;
    private String genero;
    private int clasifificação;
    private double preco;

    //Método de acesso
    public String getNomeJogo() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }

    public int getClasifificação() {
        return clasifificação;
    }

    public double getPreco() {
        return preco;
    }

    //Método de valor
    public void setNomeJogo(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setClasifificação(int clasifificação) {
        this.clasifificação = clasifificação;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}    