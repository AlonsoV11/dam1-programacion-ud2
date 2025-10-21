import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi edad");
        int edad = sc.nextInt();
        boolean edadValida = edad > 0 && edad < 120;
        if (edadValida) {
            System.out.println("Vivo");
        } else {
            System.out.println("Muerto");
        }
        sc.close()  ;
    }
}
