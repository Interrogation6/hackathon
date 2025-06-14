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

    public void addEquipe(Equipe equipe) {
        this.equipes.add(equipe);
    }

    public void removeEquipe(Equipe equipe) {
        if (!this.equipes.contains(equipe)) {
            System.out.println("Equipe não encontrada.");
            return;
        }
        this.equipes.remove(equipe);
    }
}
