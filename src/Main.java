import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static  void main (String [] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao(" descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao(" descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" mentoria de java");
        mentoria.setDescricao(" descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcampo Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEster= new Dev();
        devEster.setNome("Ester");
        devEster.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos :" + devEster.getConteudosInscritos());
        devEster.progredir();
        devEster.progredir();
        devEster.progredir();
        System.out.println("-");
        System.out.println(" Conteúdos Inscritos Ester :" + devEster.getConteudosInscritos());
        System.out.println(" Conteúdos Concluidos Ester :" + devEster.getConteudosConcluidos());
        System.out.println("XP:" + devEster.calcularTotalXp());

        System.out.println("------");

        Dev devFernando= new Dev();
        devEster.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos :" + devFernando.getConteudosInscritos());
        devFernando.progredir();
        System.out.println("-");
        System.out.println(" Conteúdos Inscritos Fernando:" + devFernando.getConteudosInscritos());
        System.out.println(" Conteúdos Concluidos Fernando:" + devFernando.getConteudosConcluidos());
        System.out.println("XP:" + devFernando.calcularTotalXp());

   }
}
