import java.nio.file.AccessDeniedException;
import java.util.Scanner;

public class GugudanTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        System.out.println("구구단 입니다.");

        calculate(result);
    }

    private static void calculate(int result) {
        validate(result);
        for (int j = 1; j < 10; j++) {
            System.out.println(result * j);
        }
    }

    private static void validate(int result) {
        if (result < 2 || result > 9) {
            throw new IllegalStateException("2이상 과 9이하만 가능합니다.");
        }
    }
}
