
# https://leetcode.com/problems/search-insert-position/

def naive_search(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """

    for i in range(len(nums)):
        if target <= nums[i]: return i
    
    return len(nums)

def binary_search(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """
    l , r = 0 , len(nums)

    while l < r:
        