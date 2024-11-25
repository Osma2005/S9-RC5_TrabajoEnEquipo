import udla.grupo1.gestionhotel2.Cliente;
import udla.grupo1.gestionhotel2.Habitacion;
import udla.grupo1.gestionhotel2.Hotel;
import udla.grupo1.gestionhotel2.Reserva;

import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        hotel.agregarHabitacion(new Habitacion(101, "Simple"));
        hotel.agregarHabitacion(new Habitacion(102, "Doble"));

        System.out.println("Bienvenido al sistema de reservas de hotel.");

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido);


        System.out.println("\nEstado inicial del hotel:");
        System.out.println(hotel);


        System.out.print("\nIngrese el tipo de habitación que desea reservar (Simple/Doble): ");
        String tipoHabitacion = scanner.nextLine();


        Habitacion habitacionDisponible = hotel.buscarHabitacionDisponible(tipoHabitacion);

        if (habitacionDisponible != null) {
            habitacionDisponible.setOcupada(true);
            Reserva reserva = new Reserva(cliente, habitacionDisponible);
            System.out.println("\nReserva creada: " + reserva);
        } else {
            System.out.println("\nLo sentimos, no hay habitaciones disponibles del tipo solicitado.");
        }


        System.out.println("\nEstado final del hotel:");
        System.out.println(hotel);

        scanner.close();
    }
}
