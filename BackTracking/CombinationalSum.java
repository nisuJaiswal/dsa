package BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Intution
// Step 1: Remove the duplicates and sort the input array
// Step 2: Initialize the res array along with the backtracking array temp and 
// Step 3: Create a recursive function which accepts the input array, sum, res array, index and temp array
// Step 4: Base Case: If sum == 0 then add the elements of temp into the res arry
// Step 5; for i = index to size of input array: 
// Step 5.1 : check if the difference betwen current elemenet and sum is greater than 0, otherwise do nothing
// Step 5.2 : Add the current element into the temp array ( To have backtracking )
// Step 5.3 : Apply recursive call on the function with all the same values except sum = sum - current element and index = i
// Step 5.4 : Remove the current element from backtracking array i.e. temp array; 

public class CombinationalSum {

    public static ArrayList<ArrayList<Integer>> combinationalSum(ArrayList<Integer> arr, int sum) {
        // Removing the duplicates and sorting the array
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);

        // Initializing the vairables
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        getCombinations(arr, res, sum, 0, temp);
        return res;

    }

    public static void getCombinations(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> res, int sum, int index,
            ArrayList<Integer> temp) {
        // Base Case:
        if (sum == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.size(); i++) {

            // Checking if the diff is greater than 0
            if (sum - arr.get(i) >= 0) {
                temp.add(arr.get(i));

                getCombinations(arr, res, sum - arr.get(i), i, temp);

                temp.remove(arr.get(i));
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        int sum = 8;

        ArrayList<ArrayList<Integer>> res = combinationalSum(arr, sum);
        System.out.println();
        for (int i = 0; i < res.size(); i++) {
            System.out.print(" {" + " ");
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.print(" }");
        }

    }
}
