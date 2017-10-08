import java.util.ArrayList;
import java.util.Collections;

/**
 * A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * <p>
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 * For example, consider array A such that:
 * <p>
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * Triplet (0, 2, 4) is triangular.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * the function should return 1, as explained above. Given array A such that:
 * <p>
 * A[0] = 10    A[1] = 50    A[2] = 5
 * A[3] = 1
 * the function should return 0.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N*log(N));
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class Triangle {

    public static void main(String[] args) {
        assert solution(new int[]{10, 2, 5, 1, 8, 20}) == 1;
        assert solution(new int[]{1}) == 0;
        assert solution(new int[]{1, 2}) == 0;
        assert solution(new int[]{1, 1, 1}) == 1;
        assert solution(new int[]{5, 3, 3}) == 1;
    }

    //RESULT 100%
    public static int solution(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        ArrayList<Long> sortedArray = new ArrayList<>();
        for (int x : A) {
            sortedArray.add((long) x);
        }

        Collections.sort(sortedArray);
        Long val2 = null;
        Long val3;

        Long val = null;
        if (sortedArray.size() > 2) {
            val = sortedArray.get(0);
            val2 = sortedArray.get(1);
        }

        for (int i = 2; i < sortedArray.size(); i++) {
            val3 = sortedArray.get(i);

            if (val != null
                    && val3 != null
                    && val2 != null
                    && val + val2 > val3
                    && val2 + val3 > val
                    && val3 + val > val2) {

                return 1;
            }
            val = val2;
            val2 = val3;
        }

        return 0;
    }

}
