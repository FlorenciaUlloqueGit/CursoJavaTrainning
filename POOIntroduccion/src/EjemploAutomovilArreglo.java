import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {




        Persona conductorauto = new Persona("luci", "Martinez");
        Automovil auto = new Automovil("renault", "corsa", Color.ROJO);
        auto.setTipo(tipoAutomovil.HATCHBACK);
        tipoAutomovil tipoAuto0 = auto.getTipo();
        auto.setMotor( new Motor(2.0, tipoMotor.DIESEL));
        auto.setEstanque(new Estanque());
        auto.setDueño(conductorauto);
      //  auto.setRuedas(ruedasAuto);





        Automovil auto2 = new Automovil("renault", "corsa", Color.NARANJA, new Motor(3.0, tipoMotor.DIESEL));
        auto2.setEstanque(new Estanque(45));
        auto2.setTipo(tipoAutomovil.CONVERTIBLE);
        Persona conductorauto2 = new Persona("Pato", "gomez");
        auto2.setDueño(conductorauto2);
     //   auto2.setRuedas(ruedasAuto2);




        Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, tipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(tipoAutomovil.FURGON);
        Persona conductorNissan = new Persona("lucas", "pedraza");
        nissan.setDueño(conductorNissan);
    //    nissan.setRuedas(ruedasNissan);


        Automovil audi = new Automovil();
        audi.setModelo("a3");
        audi.setFabricante("Audi");
        audi.setDueño(new Persona("jano", "perez"));





        Automovil FiatSiena = new Automovil("fiat", "siena", Color.AZUL, new Motor(3.5, tipoMotor.NAFTA),new Estanque(55));
        FiatSiena.setTipo(tipoAutomovil.SEDAN);
        Persona conductorsiena = new Persona("" +
                "Rodolfo", "leguille");
      FiatSiena.setDueño(conductorsiena);
   //   FiatSiena.setRuedas(ruedasFiat);


        Automovil[] autos = new Automovil[6];

        autos[0] = auto;
        autos[1] = auto2;
        autos[3] = nissan;
        autos[4] = audi;
        autos[5] = FiatSiena;



        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);

        }

    }
}
