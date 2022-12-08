package Modelo;

import java.io.*;

public abstract class Articulo implements Serializable {

    //Definicion de atributos de la clase
    private int cod;
    private String nomP;
    private double precioC;
    private double pVentaC;
    private double ganancia;
    private int ID;
    private double cant;

    //Definicion de constructores
    public Articulo() {
    }

    public Articulo(int cod, String nomP, double precioC) {
        this.cod = cod;
        this.nomP = nomP;
        this.precioC = precioC;
    }

    //Getters y setters
    public double getpVentaC() {
        return pVentaC;
    }

    public void setpVentaC(double pVentaC) {
        this.pVentaC = pVentaC;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    //Definicion de metodos
    @Override
    public String toString() {
        return "Articulo{" + "cod=" + cod + ", nomP=" + nomP + ", precioC=" + precioC + ", pVentaC=" + pVentaC + ", ganancia=" + ganancia + ", ID=" + ID + ", cant=" + cant + '}';
    }

}
