function maxPathSum(board, p, q) {
  // Write your code here

  const down = calculateScoreDown(board, p, 0);
  const up = calculateScoreUp(board, q, board.length - 1);

  console.log(down + " " + up);
  return Math.max(down, up);
  //   return Math.max(
  //     calculateScoreDown(board, p, 0),
  //     calculateScoreUp(board, q, board.length - 1)
  //   );
}

function calculateScoreDown(board, start, row) {
  const currentValue = board[row][start];
  if (row === board.length - 1) {
    return currentValue;
  }

  if (start === board[row].length - 1) {
    return (
      currentValue +
      Math.max(
        calculateScoreDown(board, start, row + 1),
        calculateScoreDown(board, start - 1, row + 1)
      )
    );
  }

  if (start === 0) {
    return (
      currentValue +
      Math.max(
        calculateScoreDown(board, start, row + 1),
        calculateScoreDown(board, start + 1, row + 1)
      )
    );
  }

  return (
    currentValue +
    Math.max(
      calculateScoreDown(board, start, row + 1),
      calculateScoreDown(board, start + 1, row + 1),
      calculateScoreDown(board, start - 1, row + 1)
    )
  );
}

function calculateScoreUp(board, start, row) {
  const currentValue = board[row][start];
  if (row === 0) {
    console.log(currentValue);
    return currentValue;
  }

  if (start === board[row].length - 1) {
    return (
      currentValue +
      Math.max(
        calculateScoreUp(board, start, row - 1),
        calculateScoreUp(board, start - 1, row - 1)
      )
    );
  }

  if (start === 0) {
    return (
      currentValue +
      Math.max(
        calculateScoreUp(board, start, row - 1),
        calculateScoreUp(board, start + 1, row - 1)
      )
    );
  }

  return (
    currentValue +
    Math.max(
      calculateScoreUp(board, start, row - 1),
      calculateScoreUp(board, start + 1, row - 1),
      calculateScoreUp(board, start - 1, row - 1)
    )
  );
}

// const board = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9],
// ];
// console.log(maxPathSum(board, 1, 0));
const board = [
  [9, 4, 7],
  [2, 1, 3],
  [1, 4, 2],
];
console.log(maxPathSum(board, 2, 1));
