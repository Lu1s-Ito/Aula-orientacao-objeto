//Pacote usado
package Emcapsulamento;

//classe Funcionario
public class Funcionario {
    
    //Atributos de funcionario
    private String nome;
    private double salario;
    private String setor;
    private String cargo;
    
        //Criar metodo do nome
        public String getName(){
            return this.nome;
        }

        //Criar metodo do salatrio
        public double getSalario(){
            return this.salario;
        }
        
        //Criar metodo do cargo
        public String getCargo(){
            return this.cargo;
        }
        
        //Criar o metodo de setor
        public String getSetor(){
            return this.setor;
        }
            //Criar o metodo auxiliar de nome
            public void setNome(String nome){
                this.nome = nome;
            }
        
            //Criar o metodo auxiliar de nome
            public void setSalario(double salario){
                this.salario = salario;
            }
            
            //Criar o metodo auxiliar de cargo
            public void setCargo(String cargo){
                this.cargo = cargo;
            }
            
            //criar o metodo auxiliar do setor
            public void setSetor(String setor){
                this.setor = setor;
            }
                
}
