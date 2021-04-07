const findDups = (nums) => {
  const output = [];

  nums.forEach((n) => {
    const truevalue = Math.abs(n);
    if (nums[truevalue - 1] > 0) {
      nums[truevalue - 1] *= -1;
    } else {
      output.push(truevalue);
    }
  });

  return output;
};

console.log(findDups([4, 3, 2, 7, 8, 2, 3, 1]));
