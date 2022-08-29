
package br.edu.fatecfranca.projeto2.exe0;

/**
 *
 * @author lihhc
 */
public final class Produto {
    
    //criar os atributos da classe, também chamados de variáveis da classe
    // Private - recurso que impossibilita a atribuição de valores diretamente à variável
    
    private int qtde;
    private double preco;
    private String nome;
    
    //////////////////////////////////////////////////////////////////////////////////////
    //método construtor vazio (deve ter o mesmo nome da classe)
    public Produto(){
        
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    //método construtor para inicializar as variáveis (deve ter o mesmo nome da classe)
    public Produto(String nome, int qtde, double preco){
        //this representa o objeto que chamou o método
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
        
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    // Métodos setter - metodos para se atribuir com segurança valor às variáveis
    public final void setNome(String nome){
        this.nome = nome;
    }
    public void setQtde (int qtde){
        if (qtde >= 0){
            this.qtde = qtde;
        }
        else{
            System.out.println("Qtde não pode ser negativa!");
        }
    }
    public void setPreco(double preco){
        if (preco >=0){
            this.preco = preco;
        }
        else{
            System.out.println("Preço não pode ser negativo!");
        }
    }
    ///////////////////////////////////////////////////////////////////////////
    
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
    ////////////////////////////////////////////////////////////////////////////////
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
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////
     // Métodos getters - métodos para se recuperar com segurança o valor da variável
     public String getNome(){
         return this.nome;
     }
     public int getQtde (){
         return this.qtde;
     }
     public double getPreco(){
         return this.preco;
     }
}
