public enum tipoAutomovil {
    SEDAN ("Sedan", "Auto normal", 5),
    PICKUP ("Pickup", "camioneta", 4),
    COUPE ("Coupe", "auto pequeño",2 ),
    CONVERTIBLE ("Convertible", "Auto deportivo", 2 ),
    FURGON ("furgon", "Auto utilitario", 5),
    HATCHBACK ("Hatchback", "Auto compacto", 4),
    STATION_WAGON("Station-wagon", "Auto grande", 5);


    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    tipoAutomovil(String nombre,  String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
