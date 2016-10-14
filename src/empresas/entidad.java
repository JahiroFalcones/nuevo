/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresas;

/**
 *
 * @author Jahiroj
 */
public class entidad {
    private String idProfesor;
     private String nombre;
     private int salario;
     
     public entidad() {
    }

    public entidad(String idProfesor, String nombre, int Salario) {
       this.idProfesor = idProfesor;
       this.salario= salario;
       this.nombre = nombre;
}
    
     public String getIdProfesor() {
        return this.idProfesor;
    }
    
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getsalario() {
        return this.salario;
    }
    
    public void setsalario(int salario) {
        this.salario = salario;
    }
    
    }
