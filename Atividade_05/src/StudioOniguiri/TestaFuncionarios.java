//define de que pacote é essa classe
package StudioOniguiri;

    //define a classe, e o que terá nela
    public class TestaFuncionarios {
    
        //Roda o codigo na memoria
        public static void main(String[] args) {
            
            //cria o primeiro objeto
            Devs dv1 = new Devs();            
            
                //atribui valor aos atributos do objeto
                    
                    //Funcionario
                    dv1.setNome("Lucas");                    
                    dv1.setSalario(2300.00);
                    dv1.setIdade(24);
                    
                    //Devs
                    dv1.setLocal("Casa");
                    dv1.setFuncao("Programacao do personagem X");
                    
                    
            //cria o segundo objeto
            Design ds1 = new Design();
            
                //atribui valor aos atributos do objeto
                
                    //Funcionario
                    ds1.setNome("Massa");
                    ds1.setSalario(2300.00);
                    ds1.setIdade(20);
                    
                    //Design
                    ds1.setArea("Modelagem 3D");
                    ds1.setPapel("Modelagem do personagem X");
                    
                        //imprime os valores do objeto dv1
                        System.out.println("                  ");
                        System.out.println("Devs");
                        System.out.println("------------------");
                        System.out.println("Nome: " + dv1.getNome());
                        System.out.println("Salario: " + dv1.getSalario());
                        System.out.println("Idade: " + dv1.getIdade());
                        System.out.println("Local de trabalho: " + dv1.getMesa());
                        System.out.println("Funcao atual: " + dv1.getFuncao());
                        System.out.println("                  ");
                        System.out.println("Bonus por jogo lancado: " + dv1.BonusSalario());
                        System.out.println("Total salario: " + dv1.TotalSalario());
                        
                        System.out.println("                  ");
                        System.out.println("==================");
                        
                        //imprime os valores do objeto ds1
                        System.out.println("                  ");
                        System.out.println("Design");
                        System.out.println("------------------");
                        System.out.println("Nome: " + ds1.getNome());
                        System.out.println("Salario: " + ds1.getSalario());
                        System.out.println("Idade: " + ds1.getIdade());
                        System.out.println("Local de trabalho: " + ds1.getArea());
                        System.out.println("Funcao atual: " + ds1.getPapel());
                        System.out.println("                  ");
                        System.out.println("Bonus por jogo lancado: " + ds1.BonusSalario());
                        System.out.println("Total salario: " + ds1.TotalSalario());
                        
        }
    
}
