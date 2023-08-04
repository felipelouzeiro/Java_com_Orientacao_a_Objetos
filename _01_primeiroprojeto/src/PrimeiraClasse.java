public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("☻Hello Java!☺");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        boolean coveredFlat = true;
        System.out.println("Ano Lançamento: "+releaseYear);
        System.out.println("Coberto pelo plano: "+(coveredFlat?"Sim":"não"));

        String nome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);

        int rating = (int) (2.15 / 2);


    }

}