import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение с пробелом");
        String text = scanner.nextLine();

        System.out.println(text.replace("хороший", "плохой").replace("день", "ночь").replace("плохой", "чудесный"));
    }
}
