package SimplyCoding.JavaChallenges;

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends SimplyCoding.JavaChallenges.BiCycle {
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp= super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}

public class InheritanceTwo {
    public static void main(String []args){
        SimplyCoding.JavaChallenges.MotorCycle M=new SimplyCoding.JavaChallenges.MotorCycle();
    }
}
