
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        OUTER:
        while(true){
            System.out.println("Juego Adivina el Número");
            System.out.println("1 - Nivel Fácil\n"+"2 - Nivel Intermedio\n"+"3 - Nivel Dificil\n"+"4 - Salir");
            char opcion= leer.next().charAt(0);
            switch(opcion){
                case '1':
                    jugar(10);
                    break;
                case '2':
                    jugar(7);
                    break;
                    
                case '3':
                    jugar(5);
                    break;
                    
                case '4':
                    System.out.println("Finalizado Juego");
                    break OUTER;
                
                default:
                    System.out.println("Opción introducida incorrecta. Por favor introduzca una opción válida");
                    break ;
            }
    
        }
        
        
    }
    
    static void jugar (int vidas){
        int numeroRandom =(int)(Math.random()*101);
        int numeroElegido=-1;
        Scanner leer= new Scanner(System.in);
        while(numeroElegido != numeroRandom && vidas>0){
            System.out.print("Ingrese un número entre 1 y 100: ");
            numeroElegido=leer.nextInt();
            
            if(numeroRandom<numeroElegido){
                System.out.println("Ingrese un número más pequeño");
                vidas--;
            }
            else if(numeroRandom>numeroElegido){
                System.out.println("Ingrese un número más grande");
                vidas--;
            }
            else{
                System.out.println("Felicidades. Acertaste el número");
            }
            
            if(vidas==0){
                System.out.println("No te quedan vidas. Has perdido");
            }
            else if (numeroElegido != numeroRandom){
                System.out.printf("Te quedan %d vidas.\n",vidas);
            }
            

        }
    
    }

    
}
