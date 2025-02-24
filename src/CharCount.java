import java.util.HashMap;

public class CharCount {

    public static void countCharecter(String str) {
        HashMap<Character ,Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        countCharecter("Harshal");
    }
}
