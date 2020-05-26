def findNumbers(n):
    evenDigits = 0
    for i in n:
        i_list = list(str(i))
        if (len(i_list)%2==0):
            evenDigits+=1
    return (evenDigits)

print(f'\nInput =  [12,345,2,6,7896] \nOutput : {findNumbers([12,345,2,6,7896])}')
print(f'\nInput =  [555,901,482,1771] \nOutput : {findNumbers([555,901,482,1771])}')


