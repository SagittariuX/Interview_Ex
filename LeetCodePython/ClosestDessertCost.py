
ideal = 0
diff = 0
def closestCost(baseCosts, toppingCosts, target):
    """
    :type baseCosts: List[int]
    :type toppingCosts: List[int]
    :type target: int
    :rtype: int
    """
    toppingCosts.sort()
    baseCosts.sort()
    for i in range(len(baseCosts)):
        helper(baseCosts[i], toppingCosts, 0,target)

    return ideal




def helper(base, topping_costs, topping, target):
    if(topping == topping_costs):
        return
    
    




