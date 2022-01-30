package desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(9);

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

        Dev devJunio = new Dev();
        devJunio.setNome("Junior");
        devJunio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devJunio.getConteudosInscritos());
        devJunio.progredir();
        devJunio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devJunio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devJunio.getConteudosConcluidos());
        System.out.println("XP:" + devJunio.calcularTotalXp());

        System.out.println("-------");

        Dev devBruno = new Dev();
        devBruno.setNome("Joao");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devBruno.getConteudosConcluidos());
        System.out.println("XP:" + devBruno.calcularTotalXp());

	}

}
