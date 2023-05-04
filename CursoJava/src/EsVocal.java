

import java.util.Scanner;

public class EsVocal {
    
    public static void main(String[] args){
    
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduce una letra");
        
        char letra =leer.next().charAt(0);
       
        
        if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
        
                System.out.println("La letra introducida es una vocal");
    }
        else if (letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U'){
                
                System.out.println("La letra introducida es una vocal");
            }
     else{
                System.out.println("La letra introducida no es una vocal");
     }
        
       
      
    
    }
    
    
}
