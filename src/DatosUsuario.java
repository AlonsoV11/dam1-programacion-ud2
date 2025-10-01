import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu usuario:");
        String nombreUsuario = sc.nextLine();
        System.out.println("Tu edad:");
        int edad = sc.nextInt();
        System.out.println("Tu email:");
        String correo = sc.nextLine();
        String gmail = sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(gmail);
        if (emailValido){
	System.out.println(" Tu email es valido ");
} else {
	System.out.println(" Tu email no es valido ");
}
       sc.close();
        }
}