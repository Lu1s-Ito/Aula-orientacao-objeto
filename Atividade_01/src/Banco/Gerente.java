//pacote que vamos usar
package Banco;

//classe Gerente
public class Gerente {
    
    //declarando os atributos
    String nome;
    double salario;
    
    //declarando o metodo
    void aumentaSalario(){
        this.aumentaSalario(0.1);
    }
    
    //sobrecarregando o metodo
    void aumentaSalario(double taxa){
        this.salario += this.salario * taxa;
    
    }
}