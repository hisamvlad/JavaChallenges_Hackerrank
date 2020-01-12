package SimplyCoding.JavaChallenges;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.*;

public class RegexGroups {
    static public final String POEM =
            "Twas brilling, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves, \n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        Pattern p = Pattern.compile("\\b((?![A-Z])\\w+)\\b");
        Matcher m = p.matcher(POEM);
        while(m.find()) {
            words.add(m.group(1));
            System.out.println("Number of unique words " + words.size());
            System.out.println(words.toString());
            }
        }
    }


