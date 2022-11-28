import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = sc.nextFloat();
        System.out.println("Введите операцию: /, *, -, +, //, %");
        String operation = sc.next().strip();
        double b;
        do {
            System.out.println("Введите второе число: ");
            b = sc.nextFloat();
            if ((operation.equals("/") || operation.equals("//")) && b == 0) {
                System.out.println("Делить на ноль нельзя!");
            }
        } while ((operation.equals("/") || operation.equals("//")) && b == 0);

        System.out.print("Результат: ");
        switch (operation) {
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            case "//":
                System.out.println((int)a / b);
            case "%":
                System.out.println(a % b);
        }
    }
}
