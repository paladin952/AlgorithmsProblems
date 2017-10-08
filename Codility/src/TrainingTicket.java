import java.util.HashMap;
import java.util.Map;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * For another example, given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 * <p>
 * Copyright 2009–2017 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
public class TrainingTicket {
    public static void main(String args[]) {
        System.out.println(solution(new int[]{3, 4, 1}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{1, 3, 6, 4, 2}));
        System.out.println(solution(new int[]{-1, -3}));
        System.out.println(solution(new int[]{-1, -3, 0, 1, 2, 3}));
        System.out.println(solution(new int[]{1321321321}));
    }

    //100%
    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, 1);
        }

        Integer res= null;
        Integer last= null;
        for (int i = 1; i<=A.length;i++) {
            if (!map.containsKey(i)) {
                res = i;
                break;
            } else {
                last = i;
            }
        }

        if (res != null) {
            return res;
        } else {
            return last +1;
        }
    }
}
