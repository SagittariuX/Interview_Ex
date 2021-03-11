
# https://leetcode.com/problems/count-primes/

def count_primes(n):
    '''
    :type n : int
    :rtype: int 
    '''
    if n < 2 : return 0

    dp = [0] * n
    count = 0

    for i in range(2, n):
        if (dp[i] == 0):
            count += 1
            for j in range(i, n, i):
                if j < n+1 : dp[j] = 1
    
    return count
    
print(count_primes(12))



        