# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

def subtract_product_and_sum(n):
    '''
    :type n: int
    :rtype: int
    '''
    # Careful with python2 and python3
    track_sum = n % 10
    track_product = n % 10

    n /= 10

    while n:
        n , mod = divmod(n, 10) #divmod is fast 'O'
        track_sum += mod
        track_product *= mod

    return track_product - track_sum


print(subtract_product_and_sum(234))
# print(subtract_product_and_sum(4421))