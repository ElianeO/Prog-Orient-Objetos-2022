package br.edu.fatecfranca.projeto2.exe2;


/**
 *
 * @author lihhc
 */
public final class Cliente {
    private int nroConta, nroAgencia;
    private String nome;
    private double saldo;
    
    public Cliente(String nome, int nroConta, int nroAgencia, double saldo){
        this.setNome(nome);
        this.setNroConta(nroConta);
        this.setNroAg(nroAgencia);
        this.setSaldo(saldo);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setConta(int nroConta){
        if (nroConta >= 0){
            this.nroConta = nroConta;
        }
        else{
            System.out.println("Numero da conta não pode ser negativo");
        }
  
    }
    public void setNroAg(int nroAgencia){
        if(nroAgencia >= 0){
        this.nroAgencia = nroAgencia;
        }
        else{
            System.out.println("Numero da agencia nao pode ser negativo");
        }
    }
    public void setNroConta(int nroConta){
        if (nroConta >=0){
            this.nroConta = nroConta;
        }
        else{
            System.out.println("Numero da conta não pode ser negativo");
        }
    
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void Saldo(double saldo){
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
    public String getNome(){
        return this.nome;
    }
    public int getNroConta(){
        return this.nroConta;
    }
    public int getNroAg(){
        return this.nroAgencia;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
