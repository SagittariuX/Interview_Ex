// https://leetcode.com/problems/spiral-matrix-ii/

var generateMatrix = function (n) {
  const matrix = Array.from(Array(n), () => new Array(n));
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

  let count = 1;

  while (count <= n * n) {
    matrix[y][x] = count++;
    set.add(`${y},${x}`);

    if (currentDirection === 0 || currentDirection === 2) {
      //Going right and left
      const futureX = x + directions[currentDirection];
      if (futureX > n - 1 || futureX < 0 || set.has(`${y},${futureX}`)) {
        currentDirection = (currentDirection + 1) % 4;
        y = y + directions[currentDirection];
        continue;
      } else {
        x = futureX;
      }
    }

    if (currentDirection === 1 || currentDirection === 3) {
      const futureY = y + directions[currentDirection];
      if (futureY > n - 1 || futureY < 0 || set.has(`${futureY},${x}`)) {
        currentDirection = (currentDirection + 1) % 4;
        x = x + directions[currentDirection];
        continue;
      } else {
        y = futureY;
      }
    }
  }

  return matrix;
};

console.log(generateMatrix(3));
