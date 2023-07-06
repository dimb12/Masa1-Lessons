import java.util.Scanner;

public class HW1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите первое число: ");
double number1 = scanner.nextDouble();
System.out.print("Введите второе число: ");
double number2 = scanner.nextDouble();
System.out.print("Введите третье число: ");
double number3 = scanner.nextDouble();
double max = Math.max(number1, Math.max(number2, number3));
double min = Math.min(number1, Math.min(number2, number3));
double sum = number1+number2+number3;
double srednyaya = sum/3;
System.out.printf("Наибольшее число: %.0f%n", max);
System.out.printf("Наименьшее число: %.0f%n", min);
System.out.printf("Среднее арифметическое: %.0f%n", srednyaya);
        scanner.close();


    }
}

