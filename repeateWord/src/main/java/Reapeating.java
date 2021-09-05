import java.util.HashMap;

public class Reapeating {

  public static String repeitingWords(String word) {

    HashMap<String, Integer> words = new HashMap<String, Integer>();
    String symbol[] = word.split(" ");
     int y = 0;
    for (int i = 0; i < symbol.length; i++) {
      if (words.containsKey(symbol[i])) {
        words.put(symbol[i], words.get(symbol[i]) + 1);
        y++;
//        System.out.println(y);
              } else {
        words.put(symbol[i], 1);
      }
    }
    for (int i = 0; i < symbol.length; i++) {
      int countForWord = words.get(symbol[i]);
      if (countForWord > 1) {
        return symbol[i];
      }
    }

    return "Try Again ,No Repeating Words";
  }
}
