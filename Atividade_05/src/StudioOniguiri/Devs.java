//define de que pacote é essa classe
package StudioOniguiri;

    //define a classe, e o que terá nela
    public class Devs extends Funcionarios{
    
        //define os atributos dessa classe
        private String local;
        private String funcao;

            //Método de acesso
            public String getMesa() {
                return local;
            }

            public String getFuncao() {
                return funcao;
            }
                
                //Método de valor
                public void setLocal(String local) {
                    this.local = local;
                }

                public void setFuncao(String funcao) {
                    this.funcao = funcao;
                }
    }
