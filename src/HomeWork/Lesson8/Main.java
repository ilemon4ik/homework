package HomeWork.Lesson8;

public class Main {

    public static void main(String[] args){
        String message = "Сообщение";

        new Electronics("Смартфон", 400.0).showFinalPrice();
        new Clothing("Куртка", 50).showFinalPrice();
        new Food("Хлеб", 10.0).showFinalPrice();
    }
}