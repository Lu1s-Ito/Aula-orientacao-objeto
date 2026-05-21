//define de que pacote é essa classe
package StudioOniguiri;

    //define a classe, e o que terá nela
    public class Design extends Funcionarios{
    
        //define os atributos dessa classe
        private String area;
        private String papel;
            
            //Método de acesso
            public String getArea() {
                return area;
            }

            public String getPapel() {
                return papel;
            }
                
                //Método de valor
                public void setArea(String area) {
                    this.area = area;
                }

                public void setPapel(String papel) {
                    this.papel = papel;
                }
                                
                    //reescrita de método
                    @Override
                    public double BonusSalario(){
                        return this.getSalario() * 0.2 + 240;
                    }
        
    }
