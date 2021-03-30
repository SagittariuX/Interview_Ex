// https://leetcode.com/problems/insert-into-a-binary-search-tree/

const insertIntoBST = (root, val) => {
  if (root === null) return new TreeNode(val, undefined, undefined);

  let currentNode = root;
  while (true) {
    if (currentNode.val === 0) {
      currenNode.val = val;
      break;
    }

    if (val > currentNode.val) {
      if (currentNode.right === null) {
        currentNode.right = new TreeNode(val, undefined, undefined);
        break;
      } else {
        currentNode = currentNode.right;
      }
    } else {
      if (currentNode.left === null) {
        currentNode.left = new TreeNode(val, undefined, undefined);
        break;
      } else {
        currentNode = currentNode.left;
      }
    }
  }
  return root;
};
