import java.util.LinkedHashSet;

public class Q05_linkedhashset {
    public static void main(String[] args) {
        // Create a LinkedHashSet of type double
        LinkedHashSet<Double> set = new LinkedHashSet<>();
        
        // Insert some elements into the set
        set.add(3.14);
        set.add(2.71);
        set.add(1.618);
        set.add(0.707);
        set.add(4.669);
        
        // Display the contents of the set
        System.out.println("LinkedHashSet elements: " + set);
    }
}
