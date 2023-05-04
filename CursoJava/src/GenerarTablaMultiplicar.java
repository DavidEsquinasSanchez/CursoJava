
import java.util.Scanner;

public class GenerarTablaMultiplicar {
    
    public static void main (String[] args){
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduce el numero de la tabla");
        
        int num=leer.nextInt();
        int c=0;
        
        while(c<=10){
            System.out.printf("| %d x %d = %d |\n",num,c,(num*c));
            c++;
        }
        do{
            System.out.println("Termino el flujo");
        }while(c<2);
        
        
        for (int i=0;i<=10;i++){
             System.out.printf("| %d x %d = %d |\n",num,i,(num*i));
             if (i==5){
                 System.out.println("Saltar siguiente ejecucion "+i);
                 //break;
                 continue;
             }
             System.out.println("No me ejecutare en posicion 5");
        }
        
    }
}
