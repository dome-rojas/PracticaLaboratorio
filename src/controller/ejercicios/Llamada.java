package controller.ejercicios;

import java.util.Scanner;

public class Llamada {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String continuar = null;

        // Ciclo para realizar múltiples cálculos
        do {
            System.out.println("Selecciona la zona de destino:");
            System.out.println("1 - América del Norte (Clave 12)");
            System.out.println("2 - América Central (Clave 15)");
            System.out.println("3 - América del Sur (Clave 18)");
            System.out.println("4 - Europa (Clave 19)");
            System.out.println("5 - Asia (Clave 23)");
            System.out.println("6 - África (Clave 25)");
            System.out.println("7 - Oceanía (Clave 29)");
            System.out.println("8 - Resto del Mundo (Clave 31)");

            // Leer la clave de la zona seleccionada
            System.out.print("Ingresa la clave de la zona seleccionada: ");
            int clave = tcl.nextInt();
            float precioPorMinuto = 0;
            String zona = "";

            // Determinar el precio por minuto y la zona de destino
            if (clave == 12) {
                precioPorMinuto = 2.75f; // América del Norte
                zona = "América del Norte";
            } else if (clave == 15) {
                precioPorMinuto = 1.89f; // América Central
                zona = "América Central";
            } else if (clave == 18) {
                precioPorMinuto = 1.60f; // América del Sur
                zona = "América del Sur";
            } else if (clave == 19) {
                precioPorMinuto = 3.50f; // Europa
                zona = "Europa";
            } else if (clave == 23) {
                precioPorMinuto = 4.50f; // Asia
                zona = "Asia";
            } else if (clave == 25) {
                precioPorMinuto = 3.10f; // África
                zona = "África";
            } else if (clave == 29) {
                precioPorMinuto = 3.00f; // Oceanía
                zona = "Oceanía";
            } else if (clave == 31) {
                precioPorMinuto = 6.00f; // Resto del Mundo
                zona = "Resto del Mundo";
            } else {
                System.out.println("Clave no válida. Elija una clave de la lista.");
                continue; // Volver a preguntar por la clave si es inválida
            }

            // Leer el número de minutos
            System.out.print("Ingresa el número de minutos de la llamada: ");
            float minutos = tcl.nextFloat();

            // Calcular el costo total
            float costoTotal = precioPorMinuto * minutos;

            // Mostrar los resultados en tres líneas diferentes
            System.out.println("Zona de destino: " + zona);
            System.out.println("Valor por minuto: $" + precioPorMinuto);
            System.out.printf("Costo total de la llamada: $%.2f%n", costoTotal);

            // Preguntar si el usuario quiere calcular otro valor
            System.out.print("¿Desea calcular otro pago? (s/n): ");
            continuar = tcl.next();
        } while (continuar.equals("s"));

        tcl.close();
    }
}
