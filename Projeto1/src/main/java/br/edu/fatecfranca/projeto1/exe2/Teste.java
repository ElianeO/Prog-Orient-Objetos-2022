/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto1.exe2;

/**
 *
 * @author lihhc
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente obj1 = new Cliente("Alex", 567,15,1200);
         obj1.mostrar();
         obj1.depositar(2000.5);
         obj1.saldo();
         obj1.sacar(215.5);
         obj1.saldo();
         
         Cliente obj2 = new Cliente("Maria Eduarda",180,988,3000);
         obj2.mostrar();
         obj2.depositar(100);
         obj2.saldo();
         obj2.sacar(500);
         obj2.saldo();
    }
    
    
}
