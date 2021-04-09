// https://leetcode.com/problems/spiral-matrix/
var spiralOrder = function (matrix) {
  const output = [];
  const set = new Set();

  const directions = [
    1, //right
    1, //down
    -1, //left
    -1, //up
  ];

  let currentDirection = 0;
  let x = 0;
  let y = 0;

  const xlength = matrix[0].length;
  const ylength = matrix.length;

  const matrixSize = xlength * ylength;

  while (set.size < matrixSize) {
    if (currentDirection === 0 || currentDirection === 2) {
      //Going right and left
      output.push(matrix[y][x]);
      set.add(`${y},${x}`);

      const futureX = x + directions[currentDirection];
      if (futureX > xlength - 1 || futureX < 0 || set.has(`${y},${futureX}`)) {
        currentDirection = (currentDirection + 1) % 4;
        y = y + directions[currentDirection];
        continue;
      } else {
        x = futureX;
      }
    }

    if (currentDirection === 1 || currentDirection === 3) {
      //Going down and up
      output.push(matrix[y][x]);
      set.add(`${y},${x}`);

      const futureY = y + directions[currentDirection];
      if (futureY > ylength - 1 || futureY < 0 || set.has(`${futureY},${x}`)) {
        currentDirection = (currentDirection + 1) % 4;
        x = x + directions[currentDirection];
        continue;
      } else {
        y = futureY;
      }
    }
  }

  return output;
};

console.log(
  spiralOrder([
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
  ])
);
