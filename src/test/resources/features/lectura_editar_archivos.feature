Feature: Lectura de archivos

  Scenario: Leer archivo de texto (.txt)
    Given Abrir archivo "src/test/resources/File/archivo.txt"
    And Leer archivo
    Then Mostrar contenido del archivo
    And Cerrar archivo

  Scenario: Editar archivo de texto (.txt)
    Given Abrir archivo "src/test/resources/File/archivo.txt"
    And Editar archivo agregando "Hola Mundo"
    When Guardar cambios en el archivo
    Then Cerrar archivo