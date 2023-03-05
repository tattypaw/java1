import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
    
        /* Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->*/

        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Калькулятор");
        System.out.print("Введите первое число n1: ");
        double n1 = iScanner.nextDouble();
        System.out.print("Что с ним надо сделать? Введите знак операции (+, -, *, /): ");
        String z = iScanner.next();
        System.out.print("Введите второе число n2: ");
        double n2 = iScanner.nextDouble();
        switch (z) {
            case "+":
                System.out.print(n1 + n2);
                break;
            case "-":
                System.out.print(n1 - n2);
                break;
            case "*":
                System.out.print(n1 * n2);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.print("Делить на ноль нельзя!");
                }
                else System.out.print(n1 / n2);
                break;
            default:                
                System.out.print("Такой операции нет");
                break;
        }
            
     
    }
}             