package co.edu.uniquindio.poo.model;

import java.util.List;

public final class AdministradorTurno {
    private int numeroTurnos;
    private static AdministradorTurno instance;
    private List<Turno> listTurnos;

    public AdministradorTurno() {
        this.numeroTurnos = numeroTurnos;
    }

    public static AdministradorTurno getInstance(){
        if(instance==null){
            instance = new AdministradorTurno();
        }
        return instance;
    }

    public int getNumeroTurnos() {
        return numeroTurnos;
    }

    public void setNumeroTurnos(int numeroTurnos) {
        this.numeroTurnos = numeroTurnos;
    }

    public List<Turno> getListTurnos() {
        return listTurnos;
    }

    public void setListTurnos(List<Turno> listTurnos) {
        this.listTurnos = listTurnos;
    }


}
