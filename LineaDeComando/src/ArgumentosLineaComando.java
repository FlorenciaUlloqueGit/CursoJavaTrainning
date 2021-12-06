public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Debe ingresar un argumento o parámetros!");
        System.exit(-1); // 0 es cuandoTodo sale bien y -1 es un error
        }
        for(int i = 0; i< args.length; i++){
            System.out.println("argumentos nro = " + i + ": " + args[i]);
        }
    }
}
