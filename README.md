# parcial-1
## Parcial I | Programación II 
## Nombre: Juan Fernando Lenis Acosta
## Grupo: 412
## Docente: Gabriel Pérez Moreno
## Fecha: 10 de marzo de 2026

# Algoritmo

Iniciamos 

1. Crear Libro1 con constructor parametrizado 
2. Crear Libro2 con constructor por defecto
3. Solicitar datos para libro2
4. Crear LibroTextoUNIAJC con atributos
5. Crear Novela indicando el tipo
6. Mostrar información de los libros creados (objetos)
7. Probar método de prestar
8. Probar método de devolución

Finalizamos

-------------------------------------------------------------------------

## Ejemplo 1 — Clase final
public final class Libro {
}
Si Libro es final, ninguna clase puede heredar de ella.

Entonces esto nos puede dar este error:
public class LibroTexto extends Libro { } 

## Ejemplo 2 — Constructor privado
public class Libro {
    private Libro() { }
}

Si el constructor de la base es privado, no podemos utilizarlo desde una clase hija

Entonces esto también falla:
public class LibroTexto extends Libro { }

## Nuevos atributos y método adicional
Ejemplos:

###  Nuevos atributos posibles

editorial → para guardar qué editorial publicó el libro.

FechaPublicacion → para guardar el año de publicación.

private String editorial;
private int FechaPublicacion;

### Método adicional

Por ejemplo, un método para ver cuántos ejemplares quedan disponibles:

public int ejemplaresDisponibles() {
    return numeroEjemplares - numeroPrestados;
}

Este método nos puede ayudar a inhabilitar o habilitar préstamos en dado caso de que queden o no queden libros disponibles según se haya escogido.
