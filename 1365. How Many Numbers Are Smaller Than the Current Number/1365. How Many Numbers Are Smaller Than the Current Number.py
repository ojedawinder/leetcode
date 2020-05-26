def smallerNumbersThanCurrent(nums):
    array = []
    for i in nums:
        minimums = 0
        for j in nums:
            if j< i:
                minimums+=1
        array.append(minimums)
    return array

print(smallerNumbersThanCurrent([6,5,4,8]))