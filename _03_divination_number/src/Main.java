import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5;
        int numberOfAttempts = 5;
        int count = 1;

        System.out.println("Tente adivinhar o número em 5 tentativas! ");
        while (count <= numberOfAttempts){
            System.out.printf("%sº Tentativa:",count);
            int guess = sc.nextInt();
            if (guess == number){
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (count == 5 && guess != number) {
                System.out.println("Tentativas esgotadas!");
            }
            count++;
        }
    }
}