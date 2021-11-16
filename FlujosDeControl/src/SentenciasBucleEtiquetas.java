public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        //etiqueta para el for //itera por los dias de semana cada 8 hs
        for (int i = 0; i <= 7; i++) {

            for (int j = 0; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Día " + i + ", trabajando a las " + j + " hrs.");


            }
        }
        System.out.println("\n==========================================================");

        bucle1: //etiqueta para el for
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1; //se salta el 2
                }
                System.out.println("[i = " + i + ", j = " + j + "],");

            }

        }
        System.out.println("\n==============================================================");

        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println("\n==========================================================");
            for (int j = 0; j <5 ; j++) {
                if (i == 2) {
                    continue etiqueta; //se salta el 2
                }
                System.out.println("[i = " + i + ", j = " + j + "],");

            }

            }

        }
    }

