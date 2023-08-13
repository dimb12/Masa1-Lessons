import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Set<Integer> generatedNumbers = new HashSet<>();
        Random random = new Random();

        // Генерируем 6 уникальных чисел от 1 до 34
        while (generatedNumbers.size() < 6) {
            int randomNumber = random.nextInt(34) + 1;
            generatedNumbers.add(randomNumber);
        }

        // Выводим сгенерированные числа
        System.out.println("Сгенерированные числа:");
        for (int number : generatedNumbers) {
            System.out.print(number + " ");
        }

        // Генерируем дополнительное число от 1 до 7
        int additionalNumber = random.nextInt(7) + 1;
        System.out.println("\nДополнительное число: " + additionalNumber);
    }
}
