package HomeWork.Lesson10;

public class TooYoungException extends Exception {
    public TooYoungException() {
        super("Запрещено для лиц, младше 18 лет");
    }
}