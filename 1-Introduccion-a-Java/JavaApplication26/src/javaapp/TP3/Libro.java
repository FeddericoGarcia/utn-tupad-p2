package javaapp.TP3;

public class Libro {
    private String titulo, autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = 2025;
        if(anioPublicacion <= anioActual){    
            this.anioPublicacion = anioPublicacion;
        }
    }
}
