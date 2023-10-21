
/**
 * @author Valentina Galeano | Nelson Barboza 
 * @version 1.0
 */

import java.util.Date;
import java.util.List;

public class Torneo {
    private String nombre;
    private Date fecha;
    private String ubicacion;
    private List<String> categorias;

    public Torneo(String nombre, Date fecha, String ubicacion, List<String> categorias) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void gestionarInformacion() {
        System.out.println("Gestión de información para el torneo: " + nombre);
    }

    public void planificarPartidos() {
        System.out.println("Planificación de partidos para el torneo: " + nombre);
    }

    public void registrarResultados() {
        System.out.println("Registro de resultados para el torneo: " + nombre);
    }
}


