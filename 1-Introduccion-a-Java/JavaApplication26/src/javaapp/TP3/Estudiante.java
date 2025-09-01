package javaapp.TP3;

public class Estudiante {
    
    private String nombre, apellido, curso;
    private float calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion >= 0 ? calificacion : 0;
    }
    
    public void subirCalificacion(float puntos){
        this.calificacion += puntos;
    }
    
    public void bajarCalificacion(float puntos){
        this.calificacion -= puntos;
    }

    public String mostrarInfo(){
        return "Nombre:" + this.nombre +
                "\nApellido: "+ this.apellido +
                "\nCurso: "+ this.curso +
                "\nCalificación: "+ this.calificacion;
    }
}
