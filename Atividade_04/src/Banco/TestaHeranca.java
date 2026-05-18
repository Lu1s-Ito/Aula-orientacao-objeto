//define de que pacote é essa classe
package Banco;

    //define a classe, e o que terá nela
    public class TestaHeranca {
        
        //Roda o codigo na memoria
        public static void main(String[] args) {
            
            //cria um novo objeto
            SeguroDeVeiculo sdv = new SeguroDeVeiculo();
            
                //atribui os valores dos atributos do objeto
                sdv.setCodigoServico(1);
                sdv.setNomeServico("Seguro de veiculo - Fusca, 1967");
                sdv.setDataDeContratacao("18/05/2010");
                sdv.setFranquia(1967.00);
                sdv.setValorSeguroDeVeiculo(2500.00);
            
            //cria o segundo objeto
            Emprestimo e = new Emprestimo();
            
                //atribui os valores dos atributos do objeto
                e.setCodigoServico(2);
                e.setNomeServico("Emprestimo - Massa");
                e.setDataDeContratacao("15/04/2026");
                e.setValor(3200.00);
                e.setTaxa(0.2);
                
                    //imprime os valores do objeto sdv
                    System.out.println("                     ");
                    
                    System.out.println("Seguro de veiculo");
                    System.out.println("---------------------");
                    
                    System.out.println("Codigo de servico: " + sdv.getCodigoServico());
                    System.out.println("Nome do servico: " + sdv.getNomeServico());
                    System.out.println("Data de contratacao: " + sdv.getDataDeContratacao());
                    System.out.println("Franquia: " + sdv.getFranquia());
                    System.out.println("Valor do Seguro de veiculo: " + sdv.getValorSeguroDeVeiculo());
                    
                    System.out.println("---------------------");
                    
                    System.out.println("                     ");
                    
                    //imprime os valores do segundo objeto e
                    System.out.println("Emprestimo");
                    System.out.println("---------------------");
                    
                    System.out.println("Codigo do servico: " + e.getCodigoServico());
                    System.out.println("Nome do servico: " + e.getNomeServico());
                    System.out.println("Data de contratacao: " + e.getDataDeContratacao());
                    System.out.println("Valor do emprestimo: " + e.getValor());
                    System.out.println("Taxa do emprestimo: " + e.getTaxa());
                    System.out.println("Valor total: " + e.calculoTaxa());
        
        }
    
    }
