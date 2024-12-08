package controller.ejercicios;

import java.util.Scanner;

public class Empleado {

    public String nombre;
    private int autosVendidos = 0;
    private float totalVentas = 0.0f;
    private float comisiones = 0.0f;

    private final float sueldoBase = 2500.0f;
    private final float comisionPorAuto = 250.0f;
    private final float porcentajeUtilidad = 0.05f;

    // Registrar ventas
    public void registrarVentas(Scanner scanner) {

        String continuarVenta;

        do {
            System.out.println("\nRegistro de ventas para " + nombre);
            System.out.print("Ingrese el valor de la venta del automóvil (Presione 0 para terminar): ");
            float valorAuto = scanner.nextFloat();

            if (valorAuto == 0)
                break;

            if (valorAuto > 0) {
                autosVendidos++;
                totalVentas += valorAuto;

                if (valorAuto > 10000) {
                    comisiones += comisionPorAuto;
                }

            } else {
                System.out.println("El valor de la venta debe ser mayor que 0.");
            }

            System.out.print("¿Desea registrar otra venta? (si/no): ");
            continuarVenta = scanner.next();

        } while (continuarVenta.equalsIgnoreCase("si"));
    }

    public float calcularPagoTotal() {
        float utilidad = totalVentas * porcentajeUtilidad;
        return sueldoBase + comisiones + utilidad;
    }

    public void imprimirInforme() {
        float utilidad = totalVentas * porcentajeUtilidad;
        float pagoTotal = calcularPagoTotal();

        System.out.println("\nInforme de " + nombre + ":");
        System.out.println("Autos Vendidos: " + autosVendidos);
        System.out.println("Valor Total de Ventas: $" + totalVentas);
        System.out.println("Sueldo Base Mensual: $" + sueldoBase);
        System.out.println("Comisión por Autos Vendidos: $" + comisiones);
        System.out.println("Utilidad (5% de ventas): $" + utilidad);
        System.out.println("Pago Total Mensual: $" + pagoTotal);
    }
}
