/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author chent
 */
public class Personas {
    private String Miembro;//Alumno,Maestro,Intendencia;
    private String Nombre;
    private int edad;
    private char sexo;
    private String curp;

    public Personas() {
    }

    public Personas(String Miembro, String Nombre, int edad, char sexo, String curp) {
        this.Miembro = Miembro;
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.curp = curp;
    }

    public String getMiembro() {
        return Miembro;
    }

    public void setMiembro(String Miembro) {
        this.Miembro = Miembro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Personas{" + "Miembro=" + Miembro + ", Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", curp=" + curp + '}';
    }

}
