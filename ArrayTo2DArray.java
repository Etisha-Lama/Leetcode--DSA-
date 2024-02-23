import java.util.ArrayList;
import java.util.List;

public class ArrayTo2DArray {

    public static List<List<Integer>> convertTo2DArray(int[] array, int rows, int columns) {
        List<List<Integer>> result = new ArrayList<>();

        if (array.length != rows * columns) {
            System.out.println("Invalid array dimensions for conversion to 2D array.");
            return result;
        }

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(array[i * columns + j]);
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6}; // Example 1D array
        int rows = 2;
        int columns = 3;

        List<List<Integer>> result = convertTo2DArray(array, rows, columns);

        // Print the resulting 2D array
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
