import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scan.nextInt();

        if (number % 2 == 0){
            System.out.println("Введене число є парним");
        } else {
            System.out.println("Введене число не є парним ");
        }
    }
}
