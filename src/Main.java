
import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public void Main() {
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        Dev devPatricia = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devPatricia.getConteudosInscritos());
        devPatricia.Progredir();
        devPatricia.Progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Patricia:" + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Patricia:" + devPatricia.getConteudosConcluidos());
        System.out.println("XP:" + devPatricia.CalcularTotalXp());
        System.out.println("-------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.InscreverBootcamp (bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.Progredir();
        devJoao.Progredir();
        devJoao.Progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.CalcularTotalXp());
    }
}
