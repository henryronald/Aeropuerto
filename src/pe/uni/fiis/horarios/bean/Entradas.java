package pe.uni.fiis.horarios.bean;

import java.util.Date;

/**
 * Created by Henry on 05/06/2015.
 */
public class Entradas extends Vuelo {
    private String LugarOrigen;
    private Date Llegada;

    public Entradas(String idVuelo, String nombre, String lugarOrigen, Date llegada) {
        super(idVuelo, nombre);
        LugarOrigen = lugarOrigen;
        Llegada = llegada;
    }

    public String getLugarOrigen() {
        return LugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        LugarOrigen = lugarOrigen;
    }

    public Date getLlegada() {
        return Llegada;
    }

    public void setLlegada(Date llegada) {
        Llegada = llegada;
    }
}
