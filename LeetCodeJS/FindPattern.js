// https://leetcode.com/problems/find-and-replace-pattern/

/**
 *
 * @param {[string]} words
 * @param {string} pattern
 */
var findAndReplacePattern = function (words, pattern) {
  const output = [];
  for (let i = 0; i < words.length; i++) {
    const template = {};
    const reversetemplate = {};
    const word = words[i];
    let add = true;
    for (let j = 0; j < pattern.length; j++) {
      if (template[pattern.charAt(j)]) {
        if (template[pattern.charAt(j)] !== word.charAt(j)) {
          add = false;
          break;
        }
      } else {
        if (
          reversetemplate[word.charAt(j)] &&
          reversetemplate[word.charAt(j)] !== pattern.charAt(j)
        ) {
          add = false;
          break;
        }

        template[pattern.charAt(j)] = word.charAt(j);
        reversetemplate[word.charAt(j)] = pattern.charAt(j);
      }
      console.log(template);
    }
    if (add) output.push(word);
  }

  return output;
};

console.log(findAndReplacePattern(["ccc"], "abb"));
