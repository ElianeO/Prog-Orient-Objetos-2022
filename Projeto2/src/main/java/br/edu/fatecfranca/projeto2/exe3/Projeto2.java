
package br.edu.fatecfranca.projeto2.exe3;

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
        Rio obj1 = new Rio();
        obj1.setNome("Amazonas");
        obj1.setNivel(1.45);
        obj1.setPoluido(false);
        
        obj1.mostrar();
        obj1.chover(2.74);
        obj1.limpar();
        obj1.mostrar();
        
        
        
        Rio obj2 = new Rio("Parana", 1.21, false);
        obj2.mostrar();
        obj2.chover(0.3);
        obj2.sujar();
        obj2.mostrar();
        
        
        Rio obj3 = new Rio("Tietê", 0.78,true);
        obj3.mostrar();
        obj3.ensolarar(0.78);
        obj3.limpar();
        obj3.mostrar();
        System.out.println("\nNome: " + obj1.getNome() + " \nPoluido: " + obj1.getPoluido() + " \nNivel: " + obj1.getNivel());
    }

}
