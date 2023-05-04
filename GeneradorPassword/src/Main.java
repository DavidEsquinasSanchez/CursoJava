
public class Main {
    public static void main(String[] args){
        System.out.println(generaContrasena());
        
    }
    
    static String generaContrasena(){
        
        char[] letraMayusculas= {'A','B','C','D','E','F','G'};
        char[] letraMinuscula= {'a','b','c','d','e','f','g'};
        char[] numeros={'1','2','3','4','5','6','7','8','9','0'};
        
        StringBuilder caracteres = new StringBuilder();
        
        caracteres.append(letraMayusculas);
        caracteres.append(letraMinuscula);
        caracteres.append(numeros);
        
        StringBuilder contrasena= new StringBuilder();
        
        for (int i = 0;i <=15; i++){
            int cantidadCaracteres= caracteres.length();
            int numeroRandom=(int)(Math.random()*cantidadCaracteres);
            contrasena.append((caracteres.toString()).charAt(numeroRandom));
                   
        }
        
        return contrasena.toString();
        
    }
}
