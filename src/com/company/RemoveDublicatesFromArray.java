package com.company;

import java.util.ArrayList;
import java.util.List;

public class RemoveDublicatesFromArray {
    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     *
     * Since it is impossible to change the length of the array in some languages,
     * you must instead have the result be placed in the first part of the array nums.
     * More formally, if there are k elements after removing the duplicates,
     * then the first k elements of nums should hold the final result.
     * It does not matter what you leave beyond the first k elements.
     *
     * @return k after placing the final result in the first k slots of nums
     *
     * Input: nums = [1,2,2,3,3], val = 5
     * Output: 3, nums = [1,2,3,_,_]
     *
     * *
     */

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }
        System.out.println(nums);
        return i + 1;
    }
}
