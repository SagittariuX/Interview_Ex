// https://leetcode.com/problems/balanced-binary-tree/

var isBalanced = function (root) {
  if (!root) return true;

  return isBalancedRecursive(root, 1) > -1;
};

var isBalancedRecursive = function (node, height) {
  if (!node) return height;

  const left = isBalancedRecursive(node.left, height + 1);
  if (left === -1) return -1;

  const right = isBalancedRecursive(node.right, height + 1);
  if (right === -1) return -1;

  const diff = Math.abs(left - right);

  return diff > 1 ? -1 : Math.max(left, right);
};
