package SimplyCoding.JavaChallenges;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        // Solution:

        StringBuilder str = new StringBuilder(A);
        System.out.println(str);
        StringBuilder reverse = str.reverse();
        System.out.println(reverse);


        if (A.equals((reverse.toString()))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }




    }
}
