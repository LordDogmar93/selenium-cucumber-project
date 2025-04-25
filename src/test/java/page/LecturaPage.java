package page;

import java.io.*;

public class LecturaPage {

    private BufferedReader br;
    private StringBuilder contenido;

    public void crearArchivo(String rutaArchivo) throws IOException {
        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo ya existe: " + rutaArchivo);
        } else {
            contenido = new StringBuilder();
            try (FileWriter fw = new FileWriter(rutaArchivo)) {
                System.out.println("Archivo creado: " + rutaArchivo);
            }
        }
    }

    public void escribirEnArchivo(String nuevoContenido) {
        if (contenido == null) {
            contenido = new StringBuilder();
        }
        contenido.append(nuevoContenido).append("\n");
    }

    public void abrirArchivo(String rutaArchivo) throws IOException {
        br = new BufferedReader(new FileReader(rutaArchivo));
        contenido = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
    }

    public String leerArchivo() {
        return contenido.toString();
    }

    public void editarArchivo(String nuevoContenido) {
        contenido.append(nuevoContenido).append("\n");
    }

    public void guardarCambios(String rutaArchivo) throws IOException {
        try (FileWriter fw = new FileWriter(rutaArchivo)) {
            fw.write(contenido.toString());
        }
    }

    public void cerrarArchivo() throws IOException {
        if (br != null) {
            br.close();
        }
    }

    public void eliminarArchivo(String rutaArchivo) throws IOException {
        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo eliminado: " + rutaArchivo);
            } else {
                throw new IOException("No se pudo eliminar el archivo: " + rutaArchivo);
            }
        } else {
            System.out.println("El archivo no existe: " + rutaArchivo);
        }
    }
}