/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 *
 * https://leetcode.com/problems/single-number/description/
 *
 * algorithms
 * Easy (59.22%)
 * Total Accepted:    434.3K
 * Total Submissions: 731K
 * Testcase Example:  '[2,2,1]'
 *
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 *
 * Example 1:
 *
 *
 * Input: [2,2,1]
 * Output: 1
 *
 *
 * Example 2:
 *
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 *
 */
class Solution {
    public int singleNumber(int[] nums) {
    // 利用数学算法，2 * (a + b + c) - (a + a + b + b + c) = c
    // 有点子想法的

    if (nums == null || nums.length == 0) return 0;

    Set<Integer> set = new HashSet<Integer>();
    int a = 0;
    for ( int i : nums) {
        a += i;
        set.add(i);
    }

    int b = 0;
    for (int i : set) {
        b += i;
    }

    return 2 * b - a;
    }
}

