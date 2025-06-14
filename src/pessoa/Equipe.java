package pessoa;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Estudante> estudantes;

    public Equipe() {
        this.estudantes = new ArrayList<Estudante>();
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
    
    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void removeEstudante(Estudante estudante) {
        if (!this.estudantes.contains(estudante)) {
            System.out.println("Estudante não encontrado na equipe.");
            return;
        }
        this.estudantes.remove(estudante);
    }
}
