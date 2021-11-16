public class sentenciaForeach {
    //recorre cada elemento de forma automática del arreglo o del objeto colección.
    public static void main(String[] args) {
        int []numeros = {1,3,5,7,9,11,13,14};
        for(int num:numeros){
            System.out.println("num = " + num);
        }


        String nombres[] = {"Andres", "Pepe", "María", "Paco", "Pepa"};
        for(String nom :nombres){
            System.out.println("nom = " + nom);
        }

        
        
    }

}
