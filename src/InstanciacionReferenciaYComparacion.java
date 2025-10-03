import utilidades.Cancion;

public class InstanciacionReferenciaYComparacion {

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c2);

        Cancion c3 = new Cancion("Fleeting Dream", "PARIS THE PRince");
        Cancion c4 = new Cancion();
        System.out.println(c3 == c4);
        System.out.println(c3);

        Cancion c5 = new Cancion("Hola", "c");
        Cancion c6 = new Cancion();
        System.out.println(c5.equals(c6));
        System.out.println(c5);

        

        











        



        

    }

}
