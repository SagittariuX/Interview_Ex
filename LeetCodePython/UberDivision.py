# Prompt:
# Given an array of integers, return a new array such that each element at index i of the new array is 
# the product of all the numbers in the original array except the one at i.

# For example, if our input was [1, 2, 3, 4, 5], 
# the expected output would be [120, 60, 40, 30, 24]. 
# If our input was [3, 2, 1], the expected output would be [2, 3, 6].


#Attempt 1
#Solution Time O(n*n) Space(n)
def my_function(list):
    if(len(list) == 0): return None
    
    ans = []
    for i in range(len(list)):
        ans.append(list_product(list, i))
    
    return ans
    
def list_product(list, i):
    ans = None
    for j in range(len(list)):
        if j != i:
            if ans == None:
                ans = list[j]
            else:
                ans *= list[j]
    
    return ans


#Update: looked up some more information about this question
#New Rule 1: all integers inside the given array are >1 
#New Rule 2: the answer array does not count as extra space
#New Rule 3: no division

# Time O(n) Space O(1)
def my_function2(list):
    if(len(list) == 0): return None
    if(len(list) == 1): return [0]
    ans = [1]*len(list)
    
    for i in range(1, len(list) , 1):
        if i == 0 : #left most element
            ans[i] = 1
        else:
            ans[i] = list[i-1]*ans[i-1]
      
    # this part is a little messy
    for i in range(len(list)-1, -1 , -1):
        if i == len(list)-1 : #right most element 
            ans[i] *= 1
        else:
            ans[i] *= list[i+1]
            list[i] *= list[i+1]
            
    return ans




list1 = [1, 2, 3, 4, 1]
list2 = [3, 2, 1]

print(my_function2(list1))
print(my_function(list2))




