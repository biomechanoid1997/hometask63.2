import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Если писать Cat без кавычек то выдаёт ошибку Expression expected;
        // Если писать с кавычками то выдаёт 'Subclass(Animal)' in 'Subclass' cannot be applied to '(java.lang.String)'
        Subclass subclass = new Subclass("Cat");


    }
}
