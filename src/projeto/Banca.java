package projeto;

import java.util.Map;
import pessoa.Jurado;

public class Banca implements Avaliavel{
    private Projeto projetoAvaliado;
    private Map<Jurado,Integer> jurados;

    public void calcularNotaFinal() {
        int somaNotas = 0;
        for (Integer nota : jurados.values()) {
            somaNotas += nota;
        }
        int notaFinal = somaNotas / jurados.size();
        //projetoAvaliado.setNotaFinal(notaFinal);
    }
}
