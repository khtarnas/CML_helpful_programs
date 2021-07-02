import java.util.*;

public class ReplaceText {
    public static void main (String[] args) {

      // Ensure the correct arguements are given
      if (args.length != 3) {
        throw new IllegalArgumentException("File must be given 3 arguments:"
          + " The original text, the string to remove, and the string with"
          + " which to replace it.");
      }

      // Get the arguments
      String text = args[0];
      String org = args[1];
      String replacement = args[2];

      // Find the starting positions of the substrings to be replaced
      ArrayList<Integer> pos_to_remove = new ArrayList<Integer>();
      for (int i = 0; i < (text.length() + 1) - org.length(); i++) {

        String x = text.substring(i, i + org.length());

        if (x.equals(org)) {
          pos_to_remove.add(i);
        }
      }

      // Iterate through found-positions and replace them with the replacement
      Iterator<Integer> iter = pos_to_remove.iterator();
      int len_diff = replacement.length() - org.length();
      int gap = 0;

      while (iter.hasNext()) {

        // Get string start
        int i = (int) iter.next();
        i += gap;

        // Change text based on placement of orginal substring
        if (i == 0) {
          text = replacement + text.substring(i + org.length(), text.length());
        } else if (i == (text.length() + 1) - org.length()) {
          text = text.substring(0, i) + replacement;
        } else  {
          text = text.substring(0, i) + replacement + text.substring(i +
            org.length(), text.length());
        }

        // Increment gap based on the difference between the two specified words
        gap += len_diff;
      }

      // Print the final product
      System.out.println(text);
    }
}
