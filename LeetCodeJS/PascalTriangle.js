// https://leetcode.com/problems/pascals-triangle/

var generate = function (numRows) {
  const output = [[1]];

  for (let i = 1; i < numRows; i++) {
    let lastRow = output[i - 1];
    let length = lastRow.length + 1;
    let track = 0;
    const newRow = [];
    for (let j = 0; j < length; j++) {
      if (j == 0) {
        newRow.push(1);
        continue;
      }

      if (j == length - 1) {
        newRow.push(1);
        continue;
      }

      newRow.push(lastRow[track] + lastRow[track + 1]);
      track++;
    }

    output.push(newRow);
  }

  return output;
};

// console.log(generate(5));

// https://leetcode.com/problems/pascals-triangle-ii/
var getRow = function (rowIndex) {
  let output = [1];

  for (let i = 0; i < rowIndex; i++) {
    let newRow = [];
    let length = output.length + 1;
    let track = 0;

    for (let j = 0; j < length; j++) {
      if (j === 0) {
        newRow.push(1);
        continue;
      }
      if (j === length - 1) {
        newRow.push(1);
        continue;
      }

      newRow.push(output[track] + output[track + 1]);
      track++;
    }

    output = newRow;
  }

  return output;
};

console.log(getRow(5));
