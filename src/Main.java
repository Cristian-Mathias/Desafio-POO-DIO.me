import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("** CURSOS **");
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setTitulo("CSS");
        curso2.setDescricao("Descrição curso CSS");
        curso2.setCargaHoraria(1);

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println("=====================================");
        System.out.println("** MENTORIA **");
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("JS");
        mentoria1.setDescricao("Descrição curso JS");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("POO");
        mentoria2.setDescricao("Descrição curso POO");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);

        System.out.println("=====================================");
        System.out.println("** BOOTCAMP **");
        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        System.out.println(bootcamp);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        System.out.println("=====================================");
        System.out.println("** INSCRITO **"+'\n');
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " +'\n'+ devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" +'\n'+ devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" +'\n'+ devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" +'\n'+ devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" +'\n'+ devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" +'\n'+ devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
    }
}