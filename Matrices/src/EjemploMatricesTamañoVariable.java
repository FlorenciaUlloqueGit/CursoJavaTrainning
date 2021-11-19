public class EjemploMatricesTamañoVariable {
    public static void main(String[] args) {
        int [][] mat = new int [3][];
//hacemos una matriz de cantidad de elementos variables ya que cada fila tiene != columnas
        mat[0]= new int [2];
        mat[1] = new int [3];
        mat[2] = new int[4];
        System.out.println("Matriz lenght: "+ mat.length);
        System.out.println("fila 0 length: " + mat[0].length);
        System.out.println("fila 1 lenght: " + mat[1].length);
        System.out.println("fila 2 lenght: " + mat[2].length);

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i*j;
            }
            
        }

        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
