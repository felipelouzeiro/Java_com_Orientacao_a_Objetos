import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double rating = 0;

//        for (int i=0;i<3;i++){
//            System.out.println("Informe sua avaliação para o filme:");
//            rating += reading.nextDouble();
//        }

        int count = 0;
        while (rating != -1){
            System.out.println("Informe sua avaliação para o filme:");
            rating = reading.nextDouble();
            if (rating != -1){
                count++;
            }
        }

        System.out.printf("Média: ", rating/count);
    }
}
