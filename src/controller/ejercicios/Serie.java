package controller.ejercicios;

import java.util.Scanner;

public class Serie {

    public void generarSerie() {
        // Variables para el cálculo de la serie
        int auxiliar = 1, fibo = 1, suma, contador;
        int numero = 1; // El primer número del denominador
        int indice = 2; // El primer exponente
        int signo = 1; // Para alternar los signos entre los términos (1 para positivo, -1 para
                       // negativo)
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario cuántos términos de la serie desea ver
        System.out.println("¿Cuántos números de la serie desea ver? (sin el 0): ");
        contador = scanner.nextInt();

        if (contador > 0) {
            // Imprimir el primer término de la serie
            System.out.print("(" + auxiliar + "/" + numero + ")^" + indice);
            contador--;
            numero += 2;
            indice += 2;

            // Generar la serie
            while (contador > 0) {
                // Alternar los signos
                signo = -signo;

                // Sumar los dos primeros términos de Fibonacci para el siguiente numerador
                suma = auxiliar + fibo;
                auxiliar = fibo;
                fibo = suma;

                // Imprimir el siguiente término de la serie con el signo alternado
                System.out.print(" " + (signo == 1 ? "+" : "-") + " (" + auxiliar + "/" + numero + ")^" + indice);

                contador--;
                numero += 2;
                indice += 2;
            }
            System.out.println(); // Salto de línea al finalizar
        } else {
            System.out.println("Por favor ingrese un número mayor que 0.");
        }
    }
}
