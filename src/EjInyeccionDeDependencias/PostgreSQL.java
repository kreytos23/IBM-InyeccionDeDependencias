package EjInyeccionDeDependencias;

/**
 * Esta clase es una de las implementaciones de nuestra interfaz.
 * En este caso se indica que el metodo save(), utilizara EjInyeccionDeDependencias.PostgreSQL como DB
 */
public class PostgreSQL implements TypeService{

    @Override
    public void save(Data data) {
        System.out.println("guardando con postgreSQL....");
    }
}
