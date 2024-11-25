package udla.grupo1.gestionhotel;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return "Reserva: Cliente: " + cliente.getNombre() + " " + cliente.getApellido() +
                ", Habitación: " + habitacion.getNumero() +
                ", Desde: " + fechaInicio + " Hasta: " + fechaFin;
    }
}
