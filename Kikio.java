import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class Kikio {
    public static void main(String[] args) {
        // Создаем первую коллекцию с 10 числами
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Создаем вторую коллекцию с 10 именами
        String[] secondArray = {
            "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hank", "Ivy", "Jack"
        };

        // Создаем HashMap для хранения пар чисел и имен
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < firstArray.length && i < secondArray.length; i++) {
            hashMap.put(firstArray[i], secondArray[i]);
        }

        // Создаем третью коллекцию, объединяя числа из первой коллекции и значения из HashMap
        // В данном случае, используем ArrayList для третьей коллекции, но также можно использовать HashMap
        // в зависимости от нужд вашего проекта.
        ArrayList<String> thirdCollection = new ArrayList<>();
        for (int num : firstArray) {
            String name = hashMap.get(num);
            if (name != null) {
                String item = num + "-" + name;
                thirdCollection.add(item);
            }
        }

        // Выводим все значения третьей коллекции в цикле foreach
        for (String item : thirdCollection) {
            System.out.println(item);
        }
    }
}
