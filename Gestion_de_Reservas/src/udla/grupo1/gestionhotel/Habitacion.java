package udla.grupo1.gestionhotel;

public class Habitacion {
    private int numero;
    private String tipo; // Ejemplo: "Simple", "Doble", "Suite"
    private boolean ocupada;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") - " + (ocupada ? "Ocupada" : "Disponible");
    }
}
