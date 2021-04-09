// https://leetcode.com/problems/search-in-rotated-sorted-array/

//Naive solution
//Iterate throught array and find the target

var searchNaive = function (nums, target) {
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === target) return i;
  }
  return -1;
};

var binarySearch = function (nums, target) {
  let start = 0;
  let end = nums.length - 1;

  while (start <= end) {
    let middle = Math.floor((start + end) / 2);
    console.log(start, middle, end);
    if (nums[middle] === target) return middle;

    if (nums[start] <= nums[middle]) {
      if (nums[start] <= target && target < nums[middle]) {
        end = middle - 1;
      } else {
        start = middle + 1;
      }
    }

    if (nums[middle] <= nums[end]) {
      if (nums[middle] < target && target <= nums[end]) {
        start = middle + 1;
      } else {
        end = middle - 1;
      }
    }
  }

  return -1;
};

// console.log(searchNaive([4, 5, 6, 7, 0, 1, 2], 0));

console.log(binarySearch([4, 5, 6, 7, 0, 1, 2], 0));

// [4, 5, 6, 7, 0, 1, 2]
