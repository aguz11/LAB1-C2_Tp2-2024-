package lab1.c2_tp2.pkg2024;

/* 
 * Clase Perro hereda de la clase Mascota

 * @author: Martin Nicolas Piriz Dutra

 * @version: 1 20-03-24

 * @see <a href = "https://github.com/aguz11/LAB1-C2_Tp2-2024-.git" /> Repositorio </a>

 */
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
