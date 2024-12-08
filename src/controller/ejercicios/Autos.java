package controller.ejercicios;

import java.util.Scanner;

public class Autos {
    public void iniciarRegistro() {
        Scanner scanner = new Scanner(System.in);

        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Empleado 1";

        Empleado empleado2 = new Empleado();
        empleado2.nombre = "Empleado 2";

        Empleado empleado3 = new Empleado();
        empleado3.nombre = "Empleado 3";

        String continuar;
        do {
            System.out.println("Seleccione al empleado para registarle sus ventas: ");
            System.out.println("1. Empleado 1");
            System.out.println("2. Empleado 2");
            System.out.println("3. Empleado 3");
            int opción = scanner.nextInt();

            switch (opción) {
                case 1:
                    empleado1.registrarVentas(scanner);
                    break;

                case 2:
                    empleado2.registrarVentas(scanner);
                    break;

                case 3:
                    empleado3.registrarVentas(scanner);
                    break;

                default:
                    System.out.println("Solo opciones 1, 2 y 3");
            }

            System.out.println("\n¿Desea registarle las vetas a otro empleado? (si/no)");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\n - Informe de Sueldo mensual por empleado:");

        empleado1.imprimirInforme();
        empleado2.imprimirInforme();
        empleado3.imprimirInforme();

        scanner.close();
    }
}
