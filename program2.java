import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
    
        //Вывести все простые числа от 1 до 1000

        System.out.println("2");
        for (int i = 2; i <=1000; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2+1; j++) {
                if (i%j==0) flag = false;
            }
            if (flag) System.out.println(i);    
        }

        
    }
}             