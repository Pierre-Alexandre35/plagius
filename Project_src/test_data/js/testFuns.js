function x(y, z) {
    console.log(y + z);
}

function philip() {
    console.log("philip");
}

function foo() {
    console.log("bar");
}

function foo2(x, k) {
    let w = (x ** 3) + k;
    return w;
}

function binSearch(xs, lo, hi, target) {
    if (lo > hi) {
        return false;
    }

    var mid = Math.floor(lo + hi / 2);

    if (xs[mid] === target) {
        return true;
    } else if (xs[mid] < target) {
        return binSearch(xs, mid + 1, hi, target);
    } else {
        return binSearch(xs, lo, mid - 1, target);
    }
}
