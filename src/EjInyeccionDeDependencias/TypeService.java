package EjInyeccionDeDependencias;

/**
 * Se crea una interfaz, que sera el contrato que tendra la clase
 * Esto sirve para que la clase que la mande a instanciar solo necesite
 * saber la interfaz, mas no las implementaciones
 */
public interface TypeService {
     void save(Data data);
}
