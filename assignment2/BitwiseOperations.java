import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        bitwiseOperations(num1, num2);
        scanner.close();
    }

    public static void bitwiseOperations(int num1, int num2) {
        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Left shift (by 1): " + (num1 << 1));
        System.out.println("Right shift (by 1): " + (num1 >> 1));
    }
}

