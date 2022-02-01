import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {
        //treemap stores the values in order on the basis of key
        Map<Integer, String> nums = new TreeMap<>();
        nums.put(1, "One");
        nums.put(3, "Three");
        nums.put(2, "Two");
        nums.put(5, "Five");
        System.out.println(nums);

        for(Map.Entry<Integer, String> e: nums.entrySet()){
            System.out.println("Key: "+e.getKey()+" value: "+ e.getValue());
        }

        nums.remove(2);
        System.out.println(nums);
    }
}
