//define de que pacote é essa classe
package Heranca2;

    //define a classe, e o que terá nela
    public class Funcionarios {
    
        //define os atributos dessa classe
        private String nome;
        private double salario;

            //Método de acesso
            public String getNome() {
                return nome;
            }

            public double getSalario() {
                return salario;
            }

                //Método de valor
                public void setNome(String nome) {
                    this.nome = nome;
                }

                public void setSalario(double salario) {
                    this.salario = salario;
                }
        
           
    }
