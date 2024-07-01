package AdvancedDSA3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class stacks2 {

    public static int[] NGE_on_right(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i > 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 8, 2, 10, 9};
        int[] result = NGE_on_right(arr);
        System.out.println(Arrays.toString(result));
    }

}
