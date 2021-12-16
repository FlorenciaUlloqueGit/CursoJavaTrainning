package PatronSingleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia; // tenemos una sola instancia de esta clase y se guarda acá

    private ConexionBDSingleton(){ // el constructor debe ser privado
        System.out.println("conectandose con alguna base de datos");

    }

    public static ConexionBDSingleton getInstance(){
        if(instancia == null){ //se crea la primera vez porque es null
            instancia = new ConexionBDSingleton(); //no se ejecuta cuando ya no es null
        }
        return instancia; //se retorna la instancia creada anteriormente. Siempre se devuelve la misma
    }



}
