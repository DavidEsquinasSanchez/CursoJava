
package test;

import encapsulamiento.*;

public class TestPersona {
    public static void main(String[] args){
          Persona persona1= new Persona("Alex",25,false);
          
          System.out.println("Nombre: "+persona1.getNombre());
          System.out.println("Edad:"+persona1.getEdad());
          persona1.setNombre("Carlos");
          persona1.setEdad(10);
          System.out.println("Nombre: "+persona1.getNombre());
          System.out.println("Edad: "+persona1.getEdad());
          
          System.out.println(persona1);
          
          String estado=persona1.toString();
          System.out.println("Estado:"+estado);
    }
}
