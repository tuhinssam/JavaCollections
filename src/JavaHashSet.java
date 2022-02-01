import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {
    public static void main(String[] args){

        //hashset does not contain any duplicate element and doesn't maintain any order
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(7);
        hashSet.add(11);
        hashSet.add(13);
        hashSet.add(23);
        hashSet.add(17);
        System.out.println(hashSet);

        //remove from hashset
        hashSet.remove(23);
        System.out.println(hashSet);

        //check if hashSet contains
        System.out.println(hashSet.contains(55));

        for(int elem: hashSet){
            System.out.println("element: "+elem);
        }

        //clear the hashset
        hashSet.clear();

    }
}
