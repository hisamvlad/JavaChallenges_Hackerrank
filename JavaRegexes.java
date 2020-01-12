package SimplyCoding.JavaChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexes {

    public static void main(String[] args) {


        String source = "Java now has regular expressions";
        String[] regex = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "S{1}.", "s{0,3}"};

        for (String pattern : regex) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(source);

            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() -1));
            }
        }


    }

}
