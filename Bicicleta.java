public abstract class Bicicleta {

    private String codigo;
    private int añoFabricacion;
    private double peso;

    public Bicicleta(String codigo, int añoFabricacion, double peso) {
        setCodigo(codigo);
        setAnioFabricacion(añoFabricacion);
        setPeso(peso);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de la bicicleta no puede ser nulo ni vacío.");
        }
        this.codigo = codigo;
    }

    public int getAnioFabricacion() {
        return añoFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 2000 || anioFabricacion > 2026) {
            throw new IllegalArgumentException("El año de fabricación debe estar entre 2000 y 2026.");
        }
        this.añoFabricacion = anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor mayor que cero.");
        }
        this.peso = peso;
    }


    public abstract double calcularCostoMantencion();


    public abstract String getTipo();


    protected abstract String obtenerDetalleEspecifico();


    public String mostrarInformacionCompleta() {
        return String.format(
                "Tipo: %s | Código: %s | Año: %d | Peso: %.1f kg | %s | Costo mantención: $%.0f",
                getTipo(), getCodigo(), getAnioFabricacion(), getPeso(),
                obtenerDetalleEspecifico(), calcularCostoMantencion());
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Año: " + añoFabricacion; }
}
