package pe.uni.fiis.horarios.bean;

/**
 * Created by Henry on 05/06/2015.
 */
public class Vuelo {
    private String IdVuelo;
    private String Nombre;

    public String getIdVuelo() {
        return IdVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        IdVuelo = idVuelo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Vuelo(String idVuelo, String nombre) {
        IdVuelo = idVuelo;
        Nombre = nombre;
    }
}
