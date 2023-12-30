def findSmallest(arr):
    num_Set = set(arr)
    missing = 1
    while missing in num_Set:
        missing += 1
    
    return missing

arr = [1,-1,3,7,8,0,2,5,-6]
smallest_missing = findSmallest(arr)
print(smallest_missing)