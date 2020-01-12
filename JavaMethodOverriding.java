package SimplyCoding.JavaChallenges;

class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends SimplyCoding.JavaChallenges.Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class JavaMethodOverriding {
    public static void main(String []args){
        SimplyCoding.JavaChallenges.Sports c1 = new SimplyCoding.JavaChallenges.Sports();
        SimplyCoding.JavaChallenges.Soccer c2 = new SimplyCoding.JavaChallenges.Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
