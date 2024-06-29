import java.util.ArrayList;
import java.util.List;

public class assment1 {
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElements = new ArrayList<>();
        // Create a set to store unique elements from array1
        List<Integer> set1 = new ArrayList<>();
        for (int number : array1) {
            if (!set1.contains(number)) {
                set1.add(number);
            }
        }
        // Check if each element in array2 is in the set, and add it to the common elements list if so
        for (int number : array2) {
            if (set1.contains(number)) {
                commonElements.add(number);
            }
        }
        return commonElements;
    }
    public static void main(String[] args) {
        int[] myarray1 = {1, 2, 3, 6};
        int[] myarray2 = {2, 3, 4 ,6};
        List<Integer> commonElements = findCommonElements(myarray1, myarray2);
        System.out.println(commonElements); // Output: [2, 3]
    }
}