import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("** CURSO **");
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(200);

        Curso curso2 = new Curso();
        curso2.setTitulo("CSS");
        curso2.setDescricao("Descrição curso CSS");
        curso2.setCargaHoraria(150);

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
    }
}