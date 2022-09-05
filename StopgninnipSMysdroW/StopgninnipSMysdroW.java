package StopgninnipSMysdroW;

public class StopgninnipSMysdroW {
    public String spinWords(String sentence) {
        String result = new String();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; ++i) {
            if (words[i].length() >= 5) words[i] = new StringBuilder(words[i]).reverse().toString();
            result += (i == words.length - 1) ? words[i] : words[i] + " ";
        }
        return result;
    }
}
