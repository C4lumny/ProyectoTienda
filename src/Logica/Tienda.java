package Logica;

import Datos.*;
import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tienda implements ILibroTienda {

    Gestion archivo = new Gestion();

    @Override
    public void RegistrarArticulo(String codigo, String nombre, double precio, double peso, int OP) throws IOException {
        switch (OP) {
            case 1:
                Articulo productoP = new ProductoP(codigo, nombre, precio, peso);
                archivo.guardar(productoP);
                break;
            case 2:
                Articulo productoU = new ProductoU(codigo, nombre, precio, (int) peso);
                archivo.guardar(productoU);
                break;
        }
    }

    @Override
    public Articulo ConsultarArt(String cod) throws IOException {

        int i = 0;
        boolean ved = false;
        ArrayList<Articulo> lista = archivo.Informar();

        while (i < lista.size() && ved == false) {
            if (!lista.get(i).getCod().equals(cod)) {
                i++;
            } else {
                ved = true;
            }
        }
        if (ved == true) {
            return lista.get(i);
        }
        return null;
    }

    @Override
    public ArrayList<Articulo> Informe() throws IOException {

        if (!archivo.verificar()) {
            JOptionPane.showMessageDialog(null, "NO SEA GUARDADO NINGUN ARTICULO");
            return null;
        } else {
            ArrayList<Articulo> lista = archivo.Informar();
            return lista;

        }
    }

    @Override
    public void RegistrarVenta(Articulo V, int canV, double precio) throws IOException {
        Articulo venta = V;
        double precioAux, pI, pG, ganancia;

        do {

            if (canV > venta.getCant() || canV < 0) {
                JOptionPane.showMessageDialog(null, "ERROR... NUMERO ERRONEO VERIFIQUE Y REINTENTELO ");
            }
        } while (canV > venta.getCant() || canV < 0);

        if (venta.getID() == 1) {

            precioAux = precio;
        } else {

            precioAux = precio;
        }

        venta.setCant(venta.getCant() - canV);

        pI = canV * venta.getpVentaC();
        pG = canV * precioAux;
        ganancia = pG - pI;
        if (ganancia > 0) {
            JOptionPane.showMessageDialog(null, "La ganancia ha sido de: " + ganancia + " $");
        } else {
            JOptionPane.showMessageDialog(null, "La perdida ha sido de: " + ganancia + " $");
        }
        venta.setGanancia(venta.getGanancia() + ganancia);

    }


    /*@Override
    public void BorrarA(String cod) throws IOException {
        char op;
        boolean seguir = false;
        int i = 0;
        ArrayList<Articulo> lista = archivo.Informar();

        while (i < lista.size() && seguir == false) {
            if (lista.get(i).getCod() == cod) {
                seguir = true;
            } else {
                i++;
            }
        }
        
        if (seguir == true) {
            
            do {
                System.out.print("\n¿Esta seguro de borrar este articulo? [S/N]: ");
                op = Entrada.leerDato().charAt(0);
                op = Character.toUpperCase(op);
            } while (op != 'S' && op != 'N');
            if (op == 'S') {
                lista.remove(i);
            } else {
                System.out.println("Pulse cualquier tecla para volver al menu. ");
                Entrada.leerDato();
            }
        } else {
            System.out.println("El articulo que desea borrar no existe.");
        }
    }

    @Override
    public void Actualizar(int cod) throws IOException {
        int i = 0;
        char R = 'S';
        Articulo art = null;
        boolean ved = false;
        ArrayList<Articulo> lista = archivo.Informar();

        while (i < lista.size() && ved == false) {
            if (lista.get(i).getCod() == cod) {
                ved = true;
            } else {
                i++;
            }
        }
        if (ved == true) {
            int op = 0, codigo;
            String nombre;
            double cantidad;

            System.out.println(ConsultarArt(cod));

            System.out.println("");
            System.out.println("---ACTUALIZAR PRODUCTO---");
            System.out.println("1. Actualizar Codigo}"
                    + "\n2. Actualizar nombre"
                    + "\n3. Actualizar cantidad"
                    + "\n4. Actualizar inversion"
                    + "\n5. Volver al menu");
            while (R == 'S') {
                System.out.print("Que campo del articulo desea actualizar?: ");
                op = Entrada.leerInt();
                switch (op) {
                    case 1:
                        System.out.println("Ingrese el nuevo codigo: ");
                        codigo = Entrada.leerInt();
                        lista.get(i).setCod(codigo);
                        break;
                    case 2:
                        Entrada.leerLinea();
                        System.out.println("Ingrese el nuevo nombre: ");
                        nombre = Entrada.leerLinea();
                        lista.get(i).setNomP(nombre);
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva cantidad: ");
                        cantidad = Entrada.leerDouble();
                        lista.get(i).setCant(cantidad);
                        break;

                    case 4:
                        System.out.println("Ingrese la nueva cantidad: ");
                        cantidad = Entrada.leerDouble();
                        lista.get(i).setPrecioC(cantidad);
                        break;

                    case 5:
                        break;
                    default:
                        System.out.println("La opcion ingresada no existe. Por favor ingrese una valida");

                }
                do {
                    System.out.println("\nDESEA HACER OTRA ACTULIZACION [S/N] ");
                    R = Entrada.leerDato().charAt(0);
                    R = Character.toUpperCase(R);
                } while (R != 'S' && R != 'N');

            }

        } else {
            System.out.println("El producto que desea actualizar no existe.");

        }

    }
     */
}
