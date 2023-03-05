import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
    
 /* *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Ввод: 2? + ?5 = 69
Вывод: 24 + 45 = 69 */

        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите уравнение: ");
        String z = iScanner.nextLine();
        int index1 = z.indexOf('+');
        int index2 = z.indexOf('=');
        String q = z.substring(0, index1).trim();
        String w = z.substring(index1 + 1, index2).trim();
        String e = z.substring(index2 + 1).trim();

        int nume = Integer.parseInt(e);
        int numq = Integer.parseInt(q.replace('?', '0'));
        int numw = Integer.parseInt(w.replace('?', '0'));
        boolean flag = true;
        char chari = ' ';
        char charj = ' ';
        for (int i = 0; i < 10; i++) {
            chari = Character.forDigit(i, 10);
            numq = Integer.parseInt(q.replace('?', chari));
            for (int j = 0; j < 10; j++) {
                charj = Character.forDigit(j, 10);;
                numw = Integer.parseInt(w.replace('?', charj));
                if (numq + numw == nume) {
                    flag = false;
                    System.out.print(numq);
                    System.out.print(" + ");
                    System.out.print(numw);
                    System.out.print(" = ");
                    System.out.print(nume);
                }
            }
        }
        if (flag) System.out.print("Решения нет");
    }
}             