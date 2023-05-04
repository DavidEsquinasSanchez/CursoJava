



public class Funciones {
    public static void main (String[] args){
        
        System.out.println(sumar(4,8,9,6));
    

        
            
       
        
    }
    
    
    static int sumar(int... a){
        
        int suma=0;
        for (int num: a){
            suma +=num;
        }
        return suma;
    
    }
    
    static int sumar(int a, int b){
        
        return (a+b);
        
    }
    
    
    static int factorial(int numero){
        if(numero>1){
            numero=numero *(factorial(numero-1));
        }
        return numero;
    }
    
    static void saludar(String nombre, int edad){
        System.out.println("Saludos "+nombre);
        System.out.println("Tu edad es "+edad);
    }
    
    static int sumando(int a, int b){
        
        int sum=a+b;
        return sum;
    }
    
    
   
    
    static void cuentaRegresiva(int a){
            a--;
            if(a>0){
                System.out.println("El número es "+a);
                cuentaRegresiva(a);
            }
            else{
                System.out.println("Final de la cuenta en 0");
            }
    
    
    
    }
    
}
