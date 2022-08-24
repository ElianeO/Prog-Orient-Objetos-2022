
package br.edu.fatecfranca.projeto1.ex0;

/**
 *
 * @author lihhc
 */
public class Produto {
    
    //criar os atributos da classe, também chamados de variáveis da classe
    public int qtde;
    public double preco;
    public String nome;
    public double total;
    
    //método construtor vazio (deve ter o mesmo nome da classe)
    public Produto(){
        
    }
    
    //método construtor para inicializar as variáveis (deve ter o mesmo nome da classe)
    public Produto(String nome, int qtde, double preco){
        //this representa o objeto que chamou o método
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
        
    }
    //comprar um produto em X unidadas
    public void comprar(int x){
        this.qtde = this.qtde + x;
}
    //vender um produto em X unidades
    public void vender(int x){
        if (x < this.qtde){
            this.qtde = qtde - x;
        }
        
    }
   // subir o preço de um produto em x unidades
    public void subir(double x){
        this.preco += x;
    }
    // desce o preço de um produto em x unidades
    public void descer(double x){
        if (x <= this.preco){
            this.preco -= x;
        }
    }
     public void mostrar(){
          System.out.println("\nNome: " + this.nome +  " \nQtde: " + this.qtde + " \nPreço: " + this.preco); 
     }
}
