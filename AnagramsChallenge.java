package SimplyCoding.JavaChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsChallenge {

    static boolean isAnagram(String a, String b) {
       // If a & b has the same chars with same freq, they're anagrams
        if (a.length() != b.length()) {
            return false;
        }

        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();

        boolean anagram = true;

        Arrays.sort(charA);
        Arrays.sort(charB);

        for(int i = 0; i< a.length(); i++) {
            if(charA[i] != charB[i]) {
                anagram = false;
            }
        }

        return anagram;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
