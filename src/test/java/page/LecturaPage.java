package page;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaPage {

    private BufferedReader br;

    public void abrirArchivo(String rutaArchivo) throws IOException {
        br = new BufferedReader(new FileReader(rutaArchivo));
    }

    public String leerArchivo() throws IOException {
        StringBuilder contenido = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            contenido.append(linea).append("\n");
        }
        return contenido.toString();
    }

    public void cerrarArchivo() throws IOException {
        if (br != null) {
            br.close();
        }
    }
}