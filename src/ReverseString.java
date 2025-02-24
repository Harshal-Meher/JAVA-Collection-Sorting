public class ReverseString {
    public static void main(String[] args) {
        String str = "Harshal";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String : "+rev);
    }
}
