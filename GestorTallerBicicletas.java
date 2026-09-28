import java.util.ArrayList;
import java.util.List;


public class GestorTallerBicicletas {

}
private final List<Bicicleta> bicicletas = new ArrayList<>();


    public void registrar(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        System.out.print(bicicleta.getCodigo() + " (" + bicicleta.getClass().getSimpleName()
                + ") registrada correctamente.");
    }

    public List<Bicicleta> buscarPorCodigo(String criterio) {
        List<Bicicleta> encontradas = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getCodigo().equalsIgnoreCase(criterio)) {
                encontradas.add(bicicleta);
            }
        }
        return encontradas;
    }


    public List<Bicicleta> obtenerTodas() {
        return bicicletas;
    }

void main() {
}

