
package views;

import java.util.Scanner;

import controller.ejercicios.AguaPotable;
import controller.ejercicios.Autos;
import controller.ejercicios.Llamada;
import controller.ejercicios.Serie;

public class main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int salida = 0;
        do {

            System.out.println("Elige una opción: ");
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
                    Autos autos = new Autos();
                    autos.iniciarRegistro(scanner);
                    break;
                }
                case 2: {
                    Llamada llamada = new Llamada();
                    llamada.calcularCostoLlamada(scanner);
                    break;
                }
                case 3: {
                    AguaPotable.calcularFactura(scanner);
                    break;
                }
                case 4: {
                    Serie serie = new Serie();
                    serie.generarSerie(scanner);
                    break;
                }
                default:
                    salida = 0;
                    break;
            }
        } while (salida != 0);

        scanner.close();
    }
}