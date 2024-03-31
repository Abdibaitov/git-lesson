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

        minus(5,1);
        koboytuu(4,4);
    }

    public static void minus(int a, int b){
        System.out.println(a-b);
    }

    public static void koboytuu(int a, int v){
        System.out.println(a*v);
    }

}