import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição curso java");
        mentoria1.setData(LocalDate.now());
        
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(8);

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Leo");

        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("João");

        dev2.inscreverBootcamp(bootcamp);


        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("-------");

        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());


         

        
    }

}
