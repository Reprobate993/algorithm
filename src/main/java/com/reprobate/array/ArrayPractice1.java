package com.reprobate.array;

import java.util.*;

/**
 * @classname: ArrayPractice1
 * @author: Reprobate
 * @date: 2023/3/21
 * @description: 这里描述类的用途
 **/
public class ArrayPractice1 {

    /**
     * 给定两个数组，编写一个函数来计算它们的交集
     *
     * 示例 1:
     * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出: [2,2]
     *
     * 示例 1:
     * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出: [4,9]
     *
     * 进阶:
     * 如果给定的数组已经排好序呢？将如何优化你的算法呢？
     */
    public static void main(String[] args) {

    }

    private static int[] mySolution(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                resultSet.add(i);
            }
        }
        return null;
    }

    private static int[] mySolutionAdvance(int[] nums1, int[] nums2) {
        return null;
    }

    private static int[] solution(int[] nums1, int[] nums2) {
        return null;
    }
}
