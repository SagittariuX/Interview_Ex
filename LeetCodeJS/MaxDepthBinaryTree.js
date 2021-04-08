// https://leetcode.com/problems/maximum-depth-of-binary-tree/
var maxDepth = function (root) {
  if (!root) return 0;

  return recurseTree(root, 0);
};

const recurseTree = (root, depth) => {
  if (!root) return depth;

  return Math.max(
    recurseTree(root.left, depth + 1),
    recurseTree(root.right, depth + 1)
  );
};

// https://leetcode.com/problems/minimum-depth-of-binary-tree/

var minDepth = function (root) {
  if (!root) return 0;

  const queue = [root];
  depth = 1;

  while (queue.length > 0) {
    let len = queue.length;
    for (let i = 0; i < len; i++) {
      const current = queue.shift();

      if (current.left === null && current.right === null) {
        return depth;
      }

      current.left && queue.push(current.left);
      current.right && queue.push(current.right);
    }
    depth++;
  }
};
