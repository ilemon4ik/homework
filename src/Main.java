import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int intPlayer = scanner.nextInt();
        if (intPlayer % 2 == 0 ) {
            System.out.println("Число чётное");
        } else  {
            System.out.println("Число нечётное");
        }
    }
}