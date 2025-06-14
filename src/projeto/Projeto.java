package projeto;

import pessoa.Equipe;
import pessoa.Profissional;

public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;
    private String nome;
    public Projeto(String nome, Profissional orientador, Equipe equipe) {
        this.nome = nome;
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0;
    }
}
