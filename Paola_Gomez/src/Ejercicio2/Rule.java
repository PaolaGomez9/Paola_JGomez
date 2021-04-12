
package Ejercicio2;


public class Rule {
     private String nombre;
     private int PosicionInicio;
     private int PosicionFinal;
     private String Descripcion;
    
    public Rule(){
    
    
    } 
     
     
     
    public Rule(String nombre, int PosicionInicio, int PosicionFinal, String Descripcion) {
        this.nombre = nombre;
        this.PosicionInicio = PosicionInicio;
        this.PosicionFinal = PosicionFinal;
        this.Descripcion = Descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionInicio() {
        return PosicionInicio;
    }

    public void setPosicionInicio(int PosicionInicio) {
        this.PosicionInicio = PosicionInicio;
    }

    public int getPosicionFinal() {
        return PosicionFinal;
    }

    public void setPosicionFinal(int PosicionFinal) {
        this.PosicionFinal = PosicionFinal;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
