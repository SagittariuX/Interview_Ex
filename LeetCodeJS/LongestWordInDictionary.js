var longestWord = function (words) {
  const sorted = words.sort((a, b) => a.localeCompare(b));
  const set = new Set();
  let longestWord = "";
  set.add(longestWord);

  sorted.forEach((word) => {
    const pre = word.slice(0, word.length - 1);
    if (set.has(pre)) {
      set.add(word);
      if (longestWord === "") {
        longestWord = word;
      }
      if (longestWord.length < word.length) {
        longestWord = word;
      } else if (word.localeCompare(longestWord) === -1) {
        longestWord = word;
      }
    }
  });

  return longestWord;
};

console.log(
  longestWord(["a", "banana", "app", "appl", "ap", "appla", "apple"])
);
