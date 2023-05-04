
package test;

import Herencia.*;
import java.util.Date;



public class TestHerencia {
    public static void main(String[] args){
     
        Empleado empleado1 =new Empleado(3000,"Alex");
        System.out.println(empleado1);
        
        Empleado empleado2 =new Empleado(4000,"Alberto");
        System.out.println(empleado2);
        
        Empleado empleado3 =new Empleado(2000,"Ana");
        System.out.println(empleado3);
        
        
        var fecha = new Date();
        
        Clientes cliente1 = new Clientes(fecha, true, "Alex Roel",25, 'M', "calle falsa");
        
        System.out.println(cliente1);
        
        determinarTipo(empleado1);
        determinarTipo(cliente1);
        determinarTipo("casa");
        
        
        //Conversion de objetos
        //Downcasting
        Persona persona11 =new Empleado(300,"Luis");
        
        Empleado empleado11 = (Empleado) persona11;
        
        //Conversion de objetos
        //Upcasting
        
        Persona persona22= empleado11;
        
        
        System.out.println(persona22.equals(persona11));
        
        
        System.out.println(persona22.hashCode());
        System.out.println(persona11.hashCode());
        
        if(persona22.hashCode()==persona11.hashCode()){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        
    }
    
    public static void determinarTipo(Object objeto){
        if(objeto instanceof Empleado){
            System.out.println("El tipo es Empleado");
        }
        else if(objeto instanceof Clientes){
            System.out.println("Es de tipo Clientes");
        }
        else if(objeto instanceof Persona){
            System.out.println("Es de tipo Persona");
        }
        else{
            System.out.println("Es de tipo Object");
        }
    }
}
