package HomeWork;

import java.util.Scanner;

public class LessonFour {

    public static void main(String[] args) {
        lessonTwo();
    }

    public static void lessonOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int countSymbol = text.length();
        int k = 0;
        for (int i = 0; i < countSymbol; i++) {
            char symbol = text.charAt(i);
            if (symbol != 32) {
                int j = i - k;
                result.insert(j, symbol);
            } else {
                k = i + 1;
                result.insert(0, symbol);
            }
        }

        System.out.println(result);
    }

    public static void lessonTwo() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите строку");
            String text = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            StringBuilder result2 = new StringBuilder();
            StringBuilder result3 = new StringBuilder();

            int countSymbol = text.length();
            for (int i = 0; i < countSymbol; i++) {
                char symbol = text.charAt(i);
                int code = symbol;
                result.append(code);
                result.append(" ");
            }

            int countSymbol2 = result.length();
            for (int i = 0; i < countSymbol2; i++) {
                char symbol = result.charAt(i);
                if (symbol != 32) {
                    result2.append(symbol);
                } else {
                    int number = Integer.valueOf(result2.toString());
                    char resultNumber = (char) number;
                    result3.append(resultNumber);
                    result2.delete(0, countSymbol);
                }
            }

            System.out.println(result);
            System.out.println(result3);

    }
}