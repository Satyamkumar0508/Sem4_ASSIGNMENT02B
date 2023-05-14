import java.util.HashSet;
import java.util.Iterator;

public class Q04_hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(); // create a hash set of type string
        
        // insert some elements into the hash set
        hashSet.add("appl4e");
        hashSet.add("anana");
        hashSet.add("lelo");
        hashSet.add("cherry");
        hashSet.add("ka ho");
        
        // display the hash set
        System.out.println(hashSet);
//        Iterator<String> i=hashSet.iterator();  
//        while(i.hasNext())  
//        {  
//        System.out.println(i.next());  
//        }  
    }
}
