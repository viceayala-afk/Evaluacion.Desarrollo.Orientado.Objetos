public class BicicletaMonaña {
    public static class BicicletaMontana extends Bicicleta {

        private static final double COSTO_BASE = 30000;
        private static final double RECARGO_SUSPENSIONES = 0.15;

        private int cantidadSuspensiones;

        public BicicletaMontana(String codigo, int añoFabricacion, double peso,
                                int cantidadSuspensiones) {
            super(codigo, añoFabricacion, peso);
            setCantidadSuspensiones(cantidadSuspensiones);
        }

        public int getCantidadSuspensiones() {
            return cantidadSuspensiones;
        }

        public void setCantidadSuspensiones(int cantidadSuspensiones) {
            this.cantidadSuspensiones = cantidadSuspensiones;
        }

        @Override
        public double calcularCostoMantencion() {
            double costo = COSTO_BASE;
            if (cantidadSuspensiones > 1) {
                costo += costo * RECARGO_SUSPENSIONES;
            }
            return costo;
        }

        @Override
        public String getTipo() {
            return "Bicicleta de Montaña";
        }

        @Override
        protected String obtenerDetalleEspecifico() {
            return "Suspensiones: " + cantidadSuspensiones;
        }
    }
}

