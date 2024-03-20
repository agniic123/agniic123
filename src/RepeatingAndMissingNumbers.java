import java.util.*;

public class RepeatingAndMissingNumbers {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int sum1=0;
        int sum2=0;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {

                if (set.contains(grid[i][j])) {
                    list.add(grid[i][j]);
                }
                else
                {
                    set.add(grid[i][j]);

                }
            }
        }
        for(int k=0;k<=n*n;k++)
        {
            sum1+=k;
        }

        System.out.println(set);
        for(int elements:set)
        {
            sum2+=elements;
        }
        System.out.println(sum1);
        list.add(sum1-sum2);

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public static void main(String[] args) {
        RepeatingAndMissingNumbers solution = new RepeatingAndMissingNumbers();

        // Example 1
        int[][] grid1 = {{1, 3}, {2, 2}};
        int[] result1 = solution.findMissingAndRepeatedValues(grid1);
        System.out.println("Example 1 Output: " + Arrays.toString(result1)); // Output: [2, 4]

        // Example 2
        int[][] grid2 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] result2 = solution.findMissingAndRepeatedValues(grid2);
        System.out.println("Example 2 Output: " + Arrays.toString(result2)); // Output: [9, 5]
    }
}
