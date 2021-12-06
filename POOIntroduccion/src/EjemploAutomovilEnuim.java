public class EjemploAutomovilEnuim {
    public static void main(String[] args) {


        Motor motorAuto0 = new Motor(2.0, tipoMotor.DIESEL);
        Automovil auto = new Automovil("renault", "corsa", Color.ROJO);
        auto.setTipo(tipoAutomovil.HATCHBACK);
        auto.setMotor(motorAuto0);
        auto.setEstanque(new Estanque());
        auto.setRuedas(new Rueda[5]);

     //   Automovil.velocidad_max_carretera =133; no se puede modificar, solo se puede leer

        Automovil auto2 = new Automovil("renault", "corsa", Color.NARANJA, new Motor(3.0, tipoMotor.DIESEL));
        auto2.setEstanque(new Estanque(45));
        auto2.setTipo(tipoAutomovil.CONVERTIBLE);

        Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, tipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(tipoAutomovil.FURGON);

       Automovil.setColorPatente(Color.GRIS);


        Automovil FiatSiena = new Automovil("fiat", "siena", Color.AZUL, new Motor(3.5, tipoMotor.NAFTA),new Estanque(55));
        FiatSiena.setTipo(tipoAutomovil.SEDAN);
;
        tipoAutomovil tipo = FiatSiena.getTipo();
        System.out.println("tipo auto = "+ tipo.getNombre());
        System.out.println("tipo auto = "+ tipo.getDescripcion());

        switch (tipo){
            case CONVERTIBLE:
                System.out.println("El auto es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("es un auto pequeño de dlos puertas y deportivo");
                break;
            case FURGON:
                System.out.println("Es un auto utilitario de transporte y de empresas");
                break;
            case HATCHBACK:
                System.out.println("auto mediano com´pacto y deportuvo");
                break;
            case PICKUP:
                System.out.println("es un auto doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("auto mediano");
                break;
            case STATION_WAGON:
                System.out.println("es un auto más grande con maleta grande");
                break;
        }

        tipoAutomovil[ ] tipos = tipoAutomovil.values();

        for (tipoAutomovil ta: tipos) {
            System.out.println("ta.name = " + ta.name()
                    + " " +ta.getNombre() + " " +ta.getDescripcion()
            + " " + ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
