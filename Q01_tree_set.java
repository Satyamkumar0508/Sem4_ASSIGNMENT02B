import java.util.Scanner;
import java.util.TreeSet;

public class Q01_tree_set {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);

        // Displaying the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Asking user to enter a number and searching it in the TreeSet
        System.out.print("Enter a number to search in the TreeSet: ");
        int number = scanner.nextInt();
        if (treeSet.contains(number)) {
            System.out.println(number + " is present in the TreeSet.");
        } else {
            System.out.println(number + " is not present in the TreeSet.");
        }

        // Removing an element from the TreeSet
        System.out.print("Enter an element to remove from the TreeSet: ");
        int element = scanner.nextInt();
        if (treeSet.remove(element)) {
            System.out.println(element + " is removed from the TreeSet.");
        } else {
            System.out.println(element + " is not present in the TreeSet.");
        }

        // Displaying the TreeSet after removing an element
        System.out.println("TreeSet elements after removing " + element + ": " + treeSet);
    }
}
