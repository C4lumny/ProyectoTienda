
package Modelo;

import java.util.Scanner;

public class ProductoU extends Articulo{
    //Declaracion de atributos
    private int cNumero;
    private double numero;
    Scanner captura = new Scanner(System.in);

    //Implementacion de constructor

    public ProductoU() {
    }
    
    public ProductoU(int cod, String nomP, double precioC, int cNumero) {
        super(cod, nomP, precioC);
        this.cNumero = cNumero;
        this.setID(2);
        this.numero = (double) cNumero;
        this.setCant(numero);
        this.setpVentaC(precioC / numero);
    }
    //Definicion de getter y setters
    public int getcNumero() {
        return cNumero;
    }

    public void setcNumero(int cNumero) {
        this.cNumero = cNumero;
    }
    
    
    
}