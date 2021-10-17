import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int b = 1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='A') {
                if(b==1) b=2;
                else if(b==2) b=1;
            }
            if(s.charAt(i)=='B') {
                if(b==2) b=3;
                else if(b==3) b=2;
            }
            if(s.charAt(i)=='C') {
                if(b==3) b=1;
                else if(b==1) b=3;
            } 
        } System.out.println(b);
    }
}
