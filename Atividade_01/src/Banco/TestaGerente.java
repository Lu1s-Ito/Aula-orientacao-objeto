//pacote que vamos usar
package Banco;

    //classe de Testa Gerente
    public class TestaGerente {

        //teste de rodar na memoria
        public static void main(String[] args) {
    
            //criando o objeto g1
            Gerente g1 = new Gerente();
    
                //declarando os valores do atributo de c1
                g1.nome = "Corno";
                g1.salario = 20000;
    
                    //atribuir o aumento de 10%
                    g1.aumentaSalario();
        
                        //imprime o resutado do aumento salarial
                        System.out.println("Salario com 10% de aumento " + g1.salario);
        
    }
}
