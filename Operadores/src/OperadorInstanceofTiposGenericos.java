public class OperadorInstanceofTiposGenericos {
    public static void main(String[] args) {

       Object texto = "creando objeto de la clase String"; //es una isntancia de object pero tambien referencia un String (ambas true)


       Integer num = 7; //sale tachado porque se puede poner en la literal directamente y no hace falta hacer new.

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String= " + b1);


        b1 = texto instanceof Object; // es true porque String es un object
        System.out.println("texto es del tipo String= " + b1);

        b1 = num  instanceof  Integer; //false
        System.out.println("texto es del tipo integer=  " + b1);

       //   b1 = num instanceof  Short; //false
       // b1 = num instanceof  Long; //true

        b1 = num instanceof  Number; //true xq hereda Integer de Number
        System.out.println("num es del tipo number =  " + b1);


        b1 = num instanceof  Object; //true xq hereda de object
        System.out.println("num es del tipo number =  " + b1);

      //  b1 = num instanceof Double; //false
        //System.out.println("num es del tipo number =  " + b1);

    }


}
