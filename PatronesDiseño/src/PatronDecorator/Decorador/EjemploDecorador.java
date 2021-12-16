package PatronDecorator.Decorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Florencia");

        MayusculaDecorador mayus = new MayusculaDecorador(texto);
      //  ReversaDecorador reversa = new ReversaDecorador(mayus);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(mayus);
        System.out.println(subrayar.darFormato());


        ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayar);
        System.out.println(reemplazar.darFormato());
    }


}
