
# Find the element where list[i] = i

def naive_find(nums) -> int:
    '''
    :type nums: List[int]
    '''
    
    for i in range(len(nums)):
        if(nums[i] == i):
            return i

    return -1

def binary_find(nums, l, r) -> int:
    '''
    :type nums: List[int]
    :type l: int
    :type r: int
    '''
    if(r < l):
        return -1

    middle = int((l+r)/2)
    
    if(nums[middle] == middle):
        return middle
    else:
        if(nums[middle] > middle):
            return binary_find(nums, l, middle-1)
        else:
            return binary_find(nums, middle+1, r)
    



nums = [-40,-20,-1,1,2,3,5,7,9,12,13]
print(naive_find(nums))
print(binary_find(nums, 0 , len(nums)))