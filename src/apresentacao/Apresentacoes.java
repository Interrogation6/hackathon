package apresentacao;

import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instancia;
    private List<Apresentacao> apresentacoes;
    private Apresentacoes() {
        this.apresentacoes = new ArrayList<Apresentacao>();
    }

    public static Apresentacoes getInstance() {
        if (instancia == null) {
            instancia = new Apresentacoes();
        }
        return instancia;
    }

    public List<Apresentacao> getApresentacoes() {
        return apresentacoes;
    }
}
