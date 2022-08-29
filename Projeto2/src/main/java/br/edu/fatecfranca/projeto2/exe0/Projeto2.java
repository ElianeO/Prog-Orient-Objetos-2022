/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto2.exe0;

/**
 *
 * @author lihhc
 */
public class Projeto2 {

    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.setNome("microfone");
        prod1.setQtde(-5);
        prod1.setPreco(-94.21);
        prod1.mostrar();
        System.out.println(" Nome: " + prod1.getNome());
        System.out.println(" Qtde: " + prod1.getQtde());
        System.out.println(" Preco: " + prod1.getPreco());
    }
}
