import utilidades.CuentaBancaria;

public class Main {
   public static void main(String[] args) {
   CuentaBancaria cuenta = new CuentaBancaria();
   System.out.println(cuenta.saldo);

   cuenta.depositar(100);
   cuenta.retirar(30);
   System.out.println(cuenta.getSaldo());
   cuenta = registrarOperacion("Hackeo", 9999);
   
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: Porque utiliza el private.

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: Porque si lleva public.

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: Esta en private
// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta:
}
}