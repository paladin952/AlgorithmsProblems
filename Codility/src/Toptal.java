/**
 * Created by clapalucian on 07/10/2017.
 */
public class Toptal {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, -2, 3, 8, 6}));
        System.out.println(solution(new int[]{-5, -5, -5, -42, 6, 12}));
        System.out.println(solution(new int[]{5, 6}));
        System.out.println(solution(new int[]{5, 6, 7}));
        System.out.println(solution(new int[]{6, 1, -2, -2, 5, 8, 7}));

    }

    public static int solution(int[] A) {
        int index = 0;
        int max = Integer.MIN_VALUE;
        boolean onlyAscending = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (i ==0) {
                max = A[0];
                index = 0;
            }
            if (A[i] < A[i+1] && A[i] > max) {
                if (onlyAscending == false) {
                    index = i;
                }
                onlyAscending = true;
            } else {
                index = i;
                onlyAscending = false;
            }

            if (!onlyAscending && max < A[i]) {
                max = A[i];
                index  = i;
            }
        }
        if (index == 0) {
            return 1;
        }
        return index;
    }

//    class Solution {
//        public int solution(Tree T) {
//            // write your code in Java SE 8
//            return longest(T, 0) - 1;
//        }
//
//    private int longest(Tree T, int max) {
//        if(T == null) {
//            return 0;
//        }
//        int left = count(T, true, 0);
//        int right = count(T, false, 0);
//
//        max = Math.max(left, right);
//        max = Math.max(max, longest(T.l, max));
//        max = Math.max(max, longest(T.r, max));
//        return max;
//    }
//
//    public int count(Tree node, boolean moveLeft, int counter){
//        if(node == null){
//            return counter;
//        }
//
//        if(moveLeft) {
//            counter = count(node.l, !moveLeft, node.l == null? counter : counter+1);
//        } else {
//            counter = count(node.r, !moveLeft, node.r == null? counter : counter+1);
//        }
//        return counter;
//
//    }
//}

}
