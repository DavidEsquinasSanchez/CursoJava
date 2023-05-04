



public class ClaseMath {
    public static void main (String[] args){
        
            System.out.println("El valor de pi es "+Math.PI);
            System.out.println("El valor de Euler es "+Math.E);
            
            System.out.println("El exponente es "+ Math.pow(4, 2));
     
            
            System.out.println("Numero random "+Math.random());
            
            int numeroRandom = (int)(Math.random()*101);
            
            System.out.println("El valor de numero random es "+numeroRandom);
            
            System.out.println("Raiz cuadrada de 64 es "+(int)(Math.sqrt(64)));
            
            System.out.println("El mayor entre 7 y 9 es "+Math.max(7, 9));
            System.out.println("El menor entre 7 y 9 es "+Math.min(7, 9));
            
            
            System.out.println("El numero 3,45 se rendondea a "+Math.round(3.50));
            
            
            double moneda=(double)Math.round(3.4289 * 100d)/100;
            
            System.out.println("Rendondeo es "+moneda);
    }
}
