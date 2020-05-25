'''
testFuns.py

A series of sample functions used for testing our plagiarism detector.
'''

def x(y, z):
    print(y + z) #inline

def philip():
    print("philip")

def foo():
    print("bar")

# This comment shall be ignored
def foo2(x, k):
    w = (x ** 3) + k
    return w

#blank
def f5():
    pass

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
