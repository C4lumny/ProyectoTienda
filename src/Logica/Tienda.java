package Logica;

import Vista.Entrada;
import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tienda implements LibroTienda {

    ArrayList<Articulo> lista = new ArrayList<>();

    @Override
    public void RegistrarArticulo() {
        int op, cod, cant;
        String nombre;
        char seguir;
        double precio, cantidad;
        char R = 'S';
        do {
            System.out.println("");
            System.out.println("---Registrar Producto---");
            System.out.println("\n1. Registrar producto por peso[LB]");
            System.out.println("2. Registrar producto por cantidad");
            System.out.println("3. Volver al menu principal");
            System.out.print("\nIngrese la opcion de su preferencia: ");
            op = Entrada.leerInt();

            switch (op) {
                case 1:
                    seguir = 'S';
                    while (seguir == 'S') {
                        System.out.println("");
                        System.out.print("Ingrese el codigo del producto: ");
                        cod = Entrada.leerInt();
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = Entrada.leerLinea();
                        nombre = nombre.toUpperCase();
                        System.out.print("Ingrese el precio al que compro el producto: ");
                        precio = Entrada.leerDouble();
                        System.out.print("Ingrese la cantidad en libras[LB] que compro del producto: ");
                        cantidad = Entrada.leerDouble();
                        ProductoP pp = new ProductoP(cod, nombre, precio, cantidad);
                        //lista.add(articulo);
                    
                    do {
                        System.out.print("\n¿Desea seguir agregando mas productos por peso?[S/N]: ");
                        seguir = Entrada.leerDato().charAt(0);
                        seguir = Character.toUpperCase(seguir);
                    } while (seguir != 'S' && seguir != 'N');

            }
            break;

          case 2:
                    seguir = 'S';
                    while (seguir == 'S') {
                            System.out.println("");
                            System.out.print("Ingrese el codigo del producto: ");
                            cod = Entrada.leerInt();
                            System.out.print("Ingrese el nombre del producto: ");
                            nombre = Entrada.leerLinea();
                            nombre = nombre.toUpperCase();
                            System.out.print("Ingrese el precio al que compro el producto: ");
                            precio = Entrada.leerDouble();
                            System.out.print("Ingrese la cantidad que compro del producto: ");
                            cant = Entrada.leerInt();
                            ProductoU pu = new ProductoU(cod, nombre, precio, cant);
                            //lista.add(articulo);
                        do {
                            System.out.print("\n¿Desea seguir agregando mas productos?[S/N]: ");
                            seguir = Entrada.leerDato().charAt(0);
                            seguir = Character.toUpperCase(seguir);
                        } while (seguir != 'S' && seguir != 'N');

                    }
                    break;

                case 3:
                    R = 'N';
                    break;

                default:
                    System.out.println("La opcion ingresada no existe. Ingrese una opcion valida");
            }
        
    }
    while (R 
!= 'N');

    }

    @Override
public String ConsultarArt(int cod) {
        int i = 0;
        boolean ved = false;
        while (i < lista.size() && ved == false) {
            if (lista.get(i).getCod() == cod) {
                ved = true;
            } else {
                i++;
            }
        }
        if (ved == true) {
            String producto = "\nCodigo del producto: " + lista.get(i).getCod()
                    + "\nNombre del producto: " + lista.get(i).getNomP()
                    + "\nCantidad actual: " + lista.get(i).getCant()
                    + "\nInversion total: " + lista.get(i).getPrecioC()
                    + "\nGanancias registradas: " + lista.get(i).getGanancia();

            return producto;
        } else {
            return "El articulo que desea consultar no existe. ";
        }
    }

    @Override
public void Informe() {
        int op = 0;
        double ganaciaT = 0;
        if (lista.isEmpty() == true) {
            System.out.println("Error... No ha ingresado ningun producto.");
        } else {
            System.out.println("---LISTA DE PRODUCTOS---");
            System.out.println("");
            System.out.println("1. Visualizar productos por peso[LB]");
            System.out.println("2. Visualizar productos por Unidad");
            System.out.println("");
            do {
                System.out.print("Ingrese la opcion de su preferencia: ");
                op = Entrada.leerInt();
            } while (op < 1 || op > 2);

            switch (op) {
                case 1:
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getID() == 1) {
                            System.out.println("");
                            System.out.println("ID del producto: " + lista.get(i).getCod());
                            System.out.println("Nombre del producto: " + lista.get(i).getNomP());
                            System.out.println("Cantidad existente: " + lista.get(i).getCant());
                            if (lista.get(i).getGanancia() > 0) {
                                System.out.println("Ganancia: " + lista.get(i).getGanancia());
                            } else {
                                System.out.println("´Perdida: " + lista.get(i).getGanancia());
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getID() == 2) {
                            System.out.println("");
                            System.out.println("ID del producto: " + lista.get(i).getCod());
                            System.out.println("Nombre del producto: " + lista.get(i).getNomP());
                            System.out.println("Cantidad existente: " + lista.get(i).getCant());
                            if (lista.get(i).getGanancia() > 0) {
                                System.out.println("Ganancia: " + lista.get(i).getGanancia());
                                ganaciaT += lista.get(i).getGanancia();
                            } else {
                                System.out.println("´Perdida: " + lista.get(i).getGanancia());
                                ganaciaT += lista.get(i).getGanancia();
                            }
                            if (lista.size() - 1 == i) {
                                if (ganaciaT > 0) {

                                    System.out.println("\nLA GANANCIA TOTAL ES: " + ganaciaT);
                                } else {
                                    System.out.println("\nLA PERDIDA TOTAL ES: " + ganaciaT);
                                }
                            }
                        }
                    }
                    break;

            }
        }
    }

    @Override
