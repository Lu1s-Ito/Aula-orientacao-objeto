//define de que pacote é essa classe
package Banco;

    //define a classe, e o que terá nela
    public class SeguroDeVeiculo extends Servico{
    
        //define os atributos dessa classe
        private double valorSeguroDeVeiculo;
        private double franquia;

            //Métodos de acesso
            public double getValorSeguroDeVeiculo() {
                return valorSeguroDeVeiculo;
            }

            public double getFranquia() {
                return franquia;
            }

                //Métodos de valor
                public void setValorSeguroDeVeiculo(double valorSeguroDeVeiculo) {
                    this.valorSeguroDeVeiculo = valorSeguroDeVeiculo;
                }

                public void setFranquia(double franquia) {
                    this.franquia = franquia;
                }
            
            
    }
