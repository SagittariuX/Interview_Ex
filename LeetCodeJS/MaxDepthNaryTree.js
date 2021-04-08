// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
//Naive solution
//Go down every single child and return the max of that child
//Compare with the other children
//return max

var maxDepth = function (root) {
  if (!root) return 0;

  return recursiveDepth(root.children, 1);
};

const recursiveDepth = (children, depth) => {
  if (children.length === 0) return depth;

  let max = -Infinity;

  children.forEach((child) => {
    max = Math.max(max, recursiveDepth(child.children, depth + 1));
  });

  return max;
};
