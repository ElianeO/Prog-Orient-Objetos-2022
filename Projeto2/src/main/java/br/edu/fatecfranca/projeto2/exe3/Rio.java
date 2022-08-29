
package br.edu.fatecfranca.projeto2.exe3;

/**
 *
 * @author lihhc
 */
public final class Rio {
   //Java possui dois tipos de daddos
    // Tipo primitivo: float, double, inceger, Character, Boolean
   private String nome;
   private double nivel;
   private boolean poluido; // Variavel booleana (verdadeiro ou falso)
   
   public Rio(){
       
   }
   public Rio(String nome, double nivel, boolean poluido){
       this.setNome(nome);
       this.setNivel(nivel);
       this.setPoluido(poluido);
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public void setNivel(double nivel){
       if(nivel >= 0){
         this.nivel = nivel;
       }
       else{
           System.out.println("Nivel não pode ser negativo");
       }
       
   }
   public void setPoluido(boolean poluido){
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
   public String getNome(){
       return this.nome;
     }
   public double getNivel(){
       return this.nivel;
   }
   public boolean getPoluido(){
       return this.poluido;
   }
}
