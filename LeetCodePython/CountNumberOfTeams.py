# https://leetcode.com/problems/count-number-of-teams/
def count_teams(rating):
    """
    :type rating: List[int]
    :rtype: int
    """

    leng = len(rating)
    great = [0] * leng
    less = [0] * leng    

    for i in range(leng-1):
        for j in range(i+1, leng):
            if rating[i] > rating[j]:
                great[i] += 1
            elif rating[i] < rating[j]:
                less[i] += 1

    res = 0
    for i in range(leng-2):
        for j in range(i+1, leng):
            if rating[i] < rating[j]:
                res += less[j]
            elif rating[i] > rating[j]:
                res += great[j]
    

    return res

print(count_teams([2,1,3]))