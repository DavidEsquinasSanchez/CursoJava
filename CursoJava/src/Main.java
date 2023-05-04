
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
      
       Scanner leer= new Scanner(System.in);
       
        System.out.println("Introduce tu nombre");
        String nombre=leer.nextLine();
        
        Main s= new Main();
        
        s.saludo(nombre);
        
        saludar(nombre);
    }
    
    static void saludar(String nombre){
        System.out.println("Saludos "+nombre);
    }
    
    public void saludo(String nombre){
        System.out.println("Saludos señor "+nombre);
    }
}
