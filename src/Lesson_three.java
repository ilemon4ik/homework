import java.util.Scanner;

public class Lesson_three {
    public static void main(String[] args){
        lesson_six();
    }

    public static void lesson_six() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту лесенки: ");
        int height = scanner.nextInt();

        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}