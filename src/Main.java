import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Curso curso1 = new Curso();
        // curso1.setTitulo("curso java");
        // curso1.setDescricao("descrição curso java");
        // curso1.setCargaHoraria(8);

        // Curso curso2 = new Curso();
        // curso2.setTitulo("curso js");
        // curso2.setDescricao("descrição curso js");
        // curso2.setCargaHoraria(4);

        Curso java = new Curso("Java", "Descrição Curso Java", 68);
        Curso php = new Curso("PHP", "Descrição Curso PHP", 43);
        Curso py = new Curso("Python", "Descrição Curso Python", 38);
        Curso js = new Curso("JavaScript", "Descrição Curso JavaScript", 50);
        Curso ts = new Curso("TypeScript", "Descrição Curso TypeScript", 32);
        
        System.out.println("##############");
        System.out.printf("1 - %s \n2 - %s \n3 - %s \n4 - %s \n5 - %s \n", java, php, py, js,  ts);
        System.out.println("##############");

        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(py);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
