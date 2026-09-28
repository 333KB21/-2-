import java.util.Scanner;
import java.text.MessageFormat;
// Грицанюк КБ-21 практична робота номер 3
public class praktichnarobota3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи ціле число: ");
        int myInt = scanner.nextInt();

        System.out.print("Введи число з плаваючою точкою (через кому): ");
        double myDouble = scanner.nextDouble();

        System.out.print("Введи логічне значення (true або false): ");
        boolean myBool = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Введи якийсь рядок: ");
        String myString = scanner.nextLine();

        System.out.println("\n--- Результати виведення (10 форматів) ---");

        System.out.println("1 (println): Ціле=" + myInt + ", Дріб=" + myDouble + ", Рядок=" + myString + ", Логічне=" + myBool);
        
        System.out.println("2 (println + обгортка): Вісімкова система = " + Integer.toOctalString(myInt));

        String msg1 = MessageFormat.format("3 (MessageFormat): Рядок: {2}, Ціле: {0}, Дріб: {1}, Логічне: {3}", myInt, myDouble, myString, myBool);
        System.out.println(msg1);

        String msg2 = MessageFormat.format("4 (MessageFormat): Дріб у вигляді валюти: {0, number, currency}", myDouble);
        System.out.println(msg2);

        System.out.printf("5 (printf базовий): %d, %f, %s, %b%n", myInt, myDouble, myString, myBool);
        
        System.out.printf("6 (printf hex): Шістнадцятковий код числа = %x%n", myInt);
        
        System.out.printf("7 (printf точність): Дріб з 3 символами після крапки = %.3f%n", myDouble);
        
        System.out.printf("8 (printf ширина): Рядок з шириною 20 символів = %20s%n", myString);
        
        System.out.printf("9 (printf обрізаний рядок): Рядок до 5 символів = %.5s%n", myString);
        
        System.out.printf("10 (printf нулі та знак): Число з нулями = %010d, Зі знаком = %+d%n", myInt, myInt);

        scanner.close();
    }
}
