import java.util.Scanner;

public class MyFirstApp {   
    public static void main(String[] args) {
        System.out.println("Написано однажды, работает везде");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите имя:");
        System.out.println(console.nextLine());

        int sum = 5;
        int a = 1;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }
}