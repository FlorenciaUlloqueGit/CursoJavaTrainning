public class EjemploMatricesMarco { // hace un marco con todos unos en los bordes de la matriz
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i== 0 || i == matriz.length-1) { // el cero indica la posición
                    matriz[i][j] = 1;
                }
                if(j == 0 || j == matriz[i].length -1){
                    matriz[i][j] = 1;
                }
                if( i == j){
                    matriz[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
