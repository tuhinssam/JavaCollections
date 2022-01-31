import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1,5);
        System.out.println("List1: "+list1);

        ArrayList<Integer>  list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List2: "+list2);

        //merge two lists
        list1.addAll(list2);
        System.out.println("Merged List: "+list1);

        //update specific element
        list1.set(2, 1000);
        System.out.println("2nd index updated: "+list1);

        //get element
        System.out.println("Get 2nd element: "+list1.get(2));

        //check if element is available in list
        boolean isContains = list1.contains(1000);
        System.out.println("1000 is available? "+isContains);

        //clear entire list
        list2.clear();
        System.out.println(list2);

        //iterate in a list
        for(int element: list1){
            System.out.println(element);
        }

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()){
            System.out.println("Iterator: "+it.next());
        }
    }
}
