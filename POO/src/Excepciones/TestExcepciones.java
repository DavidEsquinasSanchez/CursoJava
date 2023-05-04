
package Excepciones;

import java.util.*;
import java.lang.*;

public class TestExcepciones {
    
    public static void main(String[] args){
        
        boolean continuarEjecucion=true;
        
        do {
            try {
                Scanner leer= new Scanner(System.in);

                System.out.println("Ingrese N1: ");
                int n1= leer.nextInt();

                System.out.println("Ingrese N2");
                int n2= leer.nextInt();

                division(n1,n2);

                //System.out.println(resultado);

                continuarEjecucion=false;

          } catch(InputMismatchException e){

              System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
              //e.printStackTrace(System.out);
              
          } catch(OperadorExcepcion e){

              System.err.println("Error: "+e.getMessage());
              //e.printStackTrace(System.out);
          } catch(Exception e){

              e.printStackTrace(System.out);
          } finally{
              System.out.println("Se reviso la division");
          }  
        } while(continuarEjecucion==true);
    }
        
        
    static int division(int n1, int n2){
            
            if(n2==0){
                throw new OperadorExcepcion("Division entre 0");
            }
            return n1/n2;
            
    }
        

    
    
}
