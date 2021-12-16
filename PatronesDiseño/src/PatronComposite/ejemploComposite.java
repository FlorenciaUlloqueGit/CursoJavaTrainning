package PatronComposite;

import com.sun.source.tree.UsesTree;

public class ejemploComposite {
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

        System.out.println(doc.mostrar(0));
    }
}
