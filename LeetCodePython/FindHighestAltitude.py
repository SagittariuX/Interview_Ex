# https://leetcode.com/problems/find-the-highest-altitude/
def find_highest_alt(gain):
    '''
    :type gain: List[int]
    :rtype: int
    '''
    highest = 0
    current = 0
    for i in gain:
        current = current + i
        highest = max(current, highest)

    return highest


print(find_highest_alt([-5,1,5,0,-7]))
print(find_highest_alt([-4,-3,-2,-1,4,3,2]))