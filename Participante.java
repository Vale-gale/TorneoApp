/**
 * @author Valentina Galeano | Nelson Barboza 
 * @version 1.0
 */
public class Participante extends Persona {
    public Participante(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    public void participarEnPartidos() {
        System.out.println(getNombre() + " está participando en partidos.");
    }

    public void consultarResultadosPersonales() {
        System.out.println(getNombre() + " está consultando sus resultados personales.");
    }
}


