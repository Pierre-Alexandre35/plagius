#Hw 1 by sam raphael 1730737



def f5():
    pass
#binary search
def binSearch(xs, lo, hi, target):
    if lo > hi:
        return False
    mid = (lo + hi) // 2
    if xs[mid] == target:
        return True
    elif xs[mid] < target:
        return binSearch(xs, mid + 1, hi, target)
    else:
        return binSearch(xs, lo, mid - 1, target)

#used for many thngs!
def doAlgo(base, add):
    result = (base ** 3) + add
    return result
i = 1

#changing the loops
#hope no one notices
while i < 10:
    a = cubeNAdd(i, i ** 2)
    b = a ** 90
    i += 1
    j = 10
    while j >= 1:
        print(a + j)
