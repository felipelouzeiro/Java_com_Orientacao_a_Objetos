import java.util.Scanner;

public class ChallengeBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "José Louzeiro";
        String type = "Investimento";
        double balance = 478547.47;
        double value = 0;

        String menu = """
                Operações:
                1- Consultar saldo
                2- Adicionar valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;

        System.out.println(menu);
        int option = sc.nextInt();

        while (option != 4) {
            switch (option) {
                case 1:
                    printsAccount(name, type, balance);
                    System.out.println(menu);
                    option = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Informe o valor para depósito: ");
                    value = sc.nextDouble();
                    balance = transfer(balance, value);
                    System.out.println(menu);
                    option = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Informe o valor para transferência: ");
                    value = sc.nextDouble();
                    balance = deposit(balance, value);
                    System.out.println(menu);
                    option = sc.nextInt();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println(menu);
                    option = sc.nextInt();
            }
        }
    }

    public static void printsAccount(String name, String type, double balance) {
        String resume = """
                                
                _______________ Saldos _______________
                                
                Nome:                    %s
                Tipo conta:              %s
                Saldo inicial:           %.2f
                _______________________________________
                """;

        System.out.printf((resume) + "%n", name, type, balance);
    }

    public static double deposit(double balance, double value) {
        double operation = balance + value;
        System.out.println("Saldo atualizado: " + operation+"\n");
        return operation;
    }

    public static double transfer(double balance, double value) {
        if (balance - value >= 0) {
            double operation = balance + value;
            System.out.println("Saldo atualizado: " + operation+"\n");
            return operation;
        } else {
            System.out.println("Saldo insuficiente!"+"\n");
            return balance;
        }
    }
}