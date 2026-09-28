public abstract class BicicletaElectrica

        extends Bicicleta implements ConGarantiaExtendida {

    private static final double COSTO_BASE = 45000;
    private static final double RECARGO_BATERIA_NO_CERTIFICADA = 0.25;

    private double autonomiaKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;

    public BicicletaElectrica(String codigo, int añoFabricacion, double peso,
                              double autonomiaKm, boolean bateriaCertificada) {
        super(codigo, añoFabricacion, peso);
        setAutonomiaKm(autonomiaKm);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaExtendidaActiva = false;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public boolean tieneGarantiaExtendida(){
        return garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendidaActiva = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = COSTO_BASE;
        if (!bateriaCertificada) {
            costo += costo * RECARGO_BATERIA_NO_CERTIFICADA;
        }
        return costo;
    }

    @Override
    public String getTipo() {
        return "Bicicleta Eléctrica";
    }

    @Override
    protected String obtenerDetalleEspecifico() {
        return "Autonomia: " + (int) autonomiaKm + " km | Batería certificada: "
                + (bateriaCertificada ? "Si" : "No") + " | Garantia extendida: "
                + (garantiaExtendidaActiva ? "Si" : "No");
    }
}

