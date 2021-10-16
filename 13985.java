import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();
        String t = sc.next();
        int c = sc.nextInt();

        if(a+b==c) System.out.println("YES");
        else System.out.println("NO");
    }
}

//InputMismatch 오류 해결 위해 정수형, 연산자를 따로 입력 
