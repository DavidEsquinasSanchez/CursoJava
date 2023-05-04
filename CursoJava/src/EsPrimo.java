
import java.util.Scanner;

public class EsPrimo {
    public static void main (String[] args){
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce el número:");
        
        int numero=leer.nextInt();
        if(numero==0){
            System.out.println("El numero "+numero+" no se considera ni primo ni no primo");
        }
        else{

            boolean resultadoPrimo=calcularSiPrimo(Math.abs(numero));
            if(resultadoPrimo==true){
                System.out.println("El numero "+numero+" SI es primo");
            }
            else{
                System.out.println("El numero "+numero+" NO es primo");
            }
        }
        
        
        
    }
        
      static boolean calcularSiPrimo(int n){
       boolean primo=true; 
       int i=1;
       while(primo==true && i<n){
           if(n %i ==0 && i!=10){
               primo=false;
               break;              
           }
           i++;
       }
       return primo;
    }  
        
}
    
 
