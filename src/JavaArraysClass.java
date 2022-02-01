import java.util.Arrays;

public class JavaArraysClass {
    public static void main(String[] args) {
        int[] nums = {1,2, 3,4,11,15, 13,8};

        Arrays.sort(nums);
        for(int elem: nums)
            System.out.println(elem);

        int index = Arrays.binarySearch(nums,8);
        System.out.println("Value fount at position: "+index);


        //fills the array with specified number
        Arrays.fill(nums, 12);
        for(int elem: nums)
            System.out.println(elem);
    }
}
