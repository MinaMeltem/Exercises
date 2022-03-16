package com.company;

public class RemoveElement {

    /***
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
     * The relative order of the elements may be changed.
     *
     * Since it is impossible to change the length of the array in some languages,
     * you must instead have the result be placed in the first part of the array nums.
     * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
     * It does not matter what you leave beyond the first k elements.
     *
     * Return k after placing the final result in the first k slots of nums.
     *
     * For example;
     *
     * Input: nums = [3,2,2,3],ill val = 2 (remove 2)
     * Output: 2, nums = [2,2,_,_]
     * Your function should return k = 2, with the first two elements of nums being 2.
     *
     * Input: nums = [0,1,2,2,3,0,4,2], val = 3 (remove 3 )
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
     *
     *
     */

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int behind = 0;
        for ( int ahead = 1; ahead < nums.length; ahead++) {
            if ( nums[ahead] != val ) {
                nums[behind] = nums[ahead];
                behind++;
            }
        }
        System.out.println(nums);
        return behind + 1;

    }

}
