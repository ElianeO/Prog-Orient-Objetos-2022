package br.edu.fatecfranca.projeto2.exe1;

/**
 *
 * @author lihhc
 */
public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vamos criar um objeto da classe aluno --> INSTANCIAR A CLASSE
          Aluno obj2 = new Aluno(456, "B", 18, 6.9, 7.2);
    
          obj2.notaFinal();
          
          System.out.println("Nro " + obj2.getNro() + " \n Nome: " + obj2.getNome() + "\nNota1: " + obj2.getNota1() + "\nNota2: " + obj2.getNota2());

    }
    
}
