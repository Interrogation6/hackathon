package pessoa;

import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instancia;
    private List<Equipe> equipes;

    private Equipes() {
        this.equipes = new ArrayList<Equipe>();
    }

    public static Equipes getInstance() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
}
