import java.util.Scanner;

public class Problem_3 {
    public static Integer basicMath(String op, int v1, int v2) {

        switch (op) {
            case "+":
                return (v1 + v2);

            case "-":
                return (v1 - v2);

            case "*":
                return (v1 * v2);

            case "/":
                return (v1 / v2);

        }
        return 0;
    }

    public static void main(String[] args) {

        int num1, num2, result;

        String operacao;

        Scanner input = new Scanner(System.in);
        operacao = input.nextLine();
        num1 = input.nextInt();
        num2 = input.nextInt();

        result = basicMath(operacao, num1, num2);
        System.out.println(result);

    }
}
