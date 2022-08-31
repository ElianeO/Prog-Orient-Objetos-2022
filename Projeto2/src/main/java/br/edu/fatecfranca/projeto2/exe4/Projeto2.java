/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto2.exe4;

/**
 *
 * @author lihhc
 */
public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente2 obj1 = new Cliente2("123456-7", "1234-5", "Maria Eduarda", 1200);
        obj1.mostrar();
        obj1.depositar(100);
        obj1.sacar(50);
        obj1.mostrar();
    }
    
}
