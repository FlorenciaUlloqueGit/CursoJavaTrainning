public class Automovil implements Comparable <Automovil>{
    private  String fabricante ; // si el atributo es estatico y se modifica, todas las clases que lo tengan van a verse modificadas.
    private String modelo;
    private Color color  = Color.GRIS; //estan en public, por eso no hace falta hacerle get y set y puedo acceder a ellos
    private Estanque estanque;
    private Motor motor;
    private tipoAutomovil tipo;
    private Persona dueño;
    private Rueda ruedas[];
    private int indiceRuedas;


   private static Color colorPatente= Color.NARANJA; //todos los autos van a tener un color naranja en la patente

    public  static final Integer velocidad_max_carretera = 120; //es una constate y su valor no varia
    public static final int Velocidad_max_ciudad = 60;



    public Automovil() {
 this.ruedas = new Rueda[5];

    }



// si se omite el modificador del atributo queda por default public.
    public  String detalle (){
        //StringBuilder sb = new StringBuilder();
      //  String modelo = "otro";// crea una variable en el metodo pero no se la toma como el modelo por el this, que hace referencia a la clase instanciada

      String detalle = "auto.modelo = " + this.modelo +
            "\nauto.color = " + this.color.getColor() +
        "\nauto.fabricante = " + this.fabricante ;
if (this.getTipo() != null ){
    detalle += "\nauto.colorPatente = " + this.getTipo().getDescripcion();
}
        detalle+=   "\nauto.tipo = " + colorPatente +

       "\nauto.cilindrada = " + motor.getCilindrada() ;
        return detalle;

    }

    public tipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(tipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda(Rueda rueda){
        this.ruedas[indiceRuedas++] = rueda;
    }

    public String acelerar(int rpm){
        return "el auto " + this.modelo + " acelerando a " + rpm + " rpm";    }

    public String frenar(){
        return modelo + " " + fabricante  + " frenando!";
    }
    public String acelerarYFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + " " + frenar;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque ) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;





    }

    public Automovil(String fabricante, String modelo, Color color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;



    }
    public Automovil(String fabricante, String modelo,Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;

    }

    public Automovil(String fabricante, String modelo, Color color, Estanque estanque, Motor motor, Persona dueño, Rueda[] ruedas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.estanque = estanque;
        this.motor = motor;
        this.dueño = dueño;

    }



    public float calcularConsumo(int km, float porcentajeNaftaGastada){
        return km /(estanque.getCapacidad() * porcentajeNaftaGastada);
    }
   /* public static float calcularConsumoEstatico(int km, float porcentajeNaftaGastada){
        return km /(capacidadEstanque * porcentajeNaftaGastada);
    }
    NO se puede porque no es estática la capacidad del estanque.
    */

    //sobrecarga de metodo: mismo nobmre del metodo pero diferente tipo o cantidad de parámetros, aca es in y en el otr es float.
    public float calcularConsumo(int km, int porcentajeNaftaGastada){
        return km /(estanque.getCapacidad() * porcentajeNaftaGastada);
    }
    //sobreescritura de metodos

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + this.motor.getCilindrada() +
                ", capacidadEstanque=" + this.estanque.getCapacidad()+
                '}';
    }

    @Override
    public int compareTo(Automovil a) {

        return this.modelo.compareTo(a.modelo);
    }
}
