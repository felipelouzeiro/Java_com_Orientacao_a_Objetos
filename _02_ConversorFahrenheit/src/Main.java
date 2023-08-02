public class Main {
    public static void main(String[] args) {
        int temperatureInCelsius = 24;
        int temperatureInFahrenheit = convertToFahrenheit(temperatureInCelsius);

        String response = """
                Temperatura informada em Celsius: %d Cº;
                Temperatura convertida para Fahrenheit: %d Fº;
                """.formatted(temperatureInCelsius,temperatureInFahrenheit);

        System.out.println(response);
    }

    private static int convertToFahrenheit(double temperature){
        return (int) ((temperature * 1.8) + 32);
    }
}