package HomeWork.Lesson11;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(6);

        LinkedList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Объединенный список: " + mergedList);
    }

    public static LinkedList<Integer> mergeLists(
            LinkedList<Integer> list1,
            LinkedList<Integer> list2
    ) {
        LinkedList<Integer> result = new LinkedList<>();

        while (!list1.isEmpty() && !list2.isEmpty()) {
            int first1 = list1.getFirst();
            int first2 = list2.getFirst();

            if (first1 <= first2) {
                result.add(first1);
                list1.removeFirst();
            } else {
                result.add(first2);
                list2.removeFirst();
            }
        }

        while (!list1.isEmpty()) {
            result.add(list1.getFirst());
            list1.removeFirst();
        }

        while (!list2.isEmpty()) {
            result.add(list2.getFirst());
            list2.removeFirst();
        }
        return result;
    }
}