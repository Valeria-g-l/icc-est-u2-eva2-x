package models;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    
    @Override
    public int compareTo(Book other) {
        int tituloComp = other.titulo.compareTo(this.titulo);
        if (tituloComp != 0) return tituloComp;
        return Integer.compare(this.anio, other.anio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.titulo.equals(other.titulo) && this.anio == other.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio);
    }

    @Override
    public String toString() {
        return titulo + " *** " + autor + " (" + anio + ")";
    }
}
