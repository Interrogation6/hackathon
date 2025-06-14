package projeto;

import java.util.ArrayList;
import java.util.List;

public class Projetos {
    private static Projetos instancia;
    private List<Projeto> projetos;

    private Projetos() {
        this.projetos = new ArrayList<Projeto>();
    }

    public static Projetos getInstance() {
        if (instancia == null) {
            instancia = new Projetos();
        }
        return instancia;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void addProjeto(Projeto projeto) {
        this.projetos.add(projeto);
    }

    public void removeProjeto(Projeto projeto) {
        if (!this.projetos.contains(projeto)) {
            System.out.println("Projeto não encontrado.");
            return;
        }
        this.projetos.remove(projeto);
    }
}
