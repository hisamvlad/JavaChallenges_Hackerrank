package SimplyCoding.JavaChallenges;

class Arithmetic {


    Integer add(int a, int b) {
        return a+b;
    }
}

class Adder extends SimplyCoding.JavaChallenges.Arithmetic {

}

public class InheritanceOne {
    public static void main(String []args){
        // Create a new Adder object
        SimplyCoding.JavaChallenges.Adder a = new SimplyCoding.JavaChallenges.Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
