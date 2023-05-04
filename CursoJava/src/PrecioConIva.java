
import java.util.Scanner;

public class PrecioConIva {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el precio sin iva: ");

        double precioSinIva = leer.nextFloat();
        //IVA es 16%.
        double precioIVA = precioSinIva * 0.18;
        double precioConIva = precioSinIva + precioIVA;

        System.out.println("El precio sin iva: " + precioSinIva);
        System.out.println("El precio con iva es: " + precioConIva);

    }
}
