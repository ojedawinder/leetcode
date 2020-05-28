def busyStudent(startTime, endTime, queryTime):
    number_students = 0
    for i in range(0, len(startTime)):
        value_s = startTime[i]
        value_e = endTime[i]
        if(queryTime>=value_s and queryTime<=value_e):
            number_students+=1
    return number_students

print(f'\nInput: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4\nOutput : {busyStudent([1,2,3],[3,2,7],4)}')
print(f'\nInput: startTime = [4], endTime = [4], queryTime = 4\nOutput : {busyStudent([4],[4],4)}')
print(f'\nInput: startTime = [4], endTime = [4], queryTime = 5\nOutput : {busyStudent([4],[4],5)}')
print(f'\nInput: startTime = [1,1,1,1], endTime = [1,3,2,4], queryTime = 7\nOutput : {busyStudent([1,1,1,1],[1,3,2,4],7)}')
print(f'\nInput: startTime = [9,8,7,6,5,4,3,2,1], endTime = [10,10,10,10,10,10,10,10,10], queryTime = 5\nOutput : {busyStudent([9,8,7,6,5,4,3,2,1],[10,10,10,10,10,10,10,10,10],5)}')
