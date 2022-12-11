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
    Entrada tranfor = new Entrada();

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
        } else {
            return null;
        }
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
        boolean ved = true;

        if (canV > venta.getCant() || canV < 0) {
            JOptionPane.showMessageDialog(null, "ERROR AL DIGITAR EL NUMERO DE VENTA DE ESTE PRODUCTO.\n"
                    + "RECUERDE QUE LA CANTIDAD VENDIDA NO PUEDE SER MAYOR A LA\n"
                    + "CANTIDAD EXISTENTE");
            ved = false;
        }

        if (ved) {
            precioAux = precio;
            venta.setCant(venta.getCant() - canV);

            pI = canV * venta.getPrecioC();
            pG = canV * precioAux;
            ganancia = pG - pI;
            if (ganancia > 0) {
                JOptionPane.showMessageDialog(null, "La ganancia ha sido de: " + ganancia + " $ ");
            } else {
                JOptionPane.showMessageDialog(null, "La perdida ha sido de: " + ganancia + " $ ");
            }
            venta.setGanancia(venta.getGanancia() + ganancia);

        }

    }

    @Override
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
            lista.remove(i);
            archivo.Actualizar(lista);
        }

    }

    @Override
    public void Actualizar(String cod, int OP, String auxi) throws IOException {
        double cantidad;
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

        switch (OP) {
            case 1:

                lista.get(i).setCod(auxi);
                archivo.Actualizar(lista);
                break;
            case 2:
                cantidad = tranfor.verificarDouble(auxi);
                lista.get(i).setPrecioC(cantidad);
                archivo.Actualizar(lista);
                break;
            case 3:
                lista.get(i).setNomP(auxi);
                archivo.Actualizar(lista);
                break;

            case 4:
                cantidad = tranfor.verificarDouble(auxi);
                lista.get(i).setCant(cantidad);
                archivo.Actualizar(lista);
                break;

        }

    }
}
