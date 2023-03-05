import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
    /*     Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();

        int s = 0;
        int f = 1;
        if (n < 0) {
            System.out.println("Задача решается только для положительных чисел");
        } else {
            for (int index = 1; index <= n; index++) {
                s = s + index;
                f = f * index;
            }
            System.out.println(s);
            System.out.println(f);
        }
       
    }
}             