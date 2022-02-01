import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        //stores the values in sorted order
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(13);
        treeSet.add(23);
        treeSet.add(43);
        treeSet.add(11);
        treeSet.add(17);
        System.out.println(treeSet);
        treeSet.remove(43);
        System.out.println(treeSet);

        for (int elem: treeSet){
            System.out.println("element: "+elem);
        }
        System.out.println(treeSet.contains(12));
        treeSet.clear();
        System.out.println(treeSet);
    }
}
