import java.util.Scanner;

public class Problem_1 {
    public static String EvenOdd(int number) {

        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {

        int num;
        String result;

        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        result = EvenOdd(num);

        System.out.println(result);
    }
}
