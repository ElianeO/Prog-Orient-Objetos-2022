
package br.edu.fatecfranca.projeto1.ex0;

/**
 *
 * @author lihhc
 */
public class Teste {

    public static void main(String[] args) {
        //System.out.println("Hello World!"); 
        
        // vamos criar um objeto da classe produto --> INSTANCIAR A CLASSE
        Produto obj1 = new Produto("Liquidificador",1,55.6); 
        obj1.comprar(2);
        obj1.vender(1);
        obj1.subir(3);
        obj1.descer(1);
        obj1.mostrar();
        
        //////////////////////////////////////////////////////////////////////////////////////////////////
        
        //Chama o método contrutor para inicializar as variáveis
        Produto obj2 = new Produto("Batedeira", 2, 500.17);
        obj2.mostrar();
        obj2.comprar(3);
        obj2.vender(1);
        obj2.subir(3);
        obj2.descer(1);
        obj2.mostrar();
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////
         
        Produto obj3 = new Produto("Fogão", 1, 2500.17);
        obj3.mostrar();
        obj3.comprar(1);
        obj3.vender(2);
        obj3.subir(3);
        obj3.descer(1);
        obj3.mostrar();
   
    }
} 
