Feature: Lectura de archivos

  Scenario: Crear archivo de texto (.txt)
    Given Crear archivo "src/test/resources/File/archivo.txt"
    And Escribir en el archivo "Hola Mundo"
    When Guardar cambios en el archivo
    Then Cerrar archivo

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

  Scenario: Eliminar archivo de texto (.txt)
    Given Abrir archivo "src/test/resources/File/archivo.txt"
    And Eliminar archivo
    Then Verificar que el archivo no existe
    And Cerrar archivo
