package pessoa;
import instituicao.Instituicao;

public abstract class Pessoa {
    protected Instituicao instituicao;
    protected String nome;
    
    public String getNome() {
        return nome;
    }
}
