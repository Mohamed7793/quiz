import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        // Create a set to store unique elements
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        // Add all elements from the array to the set
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert the set back to an array and return it
        return uniqueElements.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        int[] output = removeDuplicates(input);

        // Print the output array
        for (int num : output) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 5
    }
}