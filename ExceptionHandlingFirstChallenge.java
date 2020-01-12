package SimplyCoding.JavaChallenges;


import java.util.*;

public class ExceptionHandlingFirstChallenge {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        try {
            int x = scr.nextInt();
            int y = scr.nextInt();
            if(y == 0) {

                System.out.println("java.lang.ArithmeticException: / by zero");
            } else {
                System.out.println(x/y);
            }
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }

    }
}
