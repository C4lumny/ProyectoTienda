package Logica;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Entrada {

    public Entrada() {
    }

    
    
    public static Integer verificarINT(String Cadena) {

        Integer entero;

        try {
            entero = Integer.parseInt(Cadena);
            return entero;
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error el numero digitado es incorrecto digitelo nuevamente");
        }
        return null;

    }

    public static Double verificarDouble(String Cadena) {
        Double Flotante;
        try {
            Flotante = Double.parseDouble(Cadena);
            return Flotante;
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error el numero digitado es incorrecto digitelo nuevamente");
            return null;
        }
    }

    private static boolean aNegativeInt(int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean aNegativeDouble(double d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }
    }

}