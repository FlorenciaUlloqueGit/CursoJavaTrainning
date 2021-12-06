package Tarea;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        Date dia =  new Date(12/12/2021);


        IProducto[] prod = new  Producto[4];
        prod[0] =  new TVLcd(50000, "Sony", 40);
        prod[1] = new Libro(500  , dia  , "juan lopez", "mil maneras de vivir", "saragoza" );
        prod[2] = new IPhone(80000, "apple", "rosa", "8 pro" );
        prod[3] = new Comics(500, dia, "Juan valdez", "marvel", "alfaguara" );


        for (IProducto p : prod){
            System.out.println("tipo: " + p.getClass().getCanonicalName());
            System.out.println("precio: " + p.getPrecio());
            System.out.println("Precio venta: " + p.getPrecioVenta());


            if(p instanceof iElectronico){
                System.out.println(((iElectronico) p).getFabricante());

            }
            if(p instanceof  ILibro){
                System.out.println(((ILibro) p).getFechaPublicacion());
                System.out.println(((ILibro) p).getAutor());
                System.out.println(((ILibro) p).getEditorial());
                System.out.println(((ILibro) p).getTitulo());
                System.out.println("===========================");
            }
            if(p instanceof IPhone){
                System.out.println(((IPhone) p).getColor());
                System.out.println(((IPhone) p).getModelo());
                System.out.println("===========================");
            }
            if(p instanceof TVLcd){
                System.out.println(((TVLcd) p).getPulgada());
                System.out.println("===========================");
            }
            if(p instanceof  Comics){
                System.out.println(((Comics) p).getPersonaje());
                System.out.println("===========================");
            }
        }



    }
}
