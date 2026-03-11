package com.biblioteca;
public class LibroTextoUNIAJC extends LibroTexto {
private String facultad;
public LibroTextoUNIAJC () {
}
public LibroTextoUNIAJC(String titulo, String autor, int numeroEjemplares, int numeroPrestados, String curso, String facultad) {
super(titulo, autor, numeroEjemplares, numeroPrestados, curso);
this.facultad = facultad;
}
public String getFacultad() {
return facultad;
}
public void setFacultad(String facultad) {
this.facultad = facultad;
}
@Override
public String toString() {
return super.toString() + "\nFacultad: " + facultad;
}
}