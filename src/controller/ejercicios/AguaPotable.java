package controller.ejercicios;

import java.util.Scanner;

public class AguaPotable {
    public static float calcularPrecioAdultoMayor(Scanner tcl) {
        System.out.print("Ingrese el consumo del medidor (m³): ");
        float consumo = tcl.nextFloat();

        float costoBase = 3.00f;
        float costoExceso = calcularCostoExceso(consumo, 15);

        if (consumo <= 15) {
            costoBase *= 0.5f;
        } else {
            costoBase *= 0.7f;
        }

        return costoBase + costoExceso;
    }

    public static float calcularPrecioConDiscapacidad(Scanner tcl) {
        System.out.print("Ingrese el consumo del medidor (m³): ");
        float consumo = tcl.nextFloat();

        System.out.print("Ingrese el porcentaje de discapacidad del contribuyente (40 - 100): ");
        float porcentajeDiscapacidad = tcl.nextFloat();

        float costoBase = 3.00f;
        float costoExceso = 0.00f;

        if (consumo <= 15) {
            costoBase -= (costoBase * (porcentajeDiscapacidad / 100));
        } else {
            costoExceso += calcularCostoExceso(consumo, 15);

        }

        return costoBase + costoExceso;
    }

    public static float calcularPrecioNormal(Scanner tcl) {
        System.out.print("Ingrese el consumo del medidor (m³): ");
        float consumo = tcl.nextFloat();

        float costoBase = 3.00f;
        float costoExceso = calcularCostoExceso(consumo, 15);

        return costoBase + costoExceso;
    }

    public static float calcularCostoExceso(float consumo, float base) {
        float exceso = consumo - base;
        float costoExceso = 0.0f;

        if (exceso > 0) {
            if (exceso <= 10) {
                costoExceso = exceso * 0.10f;
            } else if (exceso <= 15) {
                costoExceso = exceso * 0.20f;
            } else if (exceso <= 20) {
                costoExceso = exceso * 0.30f;
            } else {
                costoExceso = exceso * 0.35f;
            }
        }

        return costoExceso;
    }

    public static void calcularFactura(Scanner scanner) {
        String continuar;

        do {
            System.out.println("¿El contribuyente pertenece a la tercera edad? (si/no):");
            String esAdultoMayor = scanner.next();
            float subtotal = 0;

            if (esAdultoMayor.equalsIgnoreCase("si")) {
                subtotal = calcularPrecioAdultoMayor(scanner);
            } else {
                System.out.println("¿El contribuyente tiene alguna discapacidad? (si/no):");
                String tieneDiscapacidad = scanner.next();
                if (tieneDiscapacidad.equalsIgnoreCase("si")) {
                    subtotal = calcularPrecioConDiscapacidad(scanner);
                } else {
                    subtotal = calcularPrecioNormal(scanner);
                }
            }

            float impuestoAlcantarillado = subtotal * 0.35f;
            float tasaRecoleccionBasura = 0.75f;
            float tasaProcesamientoDatos = 0.50f;
            float total = subtotal + impuestoAlcantarillado + tasaRecoleccionBasura + tasaProcesamientoDatos;

            System.out.println("\n--- Desglose de la Factura ---");
            System.out.println("Subtotal (servicio de agua): $" + subtotal);
            System.out.println("Impuesto de alcantarillado (35%): $" + impuestoAlcantarillado);
            System.out.println("Tasa por recolección de basura: $" + tasaRecoleccionBasura);
            System.out.println("Tasa por procesamiento de datos: $" + tasaProcesamientoDatos);
            System.out.println("TOTAL A PAGAR: $" + total);

            System.out.println("\n¿Desea calcular otra factura? (si/no):");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));
    }
}
