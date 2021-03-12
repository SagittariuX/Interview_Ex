
def count_consecutive_binary(n):
    '''
    :type n: int
    :rtype: int    
    '''
    max_con = 0
    current_con = 0

    for i in range(32):
        if ((1 << i) & n > 0):
            current_con += 1
        else: 
            max_con = max(max_con, current_con)
            current_con = 0

    return max_con


print(count_consecutive_binary(154))
