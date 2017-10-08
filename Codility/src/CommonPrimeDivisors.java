import java.util.*;

/**
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 * <p>
 * A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.
 * <p>
 * You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.
 * <p>
 * For example, given:
 * <p>
 * N = 15 and M = 75, the prime divisors are the same: {3, 5};
 * N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
 * N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A, int[] B); }
 * that, given two non-empty zero-indexed arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 15   B[0] = 75
 * A[1] = 10   B[1] = 30
 * A[2] = 3    B[2] = 5
 * the function should return 1, because only one pair (15, 75) has the same set of prime divisors.
 * <p>
 * Assume that:
 * <p>
 * Z is an integer within the range [1..6,000];
 * each element of arrays A, B is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(Z*log(max(A)+max(B))2);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
public class CommonPrimeDivisors {
    public static Set<Integer> primeFactors(int n) {
        // Print the number of 2s that divide n
        Set<Integer> res = new HashSet<>();
        while (n % 2 == 0) {
            res.add(2);
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }

        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
            res.add(n);

        return res;
    }
    //61%, performance problem
    public static int solution(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            Set<Integer> a = primeFactors(A[i]);
            Set<Integer> b = primeFactors(B[i]);

            if (b.equals(a)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.print(solution(new int[]{15, 10, 3}, new int[]{75, 30, 5}));
    }

}
