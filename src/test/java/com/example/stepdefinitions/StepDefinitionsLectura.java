package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import page.LecturaPage;
import java.io.File;

import java.io.IOException;

public class StepDefinitionsLectura {

    LecturaPage lector = new LecturaPage();
    String contenido;

    @Given("Crear archivo {string}")
    public void crear_archivo(String rutaArchivo) throws IOException {
        lector.crearArchivo(rutaArchivo);
        System.out.println("Archivo creado: " + rutaArchivo);
    }

    @And("Escribir en el archivo {string}")
    public void escribir_en_el_archivo(String contenido) {
        lector.escribirEnArchivo(contenido);
        System.out.println("Contenido escrito en el archivo: " + contenido);
    }

    @Given("Abrir archivo {string}")
    public void abrir_archivo(String rutaArchivo) throws IOException {
        lector.abrirArchivo(rutaArchivo);
        System.out.println("Archivo abierto: " + rutaArchivo);
    }

    @And("Leer archivo")
    public void leer_archivo() throws IOException {
        contenido = lector.leerArchivo();
        System.out.println("Contenido del archivo: " + contenido);
    }

    @And("Editar archivo agregando {string}")
    public void editar_archivo_agregando(String nuevoContenido) throws IOException {
        lector.editarArchivo(nuevoContenido);
        contenido = lector.leerArchivo();
        System.out.println("Nuevo contenido agregado: " + nuevoContenido);
    }

    @When("Guardar cambios en el archivo")
    public void guardar_cambios_en_el_archivo() throws IOException {
        String rutaArchivo = "src/test/resources/File/archivo.txt";
        lector.guardarCambios(rutaArchivo);
        System.out.println("Cambios guardados en el archivo: " + rutaArchivo);
    }

    @Then("Mostrar contenido del archivo")
    public void mostrar_contenido_del_archivo() {
        System.out.println("Contenido del archivo: " + contenido);
    }

    @And("Cerrar archivo")
    public void cerrar_archivo() throws IOException {
        lector.cerrarArchivo();
        System.out.println("Archivo cerrado");
    }

    @And("Eliminar archivo")
    public void eliminar_archivo() throws IOException {
        String rutaArchivo = "src/test/resources/File/archivo.txt";
        lector.eliminarArchivo(rutaArchivo);
    }

    @Then("Verificar que el archivo no existe")
    public void verificar_que_el_archivo_no_existe() {
        String rutaArchivo = "src/test/resources/File/archivo.txt";
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            System.out.println("El archivo no existe: " + rutaArchivo);
        } else {
            System.out.println("El archivo todavía existe: " + rutaArchivo);
        }
    }
}