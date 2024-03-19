package lab1.c2_tp2.pkg2024;

/* Autor Martin Nicolas Piriz Dutra */
public class Perro extends Mascotas {
    String comida;

    public Perro(String nombre, String raza, int edad, String comida) {
        super(nombre, raza, edad);
        this.comida = comida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    @Override
    public void Alimentarse() {
        System.out.println(getNombre() + " come: " + comida);

    }

    @Override
    public void Saludar() {
        System.out.println("Hola soy " + getNombre());
    }

}
