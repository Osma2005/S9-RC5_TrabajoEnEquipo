package udla.grupo1.serviciopublico;

import java.util.Scanner;

public class serviciopublico {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Suministro suministro = new Suministro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de servicios públicos");
        System.out.print("Ingrese su nombre: ");
        usuario.setNombre(scanner.nextLine());
        System.out.print("Ingrese su apellido: ");
        usuario.setApellido(scanner.nextLine());

        System.out.println("Elija qué suministro desea solicitar: \n 1 -> Agua  \t 2 -> Luz");
        int eleccion = scanner.nextInt();
        usuario.setEleccion(eleccion);

        if (eleccion == 1) {
            suministro.setTipoSuministro("Agua");
            suministro.setTarifa(0.50); // Tarifa por m3
        } else if (eleccion == 2) {
            suministro.setTipoSuministro("Luz");
            suministro.setTarifa(0.75); // Tarifa por kWh
        } else {
            System.out.println("Opción incorrecta");
            return;
        }

        System.out.println("Suministro seleccionado: " + suministro.getTipoSuministro());

        System.out.print("Ingrese el consumo mensual en unidades (m3 para agua o kWh para luz): ");
        double consumo = scanner.nextDouble();
        suministro.setConsumo(consumo);

        double factura = suministro.calcularFactura();
        System.out.println("El monto de su factura es: $" + factura);

        System.out.print("Ingrese el monto que desea pagar: ");
        double pago = scanner.nextDouble();

        Pago registroPago = new Pago();
        registroPago.setMontoPagado(pago);

        if (pago >= factura) {
            System.out.println("Pago exitoso. Gracias por su pago.");
        } else {
            System.out.println("Pago incompleto. Su saldo pendiente es: $" + (factura - pago));
        }

        System.out.println("Estado de la cuenta:");
        System.out.println("Cliente: " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("Suministro: " + suministro.getTipoSuministro());
        System.out.println("Consumo mensual: " + consumo + " unidades");
        System.out.println("Monto pagado: $" + registroPago.getMontoPagado());
        System.out.println("Saldo pendiente: $" + (factura - registroPago.getMontoPagado()));
    }
}
