//define de que pacote é essa classe
package Banco;

//define a classe, e o que terá nela
public class Emprestimo extends Servico{
    
    //define os atributos dessa classe
    private double valor;
    private double taxa;

        //Métodos de acesso
        public double getValor() {
            return valor;
        }

        public double getTaxa() {
            return taxa;
        }
            
            //Métodos de valor
            public void setTaxa(double taxa) {
                this.taxa = taxa;
            }
            
            public void setValor(double valor) {
                this.valor = valor;
            }
            
                //Atribui um metodo de calculo
                @Override
                public double calculoTaxa(){
                    return this.valor * taxa + super.calculoTaxa();
                }
        
            

}
