import java.util.HashMap;

public class Q06_hashmap {
    public static void main(String[] args) {
        // Creating a new hash map
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Inserting some elements into the hash map
        hashMap.put("key1", 10);
        hashMap.put("key2", 20);
        hashMap.put("key3", 30);

        // Displaying the contents of the hash map
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
 