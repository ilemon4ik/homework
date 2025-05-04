import java.util.Scanner;

public class Lesson_two {
    public static void main (String[] args){
        lesson_two_dopzadanie();
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

    public static void lesson_two_two(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше кол-во баллов: ");
        int point = scanner.nextInt();

        if (point >= 90 && point <= 100) {
            System.out.println("Оценка А:" + point);
        } else if (point >= 75) {
            System.out.println("Оценка B:" + point);
        } else if (point >= 50) {
            System.out.println("Оценка C:" + point);
        } else if (point >= 30) {
            System.out.println("Оценка D:" + point);
        } else if (point >= 0) {
            System.out.println("Оценка F:" + point);
        }
    }

    public static void lesson_two_three() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N");
        int numberN = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(numberN + " * " + i + " = " + numberN * i);
        }
    }

    public static void lesson_two_dopzadanie() {

        boolean condition = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            if (number < 0) {
                condition = false;
            } else {
                System.out.println("Вы ввели число: " + number);
            }
        } while (condition);
            System.out.println("Число отрицательное, программа завершилась!");
    }
}
