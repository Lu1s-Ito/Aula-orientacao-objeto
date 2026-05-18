//Define de que pacote é essa classe
package Heranca2;

    //Define a classe, e o que terá nela
    public class TestaFuncionario {

        //Roda o codigo na memoria
        public static void main(String[] args) {
            
            //cria um novo objeto
            Gerente g = new Gerente();
            
                //Atribui os valores dos atributos do objeto
                    //Funcionario
                    g.setNome("Jonathan");
                    g.setSalario(10000.00);
                
                    //Gerente
                    g.setUsuario("Gerente-TI");
                    g.setSenha("Java123");
                    
            //Cria um segundo objeto
            Telefonista t = new Telefonista();
            
                //Atribui os valores dos atributos do objeto
                    
                    //Funcionario
                    t.setNome("Daniel");
                    t.setSalario(3000.00);
                    
                    //Telefonista
                    t.setEstacaoDeTrabalho(12);
            
            //Cria um terceiro objeto
            Secretaria s = new Secretaria();
            
                //Atribui os valores dos atributos do objeto
                
                    //funcionario
                    s.setNome("Jucelia");
                    s.setSalario(2500.00);
                    
                    //Secretaria
                    s.setRamal(6678);
                    
                        //Imprime os valores do objeto g
                        System.out.println("Nome do funcionario: " + g.getNome());
                        System.out.println("Salario do funcionario: " + g.getSalario());
                        System.out.println("Usuario do funcionario: " + g.getUsuario());
                        System.out.println("Senha do funcionario: " + g.getSenha());
                        
                        //Imprime os valores do objeto t
                        System.out.println("Nome do funcionario: " + t.getNome());
                        System.out.println("Salario do funcionario: " + t.getSalario());
                        System.out.println("Usuario do funcionario: " + t.getEstacaoDeTrabalho());
                        
                        //Imprime os valores do objeto s
                        System.out.println("Nome do funcionario: " + s.getNome());
                        System.out.println("Salario do funcionario: " + s.getSalario());
                        System.out.println("Usuario do funcionario: " + s.getRamal());                    
        }
    
    }
