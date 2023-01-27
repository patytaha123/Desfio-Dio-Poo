package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Descrição do curso Javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPatricia = new Dev();
		devPatricia.setNome("Patricia");
		devPatricia.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de Patricia" + devPatricia.getConteudosInscritos());	
		devPatricia.progredir();
		devPatricia.progredir();
		devPatricia.progredir();
		System.out.println("Conteudos concluidos de Patricia" + devPatricia.getConteudosConcluidos());
		System.out.println("XP:" + devPatricia.calcularTotalXp());
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de João" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteudos concluidos de João" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
		
	}
	}


