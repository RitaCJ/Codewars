import java.util.Scanner;

public class Problem_2 {
    public static int summation(int n) {
        int r = 0;

        for (int i = 1; i <= n; i++) {
            r = r + i;
        }

        return r;
    }

    public static void main(String[] args) {

        int num, result = 0;

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        if (num > 0) {
            result = summation(num);
            System.out.println(result);
        }
    }
}
