package pe.uni.fiis.horarios.bean;

import java.util.Date;

/**
 * Created by Henry on 05/06/2015.
 */
public class Salidas extends Vuelo{
    private String Destino;
    private Date Partida;

    public Salidas(String idVuelo, String nombre, String destino, Date partida) {
        super(idVuelo, nombre);
        Destino = destino;
        Partida = partida;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public Date getPartida() {
        return Partida;
    }

    public void setPartida(Date partida) {
        Partida = partida;
    }
}
