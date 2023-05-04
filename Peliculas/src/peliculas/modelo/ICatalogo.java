
package peliculas.modelo;


public interface ICatalogo {
    
    void insertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
    
}
