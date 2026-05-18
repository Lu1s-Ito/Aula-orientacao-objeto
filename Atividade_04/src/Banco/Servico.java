//define de que pacote é essa classe
package Banco;

    //define a classe, e o que terá nela
    public class Servico {
    
        //define os atributos dessa classe
        private String nomeServico;
        private int codigoServico;
        private String dataDeContratacao;
        
            public Servico(){
                 System.out.println("Realizei a acao construtor");
                 System.out.println("--------------------------");
            }

            //Método de acesso
            public String getNomeServico() {
                return nomeServico;
            }

            public int getCodigoServico() {
                return codigoServico;
            }

            public String getDataDeContratacao() {
                return dataDeContratacao;
            }

                //Método de valor
                public void setNomeServico(String nomeServico) {
                    this.nomeServico = nomeServico;
                }

                public void setCodigoServico(int codigoServico) {
                    this.codigoServico = codigoServico;
                }

                public void setDataDeContratacao(String dataDeContratacao) {
                    this.dataDeContratacao = dataDeContratacao;
                }
                
                //método de calculo
                public double calculoTaxa(){
                    return 15;
                }
    
    }
