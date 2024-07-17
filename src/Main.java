import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devHugo.getConteudosInscritos());
        devHugo.progredir();
        devHugo.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devHugo.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devHugo.getConteudosConcluidos());
        System.out.println("XP: " + devHugo.calcularTotalXp());

        System.out.println("---------------");

        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devSara.getConteudosInscritos());
        devSara.progredir();
        devSara.progredir();
        devSara.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devSara.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devSara.getConteudosConcluidos());
        System.out.println("XP: " + devSara.calcularTotalXp());




    }
}
