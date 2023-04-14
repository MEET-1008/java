import java.util.HashMap;
import java.util.Map;

public class p29_CharOccurrenceCounter {

  public static void main(String[] args) {
    String inputString = "hello world";
    Map<Character, Integer> charCountMap = new HashMap<>();

    for (int i = 0; i < inputString.length(); i++) {
      char ch = inputString.charAt(i);
      if (charCountMap.containsKey(ch)) {
        int count = charCountMap.get(ch);
        charCountMap.put(ch, count + 1);
      } else {
        charCountMap.put(ch, 1);
      }
    }

    System.out.println(
      "Character occurrence count in string \"" + inputString + "\":"
    );
    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
