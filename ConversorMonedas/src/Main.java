
//3.58 sol peruano equivale a 1 dolar.

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
        while(true){
            
            System.out.println("Conversor de monedas");
            System.out.println("1 - Soles peruanos a dolares\n"
                    + "2 - Pesos mexicanos a dolares\n"
            +"3 - Pesos Colombianos a dolares\n"+
                    "4 - Salir");
            System.out.println("Introduce una opcion");
            Scanner leer= new Scanner(System.in);
            
            char opcion= leer.next().charAt(0);
            switch(opcion){
                case '1':
                    convertir(3.58,"soles peruanos");
                    break;
                case '2':
                     convertir(22.15,"Pesos mexicanos");
                     break;
                case '3':
                    convertir(3851.90,"Pesos Colombianos");
                    break;
                case '4':
                    System.out.println("Finalizado Proceso");
                    break;
                default:
                    System.out.println("Opción introducida incorrecta. Por favor vuelve a introducirlo");
                    break;
            }
            if(opcion=='4'){
                break;
            }
            
        }
        
    }
    
    
    static void convertir(double valorDolar, String pais){
        Scanner leer= new Scanner(System.in);
        System.out.printf("Introduce la cantidad de %s\n",pais);
        double cantidadmoneda= leer.nextDouble();
        
        double dolares= cantidadmoneda/valorDolar;
     
        dolares=(double)Math.round(dolares *100d)/100;
        
        System.out.println("Tienes $"+dolares+" dolares");
        
    }
}
