package lab1.c2_tp2.pkg2024;

/* Autor Rocio Dell Elice  */

public class Gato {

    private String nombre;
    private int edad;
    private String color;

    public Gato(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public void maullar() {
        System.out.println("¡Miau!");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

}
