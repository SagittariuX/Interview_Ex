// https://leetcode.com/problems/minimum-path-sum/

var minPathSum = function (grid) {
  const dp = Array.from(Array(grid.length), () => new Array(grid[0].length));

  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid[0].length; j++) {
      dp[i][j] = grid[i][j];
      if (i > 0 && j > 0) {
        dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
      } else if (i > 0) {
        dp[i][j] += dp[i - 1][j];
      } else if (j > 0) {
        dp[i][j] += dp[i][j - 1];
      }
    }
  }

  return dp[dp.length - 1][dp[0].length - 1];
};

console.log(
  minPathSum([
    [1, 3, 1],
    [1, 5, 1],
    [4, 2, 1],
  ])
);
