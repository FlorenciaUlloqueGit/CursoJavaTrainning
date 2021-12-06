package Tarea;

import InterfacesRepositorio.Modelo.Cliente;

import java.util.List;

public class ejercicio {
    public static void main(String[] args) {
        BolsaSupermercado  <Fruta> bolsa  = new BolsaSupermercado(5);

        bolsa.addProductos(new Fruta("banana", 300, 100, "amarilla"));
        bolsa.addProductos(new Fruta("durazno", 450, 120, "durazno"));
        bolsa.addProductos(new Fruta("Cereza", 800, 30, "rojo"));
        bolsa.addProductos(new Fruta("kiwi", 600, 90, "verde"));
        bolsa.addProductos(new Fruta("sandía", 300, 1000, "rojo"));


        for (Fruta fruta: bolsa.getProductos()) {
            System.out.println( fruta.getNombre()+ " $ " + fruta.getPrecio() +" "+ fruta.getColor() + " " + fruta.getPeso() + "gr ");
        }
        System.out.println("==========================================");
        BolsaSupermercado  <Limpieza> bolsaLimp  = new BolsaSupermercado(4);

        bolsaLimp.addProductos(new Limpieza("lavandina", 250, "lavandina", 1));
        bolsaLimp.addProductos(new Limpieza("lavandina en gel", 300, "lavandina", 1));
        bolsaLimp.addProductos(new Limpieza("Perfumina", 200, "Perfume", 1));
        bolsaLimp.addProductos(new Limpieza("cloro", 450, "cloro", 1.5));

        for (Limpieza l : bolsaLimp.getProductos()){
            System.out.println(l.getNombre() +" $" +l.getPrecio()+ " " +l.getComponente()+ " "+l.getLitros()+"lts");
        }
        System.out.println("==========================================");
        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado(4);
        bolsaLacteo.addProductos(new Lacteo("leche ", 150, 2, 40));
        bolsaLacteo.addProductos(new Lacteo("queso ", 300, 1, 35));
        bolsaLacteo.addProductos(new  Lacteo("manteca", 200, 1, 40));

        for (Lacteo lac :bolsaLacteo.getProductos() ) {
            System.out.println(lac.getNombre() +" $"+lac.getPrecio()+ " cant:"+ lac.getCant()+" prote: "+ lac.getProteinas() );

        }

        System.out.println("==========================================");
        BolsaSupermercado<NoPerecible> bolsaPerecibles = new BolsaSupermercado(4);
        bolsaPerecibles.addProductos(new NoPerecible("fideos ", 150, 2, 40));
        bolsaPerecibles.addProductos(new NoPerecible("compota en lata ", 300, 1, 35));
        bolsaPerecibles.addProductos(new  NoPerecible("arvejas", 200, 1, 40));

        for (NoPerecible noPerecible  :bolsaPerecibles.getProductos() ) {
            System.out.println(noPerecible.getNombre() +" $"+noPerecible.getPrecio()+ " kal:"+ noPerecible.getCalorias()+"  "+ noPerecible.getContenido() );

        }

    }
}
