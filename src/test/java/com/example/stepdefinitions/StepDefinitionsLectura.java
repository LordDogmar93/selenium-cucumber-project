package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import page.LecturaPage;

import java.io.IOException;

public class StepDefinitionsLectura {

    LecturaPage lector = new LecturaPage();
    String contenido;

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
}