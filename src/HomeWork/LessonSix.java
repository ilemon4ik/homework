package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class LessonSix {

    public static void main(String[] args) {
        lessonOne();
    }

    public static void lessonOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            System.out.println("введите " + j + " элемент массива");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("было = " + Arrays.toString(numbers));
        lessonOneTwo(numbers);
        System.out.println("ствло = " + Arrays.toString(numbers));
    }

    public static void lessonOneTwo(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                int j = i;
                int k = 0;
                int ch1 = numbers[i];
                while ((j > 0) && (k != 1)) {
                    if (numbers[j - 1] >= 0) {
                        numbers[j] = numbers[j - 1];
                        numbers[j - 1] = ch1;
                        j--;
                    } else
                        k = 1;
                }
            }
        }
    }
}

