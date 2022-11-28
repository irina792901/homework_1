import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
 * n! (произведение чисел от 1 до n)
 */
public class Triangular_number {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int summary = 0, factorial = 1;
        for (int i = 1; i <= number; i++) {
            summary += i;
            factorial *= i;
        }
        System.out.println("Сумма чисел от 1 до n: " + summary);
        System.out.println("Произведение чисел от 1 до n: " + factorial);
    }
}
