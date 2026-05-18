//define de que pacote é essa classe
package Heranca2;

    //define a classe, e o que terá nela
    public class Telefonista extends Funcionarios{
        
        //define os atributos dessa classe
        private int estacaoDeTrabalho;

            //Método de acesso
            public int getEstacaoDeTrabalho() {
                return estacaoDeTrabalho;
            }

            //Método de valor
            public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
                this.estacaoDeTrabalho = estacaoDeTrabalho;
            }
            
    }   
