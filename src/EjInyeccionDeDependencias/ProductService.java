package EjInyeccionDeDependencias;

/**
 * En esta clase se usa la interfaz, aqui es donde se hara la inyeccion de dependencias
 * por medio del contructor
 */
public class ProductService {

    //Se declara una variable del tipo de la interfase a usar
    private TypeService typeService;

    //Se inicializa la interfas por medio del constructor
    public ProductService(TypeService typeService) {
        this.typeService = typeService;
    }

    //Se hace uso de la variable de la interfas
    public void persistenceData(Data data){
        Data processedData = appLogic(data);
        typeService.save(processedData);
    }

    public Data appLogic(Data data){
        return data;
    }

}
