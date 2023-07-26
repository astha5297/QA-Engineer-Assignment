import java.util.Scanner;

public class WeatherApp {

    private static final String API_BASE_URL = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
//switch case for displaing options
            switch (option) {
                case 1:
                    getWeather(scanner);
                    break;
                case 2:
                    getWindSpeed(scanner);
                    break;
                case 3:
                    getPressure(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Get weather");
        System.out.println("2. Get Wind Speed");
        System.out.println("3. Get Pressure");
        System.out.println("0. Exit");
    }

    private static void getWeather(Scanner scanner) {
        System.out.println("Enter the date (YYYY-MM-DD):");
        String date = scanner.next();

        String apiUrl = API_BASE_URL + "/weather?location=London&date=" + date;

        String weatherData = "{\"date\":\"" + date + "\",\"temperature\":\"25°C\"}";

        System.out.println("Weather on " + date + ":");
        System.out.println(weatherData);
    }

    private static void getWindSpeed(Scanner scanner) {
        System.out.println("Enter the date (YYYY-MM-DD):");
        String date = scanner.next();

        String apiUrl = API_BASE_URL + "/wind-speed?location=London&date=" + date;

        String windSpeedData = "{\"date\":\"" + date + "\",\"wind_speed\":\"10 km/h\"}";

        System.out.println("Wind speed on " + date + ":");
        System.out.println(windSpeedData);
    }

    private static void getPressure(Scanner scanner) {
        System.out.println("Enter the date (YYYY-MM-DD):");
        String date = scanner.next();

        String apiUrl = API_BASE_URL + "/pressure?location=London&date=" + date;


        String pressureData = "{\"date\":\"" + date + "\",\"pressure\":\"1013 hPa\"}";

        System.out.println("Pressure on " + date + ":");
        System.out.println(pressureData);
    }
}