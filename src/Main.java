import apresentacao.*;
import instituicao.*;
import pessoa.*;
import projeto.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //Criar 2 equipes com 5 estudantes cada
        Equipe equipe = new Equipe();
        Instituicao universidade = new Universidade("PUC Minas - Coreu");
        equipe.addEstudante(new Estudante("João", universidade));
        equipe.addEstudante(new Estudante("Maria", universidade));
        equipe.addEstudante(new Estudante("Pedro", universidade));
        equipe.addEstudante(new Estudante("Ana", universidade));
        equipe.addEstudante(new Estudante("Lucas", universidade));
        Equipes.getInstance().addEquipe(equipe);

        equipe = new Equipe();
        universidade = new Universidade("PUC Minas - Sao Gabriel");
        equipe.addEstudante(new Estudante("Jorge", universidade));
        equipe.addEstudante(new Estudante("Marielli", universidade));
        equipe.addEstudante(new Estudante("Paulo", universidade));
        equipe.addEstudante(new Estudante("Amanda", universidade));
        equipe.addEstudante(new Estudante("Luciano", universidade));
        Equipes.getInstance().addEquipe(equipe);

        //Adciona 1 projeto diferente para cada equipe

        Instituicao instituicao = new Empresa("Tech Solutions");
        Profissional orientador = new Profissional("Dr. Silva", instituicao);
        Projetos.getInstance().addProjeto(new Projeto("Projeto 1", orientador, Equipes.getInstance().getEquipes().get(0)));
        
        orientador = new Profissional("Dr. Andrade", instituicao);
        Projetos.getInstance().addProjeto(new Projeto("Projeto 2", orientador, Equipes.getInstance().getEquipes().get(1)));

        //Criar 1 banca avaliadora para cada projeto (Cada banca deve conter 4 jurados)

        Banca banca = new Banca("Banca 1", Projetos.getInstance().getProjetos().get(0));
        instituicao = new Universidade("Secretaria PUC Minas - Coreu");
        banca.addJurado(new Jurado("Jurado 1", instituicao));
        banca.addJurado(new Jurado("Jurado 2", instituicao));
        banca.addJurado(new Jurado("Jurado 3", instituicao));
        banca.addJurado(new Jurado("Jurado 4", instituicao));
        Bancas.getInstance().getBancas().add(banca);

        banca = new Banca("Banca 2", Projetos.getInstance().getProjetos().get(1));
        //instituicao = new Universidade("Secretaria PUC Minas - Coreu");
        banca.addJurado(new Jurado("Jurado 5", instituicao));
        banca.addJurado(new Jurado("Jurado 6", instituicao));
        banca.addJurado(new Jurado("Jurado 7", instituicao));
        banca.addJurado(new Jurado("Jurado 8", instituicao));
        Bancas.getInstance().getBancas().add(banca);

        

        //Criar apresentacoes referentes a cada projeto
        
        Apresentacao apresentacao = new Apresentacao(Projetos.getInstance().getProjetos().get(0), Bancas.getInstance().getBancas().get(0));
        Apresentacoes.getInstance().getApresentacoes().add(apresentacao);
        apresentacao = new Apresentacao(Projetos.getInstance().getProjetos().get(1), Bancas.getInstance().getBancas().get(1));
        Apresentacoes.getInstance().getApresentacoes().add(apresentacao);

        //Configurar notas dos jurados para cada projeto (cada jurado deve dar uma nota de 0 a 10)
        banca = Bancas.getInstance().getBancas().get(0);
        banca.setNotaJurado("Jurado 1", 8);
        banca.setNotaJurado("Jurado 2", 9);
        banca.setNotaJurado("Jurado 3", 8);
        banca.setNotaJurado("Jurado 4", 10);

        banca = Bancas.getInstance().getBancas().get(1);
        banca.setNotaJurado("Jurado 5", 6);
        banca.setNotaJurado("Jurado 6", 8);
        banca.setNotaJurado("Jurado 7", 7);
        banca.setNotaJurado("Jurado 8", 6);

        //Calcula a nota final de cada projeto a partir da apresentação (considere a media das notas dos jurados)
        Apresentacoes.getInstance().avaliarTodos();

        //Lista os projetos com nota final >= 7 (usar stream)
        System.out.println("Projetos com nota final >= 7:");

        var stream = Projetos.getInstance().getProjetos().stream();
        var streamFiltrada = stream.filter(projeto -> projeto.getNotaFinal() >= 7);
        streamFiltrada.forEach(
            projeto -> System.out.println("Projeto: " + projeto.getNome() + ", Nota Final: " + projeto.getNotaFinal())
        );
    }
}
