

import java.util.Scanner;

public class DiaSemana {
    
    public static void main (String[] args){
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduce día de la semana");
        
        int dia=leer.nextInt();
        
        String nombreDia=null;
        
        switch(dia){
            case 1:
                nombreDia="Lunes";
                break;
            case 2:
                nombreDia="Martes";
                break;
            case 3:
                nombreDia="Miércoles";
                break;    
            case 4:
                nombreDia="Jueves";
                break;
                
            case 5:
                nombreDia="Viernes";
                break;    
            case 6:
                nombreDia="Sábado";
                break;     
            case 7:
                nombreDia="Domingo";
                break;     
            default:
                nombreDia="Inválido";
                break;
        }
        
        if(nombreDia=="Inválido"){
            System.out.println("El número introducido no pertenece a ningun día de la semana");
        }
        else{
            System.out.println("El nombre del día es "+nombreDia);
        }
        
    }
    
}
