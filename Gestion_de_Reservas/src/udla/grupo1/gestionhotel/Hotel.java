package udla.grupo1.gestionhotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Habitacion consultarDisponibilidad(String tipo) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getTipo().equals(tipo) && !habitacion.isOcupada()) {
                return habitacion;
            }
        }
        return null; // No hay habitaciones disponibles
    }

    public void mostrarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }
    }
}
