package projeto;

import java.util.ArrayList;
import java.util.List;

public class Bancas {
    private static Bancas instancia;
    private List<Banca> bancas;
    
    private Bancas() {
        this.bancas = new ArrayList<>();
    }

    public static Bancas getInstance() {
        if (instancia == null) {
            instancia = new Bancas();
        }
        return instancia;
    }

    public List<Banca> getBancas() {
        return bancas;
    }
}
