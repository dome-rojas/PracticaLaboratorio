
package views;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int salida = 0;
        do {

            System.out.println("Elige una opción:");
            System.out.println("1. Compañia de Autos Usados.");
            System.out.println("2. Llamadas Telefónicas Internacionales.");
            System.out.println("3. Agua Potable - Loja.");
            System.out.println("4. Serie.");
            System.out.println("Presione 0 para salir del sistema.");
            salida = scanner.nextInt();

            switch (salida) {
                case 0:
                    break;

                case 1: {

                    break;
                }
                case 2: {
                    System.out.println("Llamadas Telefónicas Internacionales.");
                    break;
                }
                case 3: {
                    System.out.println("La Empresa Municipal de agua potable de Loja.");
                    break;
                }
                case 4: {
                    System.out.println("Generar serie");
                    break;
                }
                default:
                    salida = 0;
                    break;
            }
        } while (salida != 0);
    }
}