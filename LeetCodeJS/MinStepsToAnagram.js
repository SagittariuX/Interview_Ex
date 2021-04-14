// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/

var minSteps = function (s, t) {
  const map = {};

  for (let i = 0; i < s.length; i++) {
    if (map[s.charAt(i)]) {
      map[s.charAt(i)] += 1;
    } else {
      map[s.charAt(i)] = 1;
    }
  }

  let steps = 0;
  for (let i = 0; i < t.length; i++) {
    if (map[t.charAt(i)]) {
      if (map[t.charAt(i)] > 0) {
        map[t.charAt(i)] -= 1;
      } else {
        steps++;
      }
    } else {
      steps++;
    }
  }

  return steps;
};

console.log(minSteps("leetcode", "practice"));
