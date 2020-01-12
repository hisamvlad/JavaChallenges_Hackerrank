package SimplyCoding.JavaChallenges;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexesTwo {

    public static void main(String[] args) {


        String source = "Arline ate eight apples and one orange while Anita hadn’t any";
        String regEx = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(source);

        while (m.find()) {
            System.out.println("Match" + m.group() + "at" + m.start() + " - " + m.end());
        }
    }
}
