public class ReverceSentences {

    public static String RevercesWords(String sentences) {
        String[] word = sentences.split(" ");
        StringBuilder rev =new StringBuilder();

        for (int i = word.length-1 ; i >= 0 ;i--) {
            rev.append(word[i]).append(" ");
        }
        return rev.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(RevercesWords("Kapur Ram"));
    }
}
