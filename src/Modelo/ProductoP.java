
package Modelo;

import java.io.Serializable;

public class ProductoP extends Articulo implements Serializable{
    //Definicion de atributos
    private double cPeso;
    
    //Definicion de constructor/Getters y setters
    public ProductoP() {
    }

    public ProductoP(String cod, String nomP, double precioC, double cPeso) {
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

    @Override
    public String toString() {
        return super.toString()+ "ProductoP{" + "cPeso=" + cPeso + '}';
    }
    
}
