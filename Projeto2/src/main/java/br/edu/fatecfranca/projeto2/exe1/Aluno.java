package br.edu.fatecfranca.projeto2.exe1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lihhc
 */
public final class Aluno {
    private int nroAluno, idade;
    private String nome;
    private double n1, n2;
    // Métodos construtores
    /*public Aluno(){ // Sem parâmetros;;;;;
        Aluno obj1 = new Aluno();
        obj1.nome = "A";
        obj1.idade = 17;
        obj1.n1 = 8.7;
        obj1.n2 = 6.3;
        obj1.nroAluno = 123; 
    } */
    public Aluno(int nroAluno, String nome, int idade, double n1, double n2){
        this.setNro(nroAluno);
        this.setNome(nome);
        this.setNota1(n1);
        this.setNota2(n2);
    }
    public void setNro (int nroAluno){
        this.nroAluno = nroAluno;
    }
    public void setNome(String nome){
       this.nome = nome;
   }
    public void setNota1(double n1){
        if (n1 >=0 ){
            this.n1 = n1;
        }
        else{
            System.out.println("Nota não pode ser negativa");
        }
 
    }
    public void setNota2(double n2){
        if (n2 >=0){
            this.n2 = n2;
        }
        else{
            System.out.println("Nota não pode ser negativa");
        }
    }
    
    public double notaFinal(){
        return (this.n1 + this.n2) / 2;
    }
    public String dadosAluno(){
        return "Nao Aluno: " + this.nroAluno + " Nome: " + this.nome + " Idade: " + this.idade + " Nota Final: " + this.notaFinal();
    }
    
    public void passou (){
        if (this.notaFinal() >= 6.0){
            System.out.println(" Aluno foi aprovado ");
        }
        else {
            System.out.println(" Aluno foi reprovado");
        }
    }
    public int getNro(){
       return this.nroAluno;
    }
    public String getNome(){
       return this.nome;
     }
    public double getNota1(){
        return this.n1;
    }
    public double getNota2(){
        return this.n2;
    }
}

