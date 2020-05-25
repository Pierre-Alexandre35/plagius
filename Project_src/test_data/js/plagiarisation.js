function xmas(bells, carolz) {
    console.log(bells + carolz);
}

// good ol'
function charlieBrown() {
    console.log("philip");
}

function footballz(iks, kids) {
    let double_v = (iks ** 3) + kids;
    return double_v;
}

function binarySearch(nums, low, high, tarjay) {
    if (low > high) {
        return false;
    }

    let middle = Math.floor(low + high / 2);

    if (nums[middle] === tarjay) {
        return true;
    } else if (nums[middle] < tarjay) {
        return binSearch(nums, middle + 1, high, tarjay);
    } else {
        return binSearch(nums, low, middle - 1, tarjay);
    }
}

function f00tball() {
    console.log("bar");
}
