package SimplyCoding.JavaChallenges;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class JavaStudent{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

public class ReflectionAttributes {

    public static void main(String[] args){
        // Get the student class
        Class student = SimplyCoding.JavaChallenges.JavaStudent.class;
        // An array named methods of type Method is created which stores all the methods of the Student class.
        Method[] methods = student.getDeclaredMethods();
        //An ArrayList of type String named methodList is declared to store all the method names of the class Student.
        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            // For each method of the Student class, the method name is added to the methodList using the getName()
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
