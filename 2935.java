import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s = sc.nextLine();
        String u = sc.nextLine();
        String t = "";

        if(s.equals("+")) {
            if(n.length()==u.length()) {
                t+="2";
                t+=n.substring(1);
                System.out.println(t);
            } else if(n.length()>u.length()) {
                t+=n.substring(0, n.length()-u.length());
                t+=u;
                System.out.println(t);
            } else {
                t+=u.substring(0, u.length()-n.length());
                t+=n;
                System.out.println(t);
            }
        }
        else if(s.equals("*")) {
            t+="1";
            t+=n.substring(1);
            t+=u.substring(1);
            System.out.println(t);
        }
    }
}
