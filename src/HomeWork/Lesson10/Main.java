package HomeWork.Lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void lesson1(Scanner scanner){
        Integer number1, number2;
        try {
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            System.out.println(number1 / number2);
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 не допустимо");
        }
    }

    public static void lesson2(Scanner scanner){
        Integer age;
        try {
            age = scanner.nextInt();
            if(age < 18) throw new TooYoungException();
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода");
        } catch (TooYoungException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void lesson3(){
        String line;
        try {
            line = System.console().readLine();
            if(line.isEmpty()) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Строка ввода пустая");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        lesson1(scanner);
        lesson2(scanner);
        lesson3();
    }
}