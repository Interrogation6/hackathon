package apresentacao;

import java.time.LocalDateTime;

import projeto.*;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Avaliavel banca, LocalDateTime horario) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = new Sala("Sala Principal"); // Exemplo de sala
        this.dataHora =  horario;// Data e hora atual
    }

    public Apresentacao(Projeto projeto, Avaliavel banca) {
        this(projeto, banca, LocalDateTime.now());
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Avaliavel getBanca() {
        return banca;
    }

    public Sala getLocal() {
        return local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void avaliar() {
        if (banca == null || projeto == null) {
            System.out.println("Avaliação não pode ser realizada. Banca ou projeto não definidos.");
            return;
        }
        float notaFinal = banca.calcularNotaFinal();
        projeto.setNotaFinal(notaFinal);
        //System.out.println("Avaliação concluída. Nota final: " + notaFinal);
    }
}
