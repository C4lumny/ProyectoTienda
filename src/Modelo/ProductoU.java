package Modelo;

import java.io.Serializable;

public class ProductoU extends Articulo implements Serializable {

    //Declaracion de atributos
    private int cNumero;
    private double numero;

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

    @Override
    public String toString() {
        return super.toString() + "ProductoU{" + "cNumero=" + cNumero + ", numero=" + numero + '}';
    }
 
}
