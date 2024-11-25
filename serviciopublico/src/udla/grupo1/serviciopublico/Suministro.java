package udla.grupo1.serviciopublico;

public class Suministro {
    private String tipoSuministro; // "Agua" o "Luz"
    private double tarifa; // Tarifa por unidad de consumo
    private double consumo; // Consumo mensual registrado

    public String getTipoSuministro() {
        return tipoSuministro;
    }

    public void setTipoSuministro(String tipoSuministro) {
        this.tipoSuministro = tipoSuministro;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double calcularFactura() {
        return tarifa * consumo;
    }
}
