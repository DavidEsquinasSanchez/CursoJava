
package peliculas.ui;

import peliculas.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    
    public static void interfazUsuario(){
        ICatalogo peliculas= new ImplementacionCatalogoPeliculas();
        Pelicula pelicula;
        
        Cerrar:
        while(true){
            
            String opcion= JOptionPane.showInputDialog(
                    null,
                    "1 - Insertar Pelicula\n"+
                    "2 - Listar Peliculas\n"+
                    "3 - Buscar Pelicula\n"+
                    "4 - Salir",
                    "Ingrese Opcion",
                    3);
            
            switch (opcion){
                case "1":
                    String nombrePelicula= JOptionPane.showInputDialog(
                    
                    null,
                    "Ingrese el nombre de la pelicula",
                    "Entrada Nombre Pelicula",
                    3
                    );
                    pelicula= new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                case "2":
                    peliculas.listarPelicula();
                    break;
                case "3":
                    
                    nombrePelicula= JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la pelicula",
                            "Buscar Pelicula",
                            3
                    
                    );
                    
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case "4":
                    break Cerrar;
                default:
                    JOptionPane.showMessageDialog(
                            null, 
                            "Opcion Incorrecta\n"+
                            "Vuelve a introducir una \n"+
                            "opcion correcta\n"+
                            "Las opciones son de 1 a 4",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                            );
      
                    
            }
        }
    }
}
