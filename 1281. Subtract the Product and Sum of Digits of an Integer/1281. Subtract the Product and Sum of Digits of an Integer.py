def subtractProductAndSum(n):
    n_list = list(str(n))
    product = 1
    total = 0
    for i in n_list:
        product*=int(i) 
        total+=int(i) 
    return (product-total)

print(f'\nn = 234 => Difference : {subtractProductAndSum(234)}')
print(f'\nn = 4421 => Difference : {subtractProductAndSum(4421)}')


