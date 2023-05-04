
import java.util.Scanner;

public class Sumar {
    public static void main(String[] args){
        
        Scanner leer= new Scanner(System.in);
        
        System.out.print("Introduce primer número: ");
        var num1=leer.nextInt();
        
        System.out.println("Introduce segundo número: ");
        
        var num2=leer.nextInt();
        
        var suma=num1+num2;
        
        System.out.printf("El resultado de la suman de %d y %d es: %d \n",num1,num2,suma);
        
    }
}
