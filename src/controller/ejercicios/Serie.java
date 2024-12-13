package controller.ejercicios;

import java.util.Scanner;

public class Serie {

    public void calcularSerie(int numeroItems) {
        double resultado = 0.0;
        int numerador1 = 1;
        int numerador2 = 1;
        int denominador = 1;
        int contadorGrupo = 0;
        int grupoActual = 2;
        int signo = 1;

        System.out.println("Serie generada:");
        for (int i = 1; i <= numeroItems; i++) {
            double termino = Math.pow((double) numerador1 / denominador, 2 * i);
            termino *= signo;

            System.out.printf("%s(%.0f / %d)^%d ", (signo > 0 ? "+" : "-"), (double) numerador1, denominador, 2 * i);

            resultado += termino;

            contadorGrupo++;
            if (contadorGrupo == grupoActual) {
                contadorGrupo = 0;
                signo *= -1;
            }

            int temp = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = temp;
            denominador += 2;
        }
        System.out.println(" ");
        System.out.println("Resultado de la serie: " + resultado);
    }

    public void ejecutar(Scanner scanner) {
        System.out.println("Ingrese el numero de terminos de la serie");
        int numero = scanner.nextInt();
        calcularSerie(numero);
    }
}
