import java.util.Scanner;

public class tarea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.println("Ingrese el tamaño del arreglo:");
        int N = scanner.nextInt();

        // Crear un arreglo para almacenar números primos
        int[] primos = new int[N];
        int contadorPrimos = 0;

        // Solicitar al usuario ingresar números
        System.out.println("Ingrese los números:");

        for (int i = 0; i < N; i++) {
            int numero = scanner.nextInt();

            // Verificar si el número es primo
            if (esPrimo(numero)) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            }
        }

        // Imprimir los números primos almacenados en el arreglo
        System.out.println("Los números primos ingresados son:");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println(primos[i]);
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

