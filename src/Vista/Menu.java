package Vista;

import Modelo.*;
import Logica.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    GestionArticulos modelo = new GestionArticulos();
    Scanner sc = new Scanner(System.in);
    Tienda tienda = new Tienda();
    int cod;

    public void menuVistaConsola() {
        String nombre;
        int op;
        System.out.print("Ingrese el nombre de su tienda: ");
        nombre = sc.nextLine();
        nombre = nombre.toUpperCase();
        do {
            cod = 0;
            System.out.println("");
            System.out.println("TIENDA " + nombre);
            System.out.println("");
            System.out.println("0. Leer archivo");
            System.out.println("1. Registrar producto");
            System.out.println("2. Registrar ventas");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Borrar producto");
            System.out.println("5. Consulta unica");
            System.out.println("6. Informe");
            System.out.println("7. Salir de la aplicacion");
            System.out.print("\nIngrese la opcion de su preferencia: ");
            op = Entrada.leerInt();
            switch (op) {
                case 0:
                    try {
                    ArrayList<Articulo> articles = modelo.leerArticulos();
                    for (Articulo a : articles){
                        System.out.println(a);
                    }
                }catch(IOException ioe){
                        System.out.println("Excepcion: "+ ioe.getLocalizedMessage());
                }
                break;
                case 1:
                    tienda.RegistrarArticulo();
                    break;

                case 2:
                    tienda.RegistrarVenta();
                    break;
                case 3:
                    System.out.print("\nIngrese el codigo del producto que desea actualizar: ");
                    cod = sc.nextInt();
                    tienda.Actualizar(cod);
                    break;

                case 4:
                    System.out.print("\nIngrese el codigo del producto que desea borrar: ");
                    cod = sc.nextInt();
                    tienda.BorrarA(cod);
                    break;
                case 5:
                    System.out.print("\nIngrese el codigo del producto que desea consultar: ");
                    cod = sc.nextInt();
                    System.out.println(tienda.ConsultarArt(cod));
                    break;
                case 6:
                    System.out.println("\n");
                    tienda.Informe();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\nError, la opcion no existe. Por favor ingrese una valida");
            }
        } while (op != 7);

    }
}
