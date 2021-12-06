import java.util.Date;
public class EjemploAutomovil {
    public static void main(String[] args) {


        Motor motorAuto0 = new Motor(2.0, tipoMotor.DIESEL);
        Automovil auto = new Automovil("renault", "corsa", Color.ROJO);

        auto.setMotor(motorAuto0);
        auto.setEstanque(new Estanque());
        auto.setRuedas(new Rueda[5]);

        Automovil auto2 = new Automovil("renault", "corsa", Color.NARANJA, new Motor(3.0, tipoMotor.DIESEL));
      //  auto2.setEstanque(new Estanque(45));

        Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, tipoMotor.DIESEL), new Estanque(50));
        System.out.println("son iguales? " + (auto== auto2)); //los objetos son unicos aunque sean iguales
        System.out.println("son iguales? " + (auto.equals(auto2) )); //falso pero con el override que se hizo es verdadero
     //   System.out.println(auto3.equals(auto2));

        System.out.println("auto = " + auto.toString());

        System.out.println(auto.detalle());
        System.out.println();

        Automovil FiatSiena = new Automovil("fiat", "siena", Color.AZUL, new Motor(3.5, tipoMotor.NAFTA),new Estanque(55));

        System.out.println( FiatSiena.detalle());
        //System.out.println(FiatSiena.acelerar(3000));
        //System.out.println( FiatSiena.frenar());
        System.out.println(FiatSiena.acelerarYFrenar(3000));

        System.out.println("km por litro " + FiatSiena.calcularConsumo(300, 0.75f));
        System.out.println("km por litro " + FiatSiena.calcularConsumo(300, 2));

    }
}
