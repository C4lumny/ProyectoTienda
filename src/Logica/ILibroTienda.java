package Logica;

import Modelo.*;
import java.io.IOException;
import java.util.ArrayList;

public interface ILibroTienda {

    void RegistrarArticulo(String codigo, String nombre, double precio, double peso, int OP) throws IOException;

    Articulo ConsultarArt(String cod) throws IOException;

    ArrayList<Articulo> Informe() throws IOException;

    void RegistrarVenta(Articulo V, int canV, double precio) throws IOException;

    void BorrarA(String cod) throws IOException;

    void Actualizar(String cod, int OP, String auxi) throws IOException;

}
