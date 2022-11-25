
package Logica;

import Modelo.*;

public interface LibroTienda {
    void RegistrarArticulo();
    
    String ConsultarArt(int cod);
    
    void Informe ();
    
    void RegistrarVenta();
    
    void BorrarA(int cod);
    
    void Actualizar(int cod);
    
    
}
