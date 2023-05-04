/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nigro
 */
public class ClassString {
    public static void main(String[] args){
        
        String nombre="Oregon";
        
        System.out.println("La primera letra es "+nombre.charAt(1));
        
        System.out.println("El texto tiene un tamaño de "+nombre.length());
        
        for (int i=0;i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
            
        }
        
        System.out.println(nombre.substring(0, 3));
        
        System.out.println(nombre.toLowerCase());
        
        System.out.println(nombre.toUpperCase());
        
        
        nombre= "O r e g o n";
        
        System.out.println(nombre.replace(" ","-"));
        
        System.out.println(nombre.replace("O", "u"));
        
        
        System.out.println(nombre.replace(" ", ""));
        
        System.out.println("Hola".equals("hola"));
        
        
        StringBuilder nuevo = new StringBuilder();
        
        System.out.println(nuevo);
        
        nuevo.append("Hola");
        
        System.out.println(nuevo);
        
        nuevo.append(" mundo.");
        
        System.out.println(nuevo.toString());
        
    }
}
