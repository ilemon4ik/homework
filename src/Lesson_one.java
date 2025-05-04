import java.util.Scanner;

public class Lesson_one {

    public static void main(String[] args) {

        System.out.println("Hello Java, (Введи своё имя)");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello Java, " + name);
    }
    public static void two(String[] args){
        System.out.println("Good!");
    }
}