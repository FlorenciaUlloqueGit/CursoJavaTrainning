package PatronComposite;

public class ejemploBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("documentos");

        Directorio java= new Directorio("java");
        java.agregarComponentes(new Archivo("patron-composite.docx"));
        Directorio Stream = new Directorio("api Stream");
        Stream.agregarComponentes(new Archivo("stream-map.docx"));

        java.agregarComponentes(Stream);
        doc.agregarComponentes(java);
        doc.agregarComponentes(new Archivo("cv.docx"));
        doc.agregarComponentes(new Archivo("logo.jpg"));


        boolean encotrado = doc.buscar("patron-composite.docx");
        System.out.println(("encontrado \"patron-composite.docx\" :" + encotrado));

        encotrado = doc.buscar("Api Stream");
        System.out.println("Encotrado \"api Stream\" :" + encotrado);


        encotrado = doc.buscar("cv.docx");
        System.out.println("Encotrado \"cv.docx\" :" + encotrado);


        encotrado = doc.buscar("Api Stream");
        System.out.println("Encotrado \"api Stream\" :" + encotrado);



    }
}
