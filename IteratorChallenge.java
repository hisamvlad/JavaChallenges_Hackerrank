package SimplyCoding.JavaChallenges;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class IteratorChallenge {

    static SimplyCoding.JavaChallenges.IteratorChallenge func(ArrayList mylist){
        Iterator it=  mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)

            break;
        }
        return (SimplyCoding.JavaChallenges.IteratorChallenge) it;

    }



    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it= (Iterator) func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
