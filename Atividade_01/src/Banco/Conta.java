//pacote que vamos usar
package Banco;

//classe da Conta
public class Conta {
    
    //declarando os atributos
    int numero;
    double saldo;
    double limite;
    
    //declarando o metodo
    void deposita(double valor){
        this.saldo += valor;
        //this.saldo = this.saldo + valor;
    }
    
    void saque(double valor){
        this.saldo -= valor;
    }
}
