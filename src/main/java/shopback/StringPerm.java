package shopback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malam on 7/29/16.
 */
public class StringPerm {

    private static List<String> result;

    /**
     * Client exposed method to determine all possible permutations of astring
     *
     * @param input the input string
     * @return  list of permutations of the input string
     */
    public static List<String> permutation(String input){
        result = new ArrayList<>();
        permutation("", input);
        return result;
    }

    /**
     * Internal method to recursively determine the permutations of the string
     *
     * @param perm
     * @param word
     */
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm);
            result.add(perm);
        } else {
            for (int i = 0; i < word.length(); i++) {
                boolean found = false;

                for (int j = 0; j < i; j++)
                    if (word.charAt(j) == word.charAt(i))
                        found = true;

                if (found)
                    continue;

                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }

}
