const solve = (board) => {
  const set = new Set();

  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board[i].length; j++) {
      //   console.log(set);
      if (board[i][j] === "O" && !set.has(`${i},${j}`)) {
        bfs(board, set, i, j);
      }
    }
  }

  return board;
};

const bfs = (board, set, i, j) => {
  if (i < 0 || i > board.length - 1 || j < 0 || j > board[i].length - 1)
    return true;

  if (board[i][j] === "X" || set.has(`${i},${j}`)) return false;

  set.add(`${i},${j}`);

  board[i][j] =
    bfs(board, set, i + 1, j) ||
    bfs(board, set, i - 1, j) ||
    bfs(board, set, i, j + 1) ||
    bfs(board, set, i, j - 1)
      ? "O"
      : "X";
};

console.log(
  solve([
    ["O", "O", "O", "O"],
    ["O", "O", "O", "O"],
    ["O", "O", "O", "O"],
    ["O", "O", "O", "O"],
  ])
);
