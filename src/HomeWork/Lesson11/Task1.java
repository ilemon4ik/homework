package HomeWork.Lesson11;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        game();
    }

    public static int numberOfPlayersInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игроков");
        return scanner.nextInt();
    }

    public static void game() {
        LinkedList<Integer> players = new LinkedList<>();
        int n = numberOfPlayersInput();

        for (int i = 1; i <= n; i++) {
            players.add(i);
        }
        System.out.println("В игре участуют " + players + " человек");

        while (players.size() > 1) {

            int firstPlayer = players.removeFirst();
            players.addLast(firstPlayer);

            int removedPlayer = players.removeFirst();
            System.out.println("Выбыл игрок №" + removedPlayer);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Победил игрок №" + players.getFirst());
    }
}