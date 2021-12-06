public class Calculadora {
    public double dividir(int dividendo , int divisor) throws DivisionPorCeroException {
        if(divisor == 0){
            throw new DivisionPorCeroException("No se puede dividir por cero ");
        }
        return dividendo/(double)divisor;

    }

    public double dividir(String dividendo, String divisor) throws DivisionPorCeroException,
            FormatoNumeroExcepcion{
       try{
           int num = Integer.parseInt(dividendo);
           int num2 = Integer.parseInt(divisor);
           return  this.dividir(num, num2);
       }catch(NumberFormatException nfe ){
           throw new FormatoNumeroExcepcion("Debe ingresar un numero en el numerador y el divisor");

       }

    }
}
