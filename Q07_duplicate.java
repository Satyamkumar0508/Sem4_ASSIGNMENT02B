import java.util.Scanner;
import java.util.HashSet;

public class Q07_duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> numSet = new HashSet<>();
        
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            int num = input.nextInt();
            numSet.add(num);
        }
        
        System.out.println("Elements in set: " + numSet);
    }
}
