def createTargetArray(nums, index):
    target_array = []
    for i in range(0, len(nums)):
        index_to_insert = index[i]
        value_to_insert = nums[i]
        target_array.insert(index_to_insert, value_to_insert)
    return target_array

print(f'\nInput: nums = [0,1,2,3,4], index = [0,1,2,2,1]\nOutput: {createTargetArray([0,1,2,3,4], [0,1,2,2,1])}')
print(f'\nInput: nums = [1,2,3,4,0], index = [0,1,2,3,0]\nOutput: {createTargetArray([1,2,3,4,0], [0,1,2,3,0])}')