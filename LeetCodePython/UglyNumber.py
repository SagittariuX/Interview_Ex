# https://leetcode.com/problems/ugly-number/

def ugly_num(n):

    if n == 0: return False
    if n == 1: return True

    for i in 2, 3, 5:
        
        while n % i == 0:
            n /= i
            if n == 1: return True
    

    return False

print(ugly_num(35))

    