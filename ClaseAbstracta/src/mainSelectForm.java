import Validaciones.*;
import select.Opcion;

import java.util.Arrays;
import java.util.List;

public class mainSelectForm {
    public static void main(String[] args) {

        //no se puede crear una clase ElementosForm porque es abstracta pero si puedo
        //implementarla al vuelo:
     /*    ElementosForm el = new ElementosForm() { //se impleenta solo para oder usarlo. es un elemento anonimo. no es reutilizable
            @Override
            public String dibujarHtml() {
                return null;
            }
        };
        */

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador( new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador( new RequeridoValidador());
        email.addValidador(new EmailValidador());


        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador());
        edad.addValidador(new NumeroValidador());


        TextAreaFor experiencia = new TextAreaFor("exp", 5, 10 );

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNulo());

        Opcion java = new Opcion("1", "java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "pyton"))
       .addOpcion(new Opcion("3", "Jasavscript").setSelected())
        .addOpcion(new Opcion("4", "PHP"));

        ElementosForm saludar = new ElementosForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' valor= '" + valor + "'> ";
            }
        };

        saludar.setValor("hola que tal este campo esta deshabilitado");

        username.setValor("");
        password.setValor("a2r2");
        email.setValor("jonhgmail.com");
        edad.setValor("40");
        experiencia.setValor(" más de 10 años de experiencia");


   //    java.setSelected(true);

        List<ElementosForm> elementos = Arrays.asList(username, password, email
        , edad,experiencia, lenguaje, saludar); //es un array que se hace desde una lsita
       // elementos.add(username);
       // elementos.add(password);
        //elementos.add(email);
        //elementos.add(edad);
        //elementos.add(experiencia);
        //elementos.add(lenguaje);

      /*  for (ElementosForm e: elementos ) {

            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }

       */

        elementos.forEach(e -> { //es lo mismo que el foreach.
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e ->{
            if(!e.esValido()){
                   e.getErrores().forEach(System.out::println); //atajo de otro foreach

             // e.getErrores().forEach(err -> System.out.println(e.getNombre()+ " :" + err)); //asi sabemos que campo tiene el error
            }
        });



    }
}
