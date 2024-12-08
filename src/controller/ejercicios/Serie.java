package controller.ejercicios;

import java.util.Scanner;

public class Serie {

    public void generarSerie() {
        int auxiliar = 1, fibo = 1, suma, contador;
        int numero = 1;
        int indice = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros de la serie desea ver (sin el 0): ");
        contador = scanner.nextInt();

        if (contador > 0) {
            System.out.print("(" + auxiliar + "/" + numero + ")" + "^" + indice);
            contador--;
            numero += 2;
            indice += 2;

            while (contador > 0) {
                System.out.print(", ");

                suma = auxiliar + fibo;
                auxiliar = fibo;
                fibo = suma;

                System.out.print("(" + auxiliar + "/" + numero + ") " + "^" + indice);

                contador--;
                numero += 2;
                indice += 2;
            }
        }
    }
}
