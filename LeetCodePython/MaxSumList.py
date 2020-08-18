# prompt: Given a list of integers, 
# write a function that returns the largest sum of non-adjacent numbers. 
# Numbers can be 0 or negative.

def max_sum_list(nums):
    
    if len(nums) == 0: return None
    if len(nums) == 1: return nums[0]
    if len(nums) == 2: return max(nums[0], nums[1])

    first = nums[0]
    second = max(nums[0], nums[1])


    for i in range(2, len(nums)):
        if first < 0 and nums[i] > first: #if first is negative and the new number is larger than it just take it
            temp = second
            second = nums[i]
            first = second
        else:
            temp = second
            second = max(first, first + nums[i])
            first = temp


    return max(first, second)

nums = [-1,-1,2,4,6,2,5]

print(max_sum_list(nums))
