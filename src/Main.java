import instituicao.Empresa;
import instituicao.Instituicao;
import instituicao.Universidade;
import pessoa.*;
import projeto.Projeto;
import projeto.Projetos;

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
        Equipes.getInstance().getEquipes().add(equipe);

        equipe = new Equipe();
        universidade = new Universidade("PUC Minas - Sao Gabriel");
        equipe.addEstudante(new Estudante("Jorge", universidade));
        equipe.addEstudante(new Estudante("Marielli", universidade));
        equipe.addEstudante(new Estudante("Paulo", universidade));
        equipe.addEstudante(new Estudante("Amanda", universidade));
        equipe.addEstudante(new Estudante("Luciano", universidade));
        Equipes.getInstance().getEquipes().add(equipe);

        //Adciona 1 projeto diferente para cada equipe

        Instituicao instituicao = new Empresa("Tech Solutions");
        Profissional orientador = new Profissional("Dr. Silva", instituicao);
        Projetos.getInstance().getProjetos().add(new Projeto("Projeto 1", orientador, Equipes.getInstance().getEquipes().get(0)));
        
        orientador = new Profissional("Dr. Andrade", instituicao);
        Projetos.getInstance().getProjetos().add(new Projeto("Projeto 2", orientador, Equipes.getInstance().getEquipes().get(1)));

        //Criar 1 banca avaliadora para cada projeto (Cada banca deve conter 4 jurados)
        //Calcula a nota final de cada projeto a partir da apresentação (considere a media das notas dos jurados)
        //Lista os projetos com nota final >= 7 (usar stream)
    }
}
