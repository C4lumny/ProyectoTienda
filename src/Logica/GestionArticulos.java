
package Logica;

import Datos.*;
import Modelo.*;
import java.io.IOException;
import java.util.ArrayList;

public class GestionArticulos {
    
     private IArchivo archivo;

    public GestionArticulos() {
        this.archivo = new ArchivoObjeto();
    }
    
    public void registrarArticulos(Articulo a) throws IOException{
        this.archivo.registrarArticulo(a);
    }
  
    public ArrayList<Articulo> leerArticulos() throws IOException {
        return this.archivo.leerArticulos();
    }
    
    public Articulo buscarMascotaPorId(int id) throws IOException {
        return this.archivo.buscarArticuloPorId(id);
    }
    
}
