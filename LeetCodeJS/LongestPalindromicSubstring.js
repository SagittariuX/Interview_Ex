const longestPalindrome = (s) => {
  let start = 0;
  let end = 0;

  for (let i = 0; i < s.length; i++) {
    let len1 = expandAround(s, i, i);
    let len2 = expandAround(s, i, i + 1);
    let length = Math.max(len1, len2);
    if (length > end - start) {
      start = i - length / 2 - 1;
      end = i + length / 2;
    }
  }

  return s.slice(start, end + 1);
};

const expandAround = (s, start, end) => {
  let l = start;
  let r = end;
  while (start >= 0 && end < s.length && s.charAt(l) === s.charAt(r)) {
    l--;
    r++;
  }

  return r - l - 1;
};

console.log(longestPalindrome("cbba"));
