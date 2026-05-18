//define de que pacote é essa classe
package Heranca2;

    //define a classe, e o que terá nela
    public class Gerente extends Funcionarios{
        
        //define os atributos dessa classe
        private String usuario;
        private String senha;

            //Método de acesso
            public String getUsuario() {
                return usuario;
            }
    
            public String getSenha() {
                return senha;
            }
            
                //Método de valor
                public void setUsuario(String usuario) {
                    this.usuario = usuario;
                }

                public void setSenha(String senha) {
                    this.senha = senha;
                }
        
        
    }
