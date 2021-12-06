import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {


        Automovil auto = new Automovil("renault", "corsa", Color.ROJO);
        auto.setTipo(tipoAutomovil.HATCHBACK);
        tipoAutomovil tipoAuto0 = auto.getTipo();
        Motor motorAuto0 = new Motor(2.0, tipoMotor.DIESEL);;
        auto.setMotor(motorAuto0);
        auto.setEstanque(new Estanque());
        auto.setRuedas(new Rueda[5]);
        System.out.println("tipo auto = "+ tipoAuto0.getNombre());
        System.out.println("tipo auto = "+ tipoAuto0.getDescripcion());


        System.out.println("velocidad max carrretera " + Automovil.velocidad_max_carretera);
        System.out.println("velocidad max ciudad " + Automovil.Velocidad_max_ciudad);
        Automovil auto2 = new Automovil("renault", "corsa", Color.NARANJA, new Motor(3.0, tipoMotor.DIESEL));
        auto2.setEstanque(new Estanque(45));
        auto2.setTipo(tipoAutomovil.CONVERTIBLE);

        Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, tipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(tipoAutomovil.FURGON);



       Automovil.setColorPatente(Color.GRIS); //ahorta todos son verdes



        Automovil FiatSiena = new Automovil("fiat", "siena", Color.AZUL, new Motor(3.5, tipoMotor.NAFTA),new Estanque(55));
        FiatSiena.setTipo(tipoAutomovil.SEDAN);
        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(nissan.detalle());
        System.out.println( FiatSiena.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

    }
}
