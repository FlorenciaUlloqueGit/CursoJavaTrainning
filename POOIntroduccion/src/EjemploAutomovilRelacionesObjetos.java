public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {




        Persona conductorauto = new Persona("luci", "Martinez");
        Automovil auto = new Automovil("renault", "corsa", Color.ROJO);
        auto.setTipo(tipoAutomovil.HATCHBACK);
        tipoAutomovil tipoAuto0 = auto.getTipo();
        auto.setMotor( new Motor(2.0, tipoMotor.DIESEL));
        auto.setEstanque(new Estanque());
        auto.setDueño(conductorauto);
      //  auto.setRuedas(ruedasAuto);

        Rueda [] ruedasAuto = new Rueda[5];
        for (int i = 0; i < ruedasAuto.length; i++) {
            auto.addRueda(new Rueda("michellin",16, 7.5));
        }




        Automovil auto2 = new Automovil("renault", "corsa", Color.NARANJA, new Motor(3.0, tipoMotor.DIESEL));
        auto2.setEstanque(new Estanque(45));
        auto2.setTipo(tipoAutomovil.CONVERTIBLE);
        Persona conductorauto2 = new Persona("Pato", "gomez");
        auto2.setDueño(conductorauto2);
     //   auto2.setRuedas(ruedasAuto2);
        Rueda [] ruedasAuto2 = new Rueda[4];
        for (int i = 0; i < ruedasAuto2.length; i++) {
          auto2.addRueda(new Rueda("michellino",15, 6.5));
        }




        Automovil nissan = new Automovil("nissan", "navara", Color.GRIS, new Motor(4.0, tipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(tipoAutomovil.FURGON);
        Persona conductorNissan = new Persona("lucas", "pedraza");
        nissan.setDueño(conductorNissan);
    //    nissan.setRuedas(ruedasNissan);
        Rueda [] ruedasNissan = new Rueda[5];
        for (int i = 0; i <ruedasNissan.length ; i++) {
            auto.addRueda(new Rueda("michellin",16, 7.5));
        }




        Rueda [] ruedasFiat = new Rueda[5];
        Automovil FiatSiena = new Automovil("fiat", "siena", Color.AZUL, new Motor(3.5, tipoMotor.NAFTA),new Estanque(55));
        FiatSiena.setTipo(tipoAutomovil.SEDAN);
        Persona conductorsiena = new Persona("" +
                "Rodolfo", "leguille");
      FiatSiena.setDueño(conductorsiena);
   //   FiatSiena.setRuedas(ruedasFiat);

        for (int i = 0; i <ruedasFiat.length ; i++) {
            FiatSiena.addRueda(new Rueda("yokohama",17, 7.5));
        }


        System.out.println(auto.detalle());
        System.out.println("conductor = " + conductorauto);
        System.out.println("ruedasAuto = " + ruedasAuto[0].toString());
        System.out.println(auto2.detalle());
        System.out.println("conductor = " + conductorauto2);
        System.out.println("ruedasAuto = " + ruedasAuto2[0].toString());
        System.out.println(nissan.detalle());
        System.out.println("conductor = " + conductorNissan);
        System.out.println("ruedasNissan = " + ruedasNissan[0].toString());
        System.out.println( FiatSiena.detalle());
        System.out.println("conductor = " + conductorsiena);
        System.out.println("ruedasFiat = " + ruedasFiat[0].toString());



    }
}
