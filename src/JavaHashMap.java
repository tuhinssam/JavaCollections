import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map);

        if(!map.containsKey("four")){
            map.put("four", 4);
        }
        map.putIfAbsent("four", 4);
        System.out.println(map);

        //iterating in map
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e);
            System.out.println("Key: "+e.getKey());
            System.out.println("value: "+e.getValue());
        }

        //iterate over keys
        for(String key: map.keySet()){
            System.out.println("key: "+key);
        }

        //iterate over values
        for(Integer val: map.values()){
            System.out.println("Value: "+val);
        }

        //check if value is present in map
        System.out.println(map.containsValue(11));

        //check if map is empty
        System.out.println(map.isEmpty());
    }
}
