/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto1.exe1;

/**
 *
 * @author lihhc
 */
public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public double n1, n2;
    // Métodos construtores
    public Aluno(){ // Sem parâmetros;;;;
        Aluno obj1 = new Aluno();
        obj1.nome = "A";
        obj1.idade = 17;
        obj1.n1 = 8.7;
        obj1.n2 = 6.3;
        obj1.nroAluno = 123; 
    }
    public Aluno(int nroAluno, String nome, int idade, double n1, double n2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
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
}

