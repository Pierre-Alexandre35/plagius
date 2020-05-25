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
