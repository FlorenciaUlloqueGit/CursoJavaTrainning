

public class EjatricesBuscar {
    public static void main(String[] args) {



        int[][] matrizDeEnteros = {
                {35, 90 ,3, 1999},
                {40, 20, 10, 350 },
                {80 , 444 , 51, 2}
        };

        int elementoBuscar = 35000;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar :for (i = 0; i <matrizDeEnteros.length ; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if(matrizDeEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado == true){
            System.out.println("encontrado = " + elementoBuscar + " en las coordenadas " + i + "," + j);

        }else{
            System.out.println("No se encontró en la matriz");
        }
    }
}
