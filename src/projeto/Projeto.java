package projeto;

import pessoa.Equipe;
import pessoa.Profissional;

public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private float notaFinal;
    private String nome;

    public Projeto(String nome, Profissional orientador, Equipe equipe) {
        this.nome = nome;
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0;
    }

    public String getNome() {
        return nome;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
}
