package pessoa;

import instituicao.Instituicao;

public class Estudante extends Pessoa {
    public Estudante(String nome, Instituicao instituicao) {
        this.instituicao = instituicao;
        this.nome = nome;
    }
}
