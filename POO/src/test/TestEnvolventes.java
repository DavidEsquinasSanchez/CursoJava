
package test;


public class TestEnvolventes {
    
    public static void main(String[] args){
        
        Integer n=10;
        
        System.out.println("Entero ->"+n+" -> "+ (n+n));
        
        String numeroString = n.toString();
        
        
        System.out.println("Entero a double ->"+n.doubleValue());
        
        int n2= n;
        
        n2 = Integer.parseInt(numeroString);
        
        System.out.println(n2+n2);
        
        
        double numeroDouble= Double.parseDouble(numeroString);
        
        System.out.println(numeroDouble);
        
    }
    
}
