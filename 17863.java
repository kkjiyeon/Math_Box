import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 10000;
        if(b==555) System.out.println("YES");
        else System.out.println("NO");
    }
}
