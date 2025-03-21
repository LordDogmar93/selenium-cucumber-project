package page;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaPage {

    private BufferedReader br;
    private StringBuilder contenido;

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
}