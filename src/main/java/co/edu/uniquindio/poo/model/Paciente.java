package co.edu.uniquindio.poo.model;

import java.util.List;

public class Paciente {
    private String nombre;
    private String cedula;
    private List<Turno> listTurnos;

    public Paciente(String nombre, String cedula, List<Turno> listTurnos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listTurnos = listTurnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Turno> getListTurnos() {
        return listTurnos;
    }

    public void setListTurnos(List<Turno> listTurnos) {
        this.listTurnos = listTurnos;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", listTurnos=" + listTurnos +
                '}';
    }
}
