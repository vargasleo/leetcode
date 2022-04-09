package topKFrequentElements;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 * Medium
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> frequencyHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        for (Integer value : frequencyMap.keySet()) {
            frequencyHeap.add(value);
            if (frequencyHeap.size() > k) {
                frequencyHeap.poll();
            }
        }

        int[] topKFrequents = new int[k];
        for (int i = 0; i < k; i++) {
            topKFrequents[i] = frequencyHeap.poll();
        }
        return topKFrequents;
    }
}
