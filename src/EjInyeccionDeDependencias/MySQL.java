package EjInyeccionDeDependencias;

/**
 * Esta clase es una de las implementaciones de nuestra interfaz.
 * En este caso se indica que el metodo save(), utilizara EjInyeccionDeDependencias.MySQL como DB
 */
public class MySQL implements TypeService {

    @Override
    public void save(Data data) {
        System.out.println("guardando en EjInyeccionDeDependencias.MySQL.....");
    }
}
