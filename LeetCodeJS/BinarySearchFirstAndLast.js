// Time O(n) Space: O(1)
const searchRangeNaive = (nums, target) => {
  const range = [-1, -1];
  if (nums.length === 0) return range;

  nums.forEach((n, i) => {
    if (n === target && range[0] === -1) {
      range[0] = i;
      range[1] = i;
    } else if (n === target) {
      range[1] = i;
    }
  });

  return range;
};

const searchRange = (nums, target) => {
  let left = -1;
  let right = -1;
  if (nums.length === 0) return [left, right];

  left = findLeft(nums, target);
  right = findRight(nums, target);

  return [left, right];
};

const findLeft = (nums, target) => {
  let index = -1;
  let start = 0;
  let end = nums.length - 1;

  while (start <= end) {
    let middle = start + Math.floor((end - start) / 2);
    if (nums[middle] >= target) {
      end = middle - 1;
    } else {
      start = middle + 1;
    }

    if (nums[middle] === target) index = middle;
  }
  return index;
};

const findRight = (nums, target) => {
  let index = -1;
  let start = 0;
  let end = nums.length - 1;

  while (start <= end) {
    let middle = start + Math.floor((end - start) / 2);

    if (nums[middle] <= target) {
      start = middle + 1;
    } else {
      end = middle - 1;
    }

    if (nums[middle] === target) index = middle;
  }
  return index;
};

console.log(searchRange([5, 7, 7, 8, 8, 10], 8));
