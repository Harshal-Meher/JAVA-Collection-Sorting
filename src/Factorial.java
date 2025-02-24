public class Factorial {
    public static int FactorialRecursive(int n) {
        return  (n == 1) ? 1 : n * FactorialRecursive(n - 1);
    }

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1 ;i <= n ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int res = FactorialRecursive(5);
        System.out.println("Factorial is  : "+res);

        System.out.println("Factorial is  : " + Factorial(5));
    }
}
