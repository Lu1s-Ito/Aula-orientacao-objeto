//Pacote usado
package Emcapsulamento;

//classe Funcionario
public class TestaFuncionario {

    //O que vai rodar na memoria
    public static void main(String[] args) {
        
        //criar o objeto f
        Funcionario f = new Funcionario();
                
            //declarar os valores dos atributos
            f.setNome("Joel");
            //f.nome = "Jubsclaiton";
        
            f.setSalario(5000.00);
            //f.salario = 5000.00;
            
            f.setSetor("RH");
            
            f.setCargo("Asistente");
            //f.cargo = "RH";
            
                //Imprimir resutados do objeto
                System.out.println("Nome: " + f.getName());
                System.out.println("Salario: " + f.getSalario());
                System.out.println("Cargo: " + f.getCargo());
                System.out.println("Setor: " + f.getSetor());
    }
    
}
