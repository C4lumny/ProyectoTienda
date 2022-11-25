package Vista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    private static Scanner entrada = new Scanner(System.in);

    public static int leerInt() {
        int valor = 0;
        boolean tieneExcepcion;
        do {
            try {
                valor = entrada.nextInt();
                tieneExcepcion = false;

            } catch (java.util.InputMismatchException IME) {
                System.out.print("Se requiere un valor numerico entero: ");
                entrada.nextLine();
                tieneExcepcion = true;
            }
        } while (tieneExcepcion);
        return valor;
    }

    Scanner sc = new Scanner(System.in);

    public static double leerDouble() {
        double valor = 0;
        boolean tieneExcepcion;
        do {
            try {
                valor = entrada.nextDouble();
                tieneExcepcion = false;

            } catch (java.util.InputMismatchException IME) {
                System.out.print("Se requiere un valor numerico real: ");
                entrada.nextLine();
                tieneExcepcion = true;
            }
        } while (tieneExcepcion);
        return valor;
    }

    public static String leerLinea() {
        entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static String leerDato() {
        return entrada.next();
    }

}
