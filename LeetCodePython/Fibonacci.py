
#learning dynamic programming
#prompt: given n return the nth fibonacci number

def fibonacci(n):
    a = 0
    b = 1

    if n == 1: return 0
    if n == 2: return 1

    for i in range(2, n):
        temp = b
        b = b + a
        a = temp

    return b 


print(fibonacci(10))