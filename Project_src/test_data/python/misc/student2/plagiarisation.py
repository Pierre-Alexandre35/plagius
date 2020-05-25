'''
plagiarisation.py

The same set of functions in testFuns.py, but with all function names and variables renamed and
one function's declaration shifted.
'''

# guess it's that time of year again
def xmas(bells, carolz):
    print(bells + carolz)

# good ol' good ol'
def charlieBrown():
    print("philip")

def footballz(iks, kids):
    double_v = (iks ** 3) + kids
    return double_v

def fun888():
    pass

def binarySearch(nums, low, high, tarjay):
    # tarjay not found
    if low > high:
        return False

    middle = (low + high) // 2

    if nums[middle] == tarjay: # tarjay found
        return True
    elif nums[middle] < tarjay: # search right
        return binarySearch(nums, middle + 1, high, tarjay)
    else: # search left
        return binarySearch(nums, low, middle - 1, tarjay)

# can't use F00tb@ll in function name because of @
def f00tball():
    print("bar")
