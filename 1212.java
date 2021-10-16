import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();
        String [] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            int n = c-'0';
            if(i==0 && n<4) {
                if(n<2) answer.append(arr[n].substring(2));
                else answer.append(arr[n].substring(1));
            } else answer.append(arr[n]);
        }
        System.out.println(answer);
    }
}
