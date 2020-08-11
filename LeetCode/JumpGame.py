
# Prompt: https://leetcode.com/problems/jump-game/


# Time O(n) Space O(1)
def jump_game(paths):
    if(len(paths) == 1 or len(paths) == 0):
        return True
    
    steps = 0
    for i  in range(len(paths)):
        steps = max(steps, paths[i])
        
        if(steps == 0):
            return False
        
        steps -= 1
    
    return True

paths1 = [2,3,1,1,4]
paths2 = [3,2,1,0,4]
paths3 = [3,1,1,0,2,4]

print(jump_game(paths1))
print(jump_game(paths2))
print(jump_game(paths3))