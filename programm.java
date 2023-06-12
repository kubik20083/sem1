import java.util.Scanner;



/**
 * class - для создания класса
 * psv - для создания функции main
 * programm
 */
public class programm {

    public static void main(String[] args) {
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // .nextLine() -- считывыет строку
        // .next() -- считывает элемент
        // .nextInt -- считывает число
        System.out.printf("%s, %d", name, 5);
        sc.close();
        
    }
}
