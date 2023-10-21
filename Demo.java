
/**
 * @author Valentina Galeano | Nelson Barboza 
 * @version 1.0
 */

import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Participante participante = new Participante("Juan", "juan@example.com", "password");
        participante.inscribirseEnTorneo(new Torneo("Torneo de prueba", new Date(), "Ubicación de prueba", List.of("Categoría C")));

        Administrador administrador = new Administrador("Admin", "admin@example.com", "admin123");
        Torneo nuevoTorneo = administrador.registrarNuevoTorneo();
        administrador.planificarDesarrolloTorneo(nuevoTorneo);

        System.out.println("\n----- Resultado del Demo -----\n");

        System.out.println("Información del participante:");
        System.out.println("Nombre: " + participante.getNombre());
        System.out.println("Correo: " + participante.getCorreo());

        System.out.println("\nInformación del administrador:");
        System.out.println("Nombre: " + administrador.getNombre());
        System.out.println("Correo: " + administrador.getCorreo());

        System.out.println("\nInformación del torneo registrado por el administrador:");
        System.out.println("Nombre del Torneo: " + nuevoTorneo.getNombre());
        System.out.println("Fecha del Torneo: " + nuevoTorneo.getFecha());
        System.out.println("Ubicación del Torneo: " + nuevoTorneo.getUbicacion());
        System.out.println("Categorías del Torneo: " + nuevoTorneo.getCategorias());
    }
}


