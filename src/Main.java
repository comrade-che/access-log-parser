import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Ввод первого значения
        System.out.println ("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        // Ввод значения значения
        System.out.println ("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        // Вычисление суммы введенных чисел
        int addition = number1 + number2;
        System.out.println ("Сумма введенных чисел равна:" + addition);
        // Вычисление разности введенных чисел
        int subtraction = number1 - number2;
        System.out.println ("Разность введенных чисел равна:" + subtraction);
        // Вычисление произведения введенных чисел
        int multiplication = number1 * number2;
        System.out.println ("Произведение введенных чисел равно:" + multiplication);
        // Вычисление частного введенных чисел
        double division = (double)number1 / number2;
        System.out.println ("Частное введенных чисел равно:" + division);

    }
}