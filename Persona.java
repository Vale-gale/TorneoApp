
/**
 * @author Valentina Galeano | Nelson Barboza 
 * @version 1.0
 */
public class Persona {
    private String nombre;
    private String correo;
    private String contrasena;

    public Persona(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void inscribirseEnTorneo(Torneo torneo) {
        System.out.println(nombre + " se ha inscrito en el torneo: " + torneo.getNombre());
    }

    public void accederSeguimientoResultados() {
        System.out.println(nombre + " está accediendo al seguimiento de resultados.");
    }
}


