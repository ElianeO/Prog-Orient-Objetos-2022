/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto2.exe4;

/**
 *
 * @author lihhc
 */
public final class Cliente2 {
    private String nroConta, nroAgencia, nome;
    private double saldo;
    
    public Cliente2(){
        
    }
    public Cliente2(String nroConta, String nroAgencia, String nome, double saldo){
        this.setNome(nome);
        this.setNroAgencia(nroAgencia);
        this.setNroConta(nroConta);
        this.setSaldo(saldo);
    }
    public void setNroConta(String nroConta){
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Digitio verificador ausente ou em posicao errada");
        }
        else System.out.println("Tamanho inválido");
    }
    public void setNroAgencia(String nroAgencia){
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("Digitio verificador ausente ou em posicao errada");
        }
         else System.out.println("Tamanho inválido");
    }
    public void setNome(String nome){
        if (nome.length() <= 30){
             this.nome = nome;
        }
        else System.out.println("Tamanho invalido");
    }
    public void setSaldo(double saldo){
        if (saldo <0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo nao pode ser negativo");
    }
     public String getNome(){
        return this.nome;
    }
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAg(){
        return this.nroAgencia;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double x){
        this.saldo = saldo + x;
    }
    public void sacar(double x){
        this.setSaldo(this.saldo -x);
    }
    public void mostrar(){
        System.out.println("\nNome: " + this.nome + "\nNumero da conta: " + this.nroConta + 
                "\nNumero da Agencia: " + this.nroAgencia + "\nSaldo: " + this.saldo);
    }
}
