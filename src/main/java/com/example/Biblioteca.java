package com.example;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        boolean encontrado = false;
        for (Libro l: libros) {
            if (l.getISBN().equals(libro.getISBN())) {
                l.setCantidadDisponible(l.getCantidadDisponible() + 1);
                System.out.println("Se ha agregado una unidad de '" + l.getTitulo() + "'");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            libros.add(libro);
            System.out.println("Se ha agregado el libro '"+ libro.getTitulo() + "'");
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Listado de libros disponibles: ");
        for (Libro libro: libros) {
            if (libro.getDisponible()) {
                libro.mostrarInfo();
                System.out.println();
            }
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro: libros) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("Resultados de '"+titulo+"'");
                libro.mostrarInfo();
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) { System.out.println("No se han encontrado resultados"); }
    }

    public void buscarLibrosPorAutor(String autor) {
        boolean encontrado = false;
        System.out.println("Resultados de '"+autor+"'");
        for (Libro libro: libros) {
            if (libro.getAutor().equals(autor)) {
                libro.mostrarInfo();
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) { System.out.println("No se han encontrado resultados\n"); }
    }

    public void eliminarLibro(String titulo) {
        boolean encontrado = false;
        for (Libro libro: libros) {
            if (libro.getTitulo().equals(titulo) && libro.getCantidadDisponible() == 0) {
                libros.remove(libro);
                System.out.println("Libro '"+titulo+"' eliminado\n");
                encontrado = true;
            }
        }
        if (!encontrado) { System.out.println("Libro no encontrado\n"); }
    }

    public void prestarLibro(String titulo) {
        boolean encontrado = false;
        for (Libro libro: libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.prestar();
                encontrado = true;
            }
        }
        if (!encontrado) { System.out.println("Libro no encontrado"); }
    }

    public void devolverLibro(String titulo) {
        boolean encontrado = false;
        for (Libro libro: libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.devolver();
                encontrado = true;
            }
        }
        if (!encontrado) { System.out.println("Libro no encontrado"); }
    }
}
