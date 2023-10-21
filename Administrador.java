
/**
 * @author Valentina Galeano | Nelson Barboza 
 * @version 1.0
 */

import java.util.Date;
import java.util.List;

public class Administrador extends Persona {
    public Administrador(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    public void gestionarCuentasUsuario() {
        System.out.println(getNombre() + " está gestionando cuentas de usuario.");
    }

    public Torneo registrarNuevoTorneo() {
        Torneo nuevoTorneo = new Torneo("Nombre del Torneo", new Date(), "Ubicación del Torneo", List.of("Categoría A", "Categoría B"));
        System.out.println(getNombre() + " ha registrado un nuevo torneo: " + nuevoTorneo.getNombre());
        return nuevoTorneo;
    }

    public void planificarDesarrolloTorneo(Torneo torneo) {
        System.out.println(getNombre() + " está planificando el desarrollo del torneo: " + torneo.getNombre());
    }
}


