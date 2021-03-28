function compressWord(word, k) {
  let sliced = true;

  while (sliced && word.length > 0) {
    let i = 0;
    let pre = null;
    let count = 0;
    let sliceStart = 0;
    sliced = false;
    for (i; i < word.length; i++) {
      if (pre === null || word.charAt(i) === pre) {
        count++;
      } else {
        count = 1;
        sliceStart = i;
      }
      pre = word.charAt(i);
      if (count === k) {
        const replacement = word.slice(sliceStart, sliceStart + count);
        word = word.replace(replacement, "");
        sliced = true;
        // break;
      }
    }
  }

  return word;
}

console.log(compressWord("bbccc", 3));
