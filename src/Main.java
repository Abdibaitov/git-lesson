import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Age is: "+a);

        String name= scanner.nextLine();
        System.out.println("Your name is: "+name);

        sum(4,5);

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
}