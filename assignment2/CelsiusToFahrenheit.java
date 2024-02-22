import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Celsius value: ");
        double c = sc.nextInt();
        sc.close();

        double F = (c * 9 / 5) + 32;

        System.out.println("The Fahrenheit value for " + c + " deg Celsius is " + F);

    }
}
