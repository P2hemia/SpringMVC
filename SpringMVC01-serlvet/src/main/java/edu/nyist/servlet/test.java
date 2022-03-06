package edu.nyist.servlet;

import org.junit.Test;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/25 8:02
 * @email p2hemia@nyist.edu.cn
 **/
public class test {

    @Test
    public void test() {
        int[] str={6,5,4,8,9,7,2,1,3,0};
        int left=0;
        int right=9;
        quicksort(str,left,right);
        for (int i : str) {
            System.out.println(i);
        }
    }
    public void quicksort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = nums[left];
        while (i < j) {
            while (nums[++i] < x) {
                ;
            }
            while (nums[--j] > x) {
                ;
            }
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        quicksort(nums, left, j);
        quicksort(nums, j + 1, right);
    }


}
