/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto2.exe5;

/**
 *
 * @author lihhc
 */

public final class Aluno2 {
    private int idade, numAluno;
    private String nome;
    private double p1, p2, notafinal;
  
     public Aluno2(){
     }
     public Aluno2(String nome, int numAluno, int idade, double p1, double p2){
         this.setNome(nome);
         this.setNumAluno(numAluno);
         this.setIdade(idade);
         this.setP1(p1);
         this.setP2(p2);
     }
     public void setNome(String nome){
         if(nome.length() <= 30){
             this.nome = nome;
         }
         else System.out.println("Tamanho do nome é grande demais");
     }
     public void setNumAluno(int numAluno){
         if(Math.floor(Math.log10(numAluno) +1) == 6){
             this.numAluno = numAluno;
         } else System.out.println("Numero do aluno não pode ser diferente de 6 dígitos");
     }
     public void setIdade(int idade){
         if(idade > 0){
             this.idade = idade;
         }else System.out.println("Idade não pode ser negativa");
     }
     public void setP2(double p2){
         if(p2 > 0){
             this.p2 = p2;
         } else System.out.println("Nota não pode ser negativa");
     }
     public void setP1(double p1){
         if(p1 > 0){
             this.p1 = p1;
         } else System.out.println("A notaa não pode ser negativa");
     }
     public String getNome(){
         return this.nome;
     }
     public int getNumAluno(){
         return this.numAluno;
     }
     public int getIdade(){
           return this.idade;
     }
     public double getP1(){
         return this.p1;
     }
     public double getp2(){
         return this.p2;
     }
     public void notaFinal(){
         this.notafinal += (this.p1+ this.p2) / 2;
         System.out.println("\nNota final: " + this.notafinal);
     }
     public void dadosAluno(){
         System.out.println("\nNumero do aluno: " + this.numAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade);
     }

}

 
