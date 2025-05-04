import java.util.Scanner;

public class Lesson_one {

    public static void main(String[] args) {
        Lesson_one();

    }
    public static void Lesson_one(){
        System.out.println("Hello Java, (Введи своё имя)");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello Java, " + name);
    }
    public static void Lesson_two(){
        System.out.println("Good!");
    }
}