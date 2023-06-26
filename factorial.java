import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = fact(n - 1);
        return ans * n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}
