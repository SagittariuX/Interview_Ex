# https://leetcode.com/problems/ugly-number-ii/

def nth_ugly_number(n):
    '''
    :type n: int
    :rtype: int
    '''
    track = [1]
    
    p2 = 0 #Points for each prime number
    p3 = 0
    p5 = 0

    while len(track) < n:
        next_num = min(track[p5] * 5, min(track[p2] * 2, track[p3] * 3))
        track.append(next_num)

        if next_num == track[p2] * 2: p2 += 1
        if next_num == track[p3] * 3: p3 += 1
        if next_num == track[p5] * 5: p5 += 1

    return track[-1]


print(nth_ugly_number(10))
