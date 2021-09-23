package EjInyeccionDeDependencias;

/**
 * ****Ejemplo de inyeccion de dependencias e inversion de dependencias****
 *
 * Aqui se manda a llamar la clase que utilizará la interfas, la cual tiene distintas
 * implementaciones y se podra usar la que se necesite por medio del contructor de la clase
 */
public class Demo {
    public static void main(String[] args) {
        //Se manda a llamar la clase que usa la interfase, se manda como parametro
        //una intancia del tipo de implementacion que se desea usar en el contructor de la clase
        // en este caso una implementacion de EjInyeccionDeDependencias.MySQL
        ProductService productServiceMySQL = new ProductService(new MySQL());
        productServiceMySQL.persistenceData(new Data());


        //Aqui se manda a llamar la clase pero ahora con la implementacion de EjInyeccionDeDependencias.PostgreSQL
        ProductService productServicePostgreSQL = new ProductService(new PostgreSQL());
        productServicePostgreSQL.persistenceData(new Data());
    }
}
