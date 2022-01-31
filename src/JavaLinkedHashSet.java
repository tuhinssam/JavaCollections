import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaLinkedHashSet {
    public static void main(String[] args){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(23);
        set.add(17);
        System.out.println(set);

        set.remove(23);
        System.out.println(set);

        set.add(31);
        System.out.println(set);

        System.out.println(set.contains(33));

        set.clear();
        System.out.println(set);
    }
}
