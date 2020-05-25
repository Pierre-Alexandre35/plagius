#Hw 1 by dan raphael student id 1730737

#used for many thngs!
def cubeNAdd(x, k):
    w = (x ** 3) + k
    return w


def nil():
    return

#bin search
def binSearch(arr, minimum, maximum, target):
    if maximum > minimum:
        return False
    mid = (minimum + maximum) // 2
    if arr[mid] == target:
        return True
    elif arr[mid] < target:
        return binSearch(arr, mid + 1, maximum, target)
    else:
        return binSearch(arr, minimum, mid - 1, target)

#changing loops
#hope no one notices
for i in range(1, 10):
    a = cubeNAdd(i, i ** 2)
    for j in range(10, 1,-1):
        print(a + j)
