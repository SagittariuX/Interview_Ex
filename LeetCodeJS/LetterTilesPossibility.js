// https://leetcode.com/problems/letter-tile-possibilities/

var numTilePossibilities = function (tiles) {
  const set = new Set();

  const dfs = function (tiles, t) {
    if (tiles) {
      set.add(tiles);
    }
    for (let i = 0; i < t.length; i++) {
      dfs(tiles + t[i], t.substring(0, i) + t.substring(i + 1));
    }
  };

  dfs("", tiles);

  return set.size;
};

console.log(numTilePossibilities("aab"));
