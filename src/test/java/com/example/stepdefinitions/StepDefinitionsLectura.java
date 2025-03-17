package com.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import page.LecturaPage;

import java.io.IOException;

public class StepDefinitionsLectura {

    LecturaPage lector = new LecturaPage();
    private String contenido;

    @Given("Abrir archivo {string}")
    public void abrir_archivo(String rutaArchivo) throws IOException {
        lector.abrirArchivo(rutaArchivo);
    }

    @And("Leer archivo")
    public void leer_archivo() throws IOException {
        contenido = lector.leerArchivo();
    }

    @Then("Mostrar contenido del archivo")
    public void mostrar_contenido_del_archivo() {
        System.out.println(contenido);
    }

    @And("Cerrar archivo")
    public void cerrar_archivo() throws IOException {
        lector.cerrarArchivo();
    }
}