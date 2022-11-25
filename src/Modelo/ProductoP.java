
package Modelo;

import java.util.Scanner;

public class ProductoP extends Articulo{
    //Definicion de atributos
    private double cPeso;
    Scanner captura = new Scanner(System.in);
    
    //Definicion de constructor/Getters y setters
    public ProductoP() {
    }

    public ProductoP(int cod, String nomP, double precioC, double cPeso) {
        super(cod, nomP, precioC);
        this.cPeso = cPeso;
        this.setID(1);
        this.setCant(cPeso);
        this.setpVentaC(precioC/cPeso);
    }

    public double getcPeso() {
        return cPeso;
    }

    public void setcPeso(double cPeso) {
        this.cPeso = cPeso;
    }
    //Definicion de metodos
    
    
}
