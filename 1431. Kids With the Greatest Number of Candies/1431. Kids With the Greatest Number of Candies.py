def kidsWithCandies(candies, extraCandies):
    listBool = []
    maximo = max(candies)
    for i in candies:
        if i + extraCandies >= maximo:
            listBool.append(True)
        else: 
            listBool.append(False)

    return listBool


print(kidsWithCandies([12,1,12], 10))
