import java.util.Scanner;

public class SumOfNumbers {

    public static int sumOFNumbers(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println("Sum Of Num : "+sumOFNumbers(val));
    }
}
