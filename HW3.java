import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "P@ssword";
        String enteredUsername;
        String enteredPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите никнейм: ");
        enteredUsername = scanner.nextLine();

        System.out.print("Введите пароль: ");
        enteredPassword = scanner.nextLine();

        if (!username.equalsIgnoreCase(enteredUsername) || !password.equals(enteredPassword)) {
            System.out.println("Отказано. Неверный никнейм или пароль");
        } else {
            System.out.println("Вход выполнен");
        }

        scanner.close();
    }
}
