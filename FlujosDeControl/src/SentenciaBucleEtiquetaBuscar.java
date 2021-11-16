public class SentenciaBucleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase =  " trigo tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int max = frase.length() - maxPalabra;

        int cant = 0;
        buscar:
        for (int i = 0; i <= max;) {//busca el caracter t
            int k = i;
            for (int j = 0; j <maxPalabra ; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cant++;
            i = i + maxPalabra;
            System.out.println("Encontrada = " + cant + " veces la palabra " + palabra);

        }


    }
}
