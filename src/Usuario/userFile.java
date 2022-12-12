package Usuario;

import java.io.*;
import java.util.ArrayList;

public class userFile {

    Admin admin = new Admin();
    private File manejadorArchivo = new File("Usuario.bin");
    private FileInputStream modoLectura;
    private FileOutputStream modoEscritura;

    public userFile() {
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

    private void guardar(Admin user) throws IOException {
        ObjectOutputStream oos = null;

        try {
            this.modoEscritura = new FileOutputStream(manejadorArchivo);
            oos = new ObjectOutputStream(modoEscritura);
            oos.writeObject(user);

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

    private Admin Leer() throws IOException {
        ObjectInputStream ois = null;

        try {
            this.modoLectura = new FileInputStream(manejadorArchivo);

            ois = new ObjectInputStream(this.modoLectura);
            admin = (Admin) ois.readObject();
            return admin;
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

    public void registrar(Admin user) throws IOException {
        this.guardar(user);
    }

    public Admin leer() throws IOException {
        return this.Leer();
    }
    
    public boolean verificar() {
        return this.manejadorArchivo.exists();
    }
}
