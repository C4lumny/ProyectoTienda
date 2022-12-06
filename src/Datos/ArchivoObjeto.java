package Datos;

import Modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class ArchivoObjeto implements IArchivo {

    private File manejadorArchivo;
    private FileInputStream modoLectura;
    private FileOutputStream modoEscritura;

    public ArchivoObjeto() {
        this("Articulos.bin");
    }

    public ArchivoObjeto(String name) {
        this.manejadorArchivo = new File(name);
    }

    public File getManejadorArchivo() {
        return manejadorArchivo;
    }
   
    public void setManejadorArchivo(File manejadorArchivo) {
        this.manejadorArchivo = manejadorArchivo;
    }


    public FileInputStream getModoLectura() {
        return modoLectura;
    }


    public void setModoLectura(FileInputStream modoLectura) {
        this.modoLectura = modoLectura;
    }


    public FileOutputStream getModoEscritura() {
        return modoEscritura;
    }

    public void setModoEscritura(FileOutputStream modoEscritura) {
        this.modoEscritura = modoEscritura;
    }
    
    private void guardar(ArrayList<Articulo> lista)throws IOException{
        ObjectOutputStream oos = null;
        try {
            this.modoEscritura = new FileOutputStream(this.manejadorArchivo);
            oos = new ObjectOutputStream(this.modoEscritura);
            oos.writeObject(lista);

        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archvio modo escritura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegion para abrir archvio en modo escritura");
        } catch (NullPointerException np) {
            throw new IOException("El archvio en modo escritura en null");
        } catch (IOException ioe) {
            throw new IOException("Error al crear objeto de escritura");
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
    }
    
    private ArrayList<Articulo> leer()throws IOException{
        ObjectInputStream ois = null;
        ArrayList<Articulo> lista = null;
        
        if(!this.manejadorArchivo.exists()){
            lista = new ArrayList();
            return lista;
        }
        
        try {
            this.modoLectura = new FileInputStream(this.manejadorArchivo);
            lista = new ArrayList();
            ois = new ObjectInputStream(this.modoLectura);
            lista = (ArrayList<Articulo>) ois.readObject();
            return lista;

        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archvio modo lectura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegion para abrir archvio en modo lectura");
        } catch (NullPointerException np) {
            throw new IOException("El archvio en modo lectura es null");
        } catch (IOException ioe) {
            throw new IOException("Error al crear objeto lector");
        } catch (ClassNotFoundException ex) {
            throw new IOException("Error al leer objeto");
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
    }
    
    
    @Override
    public void registrarArticulo(Articulo a) throws IOException {
        ArrayList<Articulo> lista = this.leer();
        lista.add(a);
        this.guardar(lista);

    }

    @Override
    public ArrayList<Articulo> leerArticulos() throws IOException {
        return this.leer();
    }

    @Override
    public Articulo buscarArticuloPorId(int id) throws IOException {
        ArrayList<Articulo> lista = this.leer();
        Articulo buscada = null;
        for(Articulo a: lista){
            if(a.getID()==id){
                buscada = a;
                break;
            }
        }
        if(buscada==null)
            throw new NoSuchElementException("Seleccion no registrada");
        
        return buscada;
    }

}