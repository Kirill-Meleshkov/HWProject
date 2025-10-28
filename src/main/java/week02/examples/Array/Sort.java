package week02.examples.Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = new int[]{23, 123, 54, 24};
        String[] strings = new String[]{"sort", "this", "strings", "array"};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strings));

        Arrays.sort(nums);
        Arrays.sort(strings);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strings));

    }
}

