public class Motor {
    private double cilindrada;
    private tipoMotor tipo;

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public tipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(tipoMotor tipo) {
        this.tipo = tipo;
    }

    public Motor(double cilindrada, tipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }
    public Motor() {

    }
}
