
# https://leetcode.com/problems/search-in-rotated-sorted-array/
# Assuming nums cannot be rotated 360 back to original position

def rotated_search( nums, target):

    left = 0
    right = len(nums)
    middle = (left + right) // 2
    if nums[middle] == target:
        return middle
             




    return -1


nums = [7,8,9,0,1,2,3,4,5,6]
