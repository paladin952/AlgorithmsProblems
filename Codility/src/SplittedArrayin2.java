/**
 * Your function takes an array of integers (arr), and an integer (x). You need to find the position in arr that splits the array in two,
 * where one side has as many occurrences of x as the other side has occurrences of any number but x (there was some additional info about
 * edge cases, but that's the gist of it). So, given an array like this: [5, 5, 2, 3, 5, 1, 6] and x being "5", the function should return
 * "4" (Position 4, holding the number "3" above is the point where you have 2 5's on the one side, and two "not fives" on the other.
 */
public class SplittedArrayin2 {

    public static void main(String[] args) {
        assert  solution(new int[]{5,5,2,3,5,1,6}, 5) == 4;
        assert  solution(new int[]{5,5,2,3,5,5,1}, 5) == 5;
        assert  solution(new int[]{5,1}, 5) == 0;
    }

    public static int solution(int[] arr, int x) {
        int lastPos = 0;
        int counter = 0;
        for (int el : arr) {
            if (el == x) {
                lastPos = counter;
            }
            counter ++;
        }
        return lastPos;
    }

}
