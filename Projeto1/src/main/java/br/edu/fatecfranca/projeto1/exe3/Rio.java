
package br.edu.fatecfranca.projeto1.exe3;

/**
 *
 * @author lihhc
 */
public class Rio {
   //Java possui dois tipos de daddos
    // Tipo primitivo: float, double, inceger, Character, Boolean
   public String nome;
   public double nivel;
   public boolean poluido; // Variavel booleana (verdadeiro ou falso)
   
   public Rio(){
       
   }
   public Rio(String nome, double nivel, boolean poluido){
       this.nome = nome;
       this.nivel = nivel;
       this.poluido = poluido;
   }
   public void chover(double x){
       this.nivel += x;
   }
   public void ensolarar(double x){
       if (x <= this.nivel){
       this.nivel -= x;
   }
       else{
           System.out.println("Nivel do rio não pode ser negativo");
       }
   }
   public void limpar(){
       if (this.poluido){
           this.poluido = false;
           System.out.println("Rio limpo com sucesso");
       }
       else{
           System.out.println("O Rio já está limpo");
       }
   }
   public void sujar(){
       if (!this.poluido){
           this.poluido = true;
           System.out.println("O Rio foi sujo");
       }
       else{
           System.out.println("O Rio já está sujo");
       }
       
   }
   public void mostrar(){
       String aux = this.poluido ? " Sim " : " Não ";
       System.out.println("\nNome: " + this.nome + " \nNivel " + this.nivel + " \nPoluido: " + aux);
                          
   }
}
