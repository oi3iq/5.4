public class App {
    public static void main(String[] args) {
        // Display table header
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------");

        // Loop to display miles and their equivalent kilometers
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%-15d%.3f%n", miles, kilometers);
        }
    }
}
