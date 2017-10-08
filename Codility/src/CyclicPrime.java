/**
 * Generate the cyclic primes in range 0 - N
 */
public class CyclicPrime {

    public static void main(String[] args) {
        solution(100);
    }

    public static void solution(int N) {
        for (int i = 2; i < N; i++) {
            if (isPrime(i) && i > 9 && isPrime(reverseNum(i))) {
                System.out.println(i);
            }
        }
    }

    public static int reverseNum(int num) {
        int res = 0;
        int c = 1;
        while (num != 0) {
            res = res * c + (num % 10);
            num /= 10;
            c *= 10;
        }

        return res;
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= x; i += 2) {
            if (x % 3 == 0) {
                return false;
            }
        }

        return true;
    }

}
