'''
We can do a single pass through the input list, checking whether we've already seen (target - current value).
We can store the seen values in a map from value to index so we know our return index pair.

This algorithm runs in O(n) time and O(n) space.
'''

class Solution:

    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i in range(len(nums)):
            key = target-nums[i]
            if key in seen:
                return [seen[key], i]
            seen[nums[i]] = i