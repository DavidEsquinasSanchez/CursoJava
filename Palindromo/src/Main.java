
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String texto=leer.nextLine();
        if(esPalindromo(texto)==true){
            System.out.println("El texto introducido SI es palindromo");
        }
        else{
            System.out.println("El texto introducido NO es palindromo");
        }
        
    }
    
    static boolean esPalindromo(String cadena){
        
        cadena=cadena.replace(" ","");
        cadena=cadena.toLowerCase();

        StringBuilder cadenaInversa= new StringBuilder();
        
        for(int i=cadena.length()-1;i>=0;i--){
            cadenaInversa.append(cadena.charAt(i));
        }

        if (cadena.equals(cadenaInversa.toString())){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
