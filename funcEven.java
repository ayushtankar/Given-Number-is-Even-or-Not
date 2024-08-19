import java.util.*;

public class funcEven {

    public static boolean isEven(int num) {
        if (num % 2== 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number: ");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("Number is not even");
        }
    }
}
