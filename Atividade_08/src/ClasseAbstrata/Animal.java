//indica de qual pacote é 
package ClasseAbstrata;

//classe que estâ usando
abstract class Animal {
    
    //atributo 
    public String nome;
    
    //metodo abstrato; não sera iplementado
    public void emitirSom(){
    }
    
    //metodo concreto; irà ser iplementado
    public void dormir(){
        System.out.println(nome + "esta dormindo!");
    }
}
