import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctFileCount = 0; // счётчик корректных файлов

        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = sc.nextLine(); // ввод пути с консоли

            File file = new File(path);  // создаём объект файла
            boolean fileExists = file.exists();      // проверяем, существует ли файл
            boolean isDirectory = file.isDirectory(); // проверяем, не папка ли это

            if (!fileExists) {
                System.out.println("Ошибка: файл не существует!");
                continue; // продолжаем цикл
            }

            if (isDirectory) {
                System.out.println("Ошибка: указанный путь ведёт к папке, а не к файлу!");
                continue; // продолжаем цикл
            }

            // если путь верный и это файл
            correctFileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл " + correctFileCount);
        }
    }
}