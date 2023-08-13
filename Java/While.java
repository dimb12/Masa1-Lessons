import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class While {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

<<<<<<< Updated upstream
        // int i = 2;
        // while (i <= 8) {
        //    System.out.print(i + " ");
        //    i+=2; //i=i+2
        // }
=======
        // Генерация 6 уникальных чисел
        while (numbers.size() < 6) {
            int randomNumber = random.nextInt(34) + 1;
            numbers.add(randomNumber);
        }
>>>>>>> Stashed changes

        // Вывод сгенерированных чисел
        System.out.println("Сгенерированные числа:");
        for (int number : numbers) {
            System.out.println(number);
        }

<<<<<<< Updated upstream
        // int i = 1;
        // while (true) { //while(i > 0)
        //     System.out.print(i + " ");
        //     i++;
        // }

        // int i = 1;
        // while (i < 0) {
        //     i++;
        //     System.out.print(i + " ");
        // }

        // int i = 1;
        // do {
        //     i++;
        //     System.out.print(i + " ");
        // } while(i < 0);

        // int i = 1;
        // while (i <= 8) {
        //    System.out.print(i + " ");
        //    i++;
        // }
        

=======
        // Генерация дополнительного числа от 1 до 7
        int additionalNumber = random.nextInt(7) + 1;

        // Вывод дополнительного числа
        System.out.println("Дополнительное число: " + additionalNumber);
>>>>>>> Stashed changes
    }
}
