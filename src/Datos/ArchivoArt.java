package Datos;

import Modelo.*;
import java.io.*;
import java.util.ArrayList;

public class ArchivoArt {

    private File manejadorArchivo = new File("Articulos.bin");
    private FileInputStream modoLectura;
    private FileOutputStream modoEscritura;

    public ArchivoArt() {
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

    private void guardar(ArrayList<Articulo> lista) throws IOException {
        ObjectOutputStream oos = null;

        try {
            this.modoEscritura = new FileOutputStream(manejadorArchivo);
            oos = new ObjectOutputStream(modoEscritura);
            oos.writeObject(lista);

        } catch (FileNotFoundException fne) {
            throw new IOException("Error al abrir archvio modo escritura");
        } catch (SecurityException se) {
            throw new IOException("No tiene privilegios para abrir archvio en modo escritura");
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

    private ArrayList<Articulo> Leer() throws IOException {
        ObjectInputStream ois = null;
        ArrayList<Articulo> lista = null;

        if (!this.manejadorArchivo.exists()) {
            lista = new ArrayList();
            return lista;
        }

        try {
            this.modoLectura = new FileInputStream(manejadorArchivo);
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

    public void registrar(Articulo a) throws IOException {
        ArrayList<Articulo> lista = this.Leer();
        lista.add(a);
        this.guardar(lista);
    }

    public void actualizar(ArrayList art) throws IOException {
        this.guardar(art);
    }

    public ArrayList<Articulo> informe() throws IOException {
        return this.Leer();
    }

}
