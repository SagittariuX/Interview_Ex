var orangesRotting = function (grid) {
  let rotten = new Set();
  let fresh = new Set();

  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid[i].length; j++) {
      if (grid[i][j] === 1) fresh.add([i, j].toString());
      if (grid[i][j] === 2) rotten.add([i, j].toString());
    }
  }

  let minutes = 0;

  while (fresh.size > 0) {
    const directions = [
      [1, 0],
      [-1, 0],
      [0, 1],
      [0, -1],
    ];
    let infected = new Set();
    rotten.forEach((rottenvalue) => {
      const [i, j] = helper(rottenvalue);
      directions.forEach(([a, b]) => {
        const check = [i + a, j + b].toString();
        if (fresh.has(check)) {
          infected.add(check);
          fresh.delete(check);
        }
      });
    });
    if (infected.size === 0) {
      return -1;
    }
    rotten = infected;
    minutes++;
  }
  return minutes;
};

const helper = (s) => {
  const [a, , b] = s.split("");
  return [parseInt(a, 10), parseInt(b, 10)];
};

console.log(
  orangesRotting([
    [2, 1, 1],
    [1, 1, 0],
    [0, 1, 1],
  ])
);
