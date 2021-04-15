// https://leetcode.com/problems/longest-palindrome/
var longestPalindrome = function (s) {
  const map = {};

  for (let i = 0; i < s.length; i++) {
    if (map[s.charAt(i)]) {
      map[s.charAt(i)] += 1;
    } else {
      map[s.charAt(i)] = 1;
    }
  }

  let size = 0;
  let odd = false;

  Object.keys(map).forEach((key) => {
    if (map[key] === 1 && odd === false) {
      size += 1;
      odd = true;
    } else {
      if (map[key] % 2 === 0) {
        size += map[key];
      } else {
        size += map[key] - 1;
        if (odd === false) {
          size += 1;
          odd = true;
        }
      }
    }
  });

  return size;
};

console.log(longestPalindrome("aA"));
