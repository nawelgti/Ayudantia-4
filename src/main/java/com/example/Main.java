package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("biblioteca");

        Libro libro1 = new Libro("Harry Potter 1","JK Rowling", "Fantasía", "A1",5,true);
        Libro libro2 = new Libro("El principito", "Antoine", "No se", "A2", 3,true);
        Libro libro3 = new Libro("Libro Troll", "rubius", "troll", "A3", 1, true);
        Libro libro4 = new Libro("Snif", "Villano", "Novela", "A4", 0,false);
        Libro libro5 = new Libro("Harry Potter 2","JK Rowling", "Fantasía", "A5",2,true);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        System.out.println();

        biblioteca.mostrarLibrosDisponibles();

        biblioteca.prestarLibro("Libro Troll");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.devolverLibro("Libro Troll");
        biblioteca.mostrarLibrosDisponibles();

        biblioteca.buscarLibroPorTitulo("Libro Troll");

        biblioteca.buscarLibrosPorAutor("JK Rowling");

        biblioteca.eliminarLibro("Snif");
        biblioteca.mostrarLibrosDisponibles();
    }
}
