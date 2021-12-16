package PatronObserver.Observer2;

public class Ejemplo2
{
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver( (observable, usu )-> System.out.println("Enviando un email al usuario " + usu));

        repo.addObserver( (observable, usu )-> System.out.println("enviando email a los administradores "  + usu));

        repo.addObserver( (observable, usu )-> System.out.println("Guardando info del usuario " + usu +" en el logs "  ));


        repo.crearUsuario("florencia ");

    }
}
