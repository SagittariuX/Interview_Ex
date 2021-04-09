// https://leetcode.com/problems/reveal-cards-in-increasing-order/

var deckRevealedIncreasing = function (deck) {
  deck = deck.sort((a, b) => a - b);
  const ans = [];
  ans.push(deck.pop());
  while (deck.length > 0) {
    ans.unshift(ans.pop());
    ans.unshift(deck.pop());
  }

  return ans;
};

console.log(deckRevealedIncreasing([17, 13, 11, 2, 3, 5, 7]));
