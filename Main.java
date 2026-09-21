import java.util.Scanner;

// Грицанюк Кирило КБ-21

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Інформація про примітивні типи даних ---");

        System.out.println("Тип: Byte, Розмір: " + Byte.BYTES + " байт, Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE);
        System.out.println("Тип: Short, Розмір: " + Short.BYTES + " байт, Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE);
        System.out.println("Тип: Integer, Розмір: " + Integer.BYTES + " байт, Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE);
        System.out.println("Тип: Long, Розмір: " + Long.BYTES + " байт, Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE);
        System.out.println("Тип: Float, Розмір: " + Float.BYTES + " байт, Min: " + Float.MIN_VALUE + ", Max: " + Float.MAX_VALUE);
        System.out.println("Тип: Double, Розмір: " + Double.BYTES + " байт, Min: " + Double.MIN_VALUE + ", Max: " + Double.MAX_VALUE);
        System.out.println("Тип: Character, Розмір: " + Character.BYTES + " байт, Min: " + (int) Character.MIN_VALUE + ", Max: " + (int) Character.MAX_VALUE);
        System.out.println("Тип: Boolean, Розмір: залежить від JVM, Min: false, Max: true");

        System.out.println("\n--- Введення даних з терміналу ---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення типу byte: ");
        String strByte = scanner.nextLine();
        byte b = Byte.parseByte(strByte);
        System.out.println("Ви ввели byte: " + b);

        System.out.print("Введіть значення типу short: ");
        String strShort = scanner.nextLine();
        short s = Short.parseShort(strShort);
        System.out.println("Ви ввели short: " + s);

        System.out.print("Введіть значення типу int: ");
        String strInt = scanner.nextLine();
        int i = Integer.parseInt(strInt);
        System.out.println("Ви ввели int: " + i);

        System.out.print("Введіть значення типу long: ");
        String strLong = scanner.nextLine();
        long l = Long.parseLong(strLong);
        System.out.println("Ви ввели long: " + l);

        System.out.print("Введіть значення типу float: ");
        String strFloat = scanner.nextLine();
        float f = Float.parseFloat(strFloat);
        System.out.println("Ви ввели float: " + f);

        System.out.print("Введіть значення типу double: ");
        String strDouble = scanner.nextLine();
        double d = Double.parseDouble(strDouble);
        System.out.println("Ви ввели double: " + d);

        System.out.print("Введіть значення типу boolean (true/false): ");
        String strBool = scanner.nextLine();
        boolean bool = Boolean.parseBoolean(strBool);
        System.out.println("Ви ввели boolean: " + bool);
    }
}