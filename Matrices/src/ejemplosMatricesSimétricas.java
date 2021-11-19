public class ejemplosMatricesSimétricas {
    public static void main(String[] args) {
        boolean esSimetrica = true;

        int[][] matriz ={
                {1,1,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}

        };

        int i, j;
        i= 0;
        while(i< matriz.length && esSimetrica == true){
           j=0;
           while(j<i && esSimetrica == true){
               if(matriz[i][j] != matriz[j][i]){
                   esSimetrica = false;
               }
               j++;
           }
           i++;
        }

        if(esSimetrica){
            System.out.println("La matriz es simétrica");
        }else{
            System.out.println("La matriz ya no es simétrica");
        }

    }
}
