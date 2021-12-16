package Models;

import Exceptions.DineroInsuficienteException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
// @TestInstance( TestInstance.Lifecycle.PER_CLASS) //ciclo de vida por clase y no por método  y asi se crea una sola referencia

class CuentaTest { //metodo default o privado de package.
    Cuenta cuenta;
    private TestInfo testInfo;
    private TestReporter testReporter;

    @BeforeEach //antes de cada metodo
    void initMetodoTest(TestInfo testInfo, TestReporter testReporter){
       this.cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
       this.testInfo =testInfo;
       this.testReporter = testReporter;

        System.out.println("inicializando el test");
        testReporter.publishEntry("ejecutando: " + testInfo.getDisplayName() + " " + testInfo.getTestMethod().orElse(null).getName() +
                " con las etiquetas " + testInfo.getTags());
    }

    @AfterEach //al final de cada método
    void tearDown() {
        System.out.println("Finalizando el método");
    }

    @BeforeAll //siempore es estatico porque se llama sin tener la isntancia lista
    static void beforeAll() { //antes de todos los métodos de prueba


    }

    @AfterAll
    static void afterAll() { //despues de todos los metodos de prueba
        System.out.println("finalizando el test");
    }


    @Tag("cuenta")
    @Nested
    class cuentaTest{
        @Test
        @DisplayName("probando nombre de la cuenta corriente!")
        void TestNombreCuenta() {


            testReporter.publishEntry(testInfo.getTags().toString());
            if(testInfo.getTags().contains("cuenta")){
                System.out.println("hacer algo con la etiqueta cuenta");
            }
            //    cuenta.setPersona("Andres");
            String esperado = "Andres";
            String real = cuenta.getPersona();
            assertNotNull(real, () -> "La cuenta no puede ser nula");
            Assertions.assertEquals(esperado, real, () ->  "El nombre de la cuenta no es el que se esperaba: se esperaba " + esperado +
                    " sin embargo fue " + real); // compara que sean iguales
            Assertions.assertTrue(real.equals("Andres"), () -> "El nombre de cuenta esperada debe ser igual a la real"); //forma de prueba con expresión booleana

        }

