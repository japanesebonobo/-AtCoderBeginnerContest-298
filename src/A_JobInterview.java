import java.util.*;

public class A_JobInterview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char s[] = scanner.next().toCharArray();
        scanner.close();

        String ans = "No";

        for (int i = 0; i < N; i++) {
            if(s[i] == 'o') {
                ans = "Yes";
            }
            if(s[i] == 'x') {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println(ans);
    }
}

