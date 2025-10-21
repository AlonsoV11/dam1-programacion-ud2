public class GestorTareas {

    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.

        // Tu código aquí ↓
        mostrarBienvenida();

        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.

        // Tu código aquí ↓

        int totalMinutos = duracionTotal(45, 30);
        System.out.println("Duración total: " + totalMinutos + " minutos");

        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.

        // Tu código aquí ↓
        convertirHorasYMinutos(150);

        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.

        // Tu código aquí ↓

        mostrarRecordatorio("Revisar correo", 2);

        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está
        // completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
        System.out.println("[Ejercicio 5]");
        String tareaEstado = tareaCompletada(true);
        System.out.println(tareaEstado);
        tareaEstado = tareaCompletada(false);
        System.out.println(tareaEstado);

        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.

        // Tu código aquí ↓
        System.out.println("[Ejercicio 6]");
        double porcentajeTareasCompletadas = tareasCompletadas(7, 10);
        System.out.printf("Tareas completadas: %.2f%%", porcentajeTareasCompletadas);

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola
        // {usuario} completaste {numero} de tareas"
        // que muestre un resumen personalizado.
        // Llama a ambos desde main.

        // Tu código aquí ↓
        System.out.println("[Ejercicio 7]");
        saludo("crack");
        saludo("crack", 7);

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓
        System.out.println("[Ejercicio 8]");
        mostrarTareasYDuracion("limpiar tareas", 150);

    }

    // Aquí debéis crear los métodos fuera del main ↓↓↓

    public static void mostrarBienvenida() {
        System.out.println("Bienvenido");
    }

    public static int duracionTotal(int t1, int t2) {
        return t1 + t2;
    }

    public static void convertirHorasYMinutos(int minutos) {
        int horas = minutos / 60;
        int min = minutos % 60;

        System.out.println("Son " + horas + " horas y " + min + " minutos.");

    }

    public static void mostrarRecordatorio(String tarea, int prioridad) {
        System.out.println("📌 [Prioridad " + prioridad + "] " + tarea);
    }

    // Ejercicio 5
    public static String tareaCompletada(boolean completada) {
        if (completada) {
            return "Completada";
        } else {
            return "Pendiente";
        }
    }

    //Ejercicio 6
    public static double tareasCompletadas(int tareasCompletadas, int totalTareas) {
        return tareasCompletadas * 100.00 / totalTareas;
    }

    // Ejercicio 7
    public static void saludo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void saludo(String nombre, int tareasCompletadas) {
        System.out.println("Hola " + nombre + " has completado " + tareasCompletadas + " tareas");
    }

    public static void mostrarTareasYDuracion(String nombre, int totalMinutos) {
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;
        System.out.println("Tiempo: " + horas + " minutos: " + minutos);
        System.out.printf("La tarea %s durará aproximadamente %d horas y %d minutos.", nombre, horas, minutos);
    }
}
   
