import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scn.nextInt();
        System.out.print("Enter b: ");
        int b = scn.nextInt();
        System.out.println(a+b);

        //red color - not versioned files (не отслеживаемые)
        //green color - versioned files (отслеживаемые)

    }
}
