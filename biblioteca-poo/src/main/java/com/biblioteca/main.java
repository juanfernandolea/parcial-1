package com.biblioteca;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("=== SISTEMA DE BIBLIOTECA ===");
System.out.print("Ingrese el título del libro: ");
String titulo = entrada.nextLine();
System.out.print("Ingrese el autor del libro: ");
String autor = entrada.nextLine();
System.out.print("Ingrese número de ejemplares: ");
int ejemplares = entrada.nextInt();
System.out.print("Ingrese número de libros prestados: ");
int prestados = entrada.nextInt();
Libro libro1 = new Libro(titulo, autor, ejemplares, prestados);
System.out.println("\nLibro creado:");
System.out.println(libro1);
System.out.println("\nIntentando realizar un préstamo...");
if (libro1.prestamo()) {
System.out.println("Préstamo realizado correctamente.");
} else {
System.out.println("No hay ejemplares disponibles.");
}
System.out.println("\nEstado del libro:");
System.out.println(libro1);
entrada.close();
}
}