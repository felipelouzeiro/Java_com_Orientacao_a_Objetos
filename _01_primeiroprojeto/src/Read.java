import java.util.Scanner;

public class Read {
    public static void main(String[] args){
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String film = reading.nextLine();
        System.out.println(film);
    }
}
