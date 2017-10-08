import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * So the task is about converting integers into bytes representation, or more simply a number written in base -2. The formula is B[i]*(−2)i for i = [0..N−1] where B is array of bytes and N is length of this array.
 * For example we have following array [1,0,0,1,1], then to find out actual integer we have to:
 */
public class Negabinary {
    public static void main(String[] args) {
        assert negaBinaryToInteger(new int[]{1, 0, 0, 1, 1}, -2) == 9;
        assert Arrays.equals(integerToNegaBinary(9, -2), new int[]{1, 0, 0, 1, 1});

        assert negaBinaryToInteger(new int[]{1,0,0,1,1,1}, -2) == -23;
        assert Arrays.equals(integerToNegaBinary(23, -2), new int[]{1, 1, 0, 1, 0,1,1});
    }

    public static int[] integerToNegaBinary(int x, int negativeBase) {
        List<Integer> res = new ArrayList<>();
        while (x != 0) {
            int rem = x % negativeBase;
            res.add(Math.abs(rem));
            x = (int) Math.ceil((double)x / negativeBase);
        }
        int c = 0;
        int[] resPrimitive = new int[res.size()];
        for (int el : res) {
            resPrimitive[c] = el;
            c++;
        }
        return resPrimitive;
    }

    public static int negaBinaryToInteger(int[] A, int negativeBase) {
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i] * Math.pow(negativeBase, i);
        }
        return total;
    }

}
