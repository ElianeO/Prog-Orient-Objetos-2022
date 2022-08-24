
package br.edu.fatecfranca.projeto1.exe2;

/**
 *
 * @author lihhc
 */
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    public Cliente(String nome, int nroConta, int nroAgencia, double saldo){
        this.nome = nome;
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.saldo = saldo;
    }
    public void depositar( double x){
        this.saldo += x;
        System.out.println("Foi depositado: " + x);
    }
   
    public void sacar(double x){
        if(x <= this.saldo){
            this.saldo -= x;
            System.out.println("Foi sacado: " + x);
        }
        else{
            System.out.println(" Saldo insuficiente");
        }
    }
    public void mostrar(){
        System.out.println("\nNome do cliente: " + this.nome + "\nAgencia: " + this.nroAgencia + "\nConta: " + this.nroConta + "\nSaldo: " + this.saldo);
  
    }
    public void saldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }
}
