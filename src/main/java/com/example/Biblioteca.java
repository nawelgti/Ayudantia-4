package com.example;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public ArrayList<Libro> agregarLibro(Libro libro) {
        for (int i=0; i<libros.size(); i++) {
            if (libros.get(i).getISBN().equals(libro.getISBN())) {
                libros.get(i).setCantidadDisponible(libro.getCantidadDisponible()+1);
            } else {
                libros.add(libro);
            }
        }
        return libros;
    }

    public void mostrarLibrosDisponibles() {
        for (int i=0; i<libros.size(); i++) {
            if (libros.get(i) != null) {
                System.out.println("Titulo: '"+libros.get(i).getTitulo()+"'");
                System.out.println("Autor: '"+libros.get(i).getAutor()+"'");
                System.out.println("Cantidad disponible: '"+libros.get(i).getCantidadDisponible()+"'");
            }
        }
    }
}
