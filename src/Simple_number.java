/**
 * Вывести все простые числа от 1 до 1000
 */
public class Simple_number {
    public static void main(String[] args) {
        int begin = 1;
        int end = 1000;
        System.out.printf("Все простые числа от %d до %d: ", begin, end);
        for (int i = begin; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) flag = false;
            }
            if (flag) System.out.print(i + " ");
        }
    }
}