        @Test
        @DisplayName("Verificando que el saldo de la cuenta sera mayor a 0! y no nulo")
        void testSaldoCuenta() {

            assertNotNull(cuenta.getSaldo());
            Assertions.assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0); // falso si el saldo es menor que 0
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0); // true si el saldo es > que 0. es lo mismo que el false pero invertido
        }

        @Test
        @DisplayName("Verificando que la cuenta ingresada exista")
        void testReferenciaCuenta() {
            Cuenta cuentaReal = new Cuenta("john Doe", new BigDecimal(8900.997));
            Cuenta cuentaValorEsperado = new Cuenta("john Doe", new BigDecimal(8900.997)); //replico con control+D

            //    assertNotEquals(cuentaReal, cuentaValorEsperado); //No son iguales porque son dos instancias diferentes (está comparando por referencia, es decir por instancia y  no por valor)
            assertEquals(cuentaReal, cuentaValorEsperado); //al cambiar el equals pasa la prueba

        }

    }
    @Nested
    @DisplayName("probando transacciones en la cuenta corriente")
    class cuentaOperacionesTest{
        @Tag("cuenta")
        @Test
        @DisplayName("probando debitar un importe de una cuenta")
        void testDebitoCuenta() {

            cuenta.debito(new BigDecimal(100));
            assertNotNull(cuenta.getSaldo());
            assertEquals(900, cuenta.getSaldo().intValue());
            assertEquals("900.12345", cuenta.getSaldo().toPlainString());
        }


        @Test
        @DisplayName("probando acreditar un importe")
        void testCreditoCuenta() {

            cuenta.credito(new BigDecimal(100));
            assertNotNull(cuenta.getSaldo());
            assertEquals(1100, cuenta.getSaldo().intValue());
            assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
        }

        @Test
        @DisplayName("probando transferencia")
        @Tag("cuenta")
        @Tag("banco")
        void testTransferirDineroCuentas() {
            Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
            Cuenta cuenta2 = new Cuenta("Florencia", new BigDecimal("1500.8989"));

            Banco banco = new Banco();
            banco.setNombre("Banco del estado");
            banco.transferir(cuenta2, cuenta1, new BigDecimal("500"));
            assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
            assertEquals("3000", cuenta1.getSaldo().toPlainString());


        }


    }


    @Test
    @DisplayName("probando error de falta de dinero")
    @Tag("cuenta")
    @Tag("Manejo de errores")
    void testDineroInsuficienteException() {

        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));// restando este monto quedaria un saldo negativo de 500
        }); //para manejar excepciones
        String real = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, real);
    }



    @Test // si no lo ponemos no se ejecuta como test pero no aparece en el reporte como el disabled
   // @Disabled // para deshabilitar el test
    @Tag("cuenta")
    @Tag("banco")
    void testRelacionBancoCuentas() {


      //  fail(); //para hacerlo fallar
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Florencia", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);


        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal("500"));

        //assertAll busca todos los errores del test ya que lo recorre entero y no frena cuando encuentra un error.
        assertAll(() -> assertEquals("1000.8989", cuenta2.getSaldo().toPlainString(), ()-> "El valor del saldo de la cuenta 2 no es el esperado"),
                () -> assertEquals("3000", cuenta1.getSaldo().toPlainString(), ()-> "El valor del saldo de la cuenta 2 no es el esperado"),
                () -> assertEquals(2, banco.getCuentas().size(), ()-> "El banco no tiene las cuentas esperadas"),
                () -> {
                    assertEquals("Florencia", banco.getCuentas().stream()
                            .filter(c -> c.getPersona().equals("Florencia"))
                            .findFirst().get().getPersona());
                },
                //otra forma de saber si la persona Florencia  tiene una cuenta
                () -> {
                    assertTrue(banco.getCuentas().stream()
                            .filter(c -> c.getPersona().equals("Florencia"))
                            .findFirst().isPresent());
                },

                //otra forma de saber si la persona Florencia  tiene una cuenta
                () -> {
                    assertTrue(banco.getCuentas().stream()
                            .anyMatch(c -> c.getPersona().equals("John Doe")));
                });

    }


    class sistemaOperativoTest{
        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testSoloWindows(){

        }
        @Test //aparece deshabilitado porque solo estamos  en windows 10
        @EnabledOnOs({OS.LINUX, OS.MAC})
        void testSoloMacyLinux(){
        }

        @Test //para cualquiera menos para windows. al ejecutar aparece deshabilitado
        @DisabledOnOs(OS.WINDOWS)
        void testNoWindows(){
        }
    }

    class JavaVersionTest{
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void soloJdk8(){
        }

        @Test
        @EnabledOnJre(JRE.JAVA_17)
        void soloJDK17(){

        }
        @Test
        @DisabledOnJre(JRE.JAVA_17)
        void soloNoJDK17(){

        }
    }

    @Nested //para indicar que la clase es solo para organizar los test.
    class PropiedadesDelSistemaTest{

        @Test
        void imprimirSystemProperties(){
            Properties properties = System.getProperties();
            properties.forEach((k, v) -> System.out.println( k + " : " + v)); //de aca podemos sacar los datos para establecer una condicion y que si se cumple se ejecute la prueba

        }

        @Test
        @EnabledIfSystemProperty(named = "java.version", matches = "17.0.1")
        void testJavaVersion(){
// no se ´porque no funciona
        }

        @Test //deshabilittado para 32
        @DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testSolo64() {
        }
        @Test //habilitado para 32
        @EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testNo64() {
        }
        @Test
        @EnabledIfSystemProperty(named = "user.name", matches = "fulloque")
        void testUsername(){

        }

        @Test
        @EnabledIfSystemProperty(named = "ENV", matches = "dev")
        void TestDev() {
        }

    }

    @Nested
    class VariablesAmbienteTest{

        @Test
        void  imprimirVariablesAmbiente(){
            Map<String, String> getEnv = System.getenv();
            getEnv.forEach((k, v) -> System.out.println(k + " : " + v));
        }
        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*openjdk-17.0.*")
        void javaHome(){

        }
        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "16")
        void testProcesadores(){

        }
    }

    @Nested
    class ejemploAssumptionTest {
        @Test
        void testSaldoCuentaConAssumption() {

            boolean esDev = "dev".equals(System.getProperty("ENV"));
            Assumptions.assumeTrue(esDev); //si es true se ejecuta el resto del código
            assertNotNull(cuenta.getSaldo());
            Assertions.assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0); // falso si el saldo es menor que 0
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0); // true si el saldo es > que 0. es lo mismo que el false pero invertido
        }

        @Test
        void testSaldoCuentaConAssumption2() {

            boolean esDev = "dev".equals(System.getProperty("ENV"));
            assumingThat(esDev, () -> { //primero el booleano y despues lamda. si la conmdicion se cumple (true) se ejecuta la condicion de lambda y sino no, pero lee el codigo fuera de lambda
                assertNotNull(cuenta.getSaldo());
                Assertions.assertEquals(1000.12345, cuenta.getSaldo().doubleValue());

            }); //si es true se ejecuta el resto del código. Lo que esta fuera del assuming that se ejecuta
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0); // falso si el saldo es menor que 0
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0); // true si el saldo es > que 0. es lo mismo que el false pero invertido

        }
    }

        @Tag("param")
        @ParameterizedTest(name = "numero de la repetición {index} ejecutando con valor {argumentsWithNames} ")
        @CsvFileSource(resources = "/data2.csv")
            //desde un archivo externo ue esta en java en la carpeta main en resources

        void testDebitoCuentaCsvFileSource2(String saldo, String monto, String esperado, String actual) {

            cuenta.setSaldo(new BigDecimal(saldo));
            cuenta.debito(new BigDecimal(monto));
            cuenta.setPersona(actual);

            assertNotNull(cuenta.getSaldo());
            assertNotNull(cuenta.getPersona());
            assertEquals(actual, esperado);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

        }


        @RepeatedTest(value = 5, name = "{displayName} - Repeticion numero {currentRepetition} de {totalRepetitions}")
        // cantidad de veces que se repite el metodo
        @DisplayName("probando debitar un importe de una cuenta")
        void testDebitoCuentaRepetir(RepetitionInfo info) {

            if (info.getCurrentRepetition() == 3) { //si es la repe 3
                System.out.println("estamos en la repeticion " + info.getCurrentRepetition());
            }
            cuenta.debito(new BigDecimal(100));
            assertNotNull(cuenta.getSaldo());
            assertEquals(900, cuenta.getSaldo().intValue());
            assertEquals("900.12345", cuenta.getSaldo().toPlainString());
        }


        @Tag("param") //este tag se aplica a todos los metodos porque estan dentro de una clase y estoy etiquertando fuera de la clase
        @Nested
        class pruebasParametrizadasTest {
            @ParameterizedTest(name = "numero de la repetición {index} ejecutando con valor {argumentsWithNames} ")
            @ValueSource(strings = {"100", "200", "300", "500", "700", "1000"})
                //cuando sea 0 el saldo lanza la excepción.
//tambien podrian ser ints porque lo aceptar el BigDecimal pero es mejor con strings porque es mas preciso cuando se trabaja con decimales

            void testDebitoCuenta(String monto) {

                cuenta.debito(new BigDecimal(monto));
                assertNotNull(cuenta.getSaldo());
                assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

            }

            @ParameterizedTest(name = "numero de la repetición {index} ejecutando con valor {argumentsWithNames} ")
            @CsvSource({"1,100", "2,200", "3,300", "4,500", "5,700", "6,1000.12345"})
            void testDebitoCuentaCsvSource(String index, String monto) { //creamos indice por parametro y mandamos tambuien los numeros

                System.out.println(index + "-> " + monto);
                cuenta.debito(new BigDecimal(monto));
                assertNotNull(cuenta.getSaldo());
                assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

            }

            @ParameterizedTest(name = "numero de la repetición {index} ejecutando con valor {argumentsWithNames} ")
            @CsvFileSource(resources = "/data.csv")
                //desde un archivo externo ue esta en java en la carpeta main en resources

            void testDebitoCuentaCsvFileSource(String monto) {


                cuenta.debito(new BigDecimal(monto));
                assertNotNull(cuenta.getSaldo());
                assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

            }


            static private List<String> montoList() {
                return Arrays.asList("100", "200", "300", "500", "700", "1000");
            }


            @ParameterizedTest(name = "numero de la repetición {index} ejecutando con valor {argumentsWithNames} ")
            @CsvSource({"200,100, John, Andres", "250,200, Pepe, Pepe", "310,300, Lucio,  Lucio", "510,500, Giuliana, Francisco", "750,700, Lucas, Lucas", "1000.12346,1000.12345, Silvina,Silvina"})
            void testDebitoCuentaCsvSource2(String saldo, String monto, String esperado, String actual) { //creamos indice por parametro y mandamos tambuien los numeros

                System.out.println(saldo + "-> " + monto);
                cuenta.setSaldo(new BigDecimal(saldo));
                cuenta.debito(new BigDecimal(monto));
                cuenta.setPersona(actual);
                assertNotNull(cuenta.getPersona());
                assertEquals(actual, esperado);
                assertNotNull(cuenta.getSaldo());
                assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

            }

    }


    @Nested
    @Tag("Timeout")
    class EjemploTimeOutTest{

        @Test
        @Timeout(1) //cantidad de segundos para producir la falla
        void pruebaTimeOut() throws InterruptedException {
            TimeUnit.SECONDS.sleep(1); //la tarea se demora 6 y el timeOut es 5 por lo que va a lanzar una excepció

        }

        @Test
        @Timeout(value = 1000,unit = TimeUnit.MILLISECONDS) //cantidad de segundos para producir la falla
        void pruebaTimeOut2() throws InterruptedException {
            TimeUnit.MILLISECONDS.sleep(1); //la tarea se demora 6 y el timeOut es 5 por lo que va a lanzar una excepció

        }

        @Test
        void testTimeOutAssertions() {
            assertTimeout(Duration.ofSeconds(5), ()-> {
                TimeUnit.MILLISECONDS.sleep(4000);
            });
        }
    }

}