import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c2);

        Cancion c3 = new Cancion("Fleeting Dream", "PARIS THE PRince");
        Cancion c4 = new Cancion();
        System.out.println(c3 == c4);
        System.out.println(c3);

        Cancion c5 = new Cancion("Waka Waka", "Shakira");
        Cancion c6 = new Cancion();
        System.out.println(c5.equals(c6));
        System.out.println(c5);

        Pelicula p1 = new Pelicula("Godzilla", 1954);
        Pelicula p2 = new Pelicula("Godzilla", 1954);
        
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Cancion c7 = new Cancion("Ma Chérie", "Malice Mizer");
        Cancion c8 = c7;
        System.out.println((c7 == c8));
        c8.setTitutlo("Chamber Of Reflection");
        System.out.println(c7);

        Pelicula p3 = null;
        System.out.println(p3);


    }

}
