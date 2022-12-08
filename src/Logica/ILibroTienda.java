
package Logica;

import Modelo.*;
import java.io.IOException;

public interface ILibroTienda {
    void RegistrarArticulo() throws IOException;
    
    String ConsultarArt(int cod) throws IOException;
    
    void Informe ()throws IOException;
    
    void RegistrarVenta()throws IOException;
    
    void BorrarA(int cod) throws IOException;
    
    void Actualizar(int cod) throws IOException;
    
    
}
