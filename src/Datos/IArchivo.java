package Datos;

import Modelo.*;
import java.io.IOException;
import java.util.ArrayList;


public interface IArchivo{

    void registrarArticulo(Articulo a) throws IOException;

    ArrayList<Articulo> leerArticulos() throws IOException;

    Articulo buscarArticuloPorId(int id) throws IOException;
}
