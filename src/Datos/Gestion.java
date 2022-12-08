
package Datos;

import Modelo.*;
import java.io.IOException;
import java.util.*;

public class Gestion {
    
    ArchivoArt archivo = new ArchivoArt();
    
    public Gestion() {
    }
    
    public void guardar(Articulo Art) throws IOException{
        this.archivo.registrar(Art);
    }
    
    public ArrayList<Articulo> Informar() throws IOException{
        return this.archivo.informe();
    }
    
    public void Actualizar(ArrayList<Articulo> lista) throws IOException{
        archivo.actualizar(lista);
    }
}
