package controller.ejercicios;

import java.util.Scanner;

public class Llamada {

    public enum Zona {
        AMERICA_DEL_NORTE(12, 2.75f),
        AMERICA_CENTRAL(15, 1.89f),
        AMERICA_DEL_SUR(18, 1.60f),
        EUROPA(19, 3.50f),
        ASIA(23, 4.50f),
        AFRICA(25, 3.10f),
        OCEANIA(29, 3.00f),
        RESTO_DEL_MUNDO(31, 6.00f);

        private final int clave;
        private final float precioPorMinuto;

        Zona(int clave, float precioPorMinuto) {
            this.clave = clave;
            this.precioPorMinuto = precioPorMinuto;
        }

        public int getClave() {
            return clave;
        }

        public float getPrecioPorMinuto() {
            return precioPorMinuto;
        }

        public static Zona getZonaClave(int clave) {
            for (Zona zona : Zona.values()) {
                if (zona.getClave() == clave) {
                    return zona;
                }
            }
            return null;
        }

    }

    public void calcularCostoLlamada(Scanner scanner) {
        System.out.println("Selecciona la zona de destino:");

        for (Zona zona : Zona.values()) {

            System.out.print(
                    "\n" + zona.getClave() + " - " + zona.name().replace('_', ' ') + " (Clave " + zona.getClave()
                            + ")");
        }

        System.out.print("\nIngresa la clave de la zona seleccionada: ");
        int clave = scanner.nextInt();

        Zona zonaSeleccionada = Zona.getZonaClave(clave);

        if (zonaSeleccionada == null) {
            System.out.println("Clave no válida. Elija una clave de la lista.");
            return;
        }

        System.out.print("\nIngresa el número de minutos de la llamada: ");
        float minutos = scanner.nextFloat();

        float costoTotal = zonaSeleccionada.getPrecioPorMinuto() * minutos;

        System.out.println("Zona de destino: " + zonaSeleccionada.name().replace('_', ' '));
        System.out.println("Valor por minuto: $" + zonaSeleccionada.getPrecioPorMinuto());
        System.out.print("Costo total de la llamada: $" + costoTotal);
    }
}
