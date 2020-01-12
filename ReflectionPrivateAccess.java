package SimplyCoding.JavaChallenges;

import java.io.*;
import java.security.*;

public class ReflectionPrivateAccess {
    public static void main(String[] args) throws Exception {
        SimplyCoding.JavaChallenges.DoNotTerminate.forbidExit();

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o; // Must be used to hold the reference of the instance of the class Solution.Inner.Private
            // call powerof2() pass input number "num"
            SimplyCoding.JavaChallenges.ReflectionPrivateAccess.Inner inner = new Inner();
            o = inner.new Private();
            //Method hidden = o.getClass().getDeclaredMethod("powerof2", cArgs);
            //hidden.setAccessible(true);
            //String answer = hidden.invoke(o, num).toString();
            System.out.println(num+" is " + ((Inner.Private) o).powerof2(num));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (SimplyCoding.JavaChallenges.DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution

class DoNotTerminate { //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
