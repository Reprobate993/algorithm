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
        System.out.println(Arrays.toString(mySolution(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    private static int[] mySolution(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            Integer num = map.get(i);
            map.put(i, num == null ? 1 : num + 1);
        }
        List<Integer> list = new ArrayList<>(Math.max(nums1.length, nums2.length));
        for (int i : nums2) {
            Integer num = map.get(i);
            if (num != null) {
                list.add(i);
                if (num - 1 == 0) {
                    map.remove(i);
                } else {
                    map.put(i, num - 1);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[] mySolutionAdvance(int[] nums1, int[] nums2) {
        return null;
    }

    private static int[] solution(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[Math.min(length1, length2)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                intersection[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
