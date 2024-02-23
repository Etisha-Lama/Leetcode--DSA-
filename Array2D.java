import java.util.ArrayList;
import java.util.List;

public class Array2D {

    public List<List<Integer>> findMatrix(int[] nums) {
        int[] np = new int[nums.length + 1];
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            int freq = np[num];

            if (freq == result.size()) {
                result.add(new ArrayList<>());
            }
            
            result.get(freq).add(num);
            np[num]++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; // Example array of integers

        Array2D array2D = new Array2D();
        List<List<Integer>> result = array2D.findMatrix(nums);

        // Print the resulting 2D array
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
