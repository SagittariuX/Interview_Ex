// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
const solution = (S) => {
  const arr = S.split("");
  let bal = 0;
  let ans = 0;

  arr.forEach((e) => {
    bal += e === "(" ? 1 : -1;
    if (bal == -1) {
      bal++;
      ans++;
    }
  });

  return bal + ans;
};

console.log(solution("()"));
