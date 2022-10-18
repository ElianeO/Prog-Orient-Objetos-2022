/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe1;

public class TestaPessoaCidadao {

    public static void main(String[] args) {
        
        Pessoa fulano = new Pessoa();
	
        Cidade franca = new Cidade();
	
        franca.contrata(fulano); // contrata um professor

        // conversão 
        franca.contrata((IEmpregado) fulano); // contrata um empregado
        
	franca.cobraDe(fulano);
	
        franca.registra(fulano);
	
        franca.alimenta(fulano);

        
    }
    
}