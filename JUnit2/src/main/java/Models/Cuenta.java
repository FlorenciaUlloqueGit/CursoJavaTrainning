package Models;
import Exceptions.DineroInsuficienteException;

import java.math.BigDecimal;

public class Cuenta {
    private String persona;
    private BigDecimal saldo; //es como los numeros nuestros, no pasan a binario y es mas preciso, ideal para contar plata
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }
    //agregamos el metodo equals para que compare por valor y no por instancia (hay que modificarlo sino compara por instancia)

    @Override
    public boolean equals(Object obj) {
        Cuenta c = (Cuenta) obj;
        if (!(obj instanceof Cuenta)){
            return false;
        }
        if(this.persona == null && this.saldo == null){

            return false;
        }

        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());

    }

    public void debito(BigDecimal monto){

       BigDecimal nuevoSaldo  = this.saldo.subtract(monto);
       if(nuevoSaldo.compareTo(BigDecimal.ZERO) < 0){
           throw  new DineroInsuficienteException("Dinero Insuficiente");
       }
       this.saldo = nuevoSaldo;
       // this.saldo.subtract(monto); //no se peude porque es inmutable el BigDecimal.
    }
    public void credito(BigDecimal monto){

        saldo = this.saldo.add(monto);
     //   this.saldo.add(monto);
    }


}
