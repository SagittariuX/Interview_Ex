
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

# paths1 = [2,3,1,1,4]
# paths2 = [3,2,1,0,4]
# paths3 = [3,1,1,0,2,4]

# print(jump_game(paths1))
# print(jump_game(paths2))
# print(jump_game(paths3))


# Prompt: https://leetcode.com/problems/jump-game-ii/
def jump_game_2(paths):
    if len(paths) == 0: return 0
    if len(paths) == 1: return 1

    jump = 0 #track total number of jumps
    current = 0 #track current location in paths
    reach = paths[0] #how far I can currently go
    potential_reach = 0 #how far I have already checked

    while(current < len(paths)):
        best_jump = 0
        for i in range(1, reach+1):
            if best_jump < current+i+paths[i]:
                best_jump = current+i+paths[i]
                current += i
                reach = paths[i]
        jump += 1    
    return jump

paths = [2,3,1,1,4]
paths = [1,5,1,1,1,1,1,1]

print(jump_game_2(paths))



