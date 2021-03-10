# https://leetcode.com/problems/continuous-subarray-sum/

def checkSubarraySum(nums, k):
    """
    :type nums: List[int]
    :type k: int
    :rtype: bool
    """
    
    for i in range(len(nums)-1):
        for j in range(i+2, len(nums)+1):
            # print( '{0} {1}'.format(sum(nums[i:j]),k))
            print('{0} {1}'.format(i,j))
            
            if (sum(nums[i:j]) == 0 and k==0):
                return True
            elif(k != 0):
                if (sum(nums[i:j]) % k == 0):
                    return True
    
    return False
