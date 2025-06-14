package pessoa;

import instituicao.Instituicao;

public class Profissional extends Pessoa {
    public Profissional(String nome, Instituicao instituicao) {
        this.instituicao = instituicao;
        this.nome = nome;
    }
}
