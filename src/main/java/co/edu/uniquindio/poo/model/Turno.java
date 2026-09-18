package co.edu.uniquindio.poo.model;

public class Turno {
    private int numero;
    private Paciente paciente;
    private AdministradorTurno administradorTurno;

    public Turno(int numero, Paciente paciente, AdministradorTurno administradorTurno) {
        this.numero = numero;
        this.paciente = paciente;
        this.administradorTurno = administradorTurno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public AdministradorTurno getAdministradorTurno() {
        return administradorTurno;
    }

    public void setAdministradorTurno(AdministradorTurno administradorTurno) {
        this.administradorTurno = administradorTurno;
    }
}
