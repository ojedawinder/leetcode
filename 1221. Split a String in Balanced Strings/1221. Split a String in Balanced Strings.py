def balancedStringSplit(s):
    count = 0
    s_list = list(s)
    count_r = 0
    count_l = 0
    for c in s_list:
        if(count_l==count_r):
            count+=1
            count_l = 0
            count_r = 0
        if c.upper() == 'R':
            count_r+=1
        elif c.upper() == 'L':
            count_l+=1
    return count

print(f'\nInput: s = RLRRLLRLRL\nOutput: { balancedStringSplit("RLRRLLRLRL") }')
print(f'\nInput: s = RLLLLRRRLR\nOutput: { balancedStringSplit("RLLLLRRRLR") }')
print(f'\nInput: s = LLLLRRRR\nOutput: { balancedStringSplit("LLLLRRRR") }')
print(f'\nInput: s = RLRRRLLRLL\nOutput: { balancedStringSplit("RLRRRLLRLL") }')