import java.util.Scanner;

public class Lesson_two {
    public static void main (String[] args){
        lesson_two_one();
    }
    public static void lesson_two_one (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        int length = scanner.nextInt();

        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();

        int perimeter = 2 * (length + width);
        int area = length * width;

        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("Площадь прямоугольника: " + area);


        scanner.close();
    }
}
