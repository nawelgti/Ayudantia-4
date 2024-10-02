package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String ISBN;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro(String titulo, String autor, String genero, String ISBN, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = ISBN;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void prestar() {
        if (this.disponible) {
            this.cantidadDisponible--;
            if (this.cantidadDisponible == 0) {
                this.disponible = false;
            }
            System.out.println("El libro '" + this.getTitulo() + "' ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }
}