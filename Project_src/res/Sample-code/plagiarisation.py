#
# plagiarisation.py
#
# The same set of functions in testFuns.py, but with all function names and variables renamed and
# one function's declaration shifted.
#

def xmas(bells, carolz):
    print(bells + carolz)

def charlieBrown():
    print("philip")

def footballz(iks, kids):
    double_v = (iks ** 3) + kids
    return double_v

def fun888():
    pass

def binarySearch(nums, low, high, tarjay):
    if low > high:
        return False

    middle = (low + high) // 2

    if nums[middle] == tarjay:
        return True
    elif nums[middle] < tarjay:
        return binarySearch(nums, middle + 1, high, tarjay)
    else:
        return binarySearch(nums, low, middle - 1, tarjay)

def f00tball():
    print("bar")
