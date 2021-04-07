const numIslands = (grid) => {
  let count = 0;

  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid[i].length; j++) {
      if (grid[i][j] === "1") {
        count++;
        bfs(grid, i, j);
      }
    }
  }
  return count;
};

const bfs = (grid, i, j) => {
  if (
    i < 0 ||
    i > grid.length - 1 ||
    j < 0 ||
    j > grid[i].length - 1 ||
    grid[i][j] === "0"
  )
    return;

  grid[i][j] = 0;
  bfs(grid, i + 1, j);
  bfs(grid, i - 1, j);
  bfs(grid, i, j + 1);
  bfs(grid, i, j - 1);
};

console.log(
  numIslands([
    ["1", "1", "1", "1", "0"],
    ["1", "1", "0", "1", "0"],
    ["1", "1", "0", "0", "0"],
    ["0", "0", "0", "0", "0"],
  ])
);
