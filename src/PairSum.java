import java.util.HashSet;

public class PairSum {
    public static void findSum(int arr[] , int sum){
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int diff = sum - num;
            if (set.contains(diff)){
                System.out.println("Pair : [ " + num + " , "+ diff +" ] ");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 , 5 , 4 , 3 , 5 , 7 , 8 };
        findSum(arr , 7);
    }
}
