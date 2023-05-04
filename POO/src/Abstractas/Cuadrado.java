/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstractas;

/**
 *
 * @author nigro
 */
public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(String tipo) {
        super(tipo);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un "+this.getClass().getSimpleName());
    }
    
}
