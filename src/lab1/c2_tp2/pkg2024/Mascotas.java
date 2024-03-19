
package lab1.c2_tp2.pkg2024;

    //Agustin Jofre.

public abstract class Mascotas {
    protected String nombre;
    protected String raza;
    protected int edad;

    public Mascotas(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void Alimentarse();
    
    public abstract void Saludar();
    
}
