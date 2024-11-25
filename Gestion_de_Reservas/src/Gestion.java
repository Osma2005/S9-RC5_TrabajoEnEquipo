import udla.grupo1.gestionhotel.Cliente;
import udla.grupo1.gestionhotel.Habitacion;
import udla.grupo1.gestionhotel.Hotel;
import udla.grupo1.gestionhotel.Reserva;

import java.util.Scanner;

public class Gestion {

        public static void main(String[] args) {
            Hotel hotel = new Hotel();
            hotel.agregarHabitacion(new Habitacion(101, "Simple"));
            hotel.agregarHabitacion(new Habitacion(102, "Doble"));
            hotel.agregarHabitacion(new Habitacion(201, "Suite"));

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido al sistema de reservas de hotel.");
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese su apellido: ");
            String apellido = scanner.nextLine();
            Cliente cliente = new Cliente(nombre, apellido);

            System.out.println("Tipos de habitación disponibles: Simple, Doble, Suite");
            System.out.print("Seleccione el tipo de habitación: ");
            String tipo = scanner.nextLine();

            Habitacion habitacionDisponible = hotel.consultarDisponibilidad(tipo);

            if (habitacionDisponible != null) {
                System.out.println("Habitación disponible: " + habitacionDisponible);
                System.out.print("Ingrese la fecha de inicio (YYYY-MM-DD): ");
                String fechaInicio = scanner.nextLine();
                System.out.print("Ingrese la fecha de fin (YYYY-MM-DD): ");
                String fechaFin = scanner.nextLine();

                Reserva reserva = new Reserva(cliente, habitacionDisponible, fechaInicio, fechaFin);
                habitacionDisponible.setOcupada(true);

                System.out.println("¡Reserva exitosa!");
                System.out.println(reserva);
            } else {
                System.out.println("No hay habitaciones disponibles del tipo seleccionado.");
            }

            System.out.println("\nEstado de habitaciones:");
            hotel.mostrarHabitaciones();
        }
    }

