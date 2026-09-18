package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public final class Hospital {
    private String nombre;
    private List<Paciente> listPacientes;
    private List<Turno> listTurnos;
    private AdministradorTurno administrador;
    private static Hospital instance;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.listTurnos = new ArrayList<>();
        this.listPacientes = new ArrayList<>();
        this.administrador = administrador;
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital("SalvaVidas");
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(List<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    public List<Turno> getListTurnos() {
        return listTurnos;
    }

    public void setListTurnos(List<Turno> listTurnos) {
        this.listTurnos = listTurnos;
    }

    public AdministradorTurno getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorTurno administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", listPacientes=" + listPacientes +
                ", listTurnos=" + listTurnos +
                ", administrador=" + administrador +
                '}';
    }

    public List<Paciente> registrarPacientes(Paciente paciente) {
        if (paciente.getCedula() != null) {
            boolean yaExiste = this.listPacientes.stream()
                    .anyMatch(p -> p.getCedula().equals(paciente.getCedula()));

            if (!yaExiste) {
                this.listPacientes.add(paciente);
            } else {
                System.out.println("El paciente ya está registrado.");
            }
        }
        return listPacientes;
    }

    public List<Turno> registrarTurnos(Turno turno) {
        if (turno != null) {
            boolean yaExiste = this.listTurnos.stream()
                    .anyMatch(t -> t.getNumero() == (turno.getNumero()));

            if (!yaExiste) {
                this.listTurnos.add(turno);
            } else {
                System.out.println("El paciente ya está registrado.");
            }
        }
        return listTurnos;
    }

}
