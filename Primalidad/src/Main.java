
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero=leer.nextInt();
        if(EsPrimo(numero)==true)
        {
            System.out.println("Es número primo");
        }
        else{
            System.out.println("No es número primo");
        }
  
    }
    
    /**
     * 
     * 
     * 
     * 
     * @param a numero entero que se revisará si es primo o no
     * @return Retorna un valor booleano que dice si es primo o no.
     * Devolverá true en caso de ser primo. En caso contrario un false.
     */
    
    static boolean EsPrimo(int a){
        
        int contador=0;
        
        int[] numeros =new int[a];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
        }
        for(int elemento:numeros){
            if(elemento==1 || elemento == a){
                continue;
            }
            if(a % elemento == 0){
                contador++;
            }
        }
        return contador==0;
    }
}
