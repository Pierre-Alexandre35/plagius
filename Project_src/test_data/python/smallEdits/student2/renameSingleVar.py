def binSearch(xs, lo, hi, target):
    if lo > hi:
        return False

    middle = (lo + hi) // 2

    if xs[middle] == target:
        return True
    elif xs[middle] < target:
        return binSearch(xs, middle + 1, hi, target)
    else:
        return binSearch(xs, lo, middle - 1, target)