public void RegistrarVenta() {
        char R, R1 = 'S';
        int cod;

        while (R1 == 'S') {
            System.out.print("\nIngrese el codigo del producto que desea registrar la(s) venta: ");
            cod = Entrada.leerInt();

            boolean ved = false;
            int I = 0;
            while (I < lista.size() && ved == false) {
                if (lista.get(I).getCod() == cod) {
                    ved = true;
                } else {
                    I++;
                }
            }

            if (ved == true) {
                double precioAux, cantV, pI, pG, ganancia;
                System.out.println("--- REGISTRAR VENTA ---");
                System.out.println("Nombre del articulo: " + lista.get(I).getNomP());
                System.out.println("Codigo del producto: " + lista.get(I).getCod());
                System.out.println("Cantidad existente: " + lista.get(I).getCant());
                System.out.println("Inversion: " + lista.get(I).getPrecioC());

                System.out.println("");

                do {
                    System.out.print("Digite la cantidad que se vendio: ");
                    cantV = Entrada.leerDouble();
                    if (cantV > lista.get(I).getCant() || cantV < 0) {
                        System.out.println("ERROR... NUMERO ERRONEO VERIFIQUE Y REINTENTELO \n");
                    }
                } while (cantV > lista.get(I).getCant() || cantV < 0);

                do {
                    if (lista.get(I).getID() == 1) {
                        System.out.print("Digite el precio de venta en libras[LB]: ");
                        precioAux = Entrada.leerDouble();
                    } else {
                        System.out.print("Digite el precio de venta en UNIDAD(ES): ");
                        precioAux = Entrada.leerDouble();
                    }

                    System.out.print("\n¿Esta seguro de que ese fue el precio de la venta? [S/N]: ");
                    R = Entrada.leerDato().charAt(0);
                    R = Character.toUpperCase(R);
                } while (R != 'N' && R != 'S');

                System.out.println("");

                lista.get(I).setCant(lista.get(I).getCant() - cantV);

                pI = cantV * lista.get(I).getpVentaC();
                pG = cantV * precioAux;
                ganancia = pG - pI;
                if (ganancia > 0) {
                    System.out.println("\nLa ganancia ha sido de: " + ganancia + "\n\n");
                } else {
                    System.out.println("La perdida ha sido de: " + ganancia + "\n\n");
                }
                lista.get(I).setGanancia(lista.get(I).getGanancia() + ganancia);
            } else {
                System.out.println("ERROR CODIGO NO VALIDO.");
            }
            do {
                System.out.println("\nDESEA HACER OTRO REGISTRO [S/N] ");
                R = Entrada.leerDato().charAt(0);
                R1 = Character.toUpperCase(R);
            } while (R1 != 'S' && R1 != 'N');
        }

    }

    @Override
public void BorrarA(int cod) {
        char op;
        boolean seguir = false;
        int i = 0;
        while (i < lista.size() && seguir == false) {
            if (lista.get(i).getCod() == cod) {
                seguir = true;
            } else {
                i++;
            }
        }
        System.out.println("");
        System.out.println("---Borrar producto---");
        if (seguir == true) {
            String producto = "\nCodigo del producto: " + lista.get(i).getCod()
                    + "\nNombre del producto: " + lista.get(i).getNomP()
                    + "\nCantidad actual: " + lista.get(i).getCant();
            System.out.println(producto);
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
public void Actualizar(int cod) {
        int i = 0;
        char R = 'S';
        Articulo art = null;
        boolean ved = false;
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

}
