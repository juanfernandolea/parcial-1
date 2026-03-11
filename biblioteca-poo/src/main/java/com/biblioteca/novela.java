package com.biblioteca;
public class Novela extends Libro {
public enum Tipo {
HISTORICA,
ROMANTICA,
POLICIACA,
REALISTA,
CIENCIA_FICCION,
AVENTURAS
}
private Tipo tipo;
public Novela() {
}
public Novela(String titulo, String autor, int numeroEjemplares, int numeroPrestados, Tipo tipo) {
super(titulo, autor, numeroEjemplares, numeroPrestados);
this.tipo = tipo;
}
public Tipo getTipo() {
return tipo;
}
public void setTipo(Tipo tipo) {
this.tipo = tipo;
}
@Override
public String toString() {
return super.toString() + "\nTipo de novela: " + tipo;
}
}