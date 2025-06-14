package projeto;

import java.util.HashMap;
import java.util.Map;
import pessoa.Jurado;

public class Banca implements Avaliavel{
    private String nome;
    private Projeto projetoAvaliado;
    private Map<Jurado,Integer> jurados;

    public Banca(String nome, Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public Jurado getJurado(String nome) {
        for (Jurado jurado : jurados.keySet()) {
            if (jurado.getNome().equals(nome)) {
                return jurado;
            }
        }
        return null; // Retorna null se o jurado não for encontrado
    }

    public void setNotaJurado(Jurado jurado, int nota) {
        if(nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
            return;
        }
        if (jurados.containsKey(jurado)) {
            jurados.put(jurado, nota);
        } else {
            System.out.println("Jurado não encontrado na banca.");
        }
    }

    public void addJurado(Jurado jurado) {
        if (jurados.size() < 4) {
            jurados.put(jurado, 0); // Inicializa a nota do jurado como 0
        } else {
            System.out.println("A banca já possui 4 jurados.");
        }
    }

    public void removeJurado(Jurado jurado) {
        if (jurados.containsKey(jurado)) {
            jurados.remove(jurado);
        } else {
            System.out.println("Jurado não encontrado na banca.");
        }
    }

    public float calcularNotaFinal() {
        if(jurados.size() < 4) {
            System.out.println("A banca deve ter 4 jurados para calcular a nota final.");
            return 0;
        }

        float somaNotas = 0;
        for (Integer nota : jurados.values()) {
            somaNotas += nota;
        }
        float notaFinal = somaNotas / jurados.size();
        projetoAvaliado.setNotaFinal(notaFinal);
        return notaFinal;
    }
}
