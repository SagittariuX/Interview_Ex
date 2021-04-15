// https://leetcode.com/problems/validate-binary-search-tree/
var isValidBST = function (root) {
  return dfs(root, -Infinity, Infinity);
};

var dfs = function (node, min, max) {
  if (!node) {
    return true;
  }
  if (node.val >= max || node.val <= min) return false;
  return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
};
